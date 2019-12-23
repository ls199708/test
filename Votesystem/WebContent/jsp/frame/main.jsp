<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<style type="text/css">
body {
	background-color: #758fde;
}
a { color: #000000; font-size: 12pt; text-decoration: none}
</style>
<body>
<p><s:property value="%{getText('mainpage')}" /></p>

<center>
<table width="60%" border="0">
  <tr>
    <td width="49%" onMouseOver="sMenubar(this)" onMouseOut="cMenubar(this)"><div align="center">
      <p><a href="../vote/newvote.jsp"><img src="../img/newvote.jpg" width="35" height="35" /></a></p>
      <p><a href="../vote/newvote.jsp">
      	<s:property value="%{getText('createvote')}" />
      </a></p>
    </div></td>
    <td width="51%" onMouseOver="sMenubar(this)" onMouseOut="cMenubar(this)"><div align="center">
      <p><a href="../vote/searchvote.jsp"><img src="../img/search.jpg" width="35" height="35" /></a></p>
      <p><a href="../vote/searchvote.jsp">
     	 <s:property value="%{getText('searchvote')}" />
      </a></p>
    </div></td>
  </tr>
  <tr>
    <td height="98" onMouseOver="sMenubar(this)" onMouseOut="cMenubar(this)"><div align="center">
      <p><a href="../admin/changepwd.jsp"><img src="../img/mima.jpg" width="35" height="35" /></a></p>
      <p><a href="../admin/changepwd.jsp">
      	<s:property value="%{getText('changepsw')}" />
      </a></p>
    </div></td>
    <td onMouseOver="sMenubar(this)" onMouseOut="cMenubar(this)"><div align="center">
      <p><a href="../findVote.action"><img src="../img/guanlitoupiao.jpg" alt="" width="35" height="35" /></a></p>
      <p><a href="../findVote.action">
     	 <s:property value="%{getText('votemanage')}" />
      </a></p>
    </div></td>
  </tr>
</table>
</center>
</body>
</html>
