<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:view>
 
	<fieldset>
			<h:form>
					<legend style="margin-left: 200px;">Atualizar Cadastro de
						Pacientes</legend>
					<h:panelGrid columns="2">

						<h:outputText value="#{msgs['paciente.nome.paciente']}"
							styleClass="campo" />
						<h:inputText id="nomePacienteAusente"
							value="#{PacienteBean.paciente.nome}"
							required="true"
							requiredMessage="#{msgs['paciente.nomePacienteAusente']}"
							style="width:200px;" styleClass="campo" />

						<h:outputText value="#{msgs['paciente.rg.paciente']}"
							styleClass="campo" />
						<h:inputText id="rg"
							value="#{PacienteBean.paciente.rg}"
							required="true"
							requiredMessage="#{msgs['paciente.numeroRgAusente']}"
							style="width:200px;" styleClass="campo" />

						<h:outputText value="#{msgs['paciente.cartao.sus']}"
							styleClass="campo" />
						<h:inputText id="cartaosus"
							value="#{PacienteBean.paciente.numero_cartao_sus}"
							required="true"
							style="width:200px;" styleClass="campo" />

					</h:panelGrid>
					
					<h:commandButton type="submit" value="Atualizar"
						action="#{PacienteBean.inserirPaciente}" styleClass="botoes"
						style="margin-left: 200px;" />

					<h:commandButton value="Cancelar" action="cancelar"
						immediate="true" styleClass="botoes" />
			</h:form>		
	</fieldset>

</f:view>
</body>
</html>