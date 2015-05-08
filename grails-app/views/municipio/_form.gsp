<%@ page import="formulariosgt.unidades.Municipio" %>



<div class="fieldcontain ${hasErrors(bean: municipioInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="municipio.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${municipioInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: municipioInstance, field: 'unidadeFederativa', 'error')} required">
	<label for="unidadeFederativa">
		<g:message code="municipio.unidadeFederativa.label" default="Unidade Federativa" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="unidadeFederativa" required="" value="${municipioInstance?.unidadeFederativa}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: municipioInstance, field: 'regiao', 'error')} required">
	<label for="regiao">
		<g:message code="municipio.regiao.label" default="Regiao" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="regiao" name="regiao.id" from="${formulariosgt.unidades.Regiao.list()}" optionKey="id" required="" value="${municipioInstance?.regiao?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: municipioInstance, field: 'unidades', 'error')} ">
	<label for="unidades">
		<g:message code="municipio.unidades.label" default="Unidades" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${municipioInstance?.unidades?}" var="u">
    <li><g:link controller="unidade" action="show" id="${u.id}">${u?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="unidade" action="create" params="['municipio.id': municipioInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'unidade.label', default: 'Unidade')])}</g:link>
</li>
</ul>


</div>

