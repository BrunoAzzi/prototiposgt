
<%@ page import="formulariosgt.apropriacao.ProducaoApropriada" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'producaoApropriada.label', default: 'ProducaoApropriada')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-producaoApropriada" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-producaoApropriada" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list producaoApropriada">
			
				<g:if test="${producaoApropriadaInstance?.apropriador}">
				<li class="fieldcontain">
					<span id="apropriador-label" class="property-label"><g:message code="producaoApropriada.apropriador.label" default="Apropriador" /></span>
					
						<span class="property-value" aria-labelledby="apropriador-label"><g:link controller="usuario" action="show" id="${producaoApropriadaInstance?.apropriador?.id}">${producaoApropriadaInstance?.apropriador?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${producaoApropriadaInstance?.atendimento}">
				<li class="fieldcontain">
					<span id="atendimento-label" class="property-label"><g:message code="producaoApropriada.atendimento.label" default="Atendimento" /></span>
					
						<span class="property-value" aria-labelledby="atendimento-label"><g:link controller="atendimento" action="show" id="${producaoApropriadaInstance?.atendimento?.id}">${producaoApropriadaInstance?.atendimento?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${producaoApropriadaInstance?.dataDeApropriacao}">
				<li class="fieldcontain">
					<span id="dataDeApropriacao-label" class="property-label"><g:message code="producaoApropriada.dataDeApropriacao.label" default="Data De Apropriacao" /></span>
					
						<span class="property-value" aria-labelledby="dataDeApropriacao-label"><g:formatDate date="${producaoApropriadaInstance?.dataDeApropriacao}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${producaoApropriadaInstance?.quantidadeApropriada}">
				<li class="fieldcontain">
					<span id="quantidadeApropriada-label" class="property-label"><g:message code="producaoApropriada.quantidadeApropriada.label" default="Quantidade Apropriada" /></span>
					
						<span class="property-value" aria-labelledby="quantidadeApropriada-label"><g:fieldValue bean="${producaoApropriadaInstance}" field="quantidadeApropriada"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${producaoApropriadaInstance?.receitaApropriada}">
				<li class="fieldcontain">
					<span id="receitaApropriada-label" class="property-label"><g:message code="producaoApropriada.receitaApropriada.label" default="Receita Apropriada" /></span>
					
						<span class="property-value" aria-labelledby="receitaApropriada-label"><g:link controller="receitaApropriada" action="show" id="${producaoApropriadaInstance?.receitaApropriada?.id}">${producaoApropriadaInstance?.receitaApropriada?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:producaoApropriadaInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${producaoApropriadaInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
