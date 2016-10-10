import java.util.Scanner;

public class NumeroPositivoNegativo {

	public static void main(String[] args) {
	//definir el escaner para leer por consola
	Scanner sc=new Scanner(System.in);
	
	//definir la variable numero
	double numero;
	
	//pedir el numero
	System.out.print("Numero: ");
	numero=sc.nextDouble();
	
	//operacion para decir si es positivo o negativo
	if(numero==0){
		System.out.print("El numero es nulo");
	}
	
		else{
			if(numero>0){
			System.out.print("El numero es positivo");
			}
		
			else{
			System.out.print("El numero es negativo");
			}
		}

	
	}

}
