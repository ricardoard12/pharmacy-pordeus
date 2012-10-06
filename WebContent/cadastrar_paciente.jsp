<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="js/jquery-1.8.2.js"
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
		<div id="top">
			<h:graphicImage value="/img/10.png" alt="logo" width="400"
				height="50" style="margin-left:250px; "></h:graphicImage>
		</div>
		<div id="content">

			<div id="content_left">
				<div id="menuUser">
					<h:form>
						<ul id="menu">

							<li><a href="Home.jsp" title="">Home</a></li>
							<li class="header">Módulo CAF</li>
							<li class="parent"><a href="#" title="">Medicamento</a>
								<ul class="sub-menu">
									<li><a href="cadastrar_medicamento.jsp" title="">Cadastrar</a></li>
									<li><a href="busca_medicamento.jsp" title="">Listar</a></li>
								</ul></li>

							<li class="parent"><a href="#" title="">Unidade</a>
								<ul class="sub-menu">
									<li><a href="cadastrar_unidade.jsp" title="">Cadastrar</a></li>
									<li><h:commandLink value="Listar"
											action="#{UnidadeBean.listarUnidades }"></h:commandLink></li>
								</ul></li>
							<li class="parent"><a href="#" title="">Dispensar para
									Unidade</a>
								<ul class="sub-menu">
									<li><a href="#" title="">Cadastrar</a></li>
									<li><a href="#" title="">Listar</a></li>
								</ul></li>




							<li class="header">Módulo UDP</li>
							<li class="parent"><a href="#" title="">Paciente</a>
								<ul class="sub-menu">
									<li><a href="cadastrar_paciente.jsp" title="">Cadastrar</a></li>
									<li><h:commandLink value="Listar"
											action="#{PacienteBean.listarPacientes }"></h:commandLink></li>
								</ul></li>

							<li class="parent"><a href="#" title="">Relatórios</a>
								<ul class="sub-menu">
									<li><a href="#" title="">Dispensas Unidades</a></li>

									<li><a href="#" title="">Medicamentos</a></li>
									<li><a href="#" title="">Dispensas Pacientes</a></li>

								</ul></li>
						</ul>
					</h:form>
				</div>
			</div>

			<div id="content_right">
				<h:form>

					<fieldset>
						<legend style="margin-left: 200px;">Cadastro de Paciente</legend>

						<div id="cads">


							<h:panelGrid columns="2">

								<h:outputText value="#{msgs['paciente.nome.paciente']}"
									styleClass="campo" />
								<h:inputText id="nomePacienteAusente"
									value="#{PacienteBean.paciente.nome}" required="true"
									requiredMessage="#{msgs['paciente.nomePacienteAusente']}"
									style="width:200px;" styleClass="campo" />

								<h:outputText value="#{msgs['paciente.rg.paciente']}"
									styleClass="campo" />
								<h:inputText id="rg" value="#{PacienteBean.paciente.rg}"
									required="true"
									requiredMessage="#{msgs['paciente.numeroRgAusente']}"
									style="width:200px;" styleClass="campo" />

								<h:outputText value="#{msgs['paciente.cartao.sus']}"
									styleClass="campo" />
								<h:inputText id="cartaosus"
									value="#{PacienteBean.paciente.numero_cartao_sus}"
									required="true" style="width:200px;" styleClass="campo" />

							</h:panelGrid>

							<h:commandButton type="submit" value="Cadastrar"
								action="#{PacienteBean.inserirPaciente}" styleClass="botoes"
								style="margin-left: 200px;" />

							<h:commandButton value="Cancelar" action="cancelar"
								immediate="true" styleClass="botoes" />

							<div id="footer">
								<h:messages style="color:red;"></h:messages>
							</div>
						</div>

					</fieldset>

				</h:form>
			</div>
		</div>

	</f:view>
</body>
</html>