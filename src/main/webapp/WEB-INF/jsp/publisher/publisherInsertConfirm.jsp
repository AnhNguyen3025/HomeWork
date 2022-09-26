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
	<h1>出版社を追加(確認)</h1>
	<dl>
		<dt>ID</dt>
		<dd>
			<c:out value="${publisherForm.publisherId}" />
		</dd>
		<dt>出版社名</dt>
		<dd>
			<c:out value="${publisherForm.publisherName}" />
		</dd>
		<dt>所番地</dt>
		<dd>
			<c:out value="${publisherForm.prefecture}" />
		</dd>
	</dl>
	<form:form modelAttribute="publisherForm" action="input">
		<form:hidden path="publisherId" />
		<form:hidden path="publisherName" />
		<form:hidden path="prefecture" />
		<input type="submit" value="戻る">
	</form:form>
</body>
</html>