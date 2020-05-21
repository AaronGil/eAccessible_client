<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
				<style>
 
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
					<h2>ALTA DE LOCALS</h2>
					
					<% String codiTipoLocal = (String) session.getAttribute("codiTipoLocal");
					webService.Caracteristica[] caracteristiques = (webService.Caracteristica[]) session.getAttribute("caracteristiques");
					%>

					
					<form method="post" action="SvlAltaLocal">
						<h5>Informació general del local</h5>
						<input type="hidden" value=<%=codiTipoLocal %> name="codiTipoLocal">
						<ul>
							<li>
								<label for="name">Nom local:</label>
								<input type="text" id="nomLocal" name="nomLocal" />
							</li>
							
							<li>
								<label for="name">Nom carrer:</label>
								<input type="text" id="nomCarrer" name="nomCarrer" />
							</li>
							<li>
								<label for="name">Nom via:</label>
								<select id="nomVia" name="nomVia">
									<option value="selecciona">Selecciona una opció</option>
									<option value="PL">PLAÇA(PL)</option>
									<option value="AV">AVINGUDA(AV)</option>
									<option value="CA">CARRER(CA)</option>
									<option value="RA">RAMBLA(RA)</option>
									<option value="TR">TRAVESSIA(TR)</option>
									<option value="PA">PASSEIG(PS)</option>
								</select>
							</li>
							<li>
								<label>Codi Carrer:</label>
								<input type="text" id="codiCarrer" name="codiCarrer" />
							</li>
							<li>
								<label for="numero">Numero:</label>
								<input type="text" id="numero" name="numero" />
							</li>
							
							<li>
								<label for="observacions">Observacions:</label>
								<textarea id="observacions" name="observacions"></textarea>
							</li>
						</ul>
						<h5>Informació d'accessibilitat del local</h5>
							Seleccioni el grau d'accessibilitat de les següents característiques del local. (0 és la més baixa i 5 la més alta)
							
							
							<input type="hidden" name="caracteristiquesLength" value="<%=caracteristiques.length%>">
							<br>
							<%for(int i=0; i<caracteristiques.length; i++){ %>
								<input type="hidden" name="codiCaracteristica<%=i%>" value="<%=caracteristiques[i].getCodiCaracteristica()%>">
								<%=caracteristiques[i].getNomCaracteristicaCA() %>: 
								<select type="text" name="valor<%=i%>">
								<option value="0">0</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								</select>
								<br>
							<% }%>
					
						<input type="submit" value="Donar d'alta el local">
						</form>
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