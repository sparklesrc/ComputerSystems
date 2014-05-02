<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        
        <%@include file="/public/header.jsp" %>
    </head>
    <body>
        <h1>Sistema de Gestión</h1>
        <a href="<%=contextPath%>/login">Iniciar Sesión</a>
        <%@include file="/public/footer.jsp" %>
    </body>
</html>
