package entity;

public class FilatoLegheMetalliche implements MateriaPrima{
private String codiceFilato;
private float diametro;

public FilatoLegheMetalliche() {
	this.codiceFilato="";
	this.diametro=0;
}

public FilatoLegheMetalliche(String codiceFilato,float diametro) {
	this.codiceFilato=codiceFilato;
	this.diametro=diametro;
}

public String getCodiceFilato() {
	return codiceFilato;
}
public void setCodiceFilato(String codiceFilato) {
	this.codiceFilato = codiceFilato;
}
public float getDiametro() {
	return diametro;
}
public void setDiametro(float diametro) {
	this.diametro = diametro;
}

public String toString() {
	return "CODICE FILATO="+this.codiceFilato+ " DIAMETRO="+this.diametro;
}

}
