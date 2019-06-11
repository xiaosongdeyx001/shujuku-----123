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
    public partial class FormRoomModify : Form
    {
        private DataGridView _dgv;
        private int _roomID;
        public FormRoomModify(DataGridView dgv)
        {
            InitializeComponent();
            _dgv = dgv;
        }

        public int RoomID
        {
            get
            {
                return _roomID;
            }
            set
            {
                _roomID = value;
            }
        }
         
        private void Form_Room_Modify_Load(object sender, EventArgs e)
        { 
            RoomID = Int32.Parse(_dgv.CurrentRow.Cells["RoomID"].Value.ToString()); 
            textBox1_name.Text = _dgv.CurrentRow.Cells["RoomName"].Value.ToString();
            textBox2_price.Text = _dgv.CurrentRow.Cells["RoomPrice"].Value.ToString(); 
            comboBox1_kind.Text = _dgv.CurrentRow.Cells["RoomKind"].Value.ToString();
            textBox3_remark.Text = _dgv.CurrentRow.Cells["RoomRemark"].Value.ToString();
            textBox_state.Text = _dgv.CurrentRow.Cells["RoomState"].Value.ToString(); 
        }

        private void button2_clr_Click(object sender, EventArgs e)
        {
            textBox1_name.Text = "";
            textBox2_price.Text = "";
            textBox3_remark.Text = "";
            comboBox1_kind.Text = "";
            textBox_state.Text = "";
        }

        private void button3_close_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button1_modify_Click(object sender, EventArgs e)
        {
            if (CheckInput())
            { 
                string name = textBox1_name.Text.Trim();
                decimal price = Decimal.Parse(textBox2_price.Text.Trim());
                string remark = textBox3_remark.Text.Trim();
                string kind = comboBox1_kind.Text.Trim();
                string state = textBox_state.Text.Trim();
                HotelManagementBLL.Room obj = new HotelManagementBLL.Room(_dgv);
                obj.Update(_roomID,name, price, kind, state, remark);
            }
        }

        private bool CheckInput()
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
         

        private void textBox2_price_KeyPress_1(object sender, KeyPressEventArgs e)
        {
            if (!(Char.IsNumber(e.KeyChar)) && e.KeyChar != (char)8 && e.KeyChar != '.')
            {
                e.Handled = true;
            }
        }
         
    }
}
