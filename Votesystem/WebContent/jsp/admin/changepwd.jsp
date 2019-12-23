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
		<a href="../frame/main.jsp">
			<s:property value="%{getText('mainpage')}" />
		</a>>>>
		<a href="adminmanage.jsp">
			<s:property value="%{getText('adminmanage')}" />
		</a>>>>
			<s:property value="%{getText('changepsw')}" />
		<br>
		<br>
		<center>
			<s:property value="%{getText('changeadminpsw')}" />
			<br>
			<br>
			<font color="red">
				<s:actionerror />
				<s:fielderror/>
			</font>
			<s:form action="changepwdValidate" theme="simple">
				<table>
					<tr>
						<td><s:text name="inputoldpsw" /></td>
						<td><s:textfield name="password"/><br></td>
					</tr>
					<tr>
						<td><s:text name="inputnewpsw" /></td>
						<td><s:textfield name="newpwd1"/><br></td>
					</tr>
					<tr>
						<td><s:text name="inputnewpswagain" /></td>
						<td><s:textfield name="newpwd2"/><br></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><s:submit key="submit" />
							<s:reset key="reset" />
						</td>
					</tr>
				</table>
				
				
				
				
			</s:form>

		</center>
	</body>
</html>
