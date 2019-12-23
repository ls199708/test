<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html><style type="text/css">
<!--
body {
	background-image: url(jsp/img/denglubeijing.jpg);
}
-->
</style>
	<body>
		<p>&nbsp;</p>
		<p>&nbsp;</p>
		<p>&nbsp;</p>
<center>
			<font color="red">
				<s:actionerror/>
				<s:fielderror/>
			</font>
			<s:form action="loginValidate" theme="simple">
				<table background="jsp/img/denglukuang.jpg" width="344" height="300">
                	<tr><td>&nbsp;</td></tr>
			  		<tr>
			  			<td><s:text name="inputusername"/>
						<td><s:textfield name="name"/></td>
					5</tr>
					<tr>
						<td><s:text name="inputpsw"/></td>
						<td><s:password name="password"/></td>
					</tr>
					<tr>
						<td><s:text name="code"/></td>
						<td><s:textfield name="safecode" /></td>
						<td><img src="safecode" id="safecode" /></td>
					</tr>	
					<tr>
						<td>&nbsp;</td>
						<td>
							<s:submit value="%{getText('submit')}" />
							<s:reset value="%{getText('reset')}" />
						</td>
					</tr>		
				</table>
  </s:form>

		</center>
	</body>
</html>
