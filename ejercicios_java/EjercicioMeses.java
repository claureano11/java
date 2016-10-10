import java.util.Scanner;

public class EjercicioMeses {

	public static void main(String[] args) {
		// definir la clase scanner para leer por consola
		Scanner sc= new Scanner(System.in);
		
		//declaracion de variables
		String mes;
		//String cadena;
		
		//pedir el mes
		System.out.print("Introduce el dia del mes: ");
		mes=sc.nextLine();
		
		//calculando el dia del mes
		//cadena=mes.substring(0,1).toUpperCase();

		String meses = mes.substring(0,1).toUpperCase() + mes.substring(1);
		switch(meses){
			case "Enero":
				System.out.println("Mes: Enero");	
				System.out.print("Enero es el 1");
				break;
		
			case "Febrero":
				System.out.println("Mes: Febrero");
				System.out.print("Febrero es el 2");
				break;
			
			case "Marzo":
				System.out.println("Mes: Marzo");
				System.out.print("Marzo es el 3");
				break;
				
			case "Abril":
				System.out.println("Mes: Abril");
				System.out.print("Abril es el 4");
				break;
				
			case "Mayo":
				System.out.println("Mes: Mayo");
				System.out.print("Mayo es el 5");
				break;	
				
			case "Junio":
				System.out.println("Mes: Junio");
				System.out.print("Junio es el 6");
				break;
				
			case "Julio":
				System.out.println("Mes: Julio");
				System.out.print("Julio es el 7");
				break;
				
			case "Agosto":
				System.out.println("Mes: Agosto");
				System.out.print("Agosto es el 8");
				break;
				
			case "Septiembre":
				System.out.println("Mes: Septiembre");
				System.out.print("Septiembre es el 9");
				break;
				
			case "Octubre":
				System.out.println("Mes: Octubre");
				System.out.print("Octubre es el 10");
				break;
				
			case "Noviembre":
				System.out.println("Mes: Noviembre");
				System.out.print("Noviembre es el 11");
				break;
				
			case "Diciembre":
				System.out.println("Mes: Diciembre");
				System.out.print("Diciembre es el 12");
				break;
				
			default:
				System.out.print("El texto escrito no corresponde a ningun mes");
				break;
		}

	}

}
