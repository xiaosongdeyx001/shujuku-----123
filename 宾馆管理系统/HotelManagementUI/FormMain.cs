using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;


namespace HotelManagementUI
{
    public partial class FormMain : Form
    {
        private String user;
        public FormMain(String user)
        {
            InitializeComponent();
            this.user = user;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            this.textbox_time.Text = System.DateTime.Now.ToShortDateString() +"   "+ System.DateTime.Now.ToLongTimeString();
        }

        private void FormMain_Load(object sender, EventArgs e)
        {
            this.timer1.Start();
            this.textbox_time.Text = System.DateTime.Now.ToShortDateString() + "   " + System.DateTime.Now.ToLongTimeString();
            this.timer1.Interval = 1000;
            this.toolStripStatusLabel_now_user.Text = user;
        }

        private void FormMain_FormClosed(object sender, FormClosedEventArgs e)
        {
            Application.Exit();
        }

        private void ToolStripMenuItem_room_mng_Click(object sender, EventArgs e)
        {
            new Room.FormRoom().Show(); 
        }

        private void pictureBox_room_Click(object sender, EventArgs e)
        {
            new Room.FormRoom().Show(); 
        }

        private void pictureBox1_roomer_Click(object sender, EventArgs e)
        {
            new Roomer.FormRoomer().Show();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            new CheckIn.FormCheckIn().Show();
        }

        private void ToolStripMenuItemCheckOut_Click(object sender, EventArgs e)
        {
            new CheckIn.FormCheckOut().Show();
        }

        private void ToolStripMenuItem_new_room_Click(object sender, EventArgs e)
        {
            new Room.FormRoom().Show(); 
        }

        private void ToolStripMenuItem_new_roomer_Click(object sender, EventArgs e)
        {
            new Roomer.FormRoomer().Show();
        }

        private void ToolStripMenuItem_logOff_Click(object sender, EventArgs e)
        {
            new FormLogin().Show();
            this.Hide();
        }

        private void ToolStripMenuItem_quit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void ToolStripMenuItem_roomer_mng_Click(object sender, EventArgs e)
        {
            new Roomer.FormRoomer().Show();
        }

        private void ToolStripMenuItem_checkin_mng_Click(object sender, EventArgs e)
        {
            new CheckIn.FormCheckIn().Show();
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            new CheckIn.FormCheckOut().Show();
        }

        private void ToolStripMenuItem_about_Click(object sender, EventArgs e)
        {
            MessageBox.Show("个人酒店管理系统\n       by luckyone\n            2016.1.1\n","关于",MessageBoxButtons.OK);
        }

        private void ToolStripMenuItem_system_mng_Click(object sender, EventArgs e)
        {
            MessageBox.Show("暂未实现\n", "提示", MessageBoxButtons.OK);
        }

        private void ToolStripMenuItem_psMdf_Click(object sender, EventArgs e)
        {
            new System_.FormPsModify(user).Show();
        }

        private void SearchAllLogToolStripMenuItem_Click(object sender, EventArgs e)
        {
            new CheckIn.CheckInLog("").Show();
        }
         
    }
}
