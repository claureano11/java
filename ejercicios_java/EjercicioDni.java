import java.util.Scanner;

public class EjercicioDni {

	public static void main(String[] args) {
		//definir el escaner para leer por consola
		  Scanner sc=new Scanner(System.in);
		  
		  
		//definir una variable
		int Dni;
		String juegoLetras="TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo;
		char letra;
		
		//pedir numero dni
		System.out.print("Numero de DNI: ");
		Dni=sc.nextInt();
		
		
		//String conversion=Integer.toString(Dni);
		//int digitos=conversion.length();
		//EjercicioDni.isNumeric(Dni)==true
		//isDigit() isLetter()
		
		//calcular la letra de tu DNI 72595423-V
		int digitos=Integer.toString(Dni).length();
		if(digitos==8){
			modulo=Dni%23;
			letra=juegoLetras.charAt(modulo);
		
			//leer por consola la letra del DNI
			System.out.print("El numero de DNI "+Dni+" le corresponde la letra "+letra);
		}
			else {
				System.out.print("Solo se aceptan 8 numeros");
			}
	}

}
