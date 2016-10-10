import java.util.Scanner;

public class IntercambioNombres {

	public static void main(String[] args) {
		//definir scanner para leer por consola
		Scanner sc=new Scanner(System.in);
		
		//declaracion de variables
		String nom1;
		String nom2;
		String aux;

		//pedir nombre
		System.out.println("¿Quien eres?");
		//leer nom1
		nom1=sc.nextLine();
		//pedir el nombre del sustituido
		System.out.println("¿Con quien quieres intercambiarte?");
		//leer nom2
		nom2=sc.nextLine();
		
		//realizar intercambio del contenido de vars
		
		aux=nom1;
		nom1=nom2;
		nom2=aux;
		
		
		//mostrar mensaje final
		System.out.print("OK! Ahora tu eres "+nom1+" y el otro es "+nom2);
	}

}
