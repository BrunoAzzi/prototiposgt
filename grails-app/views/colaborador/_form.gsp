<%@ page import="formulariosgt.colaboradores.Colaborador" %>



<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'cpf', 'error')} required">
	<label for="cpf">
		<g:message code="colaborador.cpf.label" default="Cpf" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cpf" required="" value="${colaboradorInstance?.cpf}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="colaborador.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${colaboradorInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'formacaoColaboradorId', 'error')} required">
	<label for="formacaoColaboradorId">
		<g:message code="colaborador.formacaoColaboradorId.label" default="Formacao Colaborador Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="formacaoColaboradorId" name="formacaoColaboradorId.id" from="${formulariosgt.colaboradores.FormacaoColaborador.list()}" optionKey="id" required="" value="${colaboradorInstance?.formacaoColaboradorId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'isAtivo', 'error')} ">
	<label for="isAtivo">
		<g:message code="colaborador.isAtivo.label" default="Is Ativo" />
		
	</label>
	<g:checkBox name="isAtivo" value="${colaboradorInstance?.isAtivo}" />

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'linkCurriculumVitae', 'error')} required">
	<label for="linkCurriculumVitae">
		<g:message code="colaborador.linkCurriculumVitae.label" default="Link Curriculum Vitae" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="linkCurriculumVitae" required="" value="${colaboradorInstance?.linkCurriculumVitae}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'nomeCompleto', 'error')} required">
	<label for="nomeCompleto">
		<g:message code="colaborador.nomeCompleto.label" default="Nome Completo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nomeCompleto" required="" value="${colaboradorInstance?.nomeCompleto}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'numeroCentroDeResponsabilidade', 'error')} required">
	<label for="numeroCentroDeResponsabilidade">
		<g:message code="colaborador.numeroCentroDeResponsabilidade.label" default="Numero Centro De Responsabilidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="numeroCentroDeResponsabilidade" required="" value="${colaboradorInstance?.numeroCentroDeResponsabilidade}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'numeroDeHorasDeTrabalho', 'error')} required">
	<label for="numeroDeHorasDeTrabalho">
		<g:message code="colaborador.numeroDeHorasDeTrabalho.label" default="Numero De Horas De Trabalho" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numeroDeHorasDeTrabalho" type="number" value="${colaboradorInstance.numeroDeHorasDeTrabalho}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'produtosRegionais', 'error')} ">
	<label for="produtosRegionais">
		<g:message code="colaborador.produtosRegionais.label" default="Produtos Regionais" />
		
	</label>
	<g:select name="produtosRegionais" from="${formulariosgt.produto.ProdutoRegional.list()}" multiple="multiple" optionKey="id" size="5" value="${colaboradorInstance?.produtosRegionais*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'skills', 'error')} ">
	<label for="skills">
		<g:message code="colaborador.skills.label" default="Skills" />
		
	</label>
	

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'telefone', 'error')} required">
	<label for="telefone">
		<g:message code="colaborador.telefone.label" default="Telefone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="telefone" required="" value="${colaboradorInstance?.telefone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'tipoContratoColaboradorId', 'error')} required">
	<label for="tipoContratoColaboradorId">
		<g:message code="colaborador.tipoContratoColaboradorId.label" default="Tipo Contrato Colaborador Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="tipoContratoColaboradorId" name="tipoContratoColaboradorId.id" from="${formulariosgt.colaboradores.TipoContratoColaborador.list()}" optionKey="id" required="" value="${colaboradorInstance?.tipoContratoColaboradorId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: colaboradorInstance, field: 'usuario', 'error')} required">
	<label for="usuario">
		<g:message code="colaborador.usuario.label" default="Usuario" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="usuario" name="usuario.id" from="${formulariosgt.usuarios.Usuario.list()}" optionKey="id" required="" value="${colaboradorInstance?.usuario?.id}" class="many-to-one"/>

</div>

