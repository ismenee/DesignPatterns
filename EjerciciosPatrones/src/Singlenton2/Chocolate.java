package Singlenton2;

// Vamos a hacer un controlador de una parte del proceso de una fabrica de chocolate. 
// Vamos a controlar un hervidor cuya tarea es llenarse con una mezcla de leche y chocolate y llevarlos a punto de evullicion 
// para recien ahi poder seguir con otra parte del proceso.
// El codigo previene de que se pueda vaciar cuando la mezcla todavía no esta hervida o que se pueda llenar cuando esta lleno.
// SE DEBE SIMULAR QUE EXISTE UN SOLO CONTROLADOR

public class Chocolate {
	private boolean empty;
	private boolean boiled;
	
	private static Chocolate uniqueInstance;       //Instancia unica, estatica y privada
	
	private Chocolate(){                            //Constructor privado que evita que se creen mas de un controlador
		empty=true;
		boiled=false;
	}
	
	public static Chocolate getInstance(){          //Metodo para regresar la instancia unica
		
		if (uniqueInstance==null){
			uniqueInstance= new Chocolate();
		}
		return uniqueInstance;
	}
	
	public void fill(){                            //Llenar la caldera con una mezcla de leche y chocolate
		if(isEmpty()){
			empty=false;
			boiled=false;
			System.out.println("LISTO! La caldera se esta llenando . . . ");
		}
		else
		{System.out.println("ERRO!, La caldera ya esta llena");}
	}
	
	public void drain(){                         //Drenar la caldera = vaciar el chocolate 
		if (!isEmpty() && isBoiled()){
			empty=true;
			System.out.println("LISTO!, La caldera se esta drenando . . . ");
		}
		else
		{System.out.println("ERROR!, La caldera ya esta vacia");}
	}
	
	public void boil(){                             //Hervir el contenido
		if(!isEmpty() && !isBoiled()){
			boiled=true;
			System.out.println("LISTO!, La caldera esta hirviendo . . . ");
		}
		else
		{System.out.println("ERROR!, La caldera ya esta hervida");}
	}
	
	public boolean isEmpty(){
		return empty;
	}
	
	public boolean isBoiled(){
		return boiled;
	}
	
}
