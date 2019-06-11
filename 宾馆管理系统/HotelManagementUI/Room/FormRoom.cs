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
    public partial class FormRoom : Form
    {
        public FormRoom()
        {
            InitializeComponent();  
        }


        private void toolStripButton_add_Click(object sender, EventArgs e)
        {
            new FormRoomAdd(dataGridView1).Show();
        }

        private void toolStripButton_showAll_Click(object sender, EventArgs e)
        {
            dataGridView1.AutoGenerateColumns = false;
            HotelManagementBLL.Room obj = new HotelManagementBLL.Room(dataGridView1);
            obj.UpdateDataGrid();
        }

        private void Form_Room_Load(object sender, EventArgs e)
        {
            dataGridView1.AutoGenerateColumns = false;
            HotelManagementBLL.Room obj = new HotelManagementBLL.Room(dataGridView1);
            obj.UpdateDataGrid();
        }

        private void toolStripButton_modify_Click(object sender, EventArgs e)
        {
            if (isSelect())
            {
                new FormRoomModify(dataGridView1).Show();
            }
        }

        private void toolStripButton_delete_Click(object sender, EventArgs e)
        {
            if (isSelect())
            {
                HotelManagementBLL.Room objRoom = new HotelManagementBLL.Room(dataGridView1);
                objRoom.Delete();
            }
        }

        private void toolStripButton1_Click(object sender, EventArgs e)
        {
            new FormRoomSearch(dataGridView1).Show(); 
        }

        bool isSelect()
        { 
            if (dataGridView1.SelectedRows.Count > 1)
            {
                MessageBox.Show("条目只能选择一条！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return false;
            }
            if (dataGridView1.SelectedCells.Count == 0 || dataGridView1.CurrentRow.Cells["RoomName"].Value.ToString() == "")
            {
                MessageBox.Show("请选择条目！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return false;
            }
            return true;
        }

        private void deleteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (isSelect())
            {
                HotelManagementBLL.Room objRoom = new HotelManagementBLL.Room(dataGridView1);
                objRoom.Delete();
            }
        }

        private void modifyToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (isSelect())
            {
                new FormRoomModify(dataGridView1).Show();
            }
        }

        private void refreshToolStripMenuItem_Click(object sender, EventArgs e)
        {
            dataGridView1.AutoGenerateColumns = false;
            HotelManagementBLL.Room obj = new HotelManagementBLL.Room(dataGridView1);
            obj.UpdateDataGrid();
        }

        private void checkinToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (isSelect())
            {
                new CheckIn.FormCheckIn().Show();
            }
        }
    }
}
