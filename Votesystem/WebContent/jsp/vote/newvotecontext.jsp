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
	<a href="../frame/main.jsp">
		<s:property value="%{getText('mainpage')}" />
	</a>&gt;&gt;&gt;<s:property value="%{getText('createvote')}" />
		<center>
		<s:property value="%{getText('inputthecontextofnewvote')}" />
		<br>
		<br>
		<br>
			<s:form action="newVoteContext" theme="simple">
			<s:token/>
				<s:bean name="org.apache.struts2.util.Counter" id="counter">
					<s:param name="first" value="1" />
					<s:param name="last" value="#session.contextcount" />
					<s:iterator>
						<s:property value="%{getText('di')}" />
						<s:property /><s:property value="%{getText('xiang')}" /> 
						 <s:textfield name="context" value="%{getText('pleaseinputthecontextofnewvote')}"/>
						<br>
						<br>
					</s:iterator>
					<s:submit key="next" />
				</s:bean>
			</s:form>

		</center>
	</body>
</html>