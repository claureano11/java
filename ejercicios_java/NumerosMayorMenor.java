import java.util.Scanner;

public class NumerosMayorMenor {

	public static void main(String[] args) {
		//definir el escaner para leer por consola
		Scanner sc=new Scanner(System.in);
		
		//definicion de variables
		int n1;
		int n2;
		//int n3;
		
		//pedir dos numeros
		System.out.print("Primer numero: ");
		n1=sc.nextInt();
		
		System.out.print("Segundo numero: ");
		n2=sc.nextInt();
		
		//condicion para saber el menor numero
		while(n1==n2){
			System.out.print("Introducir un numero distinto: ");
			n2=sc.nextInt();
			System.out.flush();
			
		}
			
			if(n1<n2){
					System.out.print(n2+"-"+n1);		
			}
		
		    	else{
		    		System.out.print(n1+"-"+n2);
		    	}

	}

}
