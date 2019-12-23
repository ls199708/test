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
	<a href="../frame/main.jsp"><s:property value="%{getText('mainpage')}" />
	</a>>>><s:property value="%{getText('searchvote')}" />
		<center>
		<br><br><br><br>
		<font color="red">
			<s:actionerror />
			<s:fielderror/>
		</font>
			<s:form action="searchVoteValidate" theme="simple">
				<s:text name="inputsearchstuff"/>
				<s:textfield name="title" />
				<s:submit key="submit" />
			</s:form>
		</center>
	</body>
</html>
