import java.util.Scanner;

public class EleccionDelegado {

	public static void main(String[] args) {
		
		//definicion de scanner
		Scanner sc=new Scanner(System.in);
		
		//definicion de una constante para el numero de alumnos
		//final int NUM_ALUMNOS=23;
		
		//declaracion de variables
		int delegado;
		int subdelegado;
		int numAlumnos;
		//leer por consola
		
		System.out.print("¿Cuantos alumnos hay en clase? ");
		numAlumnos=sc.nextInt();

		
		//calcular el delegado y subdelegado
		delegado=(int)(Math.round(Math.random()*(numAlumnos-1))+1); 
		subdelegado=(int)(Math.round(Math.random()*(numAlumnos-1))+1); 
		
		
		 while (delegado==subdelegado) {
			 subdelegado=(int)(Math.round(Math.random()*(numAlumnos-1))+1);     
	        }
		
		//mostrar los afortunados
		System.out.println("El delegado es el "+delegado);
		System.out.print("El subdelegado es el "+subdelegado);
				
	}

}
