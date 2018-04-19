<%-- 
    Document   : salidaEL
    Created on : 17-abr-2018, 18:30:58
    Author     : Daw2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salida Formulario EL</title>
        <link rel="stylesheet" type="text/css" href="../CSS/estilos.css">
    </head>
    <body>
        <div class="columnasCentradas">
            <ul>
                <li>Nombre: ${persona.nombre}</li>
                <li>Numero de hijos: ${persona.numHijos}</li>
                <li>Sueldo: ${persona.sueldo}</li>
                <li>Direccion: ${persona.direccion.domicilio}</li>
                <li>Localidad: ${persona.direccion.localidad}</li>
                <li><a href="${request.getContextPath()}">Volver</a></li>
            </ul>
        </div>
    </body>
</html>
