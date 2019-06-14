<%-- 
    Document   : login
    Created on : 05/12/2018, 03:38:24 PM
    Author     : Intel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <%
            //recoger valor de atributo 'msg' de validarusuario
        String msg=(String)request.getAttribute("msg");
        %>
    <body style="background-color: #E5E7E9">
    <center>
        <form action="UsuarioServlet" method="post" >
            <br></br>
            <br></br>
            
            <h1>LOGIN</h1>
            <br>
            <table>
            
            <tr>
                
                <td >Proveedor</td>
                <td><input name="txtusu" type="text" placeholder="Proveedor" required=""></td>
            </tr>
            <tr></tr>
            <tr>
                
                <td>Contraseña</td>
                 <td><input name="txtcon" type="text" placeholder="Contraseña" required="" ></td>
            </tr>
             <tr></tr>
            <tr>
            <td></td>
            <td><input value="Ingresar" type="submit" class="btn btn-primary btn-lg btn-block"></td>
            </tr>
            <tr>
                    <td colspan="2"><%=msg!=null?msg:""%></td>
                 </tr>
        </table>
            </form>
        </center>
    </body>
</html>
