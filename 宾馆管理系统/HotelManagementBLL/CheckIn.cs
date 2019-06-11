using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace HotelManagementBLL
{
    public class CheckIn
    {
        private DataGridView _dgv;

        public CheckIn(DataGridView dgr)
        {
            _dgv = dgr;
        }

        public CheckIn()
        {

        } 


        //办理入住
        public void DealCheckIn(string idcard,DateTime CheckOutDate)
        {
            string roomname = _dgv.CurrentRow.Cells["ROOMNAME"].Value.ToString();
             
            HotelManagementDAL.Roomer objRoomer = new HotelManagementDAL.Roomer(idcard);
            HotelManagementDAL.Room objRoom = new HotelManagementDAL.Room(roomname);
            HotelManagementDAL.CheckIn objCheckIn = new HotelManagementDAL.CheckIn(idcard);
            if (!objRoomer.GetDataReaderByID())
            { 
                MessageBox.Show("该身份证号未登记，请先进行登记：" + idcard + "，请重新输入！", "身份证号未登记", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else if(objCheckIn.GetDataReaderByCheckIn())
            {
                MessageBox.Show("该身份证号已经登记入住请先退房！", "已经登记入", MessageBoxButtons.OK, MessageBoxIcon.Error);
            } 
            else//报表的房间名 安全
            { 
                objCheckIn.IDCard = idcard;
                objCheckIn.RoomName = roomname;
                objCheckIn.IsPay = "未付款";
                objCheckIn.State = "正在入住";
                objCheckIn.InTime = System.DateTime.Now;
                objCheckIn.OutTime = CheckOutDate;
                if (objCheckIn.DealCheckIn() > 0 && objRoomer.CheckIn()>0 && objRoom.CheckIn() > 0)
                { 
                    MessageBox.Show("成功办理入住！", "操作成功", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    MessageBox.Show("办理入住失败！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            } 
        }

        public void DealCheckOut(string idcard,string roomname,bool useID) 
        {
            HotelManagementDAL.Roomer objRoomer = new HotelManagementDAL.Roomer(idcard);
            HotelManagementDAL.CheckIn objCheckIn = new HotelManagementDAL.CheckIn(idcard);
            HotelManagementDAL.Room objRoom = new HotelManagementDAL.Room(roomname);
            if (useID)//身份证信息匹配
            { 
                if (!objCheckIn.GetDataReaderByCheckIn())
                {
                    MessageBox.Show("该身份证号未登记入住！", "身份证号未登记入住", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
                else
                { 
                    MySqlDataReader  rd = objCheckIn.GetRoomNameByIDCard();
                    if (rd.Read())
                        objRoom.RoomName = rd["ROOM_NAME"].ToString();
                    if ( objRoomer.CheckOut() > 0 && objRoom.CheckOut() > 0 && objCheckIn.DealCheckOutByIDCard() > 0)
                    {
                        MessageBox.Show("成功办理退房！", "操作成功", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    }
                    else
                    {
                        MessageBox.Show("办理退房失败！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    } 
                }
            }
            else
            {
                objCheckIn.RoomName = roomname;
                if (!objCheckIn.IsCheckInByRoomName())
                {
                    MessageBox.Show("该房间未登记入住！", "该房间未登记入住", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
                else
                {
                    MySqlDataReader rd = objCheckIn.GetIDCardByRoomName();
                    if (rd.Read())
                    {
                        objCheckIn.IDCard = rd["ID_CARD"].ToString();
                        objRoomer.IDCard = objCheckIn.IDCard;
                    }
                    if (objRoomer.CheckOut() > 0 && objRoom.CheckOut() > 0 && objCheckIn.DealCheckOutByIDCard() > 0)
                    {
                        MessageBox.Show("成功办理退房！", "操作成功", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    }
                    else
                    {
                        MessageBox.Show("办理退房失败！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                }
            } 
        }

        public void ShowAllCheckInLogByID(string ID)
        {
            _dgv.DataSource = HotelManagementDAL.CheckIn.ShowAllCheckInLogByID(ID).Tables[0];
        }
      
    }
}
