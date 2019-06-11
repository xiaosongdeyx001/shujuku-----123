using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using System.Windows.Forms;

namespace HotelManagementBLL
{
    public class Roomer
    {
        private DataGridView _dgv;

        public Roomer(DataGridView dgr)
        {
            _dgv = dgr;
        }

        public Roomer()
        {

        } 

        //查询用户信息记录
        public void UpdateDataGrid()
        {
            DataSet objDataSet = HotelManagementDAL.Roomer.FillByAllRoom(); 
            this._dgv.DataSource = objDataSet.Tables[0];
        }

        //添加住客
        public void Add(string ID, string name, Int64 phone, string address, string state, string remark)
        {
            HotelManagementDAL.Roomer obj = new HotelManagementDAL.Roomer();
            if (obj.GetDataReaderByID(ID))
            {
                MessageBox.Show("该身份证号名已经存在" + ID + "，请重新输入！", "身份证号名已存在", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            else
            {
                if (HotelManagementDAL.Roomer.Add(ID, name, phone, address, state,remark) > 0)
                { 
                    UpdateDataGrid();
                    MessageBox.Show("成功添加住客信息！", "操作成功", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    MessageBox.Show("添加住客信息失败！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }


        //修改住客信息
        public void Update(string ID, string name, string phone, string address, string remark)
        { 
            HotelManagementDAL.Roomer obj = new HotelManagementDAL.Roomer(ID);
            obj.IDCard = ID;/// 登记 信息
            obj.Name = name;
            obj.Phone = phone;
            obj.Address = address;
            obj.Remark = remark;
            if (obj.Update() > 0)
            {
                UpdateDataGrid();
                MessageBox.Show("修改住客信息成功！", "操作成功", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                MessageBox.Show("更新操作失败！", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        public void Delete()
        {
            string IDCard = this._dgv.CurrentRow.Cells["ID_Card"].Value.ToString();
            string name = this._dgv.CurrentRow.Cells["Name_"].Value.ToString();
            if (DialogResult.Yes == MessageBox.Show("确认删除住客信息：' " + name + " '吗?\n删除住客，将同时删除与该住客有相关的所有入住信息，要继续吗？", "删除确认", MessageBoxButtons.YesNo, MessageBoxIcon.Question))
            {
                HotelManagementDAL.Roomer objRoom = new HotelManagementDAL.Roomer(IDCard);
                if (objRoom.Delete() > 0)
                {
                    UpdateDataGrid();
                    MessageBox.Show("成功删除住客" + name + " '!", "操作成功", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    MessageBox.Show("删除操作失败 " + name + " '!", "操作失败", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }


        public void Search(string ID, string name, string phone, string address, string state, string remark)
        { 
            DataSet objDataSet = HotelManagementDAL.Roomer.FillByAllRoom();
            objDataSet = HotelManagementDAL.Roomer.SearchByFuzzy(ID, name, phone, address, state, remark);
            _dgv.DataSource = objDataSet.Tables[0];
            if(objDataSet.Tables[0].Rows.Count == 0)
                MessageBox.Show("没有符合的记录！", "结果", MessageBoxButtons.OK, MessageBoxIcon.Information);
            else
                MessageBox.Show("搜索完毕", "结果", MessageBoxButtons.OK, MessageBoxIcon.Information);              
        }
    }
}
