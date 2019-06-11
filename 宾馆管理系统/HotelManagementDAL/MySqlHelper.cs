using System;
using System.Collections;
using System.Configuration;
using MySql.Data;
using MySql.Data.MySqlClient;
using System.Data;

/// <summary>
///MYSQLHelper ��ժҪ˵��
/// </summary>
public abstract class MySqlHelper
{
    //���ݿ������ַ���
    public static string Conn = "Database='Hotel_Management';Data Source='localhost';User Id='root';Password='123456';charset='utf8';pooling=true";

    /// <summary>
    /// �Զ���ĺ�������
    /// </summary>
    /// <param name="connectionString"></param>
    /// <param name="cmdType"></param>
    /// <param name="cmdText"></param>
    /// <param name="commandParameters"></param>
    /// <returns></returns>
    public static MySqlDataReader ExecuteReader(string cmdText, params MySqlParameter[] commandParameters)
    {
        return ExecuteReader(Conn, CommandType.Text, cmdText, commandParameters);
    }

    public static DataSet GetDataSet(string cmdText, params MySqlParameter[] commandParameters)
    {
        return GetDataSet(Conn, CommandType.Text, cmdText, commandParameters);
    }

    public static int ExecuteNonQuery(string cmdText, params MySqlParameter[] commandParameters)
    {
        return ExecuteNonQuery(Conn, CommandType.Text, cmdText, commandParameters);
    }

    // ���ڻ��������HASH��
    private static Hashtable parmCache = Hashtable.Synchronized(new Hashtable());

    /// <summary>
    ///  �������ӵ����ݿ��ü������ִ��һ��sql������������ݼ���
    /// </summary>
    /// <param name="connectionString">һ����Ч�������ַ���</param>
    /// <param name="cmdType">��������(�洢����, �ı�, �ȵ�)</param>
    /// <param name="cmdText">�洢�������ƻ���sql�������</param>
    /// <param name="commandParameters">ִ���������ò����ļ���</param>
    /// <returns>ִ��������Ӱ�������</returns>
    public static int ExecuteNonQuery(string connectionString, CommandType cmdType, string cmdText, params MySqlParameter[] commandParameters)
    {

        MySqlCommand cmd = new MySqlCommand();

        using (MySqlConnection conn = new MySqlConnection(connectionString))
        {
            PrepareCommand(cmd, conn, null, cmdType, cmdText, commandParameters);
            int val = cmd.ExecuteNonQuery();
            cmd.Parameters.Clear();
            return val;
        }
    }

    /// <summary>
    /// �����е����ݿ�����ִ��һ��sql������������ݼ���
    /// </summary>
    /// <param name="connection">һ�����е����ݿ�����</param>
    /// <param name="cmdType">��������(�洢����, �ı�, �ȵ�)</param>
    /// <param name="cmdText">�洢�������ƻ���sql�������</param>
    /// <param name="commandParameters">ִ���������ò����ļ���</param>
    /// <returns>ִ��������Ӱ�������</returns>
    public static int ExecuteNonQuery(MySqlConnection connection, CommandType cmdType, string cmdText, params MySqlParameter[] commandParameters)
    {

        MySqlCommand cmd = new MySqlCommand();

        PrepareCommand(cmd, connection, null, cmdType, cmdText, commandParameters);
        int val = cmd.ExecuteNonQuery();
        cmd.Parameters.Clear();
        return val;
    }

    /// <summary>
    ///ʹ�����е�SQL����ִ��һ��sql������������ݼ���
    /// </summary>
    /// <remarks>
    ///����:
    ///  int result = ExecuteNonQuery(connString, CommandType.StoredProcedure, "PublishOrders", new MySqlParameter("@prodid", 24));
    /// </remarks>
    /// <param name="trans">һ�����е�����</param>
    /// <param name="cmdType">��������(�洢����, �ı�, �ȵ�)</param>
    /// <param name="cmdText">�洢�������ƻ���sql�������</param>
    /// <param name="commandParameters">ִ���������ò����ļ���</param>
    /// <returns>ִ��������Ӱ�������</returns>
    public static int ExecuteNonQuery(MySqlTransaction trans, CommandType cmdType, string cmdText, params MySqlParameter[] commandParameters)
    {
        MySqlCommand cmd = new MySqlCommand();
        PrepareCommand(cmd, trans.Connection, trans, cmdType, cmdText, commandParameters);
        int val = cmd.ExecuteNonQuery();
        cmd.Parameters.Clear();
        return val;
    }

    /// <summary>
    /// ��ִ�е����ݿ�����ִ��һ���������ݼ���sql����
    /// </summary>
    /// <remarks>
    /// ����:
    ///  MySqlDataReader r = ExecuteReader(connString, CommandType.StoredProcedure, "PublishOrders", new MySqlParameter("@prodid", 24));
    /// </remarks>
    /// <param name="connectionString">һ����Ч�������ַ���</param>
    /// <param name="cmdType">��������(�洢����, �ı�, �ȵ�)</param>
    /// <param name="cmdText">�洢�������ƻ���sql�������</param>
    /// <param name="commandParameters">ִ���������ò����ļ���</param>
    /// <returns>��������Ķ�ȡ��</returns>
    public static MySqlDataReader ExecuteReader(string connectionString, CommandType cmdType, string cmdText, params MySqlParameter[] commandParameters)
    {
        //����һ��MySqlCommand����
        MySqlCommand cmd = new MySqlCommand();
        //����һ��MySqlConnection����
        MySqlConnection conn = new MySqlConnection(connectionString);

        //������������һ��try/catch�ṹִ��sql�ı�����/�洢���̣���Ϊ��������������һ���쳣����Ҫ�ر����ӣ���Ϊû�ж�ȡ�����ڣ�
        //���commandBehaviour.CloseConnection �Ͳ���ִ��
        try
        {
            //���� PrepareCommand �������� MySqlCommand �������ò���
            PrepareCommand(cmd, conn, null, cmdType, cmdText, commandParameters);
            //���� MySqlCommand  �� ExecuteReader ����
            MySqlDataReader reader = cmd.ExecuteReader(CommandBehavior.CloseConnection);
            //�������
            cmd.Parameters.Clear();
            return reader;
        }
        catch
        {
            //�ر����ӣ��׳��쳣
            conn.Close();
            throw;
        }
    }

    /// <summary>
    /// ����DataSet
    /// </summary>
    /// <param name="connectionString">һ����Ч�������ַ���</param>
    /// <param name="cmdType">��������(�洢����, �ı�, �ȵ�)</param>
    /// <param name="cmdText">�洢�������ƻ���sql�������</param>
    /// <param name="commandParameters">ִ���������ò����ļ���</param>
    /// <returns></returns>
    public static DataSet GetDataSet(string connectionString, CommandType cmdType, string cmdText, params MySqlParameter[] commandParameters)
    {
        //����һ��MySqlCommand����
        MySqlCommand cmd = new MySqlCommand();
        //����һ��MySqlConnection����
        MySqlConnection conn = new MySqlConnection(connectionString);

        //������������һ��try/catch�ṹִ��sql�ı�����/�洢���̣���Ϊ��������������һ���쳣����Ҫ�ر����ӣ���Ϊû�ж�ȡ�����ڣ�

        try
        {
            //���� PrepareCommand �������� MySqlCommand �������ò���
            PrepareCommand(cmd, conn, null, cmdType, cmdText, commandParameters);
            //���� MySqlCommand  �� ExecuteReader ����
            MySqlDataAdapter adapter = new MySqlDataAdapter();
            adapter.SelectCommand = cmd;
            DataSet ds = new DataSet();

            adapter.Fill(ds);
            //�������
            cmd.Parameters.Clear();
            conn.Close();
            return ds;
        }
        catch (Exception e)
        {
            throw e;
        }
    }



    /// <summary>
    /// ��ָ�������ݿ������ַ���ִ��һ���������һ�����ݼ��ĵ�һ��
    /// </summary>
    /// <remarks>
    ///����:
    ///  Object obj = ExecuteScalar(connString, CommandType.StoredProcedure, "PublishOrders", new MySqlParameter("@prodid", 24));
    /// </remarks>
    ///<param name="connectionString">һ����Ч�������ַ���</param>
    /// <param name="cmdType">��������(�洢����, �ı�, �ȵ�)</param>
    /// <param name="cmdText">�洢�������ƻ���sql�������</param>
    /// <param name="commandParameters">ִ���������ò����ļ���</param>
    /// <returns>�� Convert.To{Type}������ת��Ϊ��Ҫ�� </returns>
    public static object ExecuteScalar(string connectionString, CommandType cmdType, string cmdText, params MySqlParameter[] commandParameters)
    {
        MySqlCommand cmd = new MySqlCommand();

        using (MySqlConnection connection = new MySqlConnection(connectionString))
        {
            PrepareCommand(cmd, connection, null, cmdType, cmdText, commandParameters);
            object val = cmd.ExecuteScalar();
            cmd.Parameters.Clear();
            return val;
        }
    }

    /// <summary>
    /// ��ָ�������ݿ�����ִ��һ���������һ�����ݼ��ĵ�һ��
    /// </summary>
    /// <remarks>
    /// ����:
    ///  Object obj = ExecuteScalar(connString, CommandType.StoredProcedure, "PublishOrders", new MySqlParameter("@prodid", 24));
    /// </remarks>
    /// <param name="connection">һ�����ڵ����ݿ�����</param>
    /// <param name="cmdType">��������(�洢����, �ı�, �ȵ�)</param>
    /// <param name="cmdText">�洢�������ƻ���sql�������</param>
    /// <param name="commandParameters">ִ���������ò����ļ���</param>
    /// <returns>�� Convert.To{Type}������ת��Ϊ��Ҫ�� </returns>
    public static object ExecuteScalar(MySqlConnection connection, CommandType cmdType, string cmdText, params MySqlParameter[] commandParameters)
    {

        MySqlCommand cmd = new MySqlCommand();

        PrepareCommand(cmd, connection, null, cmdType, cmdText, commandParameters);
        object val = cmd.ExecuteScalar();
        cmd.Parameters.Clear();
        return val;
    }

    /// <summary>
    /// ������������ӵ�����
    /// </summary>
    /// <param name="cacheKey">��ӵ�����ı���</param>
    /// <param name="commandParameters">һ����Ҫ��ӵ������sql��������</param>
    public static void CacheParameters(string cacheKey, params MySqlParameter[] commandParameters)
    {
        parmCache[cacheKey] = commandParameters;
    }

    /// <summary>
    /// �һػ����������
    /// </summary>
    /// <param name="cacheKey">�����һز����Ĺؼ���</param>
    /// <returns>����Ĳ�������</returns>
    public static MySqlParameter[] GetCachedParameters(string cacheKey)
    {
        MySqlParameter[] cachedParms = (MySqlParameter[])parmCache[cacheKey];

        if (cachedParms == null)
            return null;

        MySqlParameter[] clonedParms = new MySqlParameter[cachedParms.Length];

        for (int i = 0, j = cachedParms.Length; i < j; i++)
            clonedParms[i] = (MySqlParameter)((ICloneable)cachedParms[i]).Clone();

        return clonedParms;
    }

    /// <summary>
    /// ׼��ִ��һ������
    /// </summary>
    /// <param name="cmd">sql����</param>
    /// <param name="conn">OleDb����</param>
    /// <param name="trans">OleDb����</param>
    /// <param name="cmdType">������������ �洢���̻����ı�</param>
    /// <param name="cmdText">�����ı�,����:Select * from Products</param>
    /// <param name="cmdParms">ִ������Ĳ���</param>
    private static void PrepareCommand(MySqlCommand cmd, MySqlConnection conn, MySqlTransaction trans, CommandType cmdType, string cmdText, MySqlParameter[] cmdParms)
    {

        if (conn.State != ConnectionState.Open)
            conn.Open();

        cmd.Connection = conn;
        cmd.CommandText = cmdText;

        if (trans != null)
            cmd.Transaction = trans;

        cmd.CommandType = cmdType;

        if (cmdParms != null)
        {
            foreach (MySqlParameter parm in cmdParms)
                cmd.Parameters.Add(parm);
        }
    }

}