import java.util.Scanner;

public class Matriculas {

	public static void main(String[] args) {
		
		//definir el escaner para leer por consola
		Scanner sc=new Scanner(System.in);
		
		//definir constante para la edad
		final int MAYOR_EDAD=18;
		
		//definicion de variables
		String nombre;
		int edad;
		//años q tiene q esperar para matricularse
		int anosEsperar;
		
		//pedir nombre
		System.out.println("Introduce datos para la matricula");
		System.out.print("Nombre: ");
		//leer el nombre
		nombre=sc.nextLine();
		//pedir edad
		System.out.print("Edad: ");
		//leer la edad
		edad=sc.nextInt();
		
		//calcular los años de espera
		anosEsperar=MAYOR_EDAD-edad;
		
		if(edad<MAYOR_EDAD){
				
			System.out.println(nombre+" tienes que ser mayor de edad!!");
			System.out.print("Vuelve dentro de "+anosEsperar+" años.");
		}
		
		else{
			System.out.print(nombre+", tu matricula ha sido realizada.");
		}
				
		
	}

}
