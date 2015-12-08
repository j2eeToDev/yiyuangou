<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>
   
<body>
	<form action="user/login" method="post">
	<div>
		UserName:<input type="text" name="userName" value="root"/> <br/>
		PassWord:<input type="password" name="password" value="1111"/><br/> 
		status:<input type="text" name="status" value="0"/><br/> 
		<input type="submit" id="loginBtn" value="Login" />
	</div>
	</form>
</body>
</html>
