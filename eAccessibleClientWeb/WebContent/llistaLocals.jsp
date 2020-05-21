<!DOCTYPE html>

<%@page import="webService.EAccessibleWebService"%>

<%@page import="webService.EAccessibleWebServiceServiceLocator"%>


<html>

    <head>

        <meta name="viewport" content="width=device-width, initial-scale=1">

            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
            <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

            <style>
            
            table {
			  font-family: arial, sans-serif;
			  border-collapse: collapse;
			  width: 100%;
			}
			
			 
			
			td, th {
			  border: 1px solid #dddddd;
			  text-align: left;
			  padding: 8px;
			}
			
			 
			
			tr:nth-child(even) {
			  background-color: #dddddd;
			}

 

body {




  font-family: "Lato", sans-serif;

}


/* Fixed sidenav, full height */

 

.sidenav {

 

  height: 100%;

 

  width: 200px;

 

  position: fixed;

 

  z-index: 1;

 

  top: 0;

 

  left: 0;

 

  background-color: #111;

 

  overflow-x: hidden;

 

  padding-top: 20px;

 

}

/* Style the sidenav links and the dropdown button */

 

.sidenav a, .dropdown-btn {

 

  padding: 6px 8px 6px 16px;

 

  text-decoration: none;

 

  font-size: 20px;

 

  color: #818181;

 

  display: block;

 

  border: none;

 

  background: none;

 

  width: 100%;

 

  text-align: left;

 

  cursor: pointer;

 

  outline: none;

 

}

/* On mouse-over */

 

.sidenav a:hover, .dropdown-btn:hover {

 

  color: #f1f1f1;

 

}

/* Main content */

 

.main {

 

  margin-left: 200px; /* Same as the width of the sidenav */

 

  font-size: 20px; /* Increased text to enable scrolling */

 

  padding: 0px 10px;

 

}

/* Add an active class to the active dropdown button */

 

.active {

 

  background-color: green;

 

  color: white;

 

}


/* Dropdown container (hidden by default). Optional: add a lighter background color and some left padding to change the design of the dropdown content */

 

.dropdown-container {

 

  display: none;

 

  background-color: #262626;

 

  padding-left: 8px;

 

}

/* Optional: Style the caret down icon */

 

.fa-caret-down {

 

  float: right;

 

  padding-right: 8px;

 

}

/* Some media queries for responsiveness */

 

@media screen and (max-height: 450px) {

 

  .sidenav {padding-top: 15px;}

 

  .sidenav a {font-size: 18px;}

 

}

</style>

            </head>

            <body>
            

                <div class="sidenav">

                    <a href="Inici.jsp">eAccessible</a>

                    <a >_______________</a>

                    <a href="AltaLocal.jsp">Alta de Locals</a>

                    <button class="dropdown-btn">Busqueda Locals 

                        <i class="fa fa-caret-down"></i>

                    </button>

                    <div class="dropdown-container">

                        <a href="CercaLocal.jsp">Per Tipus Local</a>

                        <a href="CercaLocalLlarga.jsp">Per Tipus, Nom i Número de Local</a>

                    </div>

                </div>

                <div class="main">

                    <h2>LLISTA DE LOCALS</h2>

                    <br>
 
					<% webService.Local[] locals = (webService.Local[]) session.getAttribute("locals"); 
					if (locals == null){ %>
					<h5>No s'ha trobat cap local!</h5>	
					<% }else{ %>
					
					<table>
							
					  <tr>
					    <th>NOM</th>
					    <th>NOM VIA</th>
					    <th>NOM CARRER</th>
					    <th>NUMERO</th>
					    <th> </th>
					    <th> </th>
					  </tr>
					  <%for (int i=0; i<locals.length; i++){%>
					  <tr>
					    <td><%=locals[i].getNomLocal()%></td>
					    <td><%=locals[i].getNomVia()%></td>
					    <td><%=locals[i].getNomCarrer()%></td>
					    <td><%=locals[i].getNumero()%></td>
					    <!-- També es pot fer amb un form i amb hiddens -->
					    <td><a href="/eAccessibleClientWeb/InformacioLocal?id=<%=locals[i].getCodiLocal()%>"><i class="fa fa-search"></i></a></td>
					    <td><a href="/eAccessibleClientWeb/BorrarLocal?id=<%=locals[i].getCodiLocal()%>"><i class="fa fa-trash"></i></a></td>
					  </tr>
					  <%}}%> 
					
					</table>
                </div>

<script>

 

/* Loop through all dropdown buttons to toggle between hiding and showing its dropdown content - This allows the user to have multiple dropdowns without any conflict */

 

var dropdown = document.getElementsByClassName("dropdown-btn");

 

var i;

 

 

 

for (i = 0; i < dropdown.length; i++) {

 

  dropdown[i].addEventListener("click", function() {

 

  this.classList.toggle("active");

 

  var dropdownContent = this.nextElementSibling;

 

  if (dropdownContent.style.display === "block") {

 

  dropdownContent.style.display = "none";

 

  } else {

 

  dropdownContent.style.display = "block";

 

  }

 

  });

 

}


                    </script>

                </body>

            </html>