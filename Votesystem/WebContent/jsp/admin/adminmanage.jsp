<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<style type="text/css">
<!--
body {
	background-color: #869de3;
}
-->
a {font-size: 12pt; text-decoration: none}
</style>
	<body>
		<a href="../frame/main.jsp">
		<s:property value="%{getText('mainpage')}" />
		</a>>>>
		<s:property value="%{getText('adminmanage')}" />
		<br>
		<br>
		<br>
		<center>
			<p>
				<a href="changepwd.jsp"><s:property
						value="%{getText('changemypsw')}" />
				</a>
			</p>
			<br>
			<p>
				<a href="createadmin.jsp"><s:property
						value="%{getText('createadmin')}" />
				</a>
			</p>
		</center>
	</body>
</html>
