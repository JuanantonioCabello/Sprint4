package clases;
public class Ave extends Animal{
	protected String nombre;
	protected int nHuevos;
	protected String sexo;

protected sjskakshdjqkajJakabsja

	public Ave(String e,String n, int nc, String s){
		this.especie=e;
		this.nombre=n;
		this.nHuevos=nc;
		this.sexo=s;
	}

	public Ave(){
		this("Desconocida","sin nombre",0,"NC");
	}

	public String getNombre(){
		return this.nombre;
	}
	public int getHuevos(){
		return this.nHuevos;
	}
	public String getSexo(){
		return this.sexo;
	}

	@Override
	public String toString(){
		return super.toString()+
		"Nombre: "+this.nombre+"\n"+
		"Numero de huevos: "+this.nHuevos+"\n"+
		"Sexo: "+this.sexo+"\n";
	}

	@Override
	public boolean equals(Object obj){
		boolean i=false;
		if (obj instanceof Ave) {
			Ave tmp=(Ave)obj;
			if (super.equals(obj)&&tmp.getNombre().equals(this.nombre)) {
				i=true;
			}
		}
	return i;
	}

}
