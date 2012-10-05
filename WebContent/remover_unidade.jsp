<!doctype html public "-//w3c//dtd html 4.0 transitional//en">
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Template de Pagina JSF</title>
</head>
<body>
<f:view>
<h:form>


<h:outputText value="selecione a unidade para remover" />
<h:panelGrid>
	<h:selectOneMenu value="#{UnidadeBean.id}">
		<f:selectItems value="#{UnidadeBean.unidades}"/>
	</h:selectOneMenu>
</h:panelGrid>

<h:commandButton value="remover" action="#{UnidadeBean.remover}"/>

</h:form>
</f:view>
</body>
</html>