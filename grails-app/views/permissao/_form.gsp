<%@ page import="formulariosgt.permissoes.Permissao" %>



<div class="fieldcontain ${hasErrors(bean: permissaoInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="permissao.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${permissaoInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: permissaoInstance, field: 'features', 'error')} ">
	<label for="features">
		<g:message code="permissao.features.label" default="Features" />
		
	</label>
	<g:select name="features" from="${formulariosgt.permissoes.Feature.list()}" multiple="multiple" optionKey="id" size="5" value="${permissaoInstance?.features*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: permissaoInstance, field: 'usuarios', 'error')} ">
	<label for="usuarios">
		<g:message code="permissao.usuarios.label" default="Usuarios" />
		
	</label>
	

</div>

