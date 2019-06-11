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
    public partial class FormRoomer : Form
    {  
        public FormRoomer()
        {
            InitializeComponent();  
        } 

        private void toolStripButton_add_Click(object sender, EventArgs e)
        {
            new FormRoomerAdd(dataGridView1).Show();
        }

        private void toolStripButton_showAll_Click(object sender, EventArgs e)
        {
            dataGridView1.AutoGenerateColumns = false;
            HotelManagementBLL.Roomer obj = new HotelManagementBLL.Roomer(dataGridView1);
            obj.UpdateDataGrid();
            obj.UpdateDataGrid();
        }

        private void refreshToolStripMenuItem_Click(object sender, EventArgs e)
        {
            toolStripButton_showAll_Click(sender, e);
        } 

        private void FormRoomer_Load(object sender, EventArgs e)
        {
            dataGridView1.AutoGenerateColumns = false;
            HotelManagementBLL.Roomer obj = new HotelManagementBLL.Roomer(dataGridView1);
            obj.UpdateDataGrid();
        }

        private void toolStripButton_modify_Click(object sender, EventArgs e)
        { 
            if(isSelect())
                new FormRoomerModify(dataGridView1).Show();
        }
        private void modifyToolStripMenuItem_Click(object sender, EventArgs e)
        {
            toolStripButton_modify_Click(sender, e);
        }

        bool isSelect()
        {
            if (dataGridView1.SelectedRows.Count > 1)
            {
                MessageBox.Show("条目只能选择一条！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Information);
                return false;
            }
            if (dataGridView1.SelectedCells.Count == 0 || dataGridView1.CurrentRow.Cells["ID_Card"].Value.ToString() == "")
            {
                MessageBox.Show("请选择条目！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return false;
            }
            return true;
        }

        private void toolStripButton_delete_Click(object sender, EventArgs e)
        {
            if (isSelect())
            {
                HotelManagementBLL.Roomer obj = new HotelManagementBLL.Roomer(dataGridView1);
                obj.Delete();
            }
        }

        private void toolStripButton1_Click(object sender, EventArgs e)
        {
            new FormRoomerSearch(dataGridView1).Show(); 
        }

        private void DeleteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            toolStripButton_delete_Click(sender, e);
        }
         
        private void ShowCheckInLogToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (isSelect())
                new CheckIn.CheckInLog(dataGridView1.CurrentRow.Cells["ID_Card"].Value.ToString()).Show();
        }

    }
}
