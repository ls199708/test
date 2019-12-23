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
			<s:property value="%{getText('thereare')}" />
			<s:property value="#session.totalcount" />
			<s:property value="%{getText('peoplevoting')}" />
			<s:property value="#session.vote.title" />
			<br>
			<table width="50%">
				<s:iterator value="#request.list2">
					<tr>
						<td>
							<s:property value="context" />
						</td>
						<td width="25%">
							<s:property value="count"/>
						</td>
						<td>
							<s:property value="%{getText('piao')}" />
						</td>
						<td>
							<img src="jsp/img/bar.jpg" width="${count}" height="10" />
						</td>
						<td>
							<s:property value="percent" />
						</td>
					</tr>
				</s:iterator>
			</table>
		</center>
	</body>
</html>

