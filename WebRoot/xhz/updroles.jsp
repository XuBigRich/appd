<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base target="_self">
    <title>角色-权限修改</title>

  <link rel="stylesheet" href="<%=basePath%>common.css" type="text/css"></link>
  <script type="text/javascript" src="<%=basePath%>jquery.js"></script>
  <script type="text/javascript">
  	$().ready(function(){
  		var dis=[<s:iterator value="fid" var="d">${d},</s:iterator>];//将已选择的菜单的ID做成数组
  		var fids=document.getElementsByName("fid");//本页面中，全部17个checkbox对象数组
  		for(i=0;i<fids.length;i++){
  			for(j=0;j<dis.length;j++){
  				if(fids[i].value==dis[j]){
  					fids[i].checked=true;
  					break;
  				}
  			}
  		}
  	});
  	
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
   <form action="lk!updRoles.action" method="post"  name="frm" onsubmit="return test()">
   <input type="hidden" name="role.rid" value="${role.rid}">
   	<table width="500" style="background-color:#ccccff">
   		<tr>
	   		<th width="80">角色名</th>
	   		<td width="420" class="left"><input type="text" name="role.name" value="${role.name}"></td>
   		</tr>
   		<tr>
	   		<th>描述</th>
	   		<td class="left"><textarea rows="3" cols="40" name="role.des">${role.des}</textarea></td>
   		</tr>
   		<tr>
	   		<td class="cen" valign="top">权限</td>
	   		<td class="left">
	   			<s:iterator value="funs">
	   				<b>${des}</b>
	   				<s:iterator value="child">
	   					<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	   					<input class="nob" type="checkbox" name="fid" value="${fid}">${des}
	   				</s:iterator><br><br>
	   			</s:iterator>
	   		</td>
   		<tr>
   		<tr>
	   		<td colspan=4 class=cen>
			<input type=button value=" 关  闭 " onclick="window.close()">
			&nbsp;&nbsp;&nbsp;&nbsp;
			<input type=submit value=" 修  改 ">
	</td>
   		</tr>
   	</table>
   	</form>
   </center>
  </body>
</html>
