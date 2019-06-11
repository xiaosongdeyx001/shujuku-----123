using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using System.Windows.Forms;


namespace HotelManagementBLL
{
    public class Room
    {
        private DataGridView _dgv;

        public Room(DataGridView dgr)
        {
            _dgv = dgr;
        }

        public Room()
        {

        } 

        //得到客房信息记录
        public void UpdateDataGrid()
        {
            DataSet objDataSet = HotelManagementDAL.Room.FillByAllRoom(); 
            this._dgv.DataSource = objDataSet.Tables[0];
        }

        //添加房间
        public void Add(string name, decimal price, string kind, string remark)
        {
            HotelManagementDAL.Room obj = new HotelManagementDAL.Room();
            if (obj.GetDataReaderByName(name))
            {
                MessageBox.Show("该房间名已经存在" + name + "，请重新输入！", "房间已存在", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (HotelManagementDAL.Room.Add(name, price, kind, remark) > 0)
                { 
                    UpdateDataGrid();
                    MessageBox.Show("成功添加房间信息！", "操作成功", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    MessageBox.Show("添加房间信息失败！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }


        //修改房间信息
        public void Update(int id, string name, decimal price, string kind, string state, string remark)
        { 
            HotelManagementDAL.Room objRoom = new HotelManagementDAL.Room(name);
            objRoom.RoomID = id;
            objRoom.RoomName = name;
            objRoom.RoomPrice = price;
            objRoom.RoomKind = kind;
            objRoom.RoomState = state;
            objRoom.Remark = remark;
            if (objRoom.Update() > 0)
            {
                UpdateDataGrid();
                MessageBox.Show("修改房间信息成功！", "操作成功", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                MessageBox.Show("更新操作失败！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }
        
        //删除房间
        public void Delete()
        {
            string roomName = this._dgv.CurrentRow.Cells["roomName"].Value.ToString();
            if (DialogResult.Yes == MessageBox.Show("确认删除房间：' " + roomName + " '吗?\n删除房间，将同时删除与该房间有相关的所有房间信息，要继续吗？", "删除确认", MessageBoxButtons.YesNo, MessageBoxIcon.Question))
            {
                HotelManagementDAL.Room objRoom = new HotelManagementDAL.Room(roomName);
                if (objRoom.Delete() > 0)
                {
                    UpdateDataGrid();
                    MessageBox.Show("成功删除房间" + roomName + " '!", "操作成功", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    MessageBox.Show("删除操作失败 " + roomName + " '!", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        //房间查询
        public void Search(string roomName,decimal roomPrice,decimal roomPrice2, string roomKind,string state, bool useMatch)
        { 
            DataSet objDataSet = HotelManagementDAL.Room.FillByAllRoom();
            if (useMatch)
                objDataSet = HotelManagementDAL.Room.SearchByFuzzy(roomName, roomPrice,roomPrice2, roomKind, state);
            else
                objDataSet = HotelManagementDAL.Room.SearchByPrecision(roomName, roomPrice,roomPrice2, roomKind, state);
            _dgv.DataSource = objDataSet.Tables[0];
            if(objDataSet.Tables[0].Rows.Count == 0)
                MessageBox.Show("没有符合的记录！", "结果", MessageBoxButtons.OK, MessageBoxIcon.Information);
            else
                MessageBox.Show("搜索完毕", "结果", MessageBoxButtons.OK, MessageBoxIcon.Information);              
        } 
    }
}
