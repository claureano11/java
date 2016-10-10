import java.util.Scanner;

public class NumerosMayorIgual {

	public static void main(String[] args) {
		//definir scanner para leer por consola
		  Scanner sc=new Scanner(System.in);

		//definicion de variables
		  int numero1;
		  int numero2;
		  
		//pedir numero1
		  System.out.print("Primer numero: ");
		  numero1=sc.nextInt();
		//pedir numero2
		  System.out.print("Segundo numero: ");
		  numero2=sc.nextInt();
		
		  
		//operacion para decir cual es el mayor o igual numero  
		  if(numero1==numero2){
			  //leer por consola  
			  System.out.print("Los numeros son iguales");
		  }
		  else{
			  if(numero1>numero2){
				  //leer por consola  
				  System.out.print("El numero "+numero1+" es mayor que "+numero2);
			  }
			  else{
				  //leer por consola  
				  System.out.print("El numero "+numero2+" es mayor que "+numero1);
			  }
		  }
		  		  
	}

}
