<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="public/css/message/message.css"/>
        <link rel="stylesheet" href="public/css/partials/header.css" />
        <link rel="stylesheet" href="public/css/partials/footer.css" />
        <link rel="stylesheet" href="public/css/main/main-admin.css" />
    </head>
    <body>
        <div id="container">
             <%@include file="../partials/header.jspf" %> 
            <main>
                <h2>Página principal</h2>
                <p>Página principal Administrador</p>
                <a href="?cmd=usuario-galeria">Continuar</a>
                <!--<a href="#">Continuar</a>-->

            </main>
            
             <%@include file="../partials/footer.jspf" %> 
        </div>
    </body>
</html>
