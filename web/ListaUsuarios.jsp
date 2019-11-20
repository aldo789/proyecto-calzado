<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Persona"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div>
        <h1>personas</h1>
        <h1>personas</h1>
        <table border="1">
            <thead>
                <tr>
                    <th class="text-center">Id</th>
                        <th class="text-center">Usuario</th>
                        <th class="text-center">Contraseña</th>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Apellido</th>
                        <th class="text-center">Correo</th>
                        <th class="text-center">Numero</th>
                        <th class="text-center">Tipo</th>
                        <th class="text-center">Estado</th>
                </tr>
            </thead>
            
            <%        
                PersonaDAO dao = new PersonaDAO();
                List<Persona>list=dao.listar();
                Iterator<Persona>iter=list.iterator();
                Persona per=null;
                
                while(iter.hasNext()){
                  per=iter.next();
            %>

            <tbody>
                <tr>
                     <td class="text-center"><%= per.getId()%></td>
                        <td class="text-center"><%= per.getUsuario()%></td>
                        <td class="text-center"><%= per.getPass()%></td>
                        <td class="text-center"><%= per.getNombre()%></td>
                        <td class="text-center"><%= per.getApellido()%></td>
                        <td class="text-center"><%= per.getCorreo()%></td>
                        <td class="text-center"><%= per.getNumero()%></td>
                        <td class="text-center"><%= per.getTipoU()%></td>
                        <td class="text-center"><%= per.getEstadoU()%></td>
                </tr>
                <%}%>
            </tbody>
        </table>

        
        
        
        
        
        
        
        
        
       </div>
    </body>
</html>
