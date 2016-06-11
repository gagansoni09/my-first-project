<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
<form:form method="post" action="saveRegister.do" modelAttribute="UserRegister">
		<table width="100%" border="0">
			<tr>
				<td><h6><form:errors path="fname"></form:errors></h6>
								<label>
								<p>First Name</p><form:input path="fname"
						placeholder="Please enter youy name" 
						maxlength="50" id="fname" />
			</label>	</td>
			</tr>
			<tr>
				<td><h6><form:errors path="lname"  ></form:errors></h6>
								<label><p>Last Name</p><form:input path="lname"
						placeholder="Please enter your last name"
						maxlength="50" id="lname" />
					</label>	</td>
			</tr>
			<tr>
				<td><h6><form:errors path="mobno"></form:errors></h6>
								<label><p>Mobile Number</p><form:input path="mobno"
						 id="mobno" />
			</label>	</td>
			</tr>
			<tr>
				<td><h6><form:errors path="emailID"  ></form:errors></h6>
								<label><p>Email Id</p><form:input path="emailID"
						placeholder="Please enter your email id" 
						maxlength="50" id="emailID" />
			</label>	</td>
			</tr>
			<tr>
				<td><h6><form:errors path="Password" ></form:errors></h6>
								<label><p>User Password</p><form:password path="Password"
						placeholder="Please enter your password" 
						maxlength="20" id="Password" /></td>
			</tr>
			<tr><td><input type="submit" value="Sign UP"/></td></tr>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<tr><td><input type="reset" value="Cancle"/></td></tr>
		</table>
	</form:form>
</body>
</html>