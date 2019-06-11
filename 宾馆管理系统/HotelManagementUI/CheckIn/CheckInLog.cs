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
    public partial class CheckInLog : Form
    {
        public CheckInLog(string IdCard)
        {
            InitializeComponent();
            dataGridView1.AutoGenerateColumns = false;
            HotelManagementBLL.CheckIn CI = new HotelManagementBLL.CheckIn(dataGridView1);
            CI.ShowAllCheckInLogByID(IdCard);
        }
    }
}
