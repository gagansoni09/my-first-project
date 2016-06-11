<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form method="post" action="saveUser.do" modelAttribute="UserLogin">
		<table width="100%" border="0">
			
			
			<tr>
				<td>User ID<form:input path="id"
						placeholder="Please enter your email" 
					 id="id" /></td>
			</tr>
			
			
			<tr>
				<td>User email<form:input path="emailID"
						placeholder="Please enter your email" 
					 id="emailID" /></td>
			</tr>
			<tr>
				<td>User Password<form:password path="password"
						placeholder="Please enter your password" 
						id="password" /></td>
			</tr>
			<tr><td><input type="submit" value="login"/></td></tr>
		</table>
	</form:form>
	<h3 style="color: red;">${invalid}</h3>
</body>
</html>