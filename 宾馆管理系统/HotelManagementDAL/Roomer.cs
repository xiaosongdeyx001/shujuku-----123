using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MySql.Data.MySqlClient;
using System.Data;


namespace HotelManagementDAL
{
    public class Roomer
    {
        private string _iDCard;
        private string _name;  
        private string _phone;
        private string _address;
        private string _state;
        private string _remark; 

        #region attribute  
         

        public string IDCard
        {
            get
            {
                return _iDCard;
            }
            set
            {
                _iDCard = value;
            }
        }

        public string Name
        {
            get
            {
                return _name;
            }
            set
            {
                _name = value;
            }
        }

        public string Phone
        {
            get
            {
                return _phone;
            }
            set
            {
                _phone = value;
            }
        }
        public string Address
        {
            get
            {
                return _address;
            }
            set
            {
                _address = value;
            }
        }
        public string State
        {
            get
            {
                return _state;
            }
            set
            {
                _state = value;
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

        public Roomer()
        { 

        }

        public Roomer(string idcard)
        {
            IDCard = idcard;
        }

        //有无该身份证号
        public bool GetDataReaderByID(string idcard)
        {
            string strSql = "select * from roomer_management where ID_CARD = @idcard";
            return MySqlHelper.ExecuteReader(strSql, new MySqlParameter("@idcard", idcard)).HasRows;
        }

        //通过身份证号获得住客信息
        public bool GetDataReaderByID()
        {
            string strSql = "select * from roomer_management where ID_CARD = @idcard";
            return MySqlHelper.ExecuteReader(strSql, new MySqlParameter("@idcard", _iDCard)).HasRows;
        }


        //添加房间信息
        public static int Add(string ID, string name, Int64 phone, string address, string state, string remark)
        {
            string strSql = "INSERT INTO `hotel_management`.`roomer_management` (`ID_CARD`, 	`NAME`, 	`PHONE`, 	`ADDRESS`, 	`STATE`, 	`REMARK`	)	VALUES	(@ID,     @name,  	@phone,    @address  ,    @state,   @remark	);";
            MySqlParameter[] paras = new MySqlParameter[6];
            paras[0] = new MySqlParameter("@ID", ID);
            paras[1] = new MySqlParameter("@name", name);
            paras[2] = new MySqlParameter("@phone", phone);
            paras[3] = new MySqlParameter("@address", address);
            paras[4] = new MySqlParameter("@state", state);
            paras[5] = new MySqlParameter("@remark", remark); 
            return MySqlHelper.ExecuteNonQuery(strSql, paras);
        }

        //修改房间信息
        public int Update()
        {//IDCard Name Phone Address State Remark
            string strSql = "UPDATE `hotel_management`.`roomer_management` 	SET 	`NAME` = @Name, 	`PHONE` = @Phone , 	`ADDRESS` = @Address , 	`REMARK` =@Remark   		WHERE  ID_CARD = @IDCard";     
            MySqlParameter[] paras = new MySqlParameter[6];
            paras[0] = new MySqlParameter("@IDCard", IDCard);
            paras[1] = new MySqlParameter("@Name", Name);
            paras[2] = new MySqlParameter("@Phone", Phone);
            paras[3] = new MySqlParameter("@Address", Address);
            paras[4] = new MySqlParameter("@State", State);
            paras[5] = new MySqlParameter("@Remark", Remark);
            return MySqlHelper.ExecuteNonQuery(strSql, paras);
        }

        //入住
        public int CheckIn()
        {
            string strSql = "UPDATE `hotel_management`.`roomer_management` 	SET 	 	`STATE` = '入住'   		WHERE  ID_CARD = @IDCard";
            MySqlParameter[] paras = new MySqlParameter[1];
            paras[0] = new MySqlParameter("@IDCard", IDCard); 
            return MySqlHelper.ExecuteNonQuery(strSql, paras);
        }
         
        //退房
        public int CheckOut()
        {
            string strSql = "UPDATE `hotel_management`.`roomer_management` 	SET 	 	`STATE` = '未入住'   		WHERE  ID_CARD = @IDCard";
            MySqlParameter[] paras = new MySqlParameter[1];
            paras[0] = new MySqlParameter("@IDCard", IDCard); 
            return MySqlHelper.ExecuteNonQuery(strSql, paras);
        }


        //按信息模糊查找
        public static DataSet SearchByFuzzy(string ID, string name, string phone, string address, string state, string remark)
        {
            string strSql = "SELECT * FROM roomer_management where ID_CARD LIKE @ID and NAME LIKE @name and PHONE LIKE @phone and ADDRESS LIKE @address AND STATE LIKE @state AND REMARK LIKE @remark";
            MySqlParameter[] paras = new MySqlParameter[6];
            paras[0] = new MySqlParameter("@ID", '%' + ID + '%');
            paras[1] = new MySqlParameter("@name", '%' + name + '%');
            paras[2] = new MySqlParameter("@phone", '%' + phone + '%');
            paras[3] = new MySqlParameter("@address", '%' + address + '%');
            if (state == "")
                state = "%";
            paras[4] = new MySqlParameter("@state", state );
            paras[5] = new MySqlParameter("@remark", '%' + remark + '%');
            DataSet ds = MySqlHelper.GetDataSet(strSql,paras); 
            return ds; 
        } 

        //删除房间
        public int Delete()
        {
            //删除房间信息 
            StringBuilder strSql = new StringBuilder();
            strSql.Append("delete from roomer_management where  ID_CARD = @IDCard ;");
            //删除 入住信息
            strSql.Append("delete from check_in where ID_CARD = @IDCard;");
            return MySqlHelper.ExecuteNonQuery(strSql.ToString(), new MySqlParameter("@IDCard", IDCard));
        }
        

        //得到所有房间信息
        public static DataSet FillByAllRoom()
        {
            string strSql = "select * from roomer_management"; 
            DataSet ds = MySqlHelper.GetDataSet(strSql);
            return ds;
        }
        
    }
}
