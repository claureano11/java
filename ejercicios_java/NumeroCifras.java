import java.util.Scanner;

public class NumeroCifras {

	public static void main(String[] args) {
		//definir el escaner para leer por consola
		  Scanner sc=new Scanner(System.in);

		//definir una variable
		  int n1;
		  int cifras;
		//pedir un numero
		  System.out.print("Introduce un n�mero entero: ");
          n1 = sc.nextInt();

		  if(n1>=0 && n1<=9999){
			//esta variable es el contador de cifras
            cifras= 0;    
            //mientras a n1 le queden cifras
            while(n1!=0){ 
            	 //le quitamos el �ltimo d�gito
                    n1 = n1/10;
                    //sumamos 1 al contador de cifras
                   cifras++;         
            }
            System.out.println("El n�mero tiene " + cifras+ " cifras");
               		 			 
		 }
		  
		  else{ 
			  System.out.print("No ha introducido un numero entre los rangos definidos");
	
		  }
	}

}
