<%@ page contentType="text/html;charset=gbk"%>
<html>
<head>
	<title>用户登录</title>
	<link type="text/css" rel="stylesheet" href="common.css">
	<script language="javascript" src="jquery.js"></script>
</head>
<script language="javascript">
function test(){
	if($('#a').val()==""||$('#b').val()==""){
		alert("用户名或密码不能空");
		return false;
	}
	return true;
}
function openSena(){
	showModalDialog("xhz!beforeSenaReg.action",null,"dialogWidth:650px;dialogHeight:330px;");
}
</script>
<body background="img/bg.jpg">
<center>
<table cellspacing=0>
	<tr height=275 valign=bottom>
		<td><img src="img/logo.jpg"></td>
	</tr>
	<tr height=120>
		<td>
			<form action="xhz!login.action" method=post onsubmit="return test();">
				用户名:<input type=text id="a" name="acc.username" size=20><br>
				密&nbsp;&nbsp;码: <input type=password id="b" name="acc.password" size=22><br><br>
				<input type=button value="申报账号注册" onclick="openSena()">
				<input type=submit value="登  录">
			</form>
		</td>
	</tr>
</table>
</center>
</body>
</html>