<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
  <base target="_self">
  <link rel="stylesheet" href="../common.css" type="text/css"></link>
  <title>项目申报单位账号申请</title>
   <style type="text/css">
    th{
      width:180px;
      text-align:right;
   };
    select{
      width:155;
    };
   </style>   
</head>
 <script type="text/javascript">
 
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
<form name="frm" action="xhz!senaReg.action" method="post" onsubmit="return test();">
<table width=650 style="background-color:#ccccff">
 <tr>
   <th class="right">单位名称<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.unit"></th>
   <th class="right">联系方式(移动电话)<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.mob" id="mob" onblur="checkMob();"></th>
 </tr>
  <tr>
   <th class="right">机构码<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.code"></th>
   <th class="right">职务<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.job"></th>
 </tr>
  <tr>
   <th class="right">法人代表<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.fade"></th>
   <th class="right">固定电话<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.tel"></th>
 </tr>
  <tr>
   <th class="right">地址<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.ress"></th>
   <th class="right">电子邮箱：</th>
   <th class="left"><input type=text name="sena.em" id="em" onblur="checkEm();"></th>
 </tr>
  <tr>
   <th class="right">所属区划<font color="red">*</font>：</th>
   <th class="left">
   <span class="selspan">
     <select name="sena.bid">
       <s:iterator value="qhs">
         <option value="${bid }">${name }</option>
       </s:iterator>
      </select>
     </span>
   </th>
   <th class="right">账号：</th>
   <th class="left"><input type=text name="sena.username"></th>
 </tr>
  <tr>
   <th class="right">联系人<font color="red">*</font>：</th>
   <th class="left"><input type=text name="sena.tact"></th>
   <th class="right">密码：</th>
   <th class="left"><input type=password name="sena.password"></th>
 </tr>
  <tr>
   <th class="right" valign="top">备注：</th>
   <th class="left" colspan=3><textarea cols="60" rows="6" name="sena.des"></textarea></th>
 </tr>
 <tr>
    <th colspan=4 align="center">
      <input type=submit value=" 注册 ">&nbsp;&nbsp;
      <input type=button value=" 关闭 " onclick="window.close()">
    </th>
 </tr>
</table>
</form>
</center>
</body>
</html>