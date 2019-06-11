using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace HotelManagementUI.Roomer
{
    public partial class FormRoomerAdd : Form
    {
        
        private DataGridView _dgv;
        public FormRoomerAdd(DataGridView dgv)
        {
            InitializeComponent();
            _dgv = dgv;
        }

        public FormRoomerAdd()
        {
            InitializeComponent(); 
        }

        private void button1_add_Click(object sender, EventArgs e)
        {
            if (CheckInput())
            {
                string ID = textBoxIDCard.Text.Trim();
                string name = this.textBoxName.Text.Trim();
                Int64 phone = Int64.Parse(textBoxPhone.Text.Trim()); 
                string address = textBoxAddress.Text.Trim();
                string remark = textBox3_remark.Text.Trim(); 
                HotelManagementBLL.Roomer obj = new HotelManagementBLL.Roomer(_dgv);
                obj.Add(ID, name, phone, address, "未入住", remark);
            }
        }

        private void button2_clr_Click(object sender, EventArgs e)
        {
            textBoxIDCard.Text = "";
            textBoxName.Text = "";
            textBoxPhone.Text = "";
            textBoxAddress.Text = "";
            textBox3_remark.Text = ""; 
        }


        private void button3_close_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        public bool CheckInput()
        {
            if (this.textBoxIDCard.Text.Trim() == "")
            {
                MessageBox.Show("身份证号不可为空！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.textBoxIDCard.Focus();
                return false;
            }
            if (this.textBoxIDCard.Text.Trim().Length!=18)
            {
                MessageBox.Show("身份证号长度应为18！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.textBoxIDCard.Focus();
                return false;
            }
            if (this.textBoxName.Text.Trim() == "")
            {
                MessageBox.Show("姓名不可为空！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.textBoxName.Focus();
                return false;
            }
            if (this.textBoxName.Text.Trim().Length > 20)
            {
                MessageBox.Show("姓名过长！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.textBoxName.Focus();
                return false;
            }

            if (this.textBoxPhone.Text.Trim() == "")
            {
                MessageBox.Show("电话不可为空！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.textBoxPhone.Focus();
                return false;
            }
            if (this.textBoxPhone.Text.Trim().Length > 20)
            {
                MessageBox.Show("电话号码过长！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.textBoxPhone.Focus();
                return false;
            } 
            return true;
        }

        private void textBoxPhone_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!(Char.IsNumber(e.KeyChar)) && e.KeyChar != (char)8 && e.KeyChar != '.')
            {
                e.Handled = true;
            }
        } 
    }
}
