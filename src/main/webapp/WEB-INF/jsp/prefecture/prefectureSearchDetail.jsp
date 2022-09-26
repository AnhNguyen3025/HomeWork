<%@page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>ID:${param.prefectureId}の検索結果</h1>
	<dl>
		<dt>ID</dt>
		<dd>${prefecture.id}</dd>
		<dt>名称</dt>
		<dd>${prefecture.name}</dd>
		<dt>人口</dt>
		<dd>${prefecture.population}</dd>
	</dl>
</body>
</html>
