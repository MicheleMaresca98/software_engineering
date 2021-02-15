package entity;

public class CompostoGommoso implements MateriaPrima {
private String codiceComposto;

public CompostoGommoso() {
	this.codiceComposto="";
}

public CompostoGommoso(String codiceComposto) {
	this.codiceComposto=codiceComposto;
}

public String getCodiceComposto() {
	return codiceComposto;
}

public void setCodiceComposto(String codiceComposto) {
	this.codiceComposto = codiceComposto;
}

public String toString() {
	return "CODICE COMPOSTO="+this.codiceComposto;
}

}
