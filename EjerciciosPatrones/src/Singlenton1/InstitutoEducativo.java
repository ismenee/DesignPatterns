package Singlenton1;

public class InstitutoEducativo {
	
	private static InstitutoEducativo instance; // Instancia unica, estatica y privada
	private String nombreInstituto;
	
	private InstitutoEducativo(){               //Constructor privado
		
	}
	
	public static InstitutoEducativo getInstance(){   // Metodo para regresar la instancia unica
		
		if (instance==null){
			instance= new InstitutoEducativo();
		}
		return instance;
	}
	
	public String getNombreInstituto(){
		return nombreInstituto;
	}
	
	public void setNombreInstituto(String nombre){
		this.nombreInstituto=nombre;
	}

}
