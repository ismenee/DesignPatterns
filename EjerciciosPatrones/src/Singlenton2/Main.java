package Singlenton2;

public class Main {
	
	public static void main(String []args){
		
		Chocolate controlSotano= Chocolate.getInstance();
		Chocolate controlPlanta= Chocolate.getInstance();
		
		
		System.out.println("Control Sotano");
		controlSotano.fill();
		controlSotano.boil();
		
		System.out.println("Control Planta");
		controlPlanta.boil();
		
		controlPlanta.drain();
		
	}

}
