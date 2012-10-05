<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="error_msg">
    <%
                String sucesso = (String) session.getAttribute("sucesso");
                String erro = (String) session.getAttribute("erro");
                session.removeAttribute("sucesso");
                session.removeAttribute("erro");

            if (erro != null) {%>
                <p class="mensagemErro" style="color: red"><%=erro%></p>
    <%}
                if (sucesso != null) {%>
                <p class="mensagemSucesso" style="color: blue"><%=sucesso%></p>
    <%}%>
    
</div>
</body>
</html>