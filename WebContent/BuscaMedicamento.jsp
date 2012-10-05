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
		<div id="content" style="overflow: -moz-scrollbars-vertical;">

			<div id="content_left">

				<div id="menuUser">
					<ul id="menu">
						<li class="header">Menu</li>
						<li><a href="Home.jsp" title="">Home</a></li>
						<li class="parent"><a href="#" title="">Medicamento</a>
							<ul class="sub-menu">
								<li><a href="cadastrar_medicamento.jsp" title="">Cadastrar</a></li>
								<li><a href="#" title="">Listar</a></li>
								<li><a href="#" title="">Editar/Remover</a></li>
							</ul></li>
						<li class="parent"><a href="#" title="">Paciente</a>
							<ul class="sub-menu">
								<li><a href="#" title="">Cadastrar</a></li>
								<li><a href="#" title="">Listar</a></li>
								<li><a href="#" title="">Editar/Remover</a></li>
							</ul></li>
						<li class="parent"><a href="#" title="">Unidade</a>
							<ul class="sub-menu">
								<li><a href="#" title="">Cadastrar</a></li>
								<li><a href="#" title="">Listar</a></li>
								<li><a href="#" title="">Editar/Remover</a></li>
							</ul></li>
						<li class="parent"><a href="#" title="">Dispensa</a>
							<ul class="sub-menu">
								<li><a href="#" title="">Cadastrar</a></li>
								<li><a href="#" title="">Listar</a></li>
								<li><a href="#" title="">Editar/Remover</a></li>
							</ul></li>
						<li class="parent"><a href="#" title="">Relatórios</a>
							<ul class="sub-menu">
								<li><a href="#" title="">Dispensas</a></li>
								<li><a href="#" title="">Unidades</a></li>
								<li><a href="#" title="">Remedios</a></li>
								<li><a href="#" title="">Pacientes</a></li>
							</ul></li>
					</ul>
				</div>


			</div>

			<div id="content_right">
				<h:form>

					<fieldset>

						<legend style="margin-left: 200px;">
							<h:outputText value="Buscar Medicamento" />
						</legend>
						<h:messages style="color: red" showDetail="false" />


						<h:panelGrid columns="1" title="Medicamentos">

							<h:outputText value="Critérios de Consulta" styleClass="texto" />
							<h:selectOneRadio layout="pageDirection" onclick="submit()"
								value="#{MedicamentoBean.tipo_busca}" required="true"
								requiredMessage="Secione um tipo de busca!" styleClass="texto"
								id="radio">
								<f:selectItem
									itemLabel="#{msgs['Busca.medicamento.radio.codigo']}"
									itemValue="codigo" />
								<f:selectItem
									itemLabel="#{msgs['Busca.medicamento.radio.nome']}"
									itemValue="nome" />
								<f:selectItem
									itemLabel="#{msgs['Busca.medicamento.radio.lote']}"
									itemValue="lote" />
								<f:selectItem itemLabel="#{msgs['Busca.medicamento.radio.nf']}"
									itemValue="nota" />
								<f:selectItem
									itemLabel="#{msgs['Busca.medicamento.radio.todos']}"
									itemValue="todos" />
							</h:selectOneRadio>



						</h:panelGrid>

						<h:panelGrid>
							<h:outputText
								value="Digite o Texto de Acordo com o Critério Escolhido"
								styleClass="texto" id="label" />

							<h:panelGroup>
								<h:inputText value="#{MedicamentoBean.parametro}" size="40"
									onchange="submint()" required="true"
									requiredMessage="O campo Parâmetro é obrigatório!"
									style=" margin-left:20px;" styleClass="campo" id="param" />
								<h:commandButton
									value="#{msgs['Busca.medicamento.botao.label']}"
									actionListener="#{MedicamentoBean.EfetuaBusca}"
									styleClass="botoes" />
							</h:panelGroup>
						</h:panelGrid>



						<h:dataTable value="#{MedicamentoBean.lista}" var="item"
							rendered="true" styleClass="tabela" headerClass="cabecalho"
							rowClasses="linha1,linha2">
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
									<h:outputText
										value="#{msgs['Busca.medicamento.table.validae']}" />
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

							<h:column>
								<f:facet name="header">
									<h:outputText value="Operação" />
								</f:facet>
								<h:commandLink value="atualizar"></h:commandLink>
							</h:column>
						</h:dataTable>

					</fieldset>

				</h:form>

			</div>

		</div>



	</f:view>
</body>
</html>