<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap-theme.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<link href="<c:url value="/resources/js/bootstrap.js" />" >
<link href="<c:url value="/resources/js/bootstrap.min.js" />" >

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>


test<br></br>
<p> ${message1} ${name1} </p>

<div>
	<p><a href="#" class="btn btn-primary btn-large">Learn more »</a></p>
</div>

<div class = "well well-lg">
<div class="panel-heading well text-center">Musique de repertoire</div>
<ul class="list-group">
	<c:forEach var="listValue" items= "${lists}">
			<li class="list-group-item">${listValue}</li>
	</c:forEach>

  <li class="list-group-item">Cras justo odio</li>
  <li class="list-group-item">Dapibus ac facilisis in</li>
  <li class="list-group-item">Morbi leo risus</li>
  <li class="list-group-item">Porta ac consectetur ac</li>
  <li class="list-group-item">Vestibulum at eros</li>
</ul>

</div>

</body>
</html>