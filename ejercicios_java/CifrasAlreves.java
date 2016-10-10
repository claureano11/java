import java.util.Scanner;

public class CifrasAlreves {

	public static void main(String[] args) {
		//definir el escaner para leer por consola
		  Scanner sc=new Scanner(System.in);

		//definir una variable
		  int n;
		  char cadInvertida;
		  
		//pedir un numero
		  System.out.print("Introduce un número entero: ");
          n = sc.nextInt();

        //realizar la operacion del numero invertido
		  if(n>=0 && n<=9999){
			  	System.out.print("El numero invertido es: ");
			  	String cadena=Integer.toString(n);
			  	for(int x=cadena.length()-1;x>=0;x--){
			  		cadInvertida=cadena.charAt(x);
			  		System.out.print(cadInvertida+" ");
			  	}
		  }
		  else{
			  System.out.print("No ha introducido un numero entre los rangos definidos");
		  }
	}

}
