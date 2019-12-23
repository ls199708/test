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
			<s:property value="%{getText('voteclosed')}" />
			<br>
			<br>
			<br>
			<a href="Javascript:window.close();"><s:property value="%{getText('shutdownwindow')}" /></a>
		</center>
	</body>
</html>
