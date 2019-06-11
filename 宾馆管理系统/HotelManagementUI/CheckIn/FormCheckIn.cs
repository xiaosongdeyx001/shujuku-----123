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
    public partial class FormCheckIn : Form
    {
        public FormCheckIn()
        {
            InitializeComponent();
            dateTimePicker1.Value = DateTime.Now.Date;
            dataGridView1.ReadOnly = true;
            dataGridView1.AutoGenerateColumns = false;
        }  
         
        private void buttonSearch_Click(object sender, EventArgs e)
        { 
            string name = "";
            decimal price = 0;
            if(textBoxPriceLowLim.Text.Trim() != "")
                price = Decimal.Parse(textBoxPriceLowLim.Text.Trim());
            decimal price2 = Decimal.MaxValue;
            if (textBoxPriceHighLim.Text.Trim() != "")
                price2 = Decimal.Parse(textBoxPriceHighLim.Text.Trim());
            string kind = comboBox1_kind.Text.Trim();
            string state = "未入住"; 
            HotelManagementBLL.Room obj = new HotelManagementBLL.Room(dataGridView1);
            obj.Search(name, price,price2, kind,state,false); 
        }

        private void buttonClear_Click(object sender, EventArgs e)
        {
            this.comboBox1_kind.Text = "";
            this.textBoxPriceLowLim.Text = "";
            this.textBoxPriceHighLim.Text = "";
            this.textBoxIDCard.Text = ""; 
        }

        private void buttonQuit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void textBoxPriceLowLim_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!(Char.IsNumber(e.KeyChar)) && e.KeyChar != (char)8 && e.KeyChar != '.')
            {
                e.Handled = true;
            }
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        { 
            if (CheckInput())
            { 
                int days = (int)dateTimePicker1.Value.Date.Subtract(System.DateTime.Now.Date).TotalDays;
                decimal pay = Convert.ToDecimal(dataGridView1.CurrentRow.Cells["RoomPrice"].Value);
                DialogResult rs = MessageBox.Show("共入住"+days+"天\n"+"应付押金"+(days*pay+100)+"元", "是否确认缴纳押金", MessageBoxButtons.OKCancel, MessageBoxIcon.Question);
                if (rs == DialogResult.OK)
                {
                    HotelManagementBLL.CheckIn obj = new HotelManagementBLL.CheckIn(dataGridView1);
                    obj.DealCheckIn(textBoxIDCard.Text.Trim(), dateTimePicker1.Value);
                }
                dataGridView1.DataSource = null;
            }
        }

        bool CheckInput()
        {  
            if (dateTimePicker1.Value.Date.Subtract(System.DateTime.Now.Date).TotalDays<1 )
            {
                MessageBox.Show("退房日期必须晚于今天", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return false;
            } 
            if (dataGridView1.SelectedRows.Count > 1)
            {
                MessageBox.Show("条目只能选择一个！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return false;
            }
            if (dataGridView1.SelectedCells.Count == 0 || dataGridView1.CurrentRow.Cells["RoomID"].Value.ToString() == "")
            {
                MessageBox.Show("请选择条目！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return false;
            }
            if (this.textBoxIDCard.Text.Trim() == "")
            {
                MessageBox.Show("身份证号不可为空！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.textBoxIDCard.Focus();
                return false;
            }
            if (this.textBoxIDCard.Text.Trim().Length != 18)
            {
                MessageBox.Show("身份证号长度应为18！", "错误", MessageBoxButtons.OK, MessageBoxIcon.Error);
                this.textBoxIDCard.Focus();
                return false;
            }
            return true;
        }
    }
}
