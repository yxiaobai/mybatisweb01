<%@ page pageEncoding="utf-8"  language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <title>mybatisweb</title>
</head>
<body>
<c:forEach items="${st}" var="s">
    ${s.uname}<br>
</c:forEach>
</body>
</html>
