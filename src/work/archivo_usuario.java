package work;

public class archivo_usuario extends objeto {
	public archivo_usuario(String nombre, int tam, String extension){
		super(nombre, tam);
		this.extension = extension;
	}
	
	
	private String extension;


	public String getExtension() {
		return extension;
	}


	public void setExtension(String extension) {
		this.extension = extension;
	}

	
}
