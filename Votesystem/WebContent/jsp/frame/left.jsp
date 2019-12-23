<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<style type="text/css">
<!--
body {
	background-color: #738edf;
}
a { font-size: 12pt; text-decoration: none}
.STYLE2 {color: #2A00AA}
-->
        </style>
	</head>
	<body>
		<table width="100%">
			<tr>
				<td>&nbsp;</td>
		    </tr>
			<tr>
				<td bgcolor="#d6dff7">
					<img src="../img/shijian.jpg" width="100%" height="26" />
				</td>
			</tr>
			<tr>
				<td bgcolor="#d6dff7">
					现在的时间是：<br><br>
					<%
					java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					java.util.Date currentTime = new java.util.Date();//得到当前系统时间
					String strdate = formatter.format(currentTime); //将日期时间格式化
					%>
					<%= strdate%>
					<br>
				</td>
			</tr>
            <tr>
				<td>&nbsp;</td>
		    </tr>
			<tr>
				<td bgcolor="#d6dff7">
					<img src="../img/huanying.jpg" width="100%" height="26" />
				</td>
			</tr>
			<tr>
				<td bgcolor="#d6dff7">
					<p>
						<s:property value="%{getText('welcome')}" />
						<span class="STYLE2">
						<STRONG><s:property value="#session.admin.name" /></STRONG>
					    </span>
					</p>
					<p>
						<s:property value="%{getText('lastlogintime')}" />
					</p>
					<p>
						<span class="STYLE2">
						<STRONG><s:property value="#session.admin.logintime" /></STRONG>
						</span>
					</p>
					<p>
						<div align="right">
							<a href="logout.action" target="_parent">
								<s:property value="%{getText('logout')}" />
							</a>
						</div>
				
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
		    </tr>
			<tr>
				<td bgcolor="#d6dff7">
					<img src="../img/tongji.jpg" width="100%" height="26" />
				</td>
			</tr>
			<tr>
				<td bgcolor="#d6dff7">
					<p>
						<s:property value="%{getText('thereare')}" />
						<span class="STYLE2">
						<STRONG><s:property value="#session.count2.allCount" /></STRONG>
					    </span>
						<s:property value="%{getText('countofvotetitle')}" />
					</p>
					<p>
						<s:property value="%{getText('include')}" />
					</p>
					<p>
						<s:property value="%{getText('singlevotetotally')}" />
						<span class="STYLE2">
						<STRONG><s:property value="#session.count2.singleCount" /></STRONG>
					    </span>
					</p>
					<p>
						<s:property value="%{getText('multivotetotally')}" />
						<span class="STYLE2">
						<STRONG><s:property value="#session.count2.multiCount" /></STRONG>
					    </span>
					</p>
				</td>
			</tr>
            <tr>
				<td>&nbsp;</td>
		    </tr>
		</table>
	</body>
</html>
