<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
     <base target="_self">
    <title>角色-权限添加</title>

  <link rel="stylesheet" href="<%=basePath%>common.css" type="text/css"></link>
  <script type="text/javascript" src="<%=basePath%>jquery.js"></script>
  <script type="text/javascript">
  function test(){
  	var f=document.frm.all;
  	for(i=0;i<f.length;i++){
  		if(f[i].value==""){
  			alert("请填写完整！！");
  			return false;
  		}
  	}
  	return true;
  }
  </script>
  </head>
  
  <body>
   <center>
   <form action="xhz!addRoles.action" method="post" name="frm" onsubmit="return test()">
   	<table  width="500" style="background-color:#ccccff">
   		<tr>
	   		<th width="80">角色名</th>
	   		<td width="420" class=left><input type="text" name="role.name"></td>
   		</tr>
   		<tr>
	   		<th>描述</th>
	   		<td class=left><textarea rows="3" cols="40" name="role.des"></textarea></td>
   		</tr>
   		<tr>
	   		<td class="cen" valign="top">权限</td>
	   		<td class=left>
	   			<s:iterator value="funs">
	   				<b>${des}</b>
	   				<s:iterator value="child">
	   					<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	   					<input class="nob" type="checkbox" name="fid" value="${fid }">${des}
	   				</s:iterator><br><br>
	   			</s:iterator>
	   		</td>
   		<tr>
   		<tr>
	   		<td colspan=4 class=cen>
	   			<input type=submit value=" 添 加 ">
	   			&nbsp;&nbsp;&nbsp;&nbsp;
				<input type=button value=" 返 回 " onclick="window.history.back(-1)">
		</td>
   		</tr>
   	</table>
   	</form>
   </center>
  </body>
</html>
