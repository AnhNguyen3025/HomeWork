<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>追加</h1>
	<dl>
		<dt>ID</dt>
		<dd>
			<form : input path="id"/>
		</dd>
		<dt>名</dt>
		<dd>
			<form : input path="name"/>
		</dd>
		<dd>
			<form : input path=""/>
		</dd>
	</dl>
</body>
</html>
