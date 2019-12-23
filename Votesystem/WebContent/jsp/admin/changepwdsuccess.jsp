<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<style type="text/css">
<!--
body {
	background-color: #869de3;
}
-->
a { font-size: 12pt; text-decoration: none}
</style>
	<body>
		<a href="../frame/frame.html">
			<s:property value="%{getText('mainpage')}" /> 
		</a>>>>
		<a href="../admin/adminmanage.jsp">
			<s:property value="%{getText('adminmanage')}" /> 
		</a>>>>
		<a href="../admin/changepwd.jsp">
			<s:property value="%{getText('changepsw')}" /> 
		</a>
		<center>
			<br>
			<br>
			<br>
			<s:property value="%{getText('changepswsuccess')}" />
		</center>
	</body>
</html>
