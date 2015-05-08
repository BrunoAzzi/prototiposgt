<%@ page import="formulariosgt.unidades.Unidade" %>



<div class="fieldcontain ${hasErrors(bean: unidadeInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="unidade.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${unidadeInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: unidadeInstance, field: 'municipio', 'error')} required">
	<label for="municipio">
		<g:message code="unidade.municipio.label" default="Municipio" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="municipio" name="municipio.id" from="${formulariosgt.unidades.Municipio.list()}" optionKey="id" required="" value="${unidadeInstance?.municipio?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: unidadeInstance, field: 'numeroCentroDeResponsabilidade', 'error')} required">
	<label for="numeroCentroDeResponsabilidade">
		<g:message code="unidade.numeroCentroDeResponsabilidade.label" default="Numero Centro De Responsabilidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numeroCentroDeResponsabilidade" type="number" value="${unidadeInstance.numeroCentroDeResponsabilidade}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: unidadeInstance, field: 'produtosRegionais', 'error')} ">
	<label for="produtosRegionais">
		<g:message code="unidade.produtosRegionais.label" default="Produtos Regionais" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${unidadeInstance?.produtosRegionais?}" var="p">
    <li><g:link controller="produtoRegional" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="produtoRegional" action="create" params="['unidade.id': unidadeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'produtoRegional.label', default: 'ProdutoRegional')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: unidadeInstance, field: 'tipoUnidade', 'error')} required">
	<label for="tipoUnidade">
		<g:message code="unidade.tipoUnidade.label" default="Tipo Unidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="tipoUnidade" name="tipoUnidade.id" from="${formulariosgt.unidades.TipoUnidade.list()}" optionKey="id" required="" value="${unidadeInstance?.tipoUnidade?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: unidadeInstance, field: 'usuarios', 'error')} ">
	<label for="usuarios">
		<g:message code="unidade.usuarios.label" default="Usuarios" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${unidadeInstance?.usuarios?}" var="u">
    <li><g:link controller="usuario" action="show" id="${u.id}">${u?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="usuario" action="create" params="['unidade.id': unidadeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'usuario.label', default: 'Usuario')])}</g:link>
</li>
</ul>


</div>

