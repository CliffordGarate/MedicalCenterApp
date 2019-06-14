
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/estiloLogin.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <%
            //recoger valor de atributo 'msg' de validarusuario
        String msg=(String)request.getAttribute("msg");
        %>
    <body>
        <div id="cuadro">
            <img src="imagen/untelslogo.png"  class="logo"></img>
            
            <form action="validarLogin" method="">
            
                <b><p id="titulo">CENTRO MÉDICO UNTELS</p></b>
                <hr >
                <br/><br/>
                <label id="subtitulo1">USUARIO</label>
                <br/><br/>
                <input name="txtusu" type="text" class="entrada" required=""/>
                <br/><br/>
                <label id="subtitlo2">CONTRASEÑA</label>
                <br/><br/>
                <input name="txtcon" type="password" class="entrada" required=""/>
                <br/><br/>
                <input type="submit" value="Iniciar sesión" id="boton"/>
                
                <td colspan="2"><%=msg!=null?msg:""%></td>
                
                
            </form>
            <br/>
               
            
        </div>         
    </body>
</html>









