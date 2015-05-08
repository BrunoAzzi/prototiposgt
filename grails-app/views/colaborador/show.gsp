
<%@ page import="formulariosgt.colaboradores.Colaborador" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'colaborador.label', default: 'Colaborador')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-colaborador" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-colaborador" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list colaborador">
			
				<g:if test="${colaboradorInstance?.cpf}">
				<li class="fieldcontain">
					<span id="cpf-label" class="property-label"><g:message code="colaborador.cpf.label" default="Cpf" /></span>
					
						<span class="property-value" aria-labelledby="cpf-label"><g:fieldValue bean="${colaboradorInstance}" field="cpf"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="colaborador.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${colaboradorInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.formacaoColaboradorId}">
				<li class="fieldcontain">
					<span id="formacaoColaboradorId-label" class="property-label"><g:message code="colaborador.formacaoColaboradorId.label" default="Formacao Colaborador Id" /></span>
					
						<span class="property-value" aria-labelledby="formacaoColaboradorId-label"><g:link controller="formacaoColaborador" action="show" id="${colaboradorInstance?.formacaoColaboradorId?.id}">${colaboradorInstance?.formacaoColaboradorId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.isAtivo}">
				<li class="fieldcontain">
					<span id="isAtivo-label" class="property-label"><g:message code="colaborador.isAtivo.label" default="Is Ativo" /></span>
					
						<span class="property-value" aria-labelledby="isAtivo-label"><g:formatBoolean boolean="${colaboradorInstance?.isAtivo}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.linkCurriculumVitae}">
				<li class="fieldcontain">
					<span id="linkCurriculumVitae-label" class="property-label"><g:message code="colaborador.linkCurriculumVitae.label" default="Link Curriculum Vitae" /></span>
					
						<span class="property-value" aria-labelledby="linkCurriculumVitae-label"><g:fieldValue bean="${colaboradorInstance}" field="linkCurriculumVitae"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.nomeCompleto}">
				<li class="fieldcontain">
					<span id="nomeCompleto-label" class="property-label"><g:message code="colaborador.nomeCompleto.label" default="Nome Completo" /></span>
					
						<span class="property-value" aria-labelledby="nomeCompleto-label"><g:fieldValue bean="${colaboradorInstance}" field="nomeCompleto"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.numeroCentroDeResponsabilidade}">
				<li class="fieldcontain">
					<span id="numeroCentroDeResponsabilidade-label" class="property-label"><g:message code="colaborador.numeroCentroDeResponsabilidade.label" default="Numero Centro De Responsabilidade" /></span>
					
						<span class="property-value" aria-labelledby="numeroCentroDeResponsabilidade-label"><g:fieldValue bean="${colaboradorInstance}" field="numeroCentroDeResponsabilidade"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.numeroDeHorasDeTrabalho}">
				<li class="fieldcontain">
					<span id="numeroDeHorasDeTrabalho-label" class="property-label"><g:message code="colaborador.numeroDeHorasDeTrabalho.label" default="Numero De Horas De Trabalho" /></span>
					
						<span class="property-value" aria-labelledby="numeroDeHorasDeTrabalho-label"><g:fieldValue bean="${colaboradorInstance}" field="numeroDeHorasDeTrabalho"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.produtosRegionais}">
				<li class="fieldcontain">
					<span id="produtosRegionais-label" class="property-label"><g:message code="colaborador.produtosRegionais.label" default="Produtos Regionais" /></span>
					
						<g:each in="${colaboradorInstance.produtosRegionais}" var="p">
						<span class="property-value" aria-labelledby="produtosRegionais-label"><g:link controller="produtoRegional" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.skills}">
				<li class="fieldcontain">
					<span id="skills-label" class="property-label"><g:message code="colaborador.skills.label" default="Skills" /></span>
					
						<g:each in="${colaboradorInstance.skills}" var="s">
						<span class="property-value" aria-labelledby="skills-label"><g:link controller="skill" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.telefone}">
				<li class="fieldcontain">
					<span id="telefone-label" class="property-label"><g:message code="colaborador.telefone.label" default="Telefone" /></span>
					
						<span class="property-value" aria-labelledby="telefone-label"><g:fieldValue bean="${colaboradorInstance}" field="telefone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.tipoContratoColaboradorId}">
				<li class="fieldcontain">
					<span id="tipoContratoColaboradorId-label" class="property-label"><g:message code="colaborador.tipoContratoColaboradorId.label" default="Tipo Contrato Colaborador Id" /></span>
					
						<span class="property-value" aria-labelledby="tipoContratoColaboradorId-label"><g:link controller="tipoContratoColaborador" action="show" id="${colaboradorInstance?.tipoContratoColaboradorId?.id}">${colaboradorInstance?.tipoContratoColaboradorId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${colaboradorInstance?.usuario}">
				<li class="fieldcontain">
					<span id="usuario-label" class="property-label"><g:message code="colaborador.usuario.label" default="Usuario" /></span>
					
						<span class="property-value" aria-labelledby="usuario-label"><g:link controller="usuario" action="show" id="${colaboradorInstance?.usuario?.id}">${colaboradorInstance?.usuario?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:colaboradorInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${colaboradorInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
