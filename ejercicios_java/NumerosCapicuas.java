import java.util.Scanner;

public class NumerosCapicuas {

	public static void main(String[] args) {
		//definir el scanner para leer por consola
		Scanner sc=new Scanner(System.in);
		
		//declaracion de variables
		int n;
		int capicua;
		int sumDi=0;
		
		//pedir un numero de 4 cifras
		System.out.print("Introduce un numero de 4 cifras: ");
		n=sc.nextInt();
		
		//calculando los numeros capicuas
		String numConversion=Integer.toString(n);
	
		if(numConversion.length()==4){
			
			while(n!=0){
				sumDi=sumDi+(n%10);
				n=n/10;
			}
			
				if(sumDi%2==0)
					System.out.print("El numero es capicua");
				
				
				else{
					System.out.print("El numero no es capicua");
				}				
		}
		
		else{
			System.out.print("Debes introducir un numero de 4 cifras");
		}
		
		/*
		1001	2002	3003	4004	5005	6006	7007	8008	9009
		1111	2112	3113	4114
		1221	2222
		1331	2332
		1441	2442
		1551	2552
		1661	2662
		1771	2772
		1881	2882
		1991	2992	3993	4994	5995	6996	7997	8998	9999
		*/
		
	}

}
