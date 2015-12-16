package Singlenton1;

//Utilizar cuando se quiera 1 sola instancia de una clase

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// InstitutoEducativo i1 = new InstitutoEducativo();   Error
		InstitutoEducativo ie= InstitutoEducativo.getInstance();
		ie.setNombreInstituto("Universidad Tecnologia de la Mixteca");
		System.out.println("1.-"+ie.getNombreInstituto());
	
		InstitutoEducativo ie1 = InstitutoEducativo.getInstance();
		System.out.println("2.-"+ie1.getNombreInstituto());
		
		InstitutoEducativo ie3 = InstitutoEducativo.getInstance();
		System.out.println("3.-"+ie3.getNombreInstituto());
		
		ie3.setNombreInstituto("Universidad Autonoma Metropolitana");
		System.out.println("4.-"+ie3.getNombreInstituto());
		
	}

}
