<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login View</title>
</head>
<body>
	<shiro:guest>
		<h2>Login</h2>
		<form action="LoginServlet" method="post">
			Email: <input type="text" name="email" placeholder="Email" />
			Password: <input type="password" name="password"
				placeholder="Password" />
			<button type="submit">Login</button>
		</form>

	</shiro:guest>



	<h3>Crear nuevo TFG</h3>
		<form action="CreateTFGServlet" method="post">
			<p>
				Nombre: <input type="text" name="name" />
			</p>
			<p>
				Email: <input type="text" name="email" />
			</p>
			<p>
				Password: <input type="password" name="password" />
			</p>
			<p>
				Title: <input type="text" name="title" />
			</p>
			<p>
				Tutor: <select name="advisor">
					<option value="" disabled selected>Elija un tutor</option>
					<c:forEach items="${professor_list}" var="prof">
						<option value="${ prof.email}">
							${prof.name}-${prof.email}</option>
					</c:forEach>
				</select>
			</p>
			<p>
				<button type="submit">Crear TFG</button>
			</p>
		</form>



</body>
</html>