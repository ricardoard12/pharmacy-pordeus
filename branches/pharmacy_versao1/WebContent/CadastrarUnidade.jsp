<!doctype html public "-//w3c//dtd html 4.0 transitional//en">
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Cadastro de Unidades</title>
</head>
<body>
	<f:view>
		<h:form>
		<fieldset>

			<legend style="margin-left: 200px;">
				<h:outputText value="Buscar Medicamento" />
			</legend>
			<h:messages style="color: red" showDetail="false" />
			
			
			<h:panelGrid columns="2" title="Cadastro de Unidades">
				<h:outputText value ="#{msgs['Unidade.cadastro.nome_unidade']}"/>
				<h:inputText value = "#{UnidadeBean.uni.nome}" required="true" requiredMessage="#{msgs['Unidade.cadastro.erro.nome_unidade']}"/>
				
				<h:outputText value ="#{msgs['Unidade.cadastro.nome_responsavel']}"/>
				<h:inputText value = "#{UnidadeBean.uni.nome_responsavel}" required="true" requiredMessage="#{msgs['Unidade.cadastro.erro.nome_responsavel']}"/>
			</h:panelGrid>
			
			</fieldset>
			
			<h:commandButton value = "#{msgs['Unidade.cadastro.botao']}" action="#{UnidadeBean.Cadastrar}"/>
			
		</h:form>
	</f:view>
</body>
</html>