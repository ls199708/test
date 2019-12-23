<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<script type="text/javascript">
function sMenubar(st) 
{
  st.style.backgroundColor="#CECFCE";
  st.style.border="1px solid #9C9A9C";
}
function cMenubar(st) 
{ 
  st.style.backgroundColor="";
  st.style.border="";
}
</script>
	</head>
	<style type="text/css">
body {
	background-color: #758fde;
}
a { color: #000000; font-size: 12pt; text-decoration: none}
</style>
	<body>
		<table border="0" width="100%">
			<tr >
				<td bgcolor="#758fde" colspan="5">
					<p>
						<img src="../img/toupiao.jpg" width="100%" height="110">
					</p>
				</td>
			</tr>
			<tr>
				<td colspan="5">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td width="20%" height="20" onMouseOver="sMenubar(this)"
					onmouseout="cMenubar(this)">
					<div align="center">
						<a href="main.jsp" target="mainFrame"> <s:property
							value="%{getText('mainpage')}" /> </a>
					</div>
				</td>
				<td width="20%" height="20" onMouseOver="sMenubar(this)"
					onmouseout="cMenubar(this)">
					<div align="center">
						<a href="../findVote.action" target="mainFrame"> <s:property
							value="%{getText('votemanage')}" /> </a>
					</div>
				</td>
				<td width="20%" height="20" onMouseOver="sMenubar(this)"
					onmouseout="cMenubar(this)">
					<div align="center">
						<a href="../vote/newvote.jsp" target="mainFrame"> <s:property
							value="%{getText('createvote')}" /> </a>
					</div>
				</td>
				<td width="20%" height="20" onMouseOver="sMenubar(this)"
					onmouseout="cMenubar(this)">
					<div align="center">
						<a href="../vote/searchvote.jsp" target="mainFrame"> <s:property
							value="%{getText('searchvote')}" /> </a>
					</div>
				</td>
				<td width="20%" height="20" onMouseOver="sMenubar(this)"
					onmouseout="cMenubar(this)">
					<div align="center">
					<a href="../admin/adminmanage.jsp" target="mainFrame"> <s:property
							value="%{getText('adminmanage')}" /> </a>
					</div>
				</td>
			</tr>
		</table>
	</body>
</html>
