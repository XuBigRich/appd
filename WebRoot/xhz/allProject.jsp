<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<title>项目立项</title>
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
<div>
	<a href="xhz!addProject.action?project.vid=61">县级项目申报</a>
	<a href="xhz!addProject.action?project.vid=62">市级项目申报</a>
	
</div>
<table width=400 cellspacing=1>
	<tr>
		<tb>项目名称</tb>
		<tb>项目状态</tb>
		<tb>审批阶段</tb>
		<tb>级别</tb>
		<tb>申请时间</tb>
		<tb>操作</tb>
	</tr>

<s:iterator value="xm">
	<tr>
		<td>${name }</td>
		<tb>项目状态</tb>
		<tb>审批阶段</tb>
		<td>${head }</td>
		<td>${tim }</td>
		<tr>
		<td><input type="button" onclick="openSena(${sid })" value="资金信息"></td>
		<td><input type="button" onclick="openSena(${sid })" value="项目修改"></td>
		<td><input type="button" onclick="openSena(${sid })" value="项目上报"></td>
		<td><input type="button" onclick="openSena(${sid })" value="审批详情"></td>
		</tr>
	</tr>
</s:iterator>
</table>
</center>
</body>
</html>