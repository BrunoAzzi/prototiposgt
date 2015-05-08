<%@ page import="formulariosgt.produto.ProdutoNacional" %>



<div class="fieldcontain ${hasErrors(bean: produtoNacionalInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="produtoNacional.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" required="" value="${produtoNacionalInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: produtoNacionalInstance, field: 'produtoCategoriaId', 'error')} required">
	<label for="produtoCategoriaId">
		<g:message code="produtoNacional.produtoCategoriaId.label" default="Produto Categoria Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="produtoCategoriaId" name="produtoCategoriaId.id" from="${formulariosgt.produto.ProdutoCategoria.list()}" optionKey="id" required="" value="${produtoNacionalInstance?.produtoCategoriaId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: produtoNacionalInstance, field: 'produtosRegionais', 'error')} ">
	<label for="produtosRegionais">
		<g:message code="produtoNacional.produtosRegionais.label" default="Produtos Regionais" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${produtoNacionalInstance?.produtosRegionais?}" var="p">
    <li><g:link controller="produtoRegional" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="produtoRegional" action="create" params="['produtoNacional.id': produtoNacionalInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'produtoRegional.label', default: 'ProdutoRegional')])}</g:link>
</li>
</ul>


</div>

