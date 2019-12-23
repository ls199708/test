<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
	<style type="text/css">
<!--
body {
	background-image: url(../img/topbg2.jpg);
}
-->
a { font-size: 12pt; text-decoration: none}
</style>
	<body>
		<a href="../frame/main.jsp">
			<s:property value="%{getText('mainpage')}" /> 
		</a>>>>
		<a href="adminmanage.jsp">
			<s:property value="%{getText('adminmanage')}" /> 
		</a>>>>
			<s:property value="%{getText('createadmin')}" />
		<center>
			<br>
			<br>
			<br>
			<center>
				<s:property value="%{getText('createadmin')}" />
				<br>
				<br>
				<font color="red">
					<s:fielderror/>
					<s:actionerror/>
				</font>
				<s:form action="createadminValidate" theme="simple">
					<s:token />
					<table>
						<tr>
							<td><s:text name="inputusername"/></td>
							<td><s:textfield name="name"/></td>
						</tr>
						<tr>
							<td><s:text name="inputpsw"/></td>
							<td><s:textfield name="newpwd1"/></td>
						</tr>
						<tr>
							<td><s:text name="inputpswagain"/></td>
							<td><s:textfield name="newpwd2"/></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>
								<s:submit key="submit" />
								<s:reset key="reset" />
							</td>
						</tr>
					</table>
				</s:form>
			</center>
	</body>
</html>
