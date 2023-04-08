<%--
    Document   : template
    Created on : Apr 5, 2017, 3:02:46 PM
    Author     : Roni
--%>

<%@tag description="Template principal" pageEncoding="UTF-8" %>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="title" %>


<html>
<head>
    <title>${title}</title>
    <base href="${pageContext.request.contextPath}/">
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <%--    <link rel="icon" type="image/png" href="favicon.png" />--%>

    <!-- CSS -->
    <link rel="stylesheet" href="assets/resources/styles/main.css"></link>
    <link rel="stylesheet" href="assets/resources/styles/template.css"></link>
    <link rel="stylesheet" href="assets/libraries/font-awesome/css/font-awesome.min.css"></link>
    <!-- Beer Css -->
    <link href="https://cdn.jsdelivr.net/npm/beercss@3.1.0/dist/cdn/beer.min.css" rel="stylesheet"></link>
</head>
<body>
<header class="no-padding">
    <nav class="s m l responsive center-align primary">
        <a>
            <i>add</i>
            <span>Novo Funcionario</span>
        </a>
        <a href="http://localhost:8080/controle-de-ponto/employees">
            <i>list</i>
            <span>Listar Funcionarios</span>
        </a>
        <a>
            <i>add_plus</i>
            <span>Novo Registro</span>
        </a>
        <a>
            <i>list</i>
            <span>Ver Registros</span>
        </a>
    </nav>
</header>
<main id="content" class="container">
    <jsp:doBody></jsp:doBody>
</main>
<!-- rodape-->
<footer class="responsive primary center-align">
    <div class="container">
        <p>Controle de Ponto</p>
        <p>Desenvolvido por Gabriel Souza Peplinski</p>
    </div>
</footer>
<script src="https://code.jquery.com/jquery-2.2.4.js"></script>
<script src="assets/libraries/jquery.mask.min.js"></script>
<script src="assets/resources/scripts/index.js"></script>

<!-- Beer CSS -->
<script type="module" src="https://cdn.jsdelivr.net/npm/beercss@3.1.0/dist/cdn/beer.min.js"></script>
<script type="module"
        src="https://cdn.jsdelivr.net/npm/material-dynamic-colors@0.1.7/dist/cdn/material-dynamic-colors.min.js"></script>
</body>
</html>