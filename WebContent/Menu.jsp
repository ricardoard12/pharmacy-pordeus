<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="js/jquery-1.3.2.js"
	type="text/javascript"></script>
<script language="JavaScript" type="text/javascript">
	$(function() {
		// Evento de clique do elemento: ul#menu li.parent > a
		$('ul#menu li.parent > a').click(function() {
			// Expande ou retrai o elemento ul.sub-menu dentro do elemento pai (ul#menu li.parent)
			$('ul.sub-menu', $(this).parent()).slideToggle('fast', function() {
				// Depois de expandir ou retrair, troca a classe 'aberto' do <a> clicado       
				$(this).parent().toggleClass('aberto');
			});
			return false;
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<f:view>

		<div id="menuUser">
			<ul id="menu">
				<li class="header">Menu</li>
				<li><a href="Home.jsp" title="">Home</a></li>
				<li class="parent"><a href="#" title="">Medicamento</a>
					<ul class="sub-menu">
						<li><a href="cadastrar_medicamento.jsp" title="">Cadastrar</a></li>
						<li><a href="#" title="">Listar</a></li>
						<li><a href="#" title="">Editar/Remover</a></li>
					</ul></li>
				<li class="parent"><a href="#" title="">Paciente</a>
					<ul class="sub-menu">
						<li><a href="#" title="">Cadastrar</a></li>
						<li><a href="#" title="">Listar</a></li>
						<li><a href="#" title="">Editar/Remover</a></li>
					</ul></li>
					<li class="parent"><a href="#" title="">Unidade</a>
					<ul class="sub-menu">
						<li><a href="#" title="">Cadastrar</a></li>
						<li><a href="#" title="">Listar</a></li>
						<li><a href="#" title="">Editar/Remover</a></li>
					</ul></li>
					<li class="parent"><a href="#" title="">Dispensa</a>
					<ul class="sub-menu">
						<li><a href="#" title="">Cadastrar</a></li>
						<li><a href="#" title="">Listar</a></li>
						<li><a href="#" title="">Editar/Remover</a></li>
					</ul></li>
					<li class="parent"><a href="#" title="">Relatórios</a>
					<ul class="sub-menu">
						<li><a href="#" title="">Dispensas</a></li>
						<li><a href="#" title="">Unidades</a></li>
						<li><a href="#" title="">Remedios</a></li>
						<li><a href="#" title="">Pacientes</a></li>
					</ul></li>
			</ul>
		</div>


	</f:view>
</body>
</html>