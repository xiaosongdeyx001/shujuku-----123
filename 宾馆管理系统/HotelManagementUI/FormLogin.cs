using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace HotelManagementUI
{
    public partial class FormLogin : Form
    {
        public FormLogin()
        {
            InitializeComponent();
        } 

        private void login_button_Click(object sender, EventArgs e)
        { 
            if (Check())
            {
                if (HotelManagementBLL.User.Login(textBox_user.Text.ToString().Trim(), textBox_pw.Text.ToString().Trim()))
                {
                    FormMain mai = new FormMain(textBox_user.Text);
                    this.Hide();
                    mai.Show();
                } 
            } 
        }

        
        public bool Check()
        {
            if (textBox_user.Text.ToString().Trim().Length < 6)
            {
                label_warn.Text = "用户名长度过短";
                textBox_user.Focus();
                return false;
            }
            else if (textBox_user.Text.ToString().Trim().Length > 12)
            {
                label_warn.Text = "用户名长度过长";
                textBox_user.Focus();
                return false;
            }
            else if (textBox_pw.Text.ToString().Trim().Length < 6)
            {
                label_warn.Text = "密码长度过短";
                textBox_pw.Focus();
                return false;
            }
            else if (textBox_pw.Text.ToString().Trim().Length > 12)
            {
                label_warn.Text = "密码长度过长";
                textBox_pw.Focus();
                return false;
            }

            
            return true;
        }

        private void textBox_pw_MouseLeave(object sender, EventArgs e)
        {
            label_warn.Text = "";
        }

        private void textBox_pw_MouseEnter(object sender, EventArgs e)
        {
            label_warn.Text = "密码长度6-12位之间";
        }

        private void textBox_user_MouseEnter(object sender, EventArgs e)
        {
            label_warn.Text = "用户名长度6-12位之间";
        }

        private void textBox_user_MouseLeave(object sender, EventArgs e)
        {
            label_warn.Text = "";
        } 

        private void quit_button_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

 
    }
}
