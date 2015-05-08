<%@ page import="formulariosgt.colaboradores.FormacaoColaborador" %>



<div class="fieldcontain ${hasErrors(bean: formacaoColaboradorInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="formacaoColaborador.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${formacaoColaboradorInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: formacaoColaboradorInstance, field: 'colaboradorId', 'error')} ">
	<label for="colaboradorId">
		<g:message code="formacaoColaborador.colaboradorId.label" default="Colaborador Id" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${formacaoColaboradorInstance?.colaboradorId?}" var="c">
    <li><g:link controller="colaborador" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="colaborador" action="create" params="['formacaoColaborador.id': formacaoColaboradorInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'colaborador.label', default: 'Colaborador')])}</g:link>
</li>
</ul>


</div>

