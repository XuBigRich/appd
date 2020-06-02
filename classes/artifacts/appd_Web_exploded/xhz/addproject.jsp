<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
   <title>添加项目</title>
  <link rel="stylesheet" href="<%=basePath%>common.css" type="text/css"></link>
  <script type="text/javascript" src="<%=basePath%>jquery.js"></script>
  <script type="text/javascript" src="<%=basePath%>time.js" charset="gbk"></script>
  </head>
  <style type="text/css">
	td{
		height:25px;
	}

  </style>
  <script type="text/javascript">
  	
  	function addRow(){
  		var trc=document.getElementById("tr").cloneNode(true);
  		trc.id="";
  		document.getElementById("tb").appendChild(trc);
  	}
  	function delRow(){
  		var i=event.srcElement.parentElement.parentElement.rowIndex;
  		document.getElementById("tab").deleteRow(i);
  	}
  </script>
  <body onload="fun()">
  <center>
  	<table style="display:none;">
  		<tr id="tr">
  			<td align="center" colspan="4">附件地址:&nbsp;&nbsp;<input type="file" name="txt">&nbsp;&nbsp;
  				<input type="button" value=" 删除 " onclick="delRow()">
  			</td>
  		</tr>
  	</table>
  	<form action="xhz!saveProject.action" method="post" enctype="multipart/form-data">
  	<table width="900" id="tab">
  	<input type="hidden" name="project.vid" value="${project.vid }">
  		<tr>
  			<td class="left" colspan="4" style="font-size:18px;color:blue;">&nbsp;&nbsp;项目基本信息</td>
  		</tr>
  		<tr>
  			<td class="right">项目名称:</td>
  			<td class="left"><input type="text" name="project.name"><font color="red">*</font></td>
  			<td class="right">项目类型:</td>
  			<td class="left">
  				<span class="selspan">
  					<select name="project.tid">
  						<s:iterator value="xmlx">
  							<option value="${bid }">${name }</option>
  						</s:iterator>
  					</select>
  				</span><font color="red">*</font>
  			</td>
  		</tr>
  		<tr>
  			<td class="right">上报年度:</td>
  			<td class="left"><input type="text" name="project.year" value="${project.year }" readonly><font color="red">*</font></td>
  			<td class="right">所属区县:</td>
  			<td class="left">
  				<span class="selspan">
  					<select name="project.cid" id="cid">
  						<s:iterator value="qhs">
  							<option value="${bid }">${name }</option>
  						</s:iterator>
  					</select>
  				</span><font color="red">*</font>
  			</td>
  		</tr>
  		<tr>
  			<td class="right">经度:</td>
  			<td class="left"><input type="text" name="project.lon"></td>
  			<td class="right">纬度:</td>
  			<td class="left"><input type="text" name="project.lat"></td>
  		</tr>
  		<tr>
  			<td class="right">预开工时间:</td>
  			<td class="left"><input type="text" name="project.star" readonly onclick="setday(this)"><font color="red">*</font></td>
  			<td class="right">预验收时间:</td>
  			<td class="left"><input type="text" name="project.en" readonly onclick="setday(this)"><font color="red">*</font></td>
  		</tr>
  		<tr>
  			<td class="right">项目地址:</td>
  			<td class="left"><input type="text" name="project.ress"></td>
  			<td class="right">建设单位:</td>
  			<td class="left">
  				<span class="selspan">
  					<select name="project.bid">
  						<s:iterator value="jsdw">
  							<option value="${did }">${name }</option>
  						</s:iterator>
  					</select>
  				</span><font color="red">*</font>
  			</td>
  		</tr>
  		<tr>
  			<td class="right">补助金类型:</td>
  			<td class="left">
  				<span class="selspan">
  					<select name="project.aid">
  						<s:iterator value="bzjlx">
  							<option value="${bid }">${name }</option>
  						</s:iterator>
  					</select>
  				</span><font color="red">*</font>
  			</td>
  			<td class="right">补助金额:</td>
  			<td class="left"><input type="text" name="project.mon"><font color="red">*</font></td>
  		</tr>
  		
  		<tr>
  			<td class="right">项目负责人:</td>
  			<td class="left"><input type="text" name="project.head"></td>
  			<td class="right">负责人电话:</td>
  			<td class="left"><input type="text" name="project.mob"></td>
  		</tr>
  		<tr>
  			<td class="right">投资金额:</td>
  			<td class="left" colspan="3"><input type="text" name="project.total"><font color="red">*</font></td>
  		</tr>
  		<tr>
  			<td class="right" valign="top">项目概述:</td>
  			<td class="left" colspan="3">
  				<textarea rows="3" cols="50" name="project.des"></textarea>
  			</td>
  		</tr>
  		<tr>
  			<td colspan="4"></td>
  		</tr>
  		<tr>
  			<td colspan="4" style="font-size:18px;"><a href="javascript:addRow()">添加附件</a></td>
  		</tr>
  		<tbody id="tb"></tbody>
  		<tr>
  			<td colspan="4"></td>
  		</tr>
  		<tr>
  			<td colspan="4">
  				<table width="900">
			  		<tr>
			  			<td class="left" colspan="4" style="font-size:18px;color:blue;">&nbsp;&nbsp;投资构成</td>
			  		</tr>
			  		<tr>
			  			<td class="right">总投资:</td>
			  			<td class="left"><input type="text" name="money.total"></td>
			  			<td class="right">国家拨款:</td>
			  			<td class="left"><input type="text" name="money.cou"></td>
			  		</tr>
			  		<tr>
			  			<td class="right">省拨款:</td>
			  			<td class="left"><input type="text" name="money.pro"></td>
			  			<td class="right">市拨款:</td>
			  			<td class="left"><input type="text" name="money.city"></td>
			  		</tr>
			  		<tr>
			  			<td class="right">企业配套资金:</td>
			  			<td class="left"><input type="text" name="money.com"></td>
			  			<td class="right">县拨款:</td>
			  			<td class="left"><input type="text" name="money.dist"></td>
			  		</tr>
			  	</table>
			  	
  			</td>
  		</tr>
  		<tr>
  			<td class="right" colspan="2"><input type="submit" value=" 提交 ">&nbsp;&nbsp;</td>
  			<td class="left" colspan="2">&nbsp;&nbsp;<input type="button" value=" 返回 " onclick="window.history.back(-1)"></td>
  		</tr>
  	</table>
  	</form>	
  </center>
  </body>
</html>