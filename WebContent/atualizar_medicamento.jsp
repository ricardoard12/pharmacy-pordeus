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
						<li><h:commandLink value="Listar" action="#{UnidadeBean.listarUnidades }"></h:commandLink></li>
					</ul></li>
					<li class="parent"><a href="#" title="">Dispensar para Unidade</a>
					<ul class="sub-menu">
						<li><a href="#" title="">Cadastrar</a></li>
						<li><a href="#" title="">Listar</a></li>
					</ul></li>
					
					
					
					
					<li class="header">Módulo UDP</li>
					<li class="parent"><a href="#" title="">Paciente</a>
					<ul class="sub-menu">
						<li><a href="cadastrar_paciente.jsp" title="">Cadastrar</a></li>
						<li><h:commandLink value="Listar" action="#{PacienteBean.listarPacientes }"></h:commandLink></li>
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
						<legend style="margin-left: 200px;">Atualizar Dados do
							Medicamento</legend>
							<div id="cads">
						<h:panelGrid columns="2">

							

								<h:outputText value="#{msgs['cadastro.nome.medicamento']}"
									styleClass="campo" />
								<h:inputText id="nomeMedausente"
									value="#{MedicamentoBean.medicamento.nomeMedicamento}"
									required="true"
									requiredMessage="#{msgs['cadastro.nomeMedausente']}"
									style="width:200px;" styleClass="campo" />

								<h:outputText value="#{msgs['cadastro.prateleira.medicamento']}"
									styleClass="campo" />
								<h:inputText id="prateleira"
									value="#{MedicamentoBean.medicamento.prateleiraMedicamento}"
									required="true"
									requiredMessage="#{msgs['cadastro.prateleira.ausente']}"
									style="width:200px;" styleClass="campo" />

								<h:outputText
									value="#{msgs['cadastro.apresentacao.medicamento']}"
									styleClass="campo" />
								<h:selectOneListbox
									value="#{MedicamentoBean.medicamento.apresentacaoMedicamento}"
									id="apresentacao" required="true"
									requiredMessage="#{msgs['cadastro.apresentacao.ausente']}"
									style="width:205px;" size="1" styleClass="campo">
									<f:selectItem itemValue="Selecione" />
									<f:selectItem itemValue="Frasco" />
									<f:selectItem itemValue="Ampola" />
									<f:selectItem itemValue="Comprimido" />
									<f:selectItem itemValue="Bisnaga" />
									<f:selectItem itemValue="Xarope" />
									<f:selectItem itemValue="Comprimido" />
									<f:selectItem itemValue="Gotas" />
									<f:selectItem itemValue="Sachê" />
									<f:selectItem itemValue="Spray" />

								</h:selectOneListbox>

								<h:outputText
									value="#{msgs['cadastro.quantidade.unidades.caixa']}"
									styleClass="campo" />
								<h:inputText id="qtdUniCaixa"
									value="#{MedicamentoBean.medicamento.qtdUnidadesPorCaixa}"
									label="numeroUnidades"
									converterMessage="#{msgs['cadastro.numero.invalido']}"
									required="true"
									requiredMessage="#{msgs['cadastro.quantidadeUnidadeCaixa.ausente']}"
									style="width:200px;" styleClass="campo" />

								<h:outputText value="#{msgs['cadastro.quantidade.caixas']}"
									styleClass="campo" />
								<h:inputText id="qtdCaixa"
									value="#{MedicamentoBean.medicamento.qtdCaixas}"
									label="numero invalido"
									converterMessage="#{msgs['cadastro.numero.invalido']}"
									required="true"
									requiredMessage="#{msgs['cadastro.quantidadeDeCaixas.ausente']}"
									style="width:200px;" styleClass="campo">
								</h:inputText>

								<h:outputText value="#{msgs['cadastro.lote.medicamento']}"
									styleClass="campo" />
								<h:inputText id="lote"
									value="#{MedicamentoBean.medicamento.loteMedicamento}"
									required="true"
									requiredMessage="#{msgs['cadastro.loteMedicamento.ausente']}"
									style="width:200px;" styleClass="campo" />

								<h:outputText
									value="#{msgs['cadastro.data.validade.medicamento']}"
									styleClass="campo" />
								<h:inputText id="dtCon"
									value="#{MedicamentoBean.medicamento.validadeMedicamento}"
									label="Data inválido"
									converterMessage="#{msgs['cadastro.data.invalida']}"
									required="true"
									requiredMessage="#{msgs['cadastro.data.ausente']}"
									style="width:200px;" styleClass="campo">
									<f:convertDateTime pattern="dd-MM-yyyy" />
								</h:inputText>


								<h:outputText
									value="#{msgs['cadastro.nota.fiscal.medicamento']}"
									styleClass="campo" />
								<h:inputText id="notaFiscal"
									value="#{MedicamentoBean.medicamento.notaFiscalMedicamento}"
									required="true"
									requiredMessage="#{msgs['cadastro.numeroNotaFiscal.ausente']}"
									style="width:200px;" styleClass="campo" />

								<h:outputText
									value="#{msgs['cadastro.tipo.atencao.medicamento']}"
									styleClass="campo" />
								<h:selectOneListbox
									value="#{MedicamentoBean.medicamento.tipoAtencaoMedicamento}"
									id="tipoAtencao" size="1" style="width:205px;"
									styleClass="campo">
									<f:selectItem itemValue="Selecione" />
									<f:selectItem itemValue="Atencao Basica" />
									<f:selectItem itemValue="Atencao Secundaria" />
									<f:selectItem itemValue="Medicamento Alto Custo" />

								</h:selectOneListbox>

								<h:outputText value="#{msgs['cadastro.tipo.medicamento']}"
									styleClass="campo" />
								<h:selectOneListbox
									value="#{MedicamentoBean.medicamento.tipoMedicamento}"
									id="tipoMedicamento" size="1" style="width:205px;"
									styleClass="campo">
									<f:selectItem itemValue="Selecione" />
									<f:selectItem itemValue="Controlado" />
									<f:selectItem itemValue="Nao Controlado" />

								</h:selectOneListbox>



								<h:outputText value="#{msgs['cadastro.valor.medicamento']}"
									styleClass="campo" />
								<h:inputText id="valor"
									value="#{MedicamentoBean.medicamento.valorMedicamento}"
									required="true"
									requiredMessage="#{msgs['cadastro.valorMedicamento.ausente']}"
									style="width:202px;" styleClass="campo" />
						</h:panelGrid>

						<h:commandButton type="submit" value="Atualizar"
							action="#{MedicamentoBean.atualizarMedicamento}"
							styleClass="botoes" style="margin-left: 200px;" />

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
