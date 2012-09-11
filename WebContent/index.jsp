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
			</div>			
			<div id="middle">
				<h:form styleClass="login">
				<h:graphicImage  url="/img/logo.png" width="400px" height="60px;"></h:graphicImage>
					<fieldset >
						<h:panelGrid columns="2">
							<h:outputText value="Login" />
							<h:inputText  style="width:280px;"></h:inputText>

							<h:outputText value="Senha" />
							<h:inputSecret  style="width:280px;"></h:inputSecret>
						</h:panelGrid>
                        <h:panelGrid columns="2">
                        <h:panelGroup>
						<h:commandButton type="submit" value="Enviar"></h:commandButton>
						<h:commandButton type="reset" value="limpar"></h:commandButton>
						</h:panelGroup>
						</h:panelGrid>
					</fieldset>
				 <h:commandLink value="recuperar senha"></h:commandLink>
				</h:form>
			</div>
			<div id="footer"></div>
		</div>



	</f:view>
</body>
</html>