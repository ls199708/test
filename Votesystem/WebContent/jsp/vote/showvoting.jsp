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
			<s:property value="#session.vote2.title" />
			<s:form action="checkVoter">
				<s:if test="%{type==1}">
					<s:radio list="#request.map" name="context"/>
				</s:if>
				<s:else>
					<s:checkboxlist list="#request.map" name="context"/>
				</s:else>
				<br>
				<s:submit value="ÏÂÒ»²½" />
			</s:form>
		</center>
	</body>
</html>
