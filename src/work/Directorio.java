package work;

import java.util.ArrayList;
import java.util.Scanner;

public class Directorio extends objeto {

	public Directorio(String nombre, int tam){
		super(nombre, tam);
		this.permisos = "AUX";
		this.objetos = null;
		
	}
	
	
	public String getPermisos() {
		return permisos;
		
	}
	public void setPermisos(String permisos) {
		this.permisos = permisos;
		
	}
	public ArrayList<objeto> getObjetos() {
		return objetos;
		
	}
	public void setObjetos(ArrayList<objeto> objetos) {
		this.objetos = objetos;
		
	}

	private String permisos;
	private static ArrayList<objeto> objetos;
	
	
	
	
	public static void main(String[] args) {
		int i = 0, y = 0, tamaño = 0;
		String nombre = "", specAtt = "";
		Scanner scn = new Scanner(System.in);
		Directorio dir = new Directorio("raiz", 1000);
				
		do{
			System.out.print("1. Agregar Archivo\n"
					+ "2. Buscar Archivo\n"
					+ "Seleccione opcion: ");
			i = scn.nextInt();
			
			switch(i){
			case 1:
				System.out.print("1. Agregar archivo Sistema\n"
						          + "2. Agregar archivo de Usuario\n"
						          + "Seleccione opcion: ");
				y = scn.nextInt();
				
				if(y == 1){
					System.out.print("Escriba el nombre: ");
					nombre  = scn.next();
					System.out.print("Escriba el tamaño: ");
					tamaño  = scn.nextInt();
					System.out.print("Escriba la extension: ");
					String extension = scn.next();
					dir.addArchivo(nombre, tamaño, 0, extension);
					
					System.out.println("Archivo se agrego correctamente");
				
				}else if (y == 2){
					System.out.print("Escriba el nombre: ");
					nombre  = scn.next();
					System.out.print("Escriba el tamaño: ");
					tamaño  = scn.nextInt();
					System.out.print("Escriba el tipo: ");
					String extension = scn.next();
					dir.addArchivo(nombre, tamaño, 1, extension);
					
					System.out.println("Archivo se agrego correctamente");
					
				}
				
				break;
				
			case 2:
				System.out.println("Ingrese el nombre al archivo a buscar: ");
				nombre = scn.next();
				
				objeto obj = dir.buscar_Carpeta(nombre, objetos.get(0), 0);
				
				if(obj != null ){
					if(obj instanceof archivo_usuario)
					System.out.println("Arhivo encontrado! Es de tipo usuario: "+obj.getNombre()+" "+obj.tamaño);
					else
					System.out.println("Arhivo encontrado! Es de tipo sistema: "+obj.getNombre()+" "+obj.tamaño);

				}else{
					System.out.println("Archivo no encontrado");
				}
				
				break;
			
			default:
				System.out.println("Error, no action for this number");
				break;
			
			
			}
			
			
		}while(i != 3);
		
			
	}	
	
	
	public void addArchivo(String nombre, int tam, int i, String ext){
			if(i == 0){
				if(objetos != null){
					objetos.add(new archivo_usuario(nombre, tam, ext));
				}else{
					objetos = new ArrayList<>();
					objetos.add(new archivo_usuario(nombre, tam, ext));
				}
			}else{
				if(objetos != null){
					objetos.add(new archivo_sistema(nombre, tam, ext));
				}else{
					objetos = new ArrayList<>();
					objetos.add(new archivo_sistema(nombre, tam, ext));
				}
			}
	}
	
	public objeto buscar_Carpeta(String nombre, objeto hi, int looper) {
		if (nombre.equals(this.nombre))
			return hi;

		if (hi == null)
			return null;
		else {
			if (looper < objetos.size()) {
				for (int i = 0; i < objetos.size(); i++) {
					objeto tmp = objetos.get(i);
					if (tmp != null) {
						if (nombre.equals(tmp.getNombre())) {
							return hi;
						} else {
							buscar_Carpeta(nombre, hi, looper+1);
						}

					}

				}
			}else{
				for (int i = 0; i < objetos.size(); i++) {
					objeto tmp = objetos.get(i);
					if (tmp != null) {
						if (nombre.equals(tmp.getNombre())) {
							return hi;
						}else{
							return null;
						}

					}

				}
			}

			return null;
		}

	}
}
