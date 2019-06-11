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
    public partial class FormRoomerModify : Form
    {
        private DataGridView _dgv;
        private string _idCard;
        public FormRoomerModify(DataGridView dgv)
        {
            InitializeComponent();
            _dgv = dgv;
        }

        public string IDCard
        {
            get
            {
                return _idCard;
            }
            set
            {
                _idCard = value;
            }
        }


        private void FormRoomerModify_Load(object sender, EventArgs e)
        { 
            _idCard = _dgv.CurrentRow.Cells["ID_Card"].Value.ToString();
            this.textBoxName.Text = _dgv.CurrentRow.Cells["Name_"].Value.ToString();
            this.textBoxPhone.Text = _dgv.CurrentRow.Cells["Phone"].Value.ToString();
            this.textBoxAddress.Text = _dgv.CurrentRow.Cells["Address"].Value.ToString(); 
            textBox3_remark.Text = _dgv.CurrentRow.Cells["Remark"].Value.ToString();
        }
         

        private void button2_clr_Click(object sender, EventArgs e)
        {
            this.textBoxName.Text = "";
            this.textBoxPhone.Text = "";
            this.textBoxAddress.Text = ""; 
            textBox3_remark.Text = ""; 
        }

        private void button3_close_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button1_modify_Click(object sender, EventArgs e)
        {
            if (CheckInput())
            {
                string ID = IDCard;
                string name = this.textBoxName.Text.Trim();
                string phone = textBoxPhone.Text.Trim(); 
                string address = textBoxAddress.Text.Trim();
                string remark = textBox3_remark.Text.Trim();
                HotelManagementBLL.Roomer obj = new HotelManagementBLL.Roomer(_dgv);
                obj.Update(ID,name, phone, address, remark);
            }
        }

        public bool CheckInput()
        {
            if (this.textBoxName.Text.Trim() == "")
            {
                MessageBox.Show("姓名不可为空！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.textBoxName.Focus();
                return false;
            }
            if (this.textBoxName.Text.Trim().Length > 20)
            {
                MessageBox.Show("姓名输入过长！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
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
                MessageBox.Show("电话号码输入过长！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
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
