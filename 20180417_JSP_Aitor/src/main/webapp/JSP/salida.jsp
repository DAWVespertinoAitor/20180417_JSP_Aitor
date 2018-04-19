<%-- 
    Document   : salida
    Created on : 17-abr-2018, 18:30:51
    Author     : Daw2
--%>

<%@page import="es.albarregas.beans.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salida Formulario JSP</title>
        <link rel="stylesheet" type="text/css" href="../CSS/estilos.css">
    </head>
    <body>
        <%
            Persona persona = (Persona) request.getAttribute("persona");
        %>
        <div class="columnasCentradas">
            <ul>
                <li>Nombre: <%= persona.getNombre()%></li>
                <li>Numero de hijos: <%= persona.getNumHijos()%></li>
                <li>Sueldo: <%= persona.getSueldo()%></li>
                <li>Direccion: <%= persona.getDireccion().getDomicilio()%></li>
                <li>Localidad: <%= persona.getDireccion().getLocalidad()%></li>
                <li><a href="<%=request.getContextPath()%>">Volver</a></li>
            </ul>
        </div>
    </body>
</html>
