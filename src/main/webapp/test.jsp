<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/file/editorUpload.do" method="post" enctype="multipart/form-data">
        <input type="file" name="upload"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
