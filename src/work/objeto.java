package work;

public class objeto {
	
	protected String nombre;
	protected int tama�o;
	
		
	public objeto(String nombre, int tam){
		this.nombre = nombre;
		this.tama�o  = tam;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	
	public  String toString()
			
}
