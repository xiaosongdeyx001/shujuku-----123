<%@page contentType="text/html; charset=gb2312" language="java"%>
<jsp:useBean id="MD5" scope="request" class="com.opentravelsoft.util.MD5" />
<%
	//****************************************
	// MD5��ԿҪ�������ύҳ��ͬ����Send.asp��� key = "test" ,�޸�""���� test Ϊ������Կ
	// �������û������MD5��Կ���½����Ϊ���ṩ�̻���̨����ַ��https://merchant3.chinabank.com.cn/
	String key = "test"; // ��½��������ĵ�����������ҵ���B2C�����ڶ������������С�MD5��Կ���á�
	// ����������һ��16λ���ϵ���Կ����ߣ���Կ���64λ��������16λ�Ѿ��㹻��
	//****************************************

	//��ȡ����
	String v_oid = request.getParameter("v_oid"); // ������
	String v_pmode = request.getParameter("v_pmode"); // ֧����ʽ����˵������"���г������ÿ�"
	String v_pstatus = request.getParameter("v_pstatus"); // ֧�������20֧����ɣ�30֧��ʧ�ܣ�
	String v_pstring = request.getParameter("v_pstring"); // ��֧�������˵�����ɹ�ʱ��v_pstatus=20��Ϊ"֧���ɹ�"��֧��ʧ��ʱ��v_pstatus=30��Ϊ"֧��ʧ��"
	String v_amount = request.getParameter("v_amount"); // ����ʵ��֧�����
	String v_moneytype = request.getParameter("v_moneytype"); // ����
	String v_md5str = request.getParameter("v_md5str"); // MD5У����
	String remark1 = request.getParameter("remark1"); // ��ע1
	String remark2 = request.getParameter("remark2"); // ��ע2

	String text = v_oid + v_pstatus + v_amount + v_moneytype + key;
	String v_md5text = MD5.getMD5ofStr(text).toUpperCase();

	if (v_md5str.equals(v_md5text)) {
		if ("30".equals(v_pstatus)) {
			out.print("֧��ʧ��");
		} else if ("20".equals(v_pstatus)) {
			// ֧���ɹ����̻� �����Լ�ҵ������Ӧ�߼�����
			//�˴������̻�ϵͳ���߼����������жϽ��ж�֧��״̬�����¶���״̬�ȵȣ�......
%>

<TABLE width=500 border=0 align="center" cellPadding=0 cellSpacing=0>
    <TR>
      <TD vAlign=top align=middle>
      <div align="left"><B><FONT style="FONT-SIZE: 14px">MD5У����:<%=v_md5str%></FONT></B></div>
      </TD>
    </TR>
    <TR>
      <TD vAlign=top align=middle>
      <div align="left"><B><FONT style="FONT-SIZE: 14px">������:<%=v_oid%></FONT></B></div>
      </TD>
    </TR>
    <TR>
      <TD vAlign=top align=middle>
      <div align="left"><B><FONT style="FONT-SIZE: 14px">֧������:<%=v_pmode%></FONT></B></div>
      </TD>
    </TR>
    <TR>
      <TD vAlign=top align=middle>
      <div align="left"><B><FONT style="FONT-SIZE: 14px">֧�����:<%=v_pstring%></FONT></B></div>
      </TD>
    </TR>
    <TR>
      <TD vAlign=top align=middle>
      <div align="left"><B><FONT style="FONT-SIZE: 14px">֧�����:<%=v_amount%></FONT></B></div>
      </TD>
    </TR>
    <TR>
      <TD vAlign=top align=middle>
      <div align="left"><B><FONT style="FONT-SIZE: 14px">֧������:<%=v_moneytype%></FONT></B></div>
      </TD>
    </TR>
</TABLE>
<%
	}
	} else {
		out.print("У��ʧ��,���ݿ���");
	}
%>