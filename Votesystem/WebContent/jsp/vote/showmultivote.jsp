<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html><style type="text/css">
<!--
body {
	background-color: #869de3;
}
-->
a { font-size: 12pt; text-decoration: none}
</style>
	<body>
		<center>
			<s:form>
			<s:property value="%{getText('votetitle')}" />£º
			<s:property value="#session.vote.title" />
				<br>
				<s:checkboxlist list="#session.map" name="context" key="votecontext"/>
				<br>
				<s:submit />
			</s:form>
		</center>
	</body>
</html>