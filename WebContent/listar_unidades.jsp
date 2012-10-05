<!doctype html public "-//w3c//dtd html 4.0 transitional//en">
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Template de Pagina JSF</title>
</head>
<body>
	<f:view>

		<h:dataTable value="#{UnidadeBean.unidadez}" var="unidade">
			<h:column>
				<f:facet name="header">
					<h:outputText value="#{msgs['unidade.nome']}" />
				</f:facet>
				<h:outputText value="#{unidade.nome}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="#{msgs['unidade.nome.responsavel']}" />
				</f:facet>
				<h:outputText value="#{unidade.nome_responsavel}" />
			</h:column>


		</h:dataTable>

	</f:view>
</body>
</html>