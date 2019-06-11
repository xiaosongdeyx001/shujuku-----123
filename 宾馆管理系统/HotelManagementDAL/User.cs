using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using System.Data.SqlClient;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace HotelManagementDAL
{
    public class User
    {
        private string _userName;
        private string _password;
        private bool _level;
        private bool _status;

        #region attribute
        public string ID
        {
            get
            {
                return _userName;
            }
            set
            {
                _userName = value;
            }
        }

        public string PW
        {
            get
            {
                return _password;
            }
            set
            {
                _password = value;
            }
        }

        public bool Level
        {
            get
            {
                return _level;
            }
            set
            {
                _level = value;
            }
        }

        public bool Status
        {
            get
            {
                return _status;
            }
            set
            {
                _status = value;
            }
        }
        #endregion

        public User(string ID)
        {
            _userName = ID;
        }

        #region login
        //根据用户名获得用户信息
        public static MySqlDataReader GetReaderByUserName(string userName)
        {
            string strSql = "select * from Userinfo where userName = @userName";
            return MySqlHelper.ExecuteReader(MySqlHelper.Conn, CommandType.Text, strSql, new MySqlParameter("@userName", userName));
        }

        //检查帐号密码是否匹配 存在
        public static MySqlDataReader CheckByUserNameAndPwd(string userName, string password)
        {
            string strSql = "select userName from UserInfo where userName = @userName and password = @password";
            return MySqlHelper.ExecuteReader(MySqlHelper.Conn, CommandType.Text, strSql, new MySqlParameter("@userName", userName), new MySqlParameter("@password", password));
        }

        //根据用户名获得当前帐号状态
        public static MySqlDataReader CheckStatus(string userName)
        {
            string strSql = "select * from UserInfo where userName = @userName and status = '1'";
            return MySqlHelper.ExecuteReader(MySqlHelper.Conn, CommandType.Text, strSql, new MySqlParameter("@userName", userName));
        }
        #endregion 
         
        //改变密码
        static public int ModifyPs(string name, string ps)
        {
            string strSql = "update  userinfo set password = @ps where userName = @name";
            MySqlParameter[] para = { new MySqlParameter("@name", name), new MySqlParameter("@ps", ps) };
            return MySqlHelper.ExecuteNonQuery(strSql, para);
        }

      
    }
}
