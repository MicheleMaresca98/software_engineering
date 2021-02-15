package entity;

public class Autore {
private String biografia;

public Autore(){
	this.setBiografia("");
}
public Autore(String biografia) {
	this.setBiografia(biografia);
}
public String getBiografia() {
	return biografia;
}
public void setBiografia(String biografia) {
	this.biografia = biografia;
}
}
