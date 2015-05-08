<%@ page import="formulariosgt.produto.ProdutoCategoria" %>



<div class="fieldcontain ${hasErrors(bean: produtoCategoriaInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="produtoCategoria.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${produtoCategoriaInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: produtoCategoriaInstance, field: 'numeroCentroDeResponsabilidade', 'error')} required">
	<label for="numeroCentroDeResponsabilidade">
		<g:message code="produtoCategoria.numeroCentroDeResponsabilidade.label" default="Numero Centro De Responsabilidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="numeroCentroDeResponsabilidade" required="" value="${produtoCategoriaInstance?.numeroCentroDeResponsabilidade}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: produtoCategoriaInstance, field: 'produtoLinhaId', 'error')} required">
	<label for="produtoLinhaId">
		<g:message code="produtoCategoria.produtoLinhaId.label" default="Produto Linha Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="produtoLinhaId" name="produtoLinhaId.id" from="${formulariosgt.produto.ProdutoLinha.list()}" optionKey="id" required="" value="${produtoCategoriaInstance?.produtoLinhaId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: produtoCategoriaInstance, field: 'produtosNacionais', 'error')} ">
	<label for="produtosNacionais">
		<g:message code="produtoCategoria.produtosNacionais.label" default="Produtos Nacionais" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${produtoCategoriaInstance?.produtosNacionais?}" var="p">
    <li><g:link controller="produtoNacional" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="produtoNacional" action="create" params="['produtoCategoria.id': produtoCategoriaInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'produtoNacional.label', default: 'ProdutoNacional')])}</g:link>
</li>
</ul>


</div>

