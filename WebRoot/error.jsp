<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
	<title>error</title>
	<link rel="stylesheet" type="text/css" href="common.css">
	<script language="javascript" src=""></script>
</head>
<script language="javascript">

</script>
<body>
<center>
<h2><s:actionerror/></h2>
<s:fielderror name="txt"/>
<input type="button" value="返   回" onclick="window.history.back(-1)">
</center>
</body>
</html>