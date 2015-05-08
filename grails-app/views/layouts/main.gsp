<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title><g:layoutTitle default="Grails"/></title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
        <!--<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">-->
        <!--<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">-->
    <!--<asset:stylesheet src="bootstrap.min.css"/>-->
    <!--<asset:stylesheet src="sticky-footer.css"/>-->
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
    <!--<asset:javascript src="jquery.min.js"/>-->
    <!--<asset:javascript src="bootstrap.min.js"/>-->
    <g:layoutHead/>
</head>

<body>
    <div id="grailsLogo" role="banner"><a href="http://grails.org">
            <asset:image src="logoinstitutos.png" alt="SENAI"/></a></div>
    <!--<nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="${createLink(uri: '/')}">SGT</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Clientes<span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="${createLink(view:"PessoaFisica")}">Pessoa Fisica</a></li>
                            <li><a href="#">Pessoa Fisica Estrangeira</a></li>
                            <li class="divider"></li>
                            <li><a href="#">Pessoa Juridica</a></li>
                            <li><a href="#">Pessoa Juridica Estrangeira</a></li>
                        </ul>
                    </li>
                    <li><a href="#about">Produtos</a></li>
                    <li><a href="#contact">Colaboradores</a></li>
                    <li><a href="#contact">Atendimentos</a></li>
                    <li><a href="#contact">Propostas</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Apropriações <span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#">Receita</a></li>
                            <li><a href="#">Produção</a></li>
                        </ul>
                    </li>
                </ul>
            </div> 
        </div>
    </nav>-->

    <!--<div class="container">-->
        <g:layoutBody/>
    <!--</div>-->

    <div class="footer">

    </div>
</body>

</html>
