using System;
using System.Collections.Generic;
using System.Text;
using System.Data;
using System.Data.Sql;
using System.Data.SqlClient;
using System.Windows.Forms;

namespace HotelManagementDAL
{
    public class SqlCommon
    {
        static private string _connString = "Database='HotelManagement';Data Source='localhost';User Id='root';Password='root';charset='utf8';pooling=true";


        public int ExecuteNonQuery(string commandText, bool usingTransaction, bool isProcedure, params SqlParameter[] paras)
        {
            SqlConnection conn = new SqlConnection(_connString);
            SqlCommand cmd = new SqlCommand(commandText, conn);
            SqlTransaction trans = null;
            if (isProcedure)
            {
                cmd.CommandType = CommandType.StoredProcedure;
            }
            foreach (SqlParameter p in paras)
            {
                cmd.Parameters.Add(p);
            }
            try
            {
                conn.Open();
                if (usingTransaction)
                {
                    trans = conn.BeginTransaction();
                    cmd.Transaction = trans;
                }
                int affected = cmd.ExecuteNonQuery();
                if (trans != null)
                {
                    trans.Commit();
                }
                return affected;
            }
            catch(SqlException ex) 
            {
                if (trans != null)
                {
                    trans.Rollback();
                }
                MessageBox.Show(ex.Message);
            }
            finally
            {
                conn.Close();
            }
            return -1;
        }

        public int ExecuteNonQuery(string commandText, bool isProcedure, params SqlParameter[] paras)
        {
            return ExecuteNonQuery(commandText, false, isProcedure, paras);
        }

        public int ExecuteNonQuery(string commandText, params SqlParameter[] paras)
        {
            return ExecuteNonQuery(commandText, false, false, paras);
        }

        public SqlDataReader ExecuteReader(string commandText, bool isProcedure, params SqlParameter[] paras)
        {
            SqlConnection conn = new SqlConnection(_connString);
            MessageBox.Show("ddd" + _connString);
            SqlCommand cmd = new SqlCommand(commandText, conn);
            MessageBox.Show("ddd" + commandText);
            if (isProcedure)
            {
                cmd.CommandType = CommandType.StoredProcedure;
            }
            if (paras != null)
            {
                foreach (SqlParameter p in paras)
                {
                    cmd.Parameters.Add(p);
                }
            }
            SqlDataReader reader = null;
            try
            {
                conn.Open();
                reader = cmd.ExecuteReader(CommandBehavior.CloseConnection);
            }
            catch (SqlException ex )
            {
                conn.Close();
                MessageBox.Show(ex.Message);
            }
            return reader;
        }

        public SqlDataReader ExecuteReader(string commandText, params SqlParameter[] paras)
        {
            return ExecuteReader(commandText, false, paras);
        }

        public DataSet CreaDataSet(string commandText, bool isProcedure, params SqlParameter[] paras)
        {
            SqlConnection conn = new SqlConnection();
            SqlCommand cmd = new SqlCommand(commandText, conn);
            if (isProcedure)
            {
                cmd.CommandType = CommandType.StoredProcedure;
            }
            if (paras != null)
            {
                foreach (SqlParameter p in paras)
                {
                    cmd.Parameters.Add(p);
                }
            }
            SqlDataAdapter adapter = new SqlDataAdapter(cmd);
            DataSet ds = new DataSet();
            try
            {
                adapter.Fill(ds);
                return ds;
            }
            catch (SqlException ex)
            {
                if (conn.State != ConnectionState.Closed)
                {
                    conn.Close();
                }
                MessageBox.Show(ex.Message);
            }
            return null;
        }

        public DataSet CreaDataSet(string commandText, params SqlParameter[] paras)
        {
            return CreaDataSet(commandText, false, paras);
        }

        public void FillDataSet(string commandText, bool isProcedure, string tableName, DataSet dataset, SqlParameter[] paras)
        {
            SqlConnection conn = new SqlConnection();
            SqlCommand cmd = new SqlCommand(commandText, conn);
            if (isProcedure)
            {
                cmd.CommandType = CommandType.StoredProcedure;
            }
            foreach (SqlParameter p in paras)
            {
                cmd.Parameters.Add(p);
            }
            SqlDataAdapter adapter = new SqlDataAdapter(cmd);
            try
            {
                adapter.Fill(dataset, tableName);
            }
            catch (SqlException ex) 
            {
                if (conn.State != ConnectionState.Closed)
                {
                    conn.Close();
                }
                MessageBox.Show(ex.Message);
            }
        }

    }

}