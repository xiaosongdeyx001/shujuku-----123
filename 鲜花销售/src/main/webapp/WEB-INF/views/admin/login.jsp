<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>管理员登录页面</title>

	<script type="text/javascript" src="<c:url value='../../static/js/jquery-1.5.1.js'/>"></script>
	<script type="text/javascript">
		function checkForm() {
			if(!$("#adminname").val()) {
				alert("管理员名称不能为空！");
				return false;
			}
			if(!$("#adminpwd").val()) {
				alert("管理员密码不能为空！");
				return false;
			}
			return true;
		}
	</script>
  </head>
  
  <body>
<div align="center">
<h1>管理员登录页面</h1>
<hr/>
  <p style="font-weight: 900; color: red">${msg }</p>
<form action="<c:url value='/admin/login'/>" method="post" onsubmit="return checkForm()" target="_top">
	<input type="hidden" name="method" value="login"/>
	管理员账户：<input type="text" name="adminname" value="" id="adminname"/><br/>
	密　　　码：<input type="password" name="adminpwd" id="adminpwd"/><br/>
	<input type="submit" value="进入后台"/>
</form>
</div>
  </body>
</html>
