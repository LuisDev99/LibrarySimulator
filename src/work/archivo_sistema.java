package work;


public class archivo_sistema extends objeto {
	
	public archivo_sistema(String nombre, int tam, String tipo){
		super(nombre, tam);
		this.tipo = tipo;
		
	}
	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
