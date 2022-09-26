<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>ID:${param.bookId}の検索結果</h1>
	<dl>
		<dt>ID</dt>
		<dd><c:out value="${book.bookId}"/></dd>
		<dt>BOOK_NAME</dt>
		<dd><c:out value="${book.bookName}"/></dd>
		<dt>PRICE</dt>
		<dd><fmt:formatNumber pattern="#,###" value ="${book.price}"/></dd>
	</dl>
</body>
</html>
