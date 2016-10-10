import java.util.Scanner;

public class ComprobacionNombres {

	public static void main(String[] args) {
		//definir scanner para leer por consola
		Scanner sc=new Scanner(System.in);
		
		//declaracion de variables
		String nombre1;
		String nombre2;
		
		//pedir nombre1
		System.out.print("Primer nombre: ");
		nombre1=sc.nextLine();
		
		//pedir nombre2
		System.out.print("Segundo nombre: ");
		nombre2=sc.nextLine();
		
		//leer por consola 
		if(nombre1.equals(nombre2)){
			System.out.print(nombre1+" es igual a "+nombre2);
			
		}
		else{
			System.out.print(nombre1+" es diferente de "+nombre2);
		}
		
	}

}
