<%@ page import="formulariosgt.produto.ProdutoLinha" %>



<div class="fieldcontain ${hasErrors(bean: produtoLinhaInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="produtoLinha.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${produtoLinhaInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: produtoLinhaInstance, field: 'numeroCentroDeResponsabilidade', 'error')} required">
	<label for="numeroCentroDeResponsabilidade">
		<g:message code="produtoLinha.numeroCentroDeResponsabilidade.label" default="Numero Centro De Responsabilidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="numeroCentroDeResponsabilidade" required="" value="${produtoLinhaInstance?.numeroCentroDeResponsabilidade}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: produtoLinhaInstance, field: 'produtosCategorias', 'error')} ">
	<label for="produtosCategorias">
		<g:message code="produtoLinha.produtosCategorias.label" default="Produtos Categorias" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${produtoLinhaInstance?.produtosCategorias?}" var="p">
    <li><g:link controller="produtoCategoria" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="produtoCategoria" action="create" params="['produtoLinha.id': produtoLinhaInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'produtoCategoria.label', default: 'ProdutoCategoria')])}</g:link>
</li>
</ul>


</div>

