<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table id="table" border = 1>
    			<thead>
					<tr>
						<th>Nombre</th>
						<th>Apellido</th>
						<th>Nit</th>
						<th>Importancia</th>
						<th>Fecha</th>
					</tr>
				</thead>
				<c:forEach items="${contribuyentes}" var="contribuyentes" varStatus="status">
				<tr>
					<td >${contribuyentes.s_nombre}</td>
					<td >${contribuyentes.s_apellido}</td>
					<td >${contribuyentes.s_nit}</td>
					<td >${contribuyentes.importancia.s_importancia}</td>
					<td >${contribuyentes.fechaDelegate}</td>
					
				</tr>
				</c:forEach>
			</table>
</body>
</html>