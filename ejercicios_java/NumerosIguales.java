import java.util.Scanner;

public class NumerosIguales {

	public static void main(String[] args) {
		//definir scanner para leer por consola
		Scanner sc=new Scanner(System.in);
		
		//definicion de variables
		double num1;
		double num2;
		
		//pedir num1
		System.out.print("Primer numero: ");
		//leer num2
		num1=sc.nextDouble();
		
		//pedir num2
		System.out.print("Segundo numero: ");
		//leer num2
		num2=sc.nextDouble();
		
		//pregunto sin son iguales
		
		if(num1==num2){
			System.out.print("Los numeros son iguales");
		}
		
			else{
				System.out.print("Los numeros son diferentes");
			}
		
	}

}
