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
		<a href="../frame/main.jsp"><s:property
				value="%{getText('mainpage')}" /> </a>>>>
		<s:property value="%{getText('createvote')}" />
		>>>
		<s:property value="%{getText('createnewvote')}" />
		<center>
			<br>
			<br>
			<br>
			<s:property value="%{getText('inputvoteinfo')}" />
			<br>
			<br>
			<font color="red">
				<s:fielderror/>
				<s:actionerror/>
			</font>
			<s:form action="newvoteValidate" theme="simple">
				<s:token />
				<table>
					<tr>
						<td><s:text name="votetitle"/></td>
						<td><s:textfield name="title" /></td>
					</tr>
					<tr>
						<td><s:text name="countofvotecontext"/></td>
						<td><s:textfield name="contextcount" /></td>
					</tr>
					<tr>
						<td><s:text name="typeofvote"/></td>
						<td><s:select list="#{'1':'单选','0':'多选'}" name="type" /></td>
					</tr>
					<tr>
						<td><s:text name="publishofvote"/></td>
						<td><s:select list="#{'1':'是','0':'否'}" name="publish" /></td>
					</tr>	
					<tr>
						<td>&nbsp;</td>
						<td><s:submit key="next" /></td>
					</tr>
				</table>
			</s:form>
		</center>
	</body>
</html>
