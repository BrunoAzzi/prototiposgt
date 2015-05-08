<%@ page import="formulariosgt.clientes.TipoCliente" %>



<div class="fieldcontain ${hasErrors(bean: tipoClienteInstance, field: 'clientes', 'error')} ">
	<label for="clientes">
		<g:message code="tipoCliente.clientes.label" default="Clientes" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${tipoClienteInstance?.clientes?}" var="c">
    <li><g:link controller="cliente" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="cliente" action="create" params="['tipoCliente.id': tipoClienteInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'cliente.label', default: 'Cliente')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: tipoClienteInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="tipoCliente.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${tipoClienteInstance?.descricao}"/>

</div>

