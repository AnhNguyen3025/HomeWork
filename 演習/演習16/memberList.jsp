<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>
		名前:
		<c:out value="${param.lastName}" />
		の一部で検索
	</h1>
	<table>
		<tr>  
			<th>会員ID</th>
			<th>氏名</th>
			<th>誕生日</th>
			<th>職種</th>
		</tr>
		<c:forEach items="${memberList}" var="member">
			<tr>
				<td><c:out value="${member.memberId}" /></td>
				<td><c:out value="${member.lastName}" /></td>
				<td><fmt:formatDate pattern="yyyy/MM/dd"
						value="${member.birthday}" /></td>
				<td><c:out value="${member.jobTypeName}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>