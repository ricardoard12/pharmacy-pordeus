<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
    
	<h:form>
		
	<br/>
	
	<fieldset>
	
	<legend>Cadastrando Medicamento...</legend>
	
	<br/>
	
	<h:panelGrid columns="2" bgcolor="#e2eeff" styleClass="painel">
			
		
			<h:outputText value="#{msgs['cadastro.nome.medicamento']}"/>
			<h:inputText id="nomeMedausente" value="#{MedicamentoBean.medicamento.nomeMedicamento}" 
					required="true" requiredMessage="#{msgs['cadastro.nomeMedausente']}"/>
							
			<h:outputText value="#{msgs['cadastro.prateleira.medicamento']}"/>
			<h:inputText  id="prateleira" value="#{MedicamentoBean.medicamento.prateleiraMedicamento}" 
					required="true" requiredMessage="#{msgs['cadastro.prateleira.ausente']}"/>
						
			<h:outputText value="#{msgs['cadastro.apresentacao.medicamento']}"/>
			<h:inputText id="apresentacao" value="#{MedicamentoBean.medicamento.apresentacaoMedicamento}"
					required="true" requiredMessage="#{msgs['cadastro.apresentacao.ausente']}"/>
			
			<h:outputText value="#{msgs['cadastro.quantidade.unidades.caixa']}"/>
			<h:inputText id="qtdUniCaixa" value="#{MedicamentoBean.medicamento.qtdUnidadesPorCaixa}" label="numeroUnidades" converterMessage="#{msgs['cadastro.numero.invalido']}"
					required="true" requiredMessage="#{msgs['cadastro.quantidadeUnidadeCaixa.ausente']}"/>
			
			<h:outputText value="#{msgs['cadastro.quantidade.caixas']}"/>
			<h:inputText id="qtdCaixa" value="#{MedicamentoBean.medicamento.qtdCaixas}" label="numero invalido" converterMessage="#{msgs['cadastro.numero.invalido']}"
					required="true" requiredMessage="#{msgs['cadastro.quantidadeDeCaixas.ausente']}">
			</h:inputText>
			
			<h:outputText value="#{msgs['cadastro.lote.medicamento']}"/>
			<h:inputText id="lote" value="#{MedicamentoBean.medicamento.loteMedicamento}"
					required="true" requiredMessage="#{msgs['cadastro.loteMedicamento.ausente']}"/>
			
			<h:outputText value="#{msgs['cadastro.data.validade.medicamento']}"/>
			<h:inputText id="dtCon" value="#{MedicamentoBean.medicamento.validadeMedicamento}" label="Data inválido" converterMessage="#{msgs['cadastro.data.invalida']}"
					required="true" requiredMessage="#{msgs['cadastro.data.ausente']}">
					<f:convertDateTime pattern="dd-MM-yyyy" />
			</h:inputText>
				
						
			<h:outputText value="#{msgs['cadastro.nota.fiscal.medicamento']}"/>
			<h:inputText id="notaFiscal" value="#{MedicamentoBean.medicamento.notaFiscalMedicamento}" 
					required="true" requiredMessage="#{msgs['cadastro.numeroNotaFiscal.ausente']}"/>
			
			<h:outputText value="#{msgs['cadastro.tipo.atencao.medicamento']}"/>
			<h:selectOneListbox value="#{MedicamentoBean.medicamento.tipoAtencaoMedicamento}"
						id="tipoAtencao" size="1">

					<f:selectItem itemValue="Atencao Basica"/>
					<f:selectItem itemValue="Atencao Secundaria"/>
					<f:selectItem itemValue="Medicamento Alto Custo"/>
							
			</h:selectOneListbox>
			
			<h:outputText value="#{msgs['cadastro.tipo.medicamento']}"/>
			<h:selectOneListbox value="#{MedicamentoBean.medicamento.tipoMedicamento}"
						id="tipoMedicamento" size="1">

					<f:selectItem itemValue="Controlado"/>
					<f:selectItem itemValue="Nao Controlado"/>
							
			</h:selectOneListbox>
			
			
			
			<h:outputText value="#{msgs['cadastro.valor.medicamento']}"/>
			<h:inputText id="valor" value="#{MedicamentoBean.medicamento.valorMedicamento}" 
					required="true" requiredMessage="#{msgs['cadastro.valorMedicamento.ausente']}"/>
	
	</h:panelGrid>

	<br/>

			<div class="botoes">
		
			<h:commandButton type="submit" value="Cadastrar"
			action="#{MedicamentoBean.inserirMedicamento}"/>
			
			<h:commandButton value="Cancelar" action="cancelar" immediate="true"/> 	
				
			</div>

</fieldset>
		

</h:form>


<fieldset>

	<legend>Avisos ao Usuário</legend>
	
<h:messages style="Color: red" showDetail="false"/>

</fieldset>



</f:view>
</body>
</html>