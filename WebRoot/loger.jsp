<%@ page contentType="text/html;charset=utf-8"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="common.css">
<style type="text/css">
#tab{
	position:absolute;
	left:0px;
	top:0px;
}
td,a{
	color:#dddddd;
}

</style>
</head>
<script type="text/javascript">
function showTime(){
	var t=new Date();
	var y=t.getYear();
	var m=t.getMonth()+1;
	var d=t.getDate();
	var h=t.getHours();
	var ms=t.getMinutes();
	var s=t.getSeconds();
	var day=t.getDay();
	var a=["星期天","星期一","星期二","星期三","星期四","星期五","星期六"];
	document.getElementById("tim").innerText="当前时间:"+y+"年"+m+"月"+d+"日 "+h+":"+ms+":"+s+" "+a[day];
}
setInterval(showTime,1000);
</script>
<script type="text/javascript">
	function fun(a){
		showModalDialog("lk!befupdPwd.action?acc.aid="+a,"null","dialogWidth:600px;dialogHeight:400px;");
	}
</script>
<body scroll=no background="img/bg2.gif">
<center>
<table id="tab" width=1000>
<tr>
	<td align=left width=500>当前登录：${user.dept.name }>>${user.name }&nbsp;(${user.roles.name })</td>
	<td align=center id="tim"></td>
	<td align=center>
		<a href="lk!befupdPwd.action?acc.aid=${user.aid }" target="content">修改密码</a>&nbsp;&nbsp;
		<a href="tuichu.jsp" target="_top" onclick="confirm('是否确定退出?');">退出系统</a>
	</td>
</tr>
</table>
</center>
</body>
</html>