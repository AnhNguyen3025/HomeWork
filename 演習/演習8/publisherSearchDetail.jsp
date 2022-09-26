<%@page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>ID:${param.publisherId}の検索結果</h1>
	<dl>
		<dt>ID</dt>
		<dd>${publisher.publisherId}</dd>
		<dt>出版社名</dt>
		<dd>${publisher.publisherName}</dd>
		<dt>所番地</dt>
		<dd>${publisher.prefecture}</dd>
	</dl>
</body>
</html>
