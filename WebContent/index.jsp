<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/styleIndex.css" rel="stylesheet" type="text/css">
<title>Pharmacy Pordheus</title>
</head>
<body>
	<f:view>

		<div id="content">
			<div id="top">
			<h:graphicImage value="/img/4.jpg" alt="logo" width="180" height="134" style="margin-left:100px;"></h:graphicImage>
			</div>	
					
			<div id="middle">
				<h:form styleClass="login">
					<fieldset >
						<h:panelGrid columns="2">
							<h:outputLabel value="Login"/>
							<h:inputText  style="width:280px;" value="#{UsuarioBean.login}" styleClass="campo"></h:inputText>

							<h:outputLabel value="Senha"/>
							<h:inputSecret  style="width:280px;" styleClass="campo" value="#{UsuarioBean.senha }"></h:inputSecret>
						</h:panelGrid>
                        <h:panelGrid columns="2">
                        <h:panelGroup>
						<h:commandButton type="submit" value="Enviar" style="margin-left:110px"  styleClass="botoes" action="#{UsuarioBean.validarUsuario }"></h:commandButton>
						<h:commandButton type="reset" value="limpar" styleClass="botoes"></h:commandButton>
						</h:panelGroup>
						</h:panelGrid>
						<h:commandLink value="Recuperar Minha Senha" style="margin-left:99px;"></h:commandLink>
					</fieldset>
				 </h:form>
			</div>
			<div id="footer"></div>
		</div>



	</f:view>
</body>
</html>