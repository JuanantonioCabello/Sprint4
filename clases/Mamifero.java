package clases;
public class Mamifero extends Animal{
	protected String nombre;
	protected int nCrias;
	protected String sexo;

	public Mamifero(String e,String n, int nc, String s){
		this.especie=e;
		this.nombre=n;
		this.nCrias=nc;
		this.sexo=s;
	}

	public Mamifero(){
		this("Desconocida","sin nombre",0,"NC");
	}

	public String getNombre(){
		return this.nombre;
	}
	public int getCrias(){
		return this.nCrias;
	}
	public String getSexo(){
		return this.sexo;
	}

	@Override
	public String toString(){
		return super.toString()+"Especie: "+this.especie+"\n"+
		"Nombre: "+this.nombre+"\n"+
		"Numero de crias: "+this.nCrias+"\n"+
		"Sexo: "+this.sexo+"\n";
	}

	

}