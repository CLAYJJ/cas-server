<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta name="_csrf" content="${_csrf.token}">
    <meta name="_csrf_header" content="${_csrf.headerName}">
    <title>登录页</title>
    <script src="/js/jquery-3.3.1.min.js"></script>
    <script src="/js/basic.js"></script>
</head>
<body>
<p>${msg}</p>
<form action="/login" method="post">
    username:<input name="username"><br>
    password:<input name="password" type="password"><br>
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
    <button type="submit">login</button>
    <#if errorMsg??>
         <p style="color: red">${errorMsg}</p>
    </#if>

</form>
<script>
</script>
</body>
</html>