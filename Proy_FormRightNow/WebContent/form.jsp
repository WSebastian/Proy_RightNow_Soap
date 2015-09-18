<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario de Contacto</title>
</head>
<body>

    <center>
    <form action="SvForm" method="post">
    
      <fieldset>
        <legend>Datos del contacto</legend>
        <table>
        
            <tr>
                <td>ID campaña: </td>
                <td> <input> </td>
            </tr>
            
            <tr>
                <td>ID campaña SI: </td>
                <td> <input> </td>
            </tr>
            
            <tr>
                <td>ID producto</td>
                <td> <input> </td>
            </tr>
        
        
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
        
           <tr>
	           <td>Nombre: </td>
	           <td> <input name="txtNombre" placeholder="Ingrese nombre" required="requerid" maxlength="80" > </td>
           </tr>
           <tr>
           	   <td>Apellidos: </td>
           	   <td> <input name="txtApellidos" placeholder="Ingrese apellido" required="requerid"> </td>
           </tr>
           
           <tr>
               <td>Tipo de Documento</td>
               <td> <select name="cboTipoDocumento" id="cboTipoDocumento"></select> </td>
           </tr>
           
           <tr>
               <td>N° de Documento</td>
               <td> <input name="txtNumeroDocumento" placeholder="Ingrese n° documento"> </td>
           </tr>
           
           <tr>
           	   <td>Email: </td>
           	   <td> <input name="txtEmail" placeholder="Ingrese email" required="requerid"> </td>
           </tr>
           
          <tr>
           	   <td>Telefono fijo: </td>
           	   <td> <input name="txtFonoFijo" placeholder="Ingrese n° fijo"> </td>
           </tr>
           
           <tr>
           	   <td>Telefono Movil: </td>
           	   <td> <input name="txtFonoMovil" placeholder="Ingrese n° movil" required="requerid"> </td>
           </tr>
              
           <tr>
               <td>Placa: </td>
           	   <td> <input name="txtPlaca" placeholder="Ingrese n° placa"> </td>
           </tr>
           
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             <tr></tr>
             
           <tr>
               <td>Estado Oportunidad: </td>
           	   <td> <input name="txtPlaca" placeholder="Ingrese n° placa"> </td>
           </tr>
           
           
           <tr>
               <td>Asesor asignado: </td>
           	   <td> <input name="txtPlaca" placeholder="Ingrese n° placa"> </td>
           </tr>
           
           <tr>
               <td>Nombre del LEAD: </td>
           	   <td> <input name="txtPlaca" placeholder="Ingrese n° placa"> </td>
           </tr>
        
        </table>
      
      </fieldset>
    
     <input type="submit" value="enviar" id="btnEnviar">
    
    </form>
    
    <center> <label> ${requestScope.mensaje}</label> </center>
    </center>
</body>
<script type="text/javascript" src="myjs/form.js"></script>
</html>