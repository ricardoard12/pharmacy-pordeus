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
		<h:form>
			<h:dataTable value="#{UnidadeBean.unidades}" var="unidade">
				<h:column>
					<f:facet name="header">
						<h:outputText value="#{msgs['Unidade.cadastro.nome_unidade']}" />
					</f:facet>
					<h:outputText value="#{unidade.nome}" />
				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="#{msgs['Unidade.cadastro.nome_responsavel']}" />
					</f:facet>
					<h:outputText value="#{unidade.nome_responsavel}" />
				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="excluir" />
					</f:facet>
					<h:commandLink action="#{UnidadeBean.remover}">
						<h:outputText value="excluir"></h:outputText>
						<f:setPropertyActionListener value="#{unidade}" target="#{UnidadeBean.uni}" />
					</h:commandLink>
				</h:column>

			</h:dataTable>

		</h:form>
	</f:view>
</body>
</html>