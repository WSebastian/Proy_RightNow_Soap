window.onload=function()
{
	populateCombo();

}


function populateCombo()
{
	document.getElementById("cboTipoDocumento").options[0]=new Option("Seleccione", "0");

		document.getElementById("cboTipoDocumento").options[1] = new Option("DNI", "1");
		document.getElementById("cboTipoDocumento").options[2] = new Option("RUC", "2");
		document.getElementById("cboTipoDocumento").options[3] = new Option("CRNET EXTRANJERIA", "3");
		document.getElementById("cboTipoDocumento").options[4] = new Option("PASAPORTE", "4");	
}

document.getElementById("cboTipoDocumento").onchange = function()
{
}