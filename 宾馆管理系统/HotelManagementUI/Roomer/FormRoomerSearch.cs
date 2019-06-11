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
    public partial class FormRoomerSearch : Form
    {
        private DataGridView _dgv;

        public FormRoomerSearch(DataGridView dgv)
        {
            InitializeComponent();
            _dgv = dgv;
        } 

        private void button2_clr_Click(object sender, EventArgs e)
        {
            textBoxIDCard.Text = "";
            textBoxName.Text = "";
            textBoxPhone.Text = "";
            textBoxAddress.Text = "";
            textBox3_remark.Text = ""; 
        }

        private void button1_Search_Click(object sender, EventArgs e)
        {
            string id = textBoxIDCard.Text.Trim();
            string name = textBoxName.Text.Trim();
            string phone = textBoxPhone.Text.Trim();
            string address = textBoxAddress.Text.Trim();
            string remark = textBox3_remark.Text.Trim();
            string state = this.comboBoxState.Text.Trim();
            HotelManagementBLL.Roomer obj = new HotelManagementBLL.Roomer(_dgv); 
            obj.Search(id, name, phone, address, state, remark);
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
 

        private void textBoxPhone_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!(Char.IsNumber(e.KeyChar)) && e.KeyChar != (char)8 && e.KeyChar != '.')
            {
                e.Handled = true;
            }
        }


    }
}
