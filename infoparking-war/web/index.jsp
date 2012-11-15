<%-- 
    Document   : index
    Created on : 14/11/2012, 08:16:26 PM
    Author     : dpineda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
    font-family: Arial, Helvetica, sans-serif;
    width: 850px;
    text-align: center;
    margin: 20px auto;
}

#main { background: #eee }

#header {
    height: 250px;
    background: #aaa;
}

#footer {
    height: 50px;
    width: 850px;
    clear: left;
    background: #aaa;
}

#indexLeftColumn {
    height: 600px;
    width: 250px;
    float: left;
    background: #ccc;
}

#indexRightColumn {
    height: 600px;
    width: 600px;
    float: left;
    background: #eee;
}

#logo {
    height: 155px;
    width: 155px;
    float: left;
    margin-left: 30px;
    margin-top: 20px;
}

#logoText {
    float: left;
    margin: 20px 0 0 70px;
    /* font styles apply to text within alt tags */
    font-family: 'American Typewriter', Courier, monospace;
    font-size: 60px;
    color: #333;
}

#widgetBar {
    height: 50px;
    width: 850px;
    float: right;
    background: #ccc;
}

.headerWidget {
    width: 194px;
    margin: 20px 2px;
    font-size: small;
    float: right;
    line-height: 25px;
    background: #aaa;
}

.categoryBox {
    height: 270px;
    width: 570px;
    margin: 21px 14px 6px;
    float: inherit;
    background: #ccc;
}

.categoryLabelText {
    line-height: 150%;
    font-size: x-large;
}

.imageBox {
    height: 220px;
    width: 220px;
    margin: 350px 14px 6px;
    float: inherit;
    background: #58ACFA;
}
input:focus {
   border: 2px solid #00FF00;
   background: #F3F3F3;
}

.btn {
   display: block;
   margin: 1em 0;
}
        </style>
    </head>
    <body>
      <div id="main">
          <div id="header">
            <div id="widgetBar">
              <fieldset style="border:6px groove #ccc; background:#0404B4;">
                    <label style="color: #FF8000;text-transform: uppercase"for="usuario">Usuario</label>
                    <input type="text" name="usuario" id="usuario" />
                     <label style="color: #FF8000; text-transform: uppercase "for="password">Contraseña</label>
		    <input type="password" name="password" id="password" />
                    <input style= "border:6px grovee #ccc; background:#00FF00;text-transform: uppercase"
                     type="submit" id="login" value="Iniciar sesión" />
		    <label for="checkbox">
			<input type="checkbox" id="checkbox" />
                      Recordarme</label>
              </fieldset>
             
               <br/><br/><br/><br/><br/><br/><br/><br/><br><br>
              <div class="headerWidget">
                
            </div>
            </div>
            <a href="#">
              <img src="#" id="logo" alt="InfoParking Logo">
            </a>
            <img src="#" id="logoText" alt="InfoParking">      
          </div>
          <div id="indexLeftColumn">
            listado parqueaderos
            <div class="imageBox">
              <a href="#">
                <span class="categoryLabelText">Imagen</span>
              </a>
            </div>
          </div>
          </div>
          <div id="indexRightColumn">
            <div class="categoryBox">
              <a href="#">
                <span class="categoryLabelText">Información del parqueadero</span>
              </a>
            </div>
            <br/><br/><br/><br/><br/><br/><br/><br/><br><br>
            <div class="categoryBox">
              <a href="#">
                <span class="categoryLabelText">Mapa de la ubucación</span>
              </a>
            </div>
          </div>
          <div id="footer">
            Pie de pagina de la aplicación
          </div>
      </div>
    </body></html>
