using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace HotelManagementUI.CheckIn
{
    public partial class FormCheckOut : Form
    {
        public FormCheckOut()
        {
            InitializeComponent();
            radioButtonIDCard.Checked = true;
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            if (CheckInput())
            {
                HotelManagementBLL.CheckIn obj = new HotelManagementBLL.CheckIn();
                obj.DealCheckOut(this.textBoxIDCard.Text.Trim(), this.textBoxRoomName.Text.Trim(), radioButtonIDCard.Checked);
            }
        }
        public bool CheckInput()
        { 
            if (radioButtonIDCard.Checked)
            {
                if (this.textBoxIDCard.Text.Trim()=="")
                {
                    MessageBox.Show("身份证信息不能为空！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    this.textBoxIDCard.Focus();
                    return false;
                }
                if (this.textBoxIDCard.Text.Trim().Length!=18)
                {
                    MessageBox.Show("身份证必须是18位！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    this.textBoxIDCard.Focus();
                    return false;
                }
            }
            else if (radioButtonRoomName.Checked)
            {
                if (this.textBoxRoomName.Text.Trim() == "")
                {
                    MessageBox.Show("房间名不能为空！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    this.textBoxRoomName.Focus();
                    return false;
                }
            }
            else
            {
                 MessageBox.Show("未选择信息匹配方式！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                 this.textBoxIDCard.Focus();
                 return false;
            } 
            return true;
        }
    }
}
