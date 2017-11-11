package work;

public class objeto {
	
	protected String nombre;
	protected int tamaño;
	
		
	public objeto(String nombre, int tam){
		this.nombre = nombre;
		this.tamaño  = tam;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	public  String toString()
			
}
