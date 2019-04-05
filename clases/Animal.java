package clases;
public class Animal{
	protected String especie;

	public Animal(String e){
		this.especie=e;
	}
	public Animal(){
		this("Desconocida");
	}

	public String getEspecie(){
		return this.especie;
	}
	@Override
	public String toString(){
		return "Especie: "+this.especie+"\n";
	}

	@Override
	public boolean equals(Object obj){
		boolean i=false;
		if (obj instanceof Animal) {
			Animal tmp=(Animal) obj;
			if (this.especie.equals(tmp.getEspecie())) {
				i=true;
			}
		}
	return i;
	}
}