
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuarios</title>
    </head>
    <body>
        <div>
            <h1>Agregar Persona</h1>
            <form action="Controlador">
                ID:<br>
                <input type="text" name="txtID">
                
                Usuario:<br>
                <input type="text" name="txtUSER">
                
                Contraseña:<br>
                <input type="text" name="txtPASS">
                
                Nombres:<br>
                <input type="text" name="txtNOMBRE">
                
                Apellidos:<br>
                <input type="text" name="txtAPELLIDO">
                
                Correo:<br>
                <input type="text" name="txtCORREO">
                
                Numero:<br>
                <input type="text" name="txtNUMERO">
                
                Tipo:<br>
                <input type="text" name="txtTIPO">
                
                Estado:<br>
                <input type="text" name="txtSTD">
                
                <input type="submit" name=="accion" value="Registrar">
       
            </form>
        </div>
    </body>
</html>
