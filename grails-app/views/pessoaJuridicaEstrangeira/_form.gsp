<%@ page import="formulariosgt.clientes.PessoaJuridicaEstrangeira" %>



<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaEstrangeiraInstance, field: 'cliente', 'error')} required">
	<label for="cliente">
		<g:message code="pessoaJuridicaEstrangeira.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${formulariosgt.clientes.Cliente.list()}" optionKey="id" required="" value="${pessoaJuridicaEstrangeiraInstance?.cliente?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaEstrangeiraInstance, field: 'documentoEmpresaEstrangeira', 'error')} required">
	<label for="documentoEmpresaEstrangeira">
		<g:message code="pessoaJuridicaEstrangeira.documentoEmpresaEstrangeira.label" default="Documento Empresa Estrangeira" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="documentoEmpresaEstrangeira" required="" value="${pessoaJuridicaEstrangeiraInstance?.documentoEmpresaEstrangeira}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaEstrangeiraInstance, field: 'equivalenteRazaoSocial', 'error')} required">
	<label for="equivalenteRazaoSocial">
		<g:message code="pessoaJuridicaEstrangeira.equivalenteRazaoSocial.label" default="Equivalente Razao Social" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="equivalenteRazaoSocial" required="" value="${pessoaJuridicaEstrangeiraInstance?.equivalenteRazaoSocial}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaEstrangeiraInstance, field: 'nomeFantasia', 'error')} required">
	<label for="nomeFantasia">
		<g:message code="pessoaJuridicaEstrangeira.nomeFantasia.label" default="Nome Fantasia" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nomeFantasia" required="" value="${pessoaJuridicaEstrangeiraInstance?.nomeFantasia}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaJuridicaEstrangeiraInstance, field: 'numeroDeFuncionarios', 'error')} required">
	<label for="numeroDeFuncionarios">
		<g:message code="pessoaJuridicaEstrangeira.numeroDeFuncionarios.label" default="Numero De Funcionarios" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numeroDeFuncionarios" type="number" value="${pessoaJuridicaEstrangeiraInstance.numeroDeFuncionarios}" required=""/>

</div>

