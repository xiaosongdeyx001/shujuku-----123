using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using System.Data.SqlClient;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace HotelManagementBLL
{
    public class User
    {
        private DataGridView _dgvUser;

        public User(DataGridView dgv)
        {
            _dgvUser = dgv;
        }

        public User()
        {

        }

        //验证用户名是否已存在
        public static bool CheckUserExists(string userName)
        { 
            return HotelManagementDAL.User.GetReaderByUserName(userName).HasRows;
        }

        //密码修改
        public static int ModifyPs(string name, string ps)
        {
            if (HotelManagementDAL.User.ModifyPs(name, ps) > 0)
            {
                MessageBox.Show("密码修改成功！", "成功！", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return 1;
            }
            MessageBox.Show("密码修改失败！", "失败！", MessageBoxButtons.OK, MessageBoxIcon.Error);
            return 0;
        }
 
        //验证登陆
        public static bool Login(string userName, string password)
        {
            //首先判断用户名是否输入有误
            if (!HotelManagementDAL.User.GetReaderByUserName(userName).HasRows)
            {
                MessageBox.Show("你输入的用户名并不存在！", "非法登陆", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return false;
            } 
            //再判断用户名正确的情况下密码是否输入有误
            if (!HotelManagementDAL.User.CheckByUserNameAndPwd(userName, password).HasRows)
            {
                MessageBox.Show("密码输入有误！", "非法登陆", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return false;
            } 
            //判断用户名和密码都正确的情况下帐户是否被封
            if (!HotelManagementDAL.User.CheckStatus(userName).HasRows)
            {
                MessageBox.Show("当前帐户已被暂停，请联系系统管理员重新开通", "非法登陆", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return false;
            }
            return true;
            //验证成功，进入主界面
        }
         
         
         
    }
}
