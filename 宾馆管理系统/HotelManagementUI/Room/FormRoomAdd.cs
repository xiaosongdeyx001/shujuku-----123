using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace HotelManagementUI.Room
{
    public partial class FormRoomAdd : Form
    {
        private DataGridView _dgv;
        public FormRoomAdd(DataGridView dgv)
        {
            InitializeComponent();
            _dgv = dgv;
        } 

        //清空数据
        private void button2_clr_Click(object sender, EventArgs e)
        {
            textBox1_name.Text = "";
            textBox2_price.Text = "";
            textBox3_remark.Text = "";
            comboBox1_kind.Text = ""; 
        }

        //退出
        private void button3_close_Click(object sender, EventArgs e)
        {
            this.Close();
        }
        
        //增加
        private void button1_add_Click(object sender, EventArgs e)
        {
            if (CheckInput())
            {
                //新增科目
                string name = textBox1_name.Text.Trim();
                decimal price = Decimal.Parse(textBox2_price.Text.Trim());
                string remark = textBox3_remark.Text.Trim();
                string kind = comboBox1_kind.Text.Trim();
                HotelManagementBLL.Room obj = new HotelManagementBLL.Room(_dgv);
                obj.Add(name, price, kind, remark);
            }
        }

        //输入检测
        public bool CheckInput()
        {
            if (this.textBox1_name.Text.Trim() == "")
            {
                MessageBox.Show("房间名称不可为空！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.textBox1_name.Focus();
                return false;
            }
            if (this.textBox2_price.Text.Trim() == "")
            {
                MessageBox.Show("价格不可为空！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.textBox2_price.Focus();
                return false;
            }
            if (this.comboBox1_kind.Text.Trim() == "")
            {
                MessageBox.Show("类型不可为空！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.comboBox1_kind.Focus();
                return false;
            } 
            return true;
        }

        //价格输入限定
        private void textBox2_price_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!(Char.IsNumber(e.KeyChar)) && e.KeyChar != (char)8 && e.KeyChar != '.')
            {
                e.Handled = true;
            } 
        }
    }
}
