using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MySql.Data.MySqlClient;
using System.Data;

namespace HotelManagementDAL
{
    public class CheckIn
    {
        private string roomName;  
        private string idCard;
        private string isPay; 
        private string state;
        private DateTime inTime;
        private DateTime outTime;


        #region attribute
        public string RoomName
        {
            get 
            { 
                return roomName;
            }
            set 
            { 
                roomName = value;
            }
        }
        public string IDCard
        {
            get
            {
                return idCard;
            }
            set
            {
                idCard = value;
            }
        }
        public string IsPay
        {
            get
            {
                return isPay;
            }
            set
            {
                isPay = value;
            }
        }
        public string State
        {
            get
            {
                return state;
            }
            set
            {
                state = value;
            }
        }
        public DateTime InTime
        {
            get
            {
                return inTime;
            }
            set
            {
                inTime = value;
            }
        }
        public DateTime OutTime
        {
            get
            {
                return outTime;
            }
            set
            {
                outTime = value;
            }
        }
        #endregion

        public CheckIn()
        { 

        }
        public CheckIn(string idcard)
        {
             idCard = idcard; 
        }

        //检查房间是否有人入住
        public bool IsCheckInByRoomName()
        {
            string strSql = "select * from check_in where Room_Name = @roomName and STATE = '正在入住'";
            return MySqlHelper.ExecuteReader(strSql, new MySqlParameter("@roomName", roomName)).HasRows;
        }

        //根据ID号获得所有入住信息
        public bool GetDataReaderByCheckIn()
        {
            string strSql = "select * from check_in where ID_CARD = @idCard and STATE = '正在入住'"; 
            return MySqlHelper.ExecuteReader(strSql, new MySqlParameter("@idCard", idCard)).HasRows;
        }
        
        //退房登记
        public int DealCheckOutByIDCard()
        {
            string strSql = "update check_in set State = '已经退房' , IS_PAY = '已付款'   where ID_CARD = @idCard ";
            return MySqlHelper.ExecuteNonQuery(strSql, new MySqlParameter("@idCard", idCard)); 
        }

        //根据用户ID获得当前正在入住的房间名
        public MySqlDataReader GetRoomNameByIDCard()
        {
            string strSql = "select ROOM_NAME from check_in where ID_CARD = @idCard and STATE = '正在入住'";
            return MySqlHelper.ExecuteReader(strSql, new MySqlParameter("@idCard", idCard));
        }

        //根据房间名获得当前正在入住的用户ID
        public MySqlDataReader GetIDCardByRoomName()
        {
            string strSql = "select ID_CARD  from check_in where ROOM_NAME = @roomName  and STATE = '正在入住'";
            return MySqlHelper.ExecuteReader(strSql, new MySqlParameter("@roomName", roomName));
        }
        
        //登记入住信息
        public int DealCheckIn()
        {
            string strSql = "insert into check_in(ROOM_NAME, ID_CARD, 	IS_PAY, STATE, 	IN_TIME, OUT_TIME) values(@roomName,@idCard,@isPay,@state,@inTime,@outTime)";
 
            MySqlParameter[] paras = new MySqlParameter[6];
            paras[0] = new MySqlParameter("@roomName", roomName);
            paras[1] = new MySqlParameter("@idCard", idCard);
            paras[2] = new MySqlParameter("@isPay", isPay);
            paras[3] = new MySqlParameter("@state", state);
            paras[4] = new MySqlParameter("@inTime", inTime.ToString());
            paras[5] = new MySqlParameter("@outTime", outTime.ToString()); 
            return MySqlHelper.ExecuteNonQuery(strSql, paras); 
        }

        //通过用户id返回所有住房信息
        public static DataSet ShowAllCheckInLogByID(string ID)
        {
            string strSql = "SELECT ROOM_NAME,Name, 	check_in.ID_CARD,  	check_in.STATE, 	IN_TIME, 	OUT_TIME  FROM roomer_management,check_in where check_in.ID_CARD = roomer_management.ID_CARD and roomer_management.ID_CARD like @ID";
            MySqlParameter[] paras = new MySqlParameter[1];
            if (ID == "")
                ID = "%";
            paras[0] = new MySqlParameter("@ID", ID );
            DataSet ds = MySqlHelper.GetDataSet(strSql, paras);
            return ds; 
        }
    }
}
