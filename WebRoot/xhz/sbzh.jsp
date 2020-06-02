<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<title>项目申报单位管理</title>
 <link rel="stylesheet" href="../common.css" type="text/css"></link>
<script language="javascript" >
function openSena(n){
	var result = showModalDialog("xhz!SenaReg.action?sena.sid="+n,null,"dialogWidth:650px;dialogHeight:330px;");
	location.reload()
}

</script>
</head>
<body>
<center>
<form action="#">
<s:textfield label="单位名称"/>
<s:submit value="查询"/>
</form>
<table width=400 cellspacing=1>
	<tr>
		<tb>单位名称</tb>
		<tb>所属区县</tb>
		<tb>联系人</tb>
		<tb>申请时间</tb>
		<tb>操作</tb>
	</tr>

<s:iterator value="sbzh">
	<tr>
		<td>${unit }</td>
		<td>${bid }</td>
		<td>${tact }</td>
		<td>${tim }</td>
		<td><input type="button" onclick="openSena(${sid })" value="查看"></td>
	</tr>
</s:iterator>
</table>
</center>
</body>
</html>