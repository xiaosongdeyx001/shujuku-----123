using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MySql.Data.MySqlClient;
using System.Data;

namespace HotelManagementDAL
{
    public class Room
    {
        private int _roomID;
        private string _roomName;  
        private string _roomKind;
        private decimal _roomPrice; 
        private string _remark;
        private string _roomState;

        #region attribute
         public int RoomID
        {
            get
            {
                return _roomID;
            }
            set
            {
                _roomID = value;
            }
        }

        public string RoomName
        {
            get
            {
                return _roomName;
            }
            set
            {
                _roomName = value;
            }
        }

        public string RoomState
        {
            get
            {
                return _roomState;
            }
            set
            {
                _roomState = value;
            }
        }

        public string RoomKind
        {
            get
            {
                return _roomKind;
            }
            set
            {
                _roomKind = value;
            }
        }

        public decimal RoomPrice
        {
            get
            {
                return _roomPrice;
            }
            set
            {
                _roomPrice = value;
            }
        }

        public string Remark
        {
            get
            {
                return _remark;
            }
            set
            {
                _remark = value;
            }
        }
        #endregion

        public Room()
        { 

        }

        public Room(string roomName)
        {
            _roomName = roomName; 
        }

        //有无该房间
        public bool GetDataReaderByName(string _roomName)
        {
            string strSql = "select * from room_management where ROOM_NAME = @roomName"; 
            return MySqlHelper.ExecuteReader(strSql, new MySqlParameter("@roomName", _roomName)).HasRows;
        }

        //添加房间信息
        public static int Add(string _name, decimal _price, string _kind, string _remark)
        {
            string strSql = "insert into room_management(ROOM_NAME,PRICE,KIND,REMARK,STATE) values(@roomName,@roomPrice,@roomKind,@roomRemark,'未入住')";
            MySqlParameter[] paras = new MySqlParameter[4];
            paras[0] = new MySqlParameter("@roomName", _name);
            paras[1] = new MySqlParameter("@roomPrice", _price);
            paras[2] = new MySqlParameter("@roomKind", _kind);
            paras[3] = new MySqlParameter("@roomRemark", _remark);
            return MySqlHelper.ExecuteNonQuery(strSql, paras);
        }

        //修改房间信息
        public int Update()
        {
            string strSql = "update room_management set ROOM_NAME = @roomName, PRICE = @roomPrice, KIND = @roomKind ,STATE = @roomState ,REMARK = @roomRemark  where ROOM_ID = @roomID";
            MySqlParameter[] paras = new MySqlParameter[6];
            paras[0] = new MySqlParameter("@roomName", _roomName);
            paras[1] = new MySqlParameter("@roomPrice", _roomPrice);
            paras[2] = new MySqlParameter("@roomKind", _roomKind);
            paras[3] = new MySqlParameter("@roomRemark", _remark);
            paras[4] = new MySqlParameter("@roomID", _roomID);
            paras[5] = new MySqlParameter("@roomState", _roomState);
            return MySqlHelper.ExecuteNonQuery(strSql, paras);
        }

        //办理入住
        public int CheckIn()
        {
            string strSql = "update room_management set STATE = '入住'  where ROOM_NAME = @roomName";
            MySqlParameter[] paras = new MySqlParameter[1];
            paras[0] = new MySqlParameter("@roomName", _roomName);
            return MySqlHelper.ExecuteNonQuery(strSql, paras);
        } 

        //办理退房
        public int CheckOut()
        {
            string strSql = "update room_management set STATE = '未入住'  where ROOM_NAME = @roomName";
            MySqlParameter[] paras = new MySqlParameter[1];
            paras[0] = new MySqlParameter("@roomName", _roomName);
            return MySqlHelper.ExecuteNonQuery(strSql, paras);
        }

        //按信息模糊查找
        public static DataSet SearchByFuzzy(string roomName, decimal roomPrice,decimal roomPrice2, string roomKind, string roomState)
        {
            string strSql = "SELECT * FROM room_management where ROOM_NAME LIKE @roomName and  PRICE  BETWEEN  @roomPrice AND @roomPrice2 and KIND LIKE @roomKind and STATE LIKE @roomState";
            MySqlParameter[] paras = new MySqlParameter[5];
            paras[0] = new MySqlParameter("@roomName",  '%' + roomName + '%' );
            paras[1] = new MySqlParameter("@roomPrice", roomPrice);
            paras[2] = new MySqlParameter("@roomKind", '%' + roomKind + '%');
            if (roomState == "")
                roomState = "%";
            paras[3] = new MySqlParameter("@roomState",  roomState );
            paras[4] = new MySqlParameter("@roomPrice2", roomPrice2);
            DataSet ds = MySqlHelper.GetDataSet(strSql,paras); 
            return ds; 
        } 

        //按信息精确查找
        public static DataSet SearchByPrecision(string roomName, decimal roomPrice, decimal roomPrice2, string roomKind, string roomState)
        {
            StringBuilder strSql = new StringBuilder("SELECT * FROM room_management where PRICE  BETWEEN  @roomPrice AND @roomPrice2 and");
            MySqlParameter[] paras = new MySqlParameter[5]; 
            if (roomName == "")
                strSql.Append(" ROOM_NAME LIKE '%' ");
            else
                strSql.Append(" ROOM_NAME = @roomName ");
            if (roomKind == "")
                strSql.Append(" AND KIND LIKE '%' ");
            else
                strSql.Append(" AND KIND = @roomKind ");
            if (roomState == "")
                strSql.Append(" AND STATE LIKE '%' ");
            else
                strSql.Append(" AND STATE = @roomState ");
            paras[0] = new MySqlParameter("@roomName", roomName);
            paras[1] = new MySqlParameter("@roomPrice", roomPrice);
            paras[2] = new MySqlParameter("@roomKind", roomKind);
            if (roomState == "")
                roomState = "%";
            paras[3] = new MySqlParameter("@roomState", roomState);
            paras[4] = new MySqlParameter("@roomPrice2", roomPrice2); 
            DataSet ds = MySqlHelper.GetDataSet(strSql.ToString(), paras);
            return ds; 
        } 

        //删除房间
        public int Delete()
        {
            //删除房间信息 
            StringBuilder strSql = new StringBuilder();
            strSql.Append("delete from room_management where  ROOM_NAME = @roomNAME ;");
            //删除 入住信息
            strSql.Append("delete from check_in where ROOM_NAME = @roomNAME;");
            return MySqlHelper.ExecuteNonQuery(strSql.ToString(), new MySqlParameter("@roomNAME", _roomName));
        } 

        //得到所有房间信息
        public static DataSet FillByAllRoom()
        {
            string strSql = "select * from room_management"; 
            DataSet ds = MySqlHelper.GetDataSet(strSql);
            return ds;
        }
        
    }
}
