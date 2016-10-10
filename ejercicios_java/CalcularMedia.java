import java.util.Scanner;

public class CalcularMedia {
	//entrada principal de la clase
	public static void main(String[] args) {
		//numero maximo de asignaturas
		final  int NUM_ASIG_ALUM=3;
		
		//variable de tipo objeto "sc"
		//sc apunta hacia el scanner
		//crear un scaner para leer por consola
		Scanner sc=new Scanner(System.in);
		
		//definir una var para guadarr la notra de programacion
		//definir una vare para guardar la nota de bbdd
		//definir una var para guardar la nota de leng marcas
		
		int programacion;
		int lengMarcas;
		int basesDatos;
		//variable para guardar el nombre de usuario
		String nombre="";
		//pedir el nombre de usuario
		System.out.print("Introduce tu nombre: ");
		//leer el nombre de usuario
		nombre=sc.nextLine();
		
		//pedir las notas al usuario
		System.out.println("Introduce tus notas...");
		System.out.print("Programacion: ");
		//lo que apunta sc lo guarda en la variable prog
		programacion=sc.nextInt();
		
		
		System.out.print("Bases de datos: ");
		basesDatos=sc.nextInt();
		
	
		System.out.print("Lenguajes Marcas: ");
		lengMarcas=sc.nextInt();
		
		
		//definir una var para calcular la media
		//escribe tu media en consola
		
		
		double notaMedia=(double)(programacion+lengMarcas+basesDatos)/NUM_ASIG_ALUM;
		
		//System.out.print("La nota media es "+notaMedia);
		
		System.out.print("La nota media de "+nombre+" es "+String.format("%.2f",notaMedia));
		
		
	}

}