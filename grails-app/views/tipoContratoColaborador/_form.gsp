<%@ page import="formulariosgt.colaboradores.TipoContratoColaborador" %>



<div class="fieldcontain ${hasErrors(bean: tipoContratoColaboradorInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="tipoContratoColaborador.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${tipoContratoColaboradorInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: tipoContratoColaboradorInstance, field: 'colaboradorId', 'error')} ">
	<label for="colaboradorId">
		<g:message code="tipoContratoColaborador.colaboradorId.label" default="Colaborador Id" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${tipoContratoColaboradorInstance?.colaboradorId?}" var="c">
    <li><g:link controller="colaborador" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="colaborador" action="create" params="['tipoContratoColaborador.id': tipoContratoColaboradorInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'colaborador.label', default: 'Colaborador')])}</g:link>
</li>
</ul>


</div>

