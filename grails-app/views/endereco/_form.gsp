<%@ page import="formulariosgt.clientes.Endereco" %>



<div class="fieldcontain ${hasErrors(bean: enderecoInstance, field: 'bairro', 'error')} required">
	<label for="bairro">
		<g:message code="endereco.bairro.label" default="Bairro" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="bairro" required="" value="${enderecoInstance?.bairro}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: enderecoInstance, field: 'cep', 'error')} required">
	<label for="cep">
		<g:message code="endereco.cep.label" default="Cep" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cep" required="" value="${enderecoInstance?.cep}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: enderecoInstance, field: 'cliente', 'error')} required">
	<label for="cliente">
		<g:message code="endereco.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${formulariosgt.clientes.Cliente.list()}" optionKey="id" required="" value="${enderecoInstance?.cliente?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: enderecoInstance, field: 'localidade', 'error')} required">
	<label for="localidade">
		<g:message code="endereco.localidade.label" default="Localidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="localidade" required="" value="${enderecoInstance?.localidade}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: enderecoInstance, field: 'logradouro', 'error')} required">
	<label for="logradouro">
		<g:message code="endereco.logradouro.label" default="Logradouro" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="logradouro" required="" value="${enderecoInstance?.logradouro}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: enderecoInstance, field: 'uf', 'error')} required">
	<label for="uf">
		<g:message code="endereco.uf.label" default="Uf" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="uf" required="" value="${enderecoInstance?.uf}"/>

</div>

