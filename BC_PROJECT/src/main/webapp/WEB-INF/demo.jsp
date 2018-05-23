<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<link rel="stylesheet" href="/webjars/bootstrap/4.1.1/dist/css/bootstrap.min.css">
</head>
<body>
	<ul>
		<c:forEach var="item" items="${result}">
			<li>${item.user_name}</li>
		</c:forEach>
	</ul>
	
	<div class="container">
	<form method="POST" action="/setDemo">
		<div class="form-group">
			<label for="Seq">Seq :</label> <input type="text" class="form-control" id="seq" name="seq">
		</div>
		<div class="form-group">
			<label for="user_name">user_name :</label> <input type="text" class="form-control" id="user_name" name="user_name">
		</div>
		<input type="submit" class="btn btn-info" value="Update Button">
	</form>
	</div>


	<script src="/webjars/jquery/3.3.1/dist/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.1.1/dist/js/bootstrap.min.js"></script>
</body>
</html>