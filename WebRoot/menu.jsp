<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>menu</title>
    <link type="text/css" rel="stylesheet" href="common.css">
    <style type="text/css">
    	div{
    		border:0px solid #ABABAB;
    		width:100%;
    		display:none;
    	}
    	a{
    		text-decoration:none;
    		line-height:20px;
    		width:100%;
    		text-align:left;
    		border-bottom:1px solid #DEDEDE;
    		color:black;
    		font-size:10pt;
    		padding-left:20px;
    	}
    	a:hover{
    		font-weight:bold;
    		color:white;
    		background-image:url('img/bg.png');
    	}
    	.bg1{
    		color:white;
    		font-size:10pt;
    		padding-left:20px;
    		background-image:url('img/left-nav1.gif');
    	}
    	a.bg1:hover{
    		background-image:url('img/left-nav2.gif');
    	}
    	table{
    		position:absolute;
    		left:0px;
    		top:0px;
    	}
    </style>
</head>
<script language="javascript">
function showDiv(a){
	if(document.getElementById("d"+a).style.display=="block")document.getElementById("d"+a).style.display="none";
	else document.getElementById("d"+a).style.display="block";
}
</script>
<body>
<center>
<table width=124% cellspacing=0>
<s:iterator value="menu">
<tr>
	<td><a href="javascript:showDiv(${fid })" class="bg1">${des }</a>
		<div id="d${fid }">
			<s:iterator value="child">
				<a href="${uri }" target="content">${des }</a><br>
			</s:iterator>
		</div>
	</td>
</tr>
</s:iterator>
</table>
</center>
</body>
</html>
