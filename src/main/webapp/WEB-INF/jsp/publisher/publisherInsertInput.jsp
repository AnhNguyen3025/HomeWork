<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>追加</h1>
	<form:form modelAttribute="publisherForm" action="confirm">
		<dl>
			<dt>ID</dt>
			<dd>
				<form:input path="publisherId" />
			</dd>
			<dt>出版社名</dt>
			<dd>
				<form:input path="publisherName" />
			</dd>
			<dt>所番地</dt>
			<dd>
				<form:input path="prefecture" />
			</dd>
		</dl>
		<input type="submit" value="追加">
	</form:form>
</body>
</html>
