import java.util.Scanner;

public class CalculoAreaCirculo {

	public static void main(String[] args) {
		//definir scanner para leer por consola
		Scanner sc=new Scanner(System.in);
		
		//definir las variables
		double radio;
		double area;
		
		//pedir el radio del circulo
		System.out.print("Radio del circulo: ");
		//leer el radio 
		radio=sc.nextDouble();

		//calcular el area del circulo
		area=Math.PI*(radio*radio);
		
		//leer por consola
		System.out.print("El area del circulo es "+String.format("%.2f",area));
	}

}
