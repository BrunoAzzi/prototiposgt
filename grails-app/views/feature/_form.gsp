<%@ page import="formulariosgt.permissoes.Feature" %>



<div class="fieldcontain ${hasErrors(bean: featureInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="feature.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${featureInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: featureInstance, field: 'permissoes', 'error')} ">
	<label for="permissoes">
		<g:message code="feature.permissoes.label" default="Permissoes" />
		
	</label>
	

</div>

