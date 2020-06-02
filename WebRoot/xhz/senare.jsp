<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
	<base target="_self">
	<title>项目申报单位账户申请</title>
	<link rel="stylesheet" type="text/css" href="common.css">
	<script language="javascript" src=""></script>
</head>
  <style type="text/css">
    th{
      width:180px;
      text-align:right;
   };
    select{
      width:155;
    };
   </style>   
<script language="javascript">
function sc(){
	var a=confirm("确定删除？");
	if(a){
	var frm=document.getElementById("frm");
	frm.action="xhz!delet.action?sena.sid="+${sena.sid };
	frm.submit();
	window.close();
	}
}	
  function checkEm(){
  var em=document.getElementById("em");
  var q3=/^[a-zA-Z0-9_]{3,}@[a-zA-Z0-9]+.[a-z]{3}$/
   if(!q3.test(em.value)){
      em.style.borderColor="red";
      document.getElementById("em").value="";
   }
    else{em.style.borderColor="black";}
 }
 
 function checkMob(){
  var mob=document.getElementById("mob");
  var q4=/^1\d{10}$/
  if(!q4.test(mob.value)){
    mob.style.borderColor="red";
    document.getElementById("mob").value="";
  }
  else{mob.style.borderColor="black";}
 }
 
  function test(){
	 var fa=document.frm.all;
	 for(i=0;i<fa.length;i++){
	     if(fa[i].value==""){
	       alert("请填写完整");
	       return false;
	     }
	 }
	 return true;
}
</script>
<body>
<center>
<form id="frm" action="xhz!savauser.action" method="post" onsubmit="return test();">
<table width=650 style="background-color:#ccccff">
 <tr> 
   <th class="right">单位名称<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.unit" value=${sena.unit }></th>
   <th class="right">联系方式(移动电话)<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.mob" value=${sena.mob } id="mob" onblur="checkMob();"></th>
 </tr>
  <tr>
   <th class="right">机构码<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.code" value=${sena.code }></th>
   <th class="right">职务<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.job" value=${sena.job }></th>
 </tr>
  <tr>
   <th class="right">法人代表<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.fade" value=${sena.fade }></th>
   <th class="right">固定电话<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.tel" value=${sena.tel }></th>
 </tr>
  <tr>
   <th class="right">地址<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.ress" value=${sena.ress }></th>
   <th class="right">电子邮箱：</th>
   <th class="left"><input type=text name="sena.em" value=${sena.em } id="em" onblur="checkEm();"></th>
 </tr>
  <tr>
   <th class="right">所属区划<font color="red">*</font>：</th>
   <th class="left">
   <span class="selspan">
     <select name="sena.bid" value=${sena.bid }>
       <s:iterator value="qhs">
         <option value="${bid }">${name }</option>
       </s:iterator>
      </select>
     </span>
   </th>
   <th class="right">账号：</th>
   <th class="left"><input type=text name="sena.username" value=${sena.username }></th>
 </tr>
  <tr>
   <th class="right">联系人<font color="red">*</font>：</th>
   <th class="left"><input type=text  name="sena.tact" value=${sena.tact }></th>
   <th class="right">密码：</th>
   <th class="left"><input type=password  name="sena.password" value=${sena.password }></th>
 </tr>
  <tr>
   <th class="right" valign="top">备注：</th>
   <th class="left" colspan=3><textarea cols="60" rows="6"  name="sena.des" value=${sena.des }></textarea></th>
 </tr>
 <tr>
    <th colspan=4 align="center">
      <input type=submit value=" 归档 " >&nbsp;&nbsp;
      <input type=button value=" 删除 " onclick="sc()">&nbsp;&nbsp;
      <input type=button value=" 关闭 " onclick="window.close()">
    </th>
 </tr>
</table>
</form>
</center>
</body>
</html>