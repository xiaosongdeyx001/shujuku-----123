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
    public partial class FormRoomSearch : Form
    {
        private DataGridView _dgv;

        public FormRoomSearch(DataGridView dgv)
        {
            InitializeComponent();
            _dgv = dgv;
        } 

        private void button2_clr_Click(object sender, EventArgs e)
        {
            textBox1_name.Text = "";
            textBox2_price.Text = "";
            comboBox1_kind.Text = "";
        }

        private void button1_search_Click(object sender, EventArgs e)
        {
            string name = textBox1_name.Text.Trim();
            decimal price = 0;
            if(textBox2_price.Text.Trim() != "")
                price = Decimal.Parse(textBox2_price.Text.Trim());
            decimal price2 = Decimal.MaxValue;
            if (textBox_price2.Text.Trim() != "")
                price2 = Decimal.Parse(textBox_price2.Text.Trim());
            string kind = comboBox1_kind.Text.Trim();
            string state = textBox_state.Text.Trim();
            HotelManagementBLL.Room obj = new HotelManagementBLL.Room(_dgv);
            obj.Search(name, price,price2, kind,state,checkBox_auto.Checked);
        }

        private void textBox2_price_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!(Char.IsNumber(e.KeyChar)) && e.KeyChar != (char)8 && e.KeyChar != '.')
            {
                e.Handled = true;
            }
        }

        private void button3_close_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void textBox_price2_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!(Char.IsNumber(e.KeyChar)) && e.KeyChar != (char)8 && e.KeyChar != '.')
            {
                e.Handled = true;
            }
        }
    }
}
