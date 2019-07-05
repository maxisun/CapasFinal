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
	<form:form id="holi" action="${pageContext.request.contextPath}/guardar" method="POST" modelAttribute="contribuyenteDTO">
		
		<form:select path = "importancia"  name="importancia">
			   <c:forEach items="${importancias}" var="importancias">
			        <option value="${importancias.c_importancia}">${importancias.s_importancia}</option>
			   </c:forEach>
		</form:select>
		<form:errors path="importancia" cssStyle="color:red;"></form:errors>
		
		<br>
				<form:label path = "nombre">Nombre: </form:label>
				<form:input type="text" name="nombre" path="nombre"/>
				<form:errors path="nombre"  cssStyle="color:red;"></form:errors>

		<br>	

				<form:label path = "apellido">Apellido: </form:label>
				<form:input type="text" name="apellido" path="apellido"/>
				<form:errors path="apellido"  cssStyle="color:red;"></form:errors>

		<br>
				<form:label path = "nit">Nit: </form:label>
				<form:input type="text" name="nit" path="nit"/>
				<form:errors path="nit"  cssStyle="color:red;"></form:errors>
		<br>

				<input id="enviar" type = "submit" value="Guardar">
		</form:form>
		<button onclick="location.href='${pageContext.request.contextPath}/ver'">Ver Contribuyentes</button>
</body>
</html>