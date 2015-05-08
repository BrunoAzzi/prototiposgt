<%@ page import="formulariosgt.unidades.Regiao" %>



<div class="fieldcontain ${hasErrors(bean: regiaoInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="regiao.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${regiaoInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: regiaoInstance, field: 'municipios', 'error')} ">
	<label for="municipios">
		<g:message code="regiao.municipios.label" default="Municipios" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${regiaoInstance?.municipios?}" var="m">
    <li><g:link controller="municipio" action="show" id="${m.id}">${m?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="municipio" action="create" params="['regiao.id': regiaoInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'municipio.label', default: 'Municipio')])}</g:link>
</li>
</ul>


</div>

