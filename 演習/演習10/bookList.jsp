<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
td.bigprice {
	color: red;
}
</style>
<title>BookList</title>
</head>
<body>
	<h1>検索結果</h1>
	<table border="1">
		<tr>
			<th>STT</th>
			<th>書籍ID</th>
			<th>書籍名</th>
			<th>価格</th>
			<th>発売日</th>
			<th>曜日</th>
		</tr>
		<c:forEach items="${bookList}" var="book" varStatus ="index">
			<tr>
				<td><c:out value="${index.count}"/></td>
				<td><c:out value="${book.bookId}" /></td>
				<td><c:out value="${book.bookName}" /></td>
				<td <c:if test="${book.price>2000}"> class="bigprice"</c:if>> 
				<fmt:formatNumber pattern="#,###" value="${book.price}" /></td>
				<td><fmt:formatDate pattern="yyyy年MM月dd" value="${book.onSaleDate}" /></td>
				<fmt:formatDate var="day" pattern="E" value="${book.onSaleDate}" />
				<td <c:if test="${day=='日'}"> class="bigprice"</c:if>>
					${day}
				</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>
