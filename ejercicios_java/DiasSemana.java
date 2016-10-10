import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {
		// Definicion de la clase scanner para leer por consola
		Scanner sc=new Scanner(System.in);
		
		//declarar variables
		int dias;
		
		//pedir el dia de la semana
		System.out.print("Introduce un numero del dia de la semana: ");
		dias=sc.nextInt();
		
		//calculando el dia de la semana
		switch(dias){
			case 1:
				System.out.println("Dia de la semana:1");
				System.out.print("Lunes");
				break;
			
			case 2:
				System.out.println("Dia de la semana:2");
				System.out.print("Martes");
				break;
				
			case 3:
				System.out.println("Dia de la semana:3");
				System.out.print("Miercoles");
				break;
				
			case 4:
				System.out.println("Dia de la semana:4");
				System.out.print("Jueves");
				break;
				
			case 5:
				System.out.println("Dia de la semana:5");
				System.out.print("Viernes");
				break;
				
			case 6:
				System.out.println("Dia de la semana:6");
				System.out.print("Sabado");
				break;
				
			case 7:
				System.out.println("Dia de la semana:7");
				System.out.print("Domingo");
				break;
				
			default:
				System.out.print("No pertenece a ningun dia de la semana");
				break;
		}

	}

}
