<%-- 
    Document   : entradaEL
    Created on : 17-abr-2018, 17:15:33
    Author     : Daw2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario EL</title>
        <link rel="stylesheet" type="text/css" href="../CSS/estilos.css">
    </head>
    <body>
        <div class="columnasCentradas">
            <form action="../<%=request.getParameter("url")%>" method="post">
                <table>
                    <tr>
                        <td><h2>Persona</h2></td>
                    </tr>
                    <tr>
                        <td><label for="nombre">Nombre: </label></td>
                        <td><input type="text" id="nombre" name="nombre"/></td>
                    </tr>
                    <tr>
                        <td><label for="numHijos">Numero de hijos: </label></td>
                        <td><input type="text" id="numHijos" name="numHijos"/></td>
                    </tr>
                    <tr>
                        <td><label for="sueldo">Sueldo: </label></td>
                        <td><input type="text" id="sueldo" name="sueldo"/></td>
                    </tr>
                    <tr>
                        <td><h2>¿Donde vives?</h2></td>
                    </tr>
                    <tr>
                        <td><label for="domicilio">Direccion: </label></td>
                        <td><input type="text" id="domicilio" name="domicilio"/></td>
                    </tr>
                    <tr>
                        <td><label for="localidad">Localidad: </label></td>
                        <td><input type="text" id="localidad" name="localidad"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="enviar" value="Enviar"/></td>
                        <td><input type="reset" name="reset" value="Limpiar"/></td>
                        <td><input type="hidden" name="tipo" value="EL"/></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
