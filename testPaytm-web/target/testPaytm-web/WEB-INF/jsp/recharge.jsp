<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recharge</title>
</head>
<body>
<h3><%Object[]b= (Object[])request.getAttribute("arr"); %></h3>
<form:form method="post" action="saveRecharge.do" modelAttribute="UserRecharge">
		<table width="100%" border="0">
			
			<tr>
				<td><p> <%=b[0] %></p><form:input path="vendor"
						placeholder="Please enter vendor name" required="autofocus"
						maxlength="50" id="vendor" /></td>
			</tr>
			<tr>
				<td><p> <%=b[1] %></p><form:input path="mobno"
						placeholder="Please enter your MobileNo" required="autofocus"
						maxlength="50" id="mobno" />
				</td>
			</tr>
			<tr>
				<td><p> <%=b[2] %></p><form:input path="amount"
						placeholder="Please enter amount" required="autofocus"
						maxlength="50" id="amount" />
				</td>
			</tr>
			
			<tr><td><input type="submit" value="Submit"/></td></tr>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<tr><td><input type="reset" value="Cancle"/></td></tr>
		</table>
	</form:form>
	<c:choose>
	<c:when test="${empty list}">
	Sorry!! No Details Found
	</c:when>
	</c:choose>
	
	<table>
	<c:forEach items="${list}" var="recharge">
	<tr>
	<td>MobileNumber:<c:out value="${recharge.mobno}"></c:out></td>
	</tr>
	<tr>
	<td>Amount:<c:out value="${recharge.amount}"></c:out></td>
	</tr>
	<tr>
	<td>Vendor:<c:out value="${recharge.vendor}"></c:out></td>
	</tr>
	</c:forEach>
	</table>
	
</body>
</html>