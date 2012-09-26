<!doctype html public "-//w3c//dtd html 4.0 transitional//en">
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Busca Medicamento</title>
</head>
<body>
	<f:view>
		<h:form>
			<fieldset class="demo_fieldset">
				<legend class="demo_legend"><h:outputText value="Buscar Medicamento"/></legend>
		  		<h:messages style="color: red" showDetail="false"/>
				
				<h:panelGrid columns="2" title="Medicamentos">
					<h:panelGroup>
						<h:outputText value="#{msgs['Busca.medicamento.campo']}" />
						<h:inputText value="#{MedicamentoBean.parametro}" size="40" onchange="submint()" required="true" requiredMessage="O campo Prâmetro é obrigatório!"/>
					</h:panelGroup>

					<h:panelGroup>
						<h:selectOneRadio layout="pageDirection" onclick="submit()" value="#{MedicamentoBean.tipo_busca}" required="true" requiredMessage="Secione um tipo de busca!">
							<f:selectItem itemLabel="#{msgs['Busca.medicamento.radio.codigo']}" itemValue="codigo" />
							<f:selectItem itemLabel="#{msgs['Busca.medicamento.radio.nome']}" itemValue="nome" />
							<f:selectItem itemLabel="#{msgs['Busca.medicamento.radio.lote']}" itemValue="lote" />
							<f:selectItem itemLabel="#{msgs['Busca.medicamento.radio.nf']}" itemValue="nota" />
							<f:selectItem itemLabel="#{msgs['Busca.medicamento.radio.todos']}" itemValue="todos" />
						</h:selectOneRadio>
					</h:panelGroup>
					
					<h:commandButton value="#{msgs['Busca.medicamento.botao.label']}" actionListener="#{MedicamentoBean.EfetuaBusca}" />
				</h:panelGrid>
			</fieldset>
			
			
			<h:dataTable value="#{MedicamentoBean.lista}" var="item" border="1" rendered="true">
				<h:column>
					<f:facet name="header">
						<h:outputText value="#{msgs['Busca.medicamento.table.codigo']}" />
					</f:facet>
					<h:outputText value="#{item.idMedicamento}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="#{msgs['Busca.medicamento.table.nome']}" />
					</f:facet>
					<h:outputText value="#{item.nomeMedicamento}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText
							value="#{msgs['Busca.medicamento.table.apresentacao']}" />
					</f:facet>
					<h:outputText value="#{item.apresentacaoMedicamento}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="#{msgs['Busca.medicamento.table.lote']}" />
					</f:facet>
					<h:outputText value="#{item.loteMedicamento}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="#{msgs['Busca.medicamento.table.validae']}" />
					</f:facet>
					<h:outputText value="#{item.validadeMedicamento}">
						<f:convertDateTime type="date" dateStyle="short" />
					</h:outputText>
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Dispensar para Paciente" />
					</f:facet>
					<h:outputText value="Link" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Dispensar para Unidade" />
					</f:facet>
					<h:outputText value="Link" />
				</h:column>
			</h:dataTable>
		</h:form>
	</f:view>
</body>
</html>