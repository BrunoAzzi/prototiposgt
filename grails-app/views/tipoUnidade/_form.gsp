<%@ page import="formulariosgt.unidades.TipoUnidade" %>



<div class="fieldcontain ${hasErrors(bean: tipoUnidadeInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="tipoUnidade.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${tipoUnidadeInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: tipoUnidadeInstance, field: 'unidades', 'error')} ">
	<label for="unidades">
		<g:message code="tipoUnidade.unidades.label" default="Unidades" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${tipoUnidadeInstance?.unidades?}" var="u">
    <li><g:link controller="unidade" action="show" id="${u.id}">${u?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="unidade" action="create" params="['tipoUnidade.id': tipoUnidadeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'unidade.label', default: 'Unidade')])}</g:link>
</li>
</ul>


</div>

