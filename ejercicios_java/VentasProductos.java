import java.util.Scanner;

public class VentasProductos {

	public static void main(String[] args) {
				//definicion de constantes
				//producto de la semana para aplicar dto
				final String PROD_SEMANA="Peras";
				//dto a aplicar por prod semana
				final double DTO_PROD_SEM=5;
				//volumen minimo para aplicar dto
				final double VOL_MIN_DTO=100;
				//dto a aplicar por volumen de compra
				final double DTO_VOLUMEN=10;
				
				
				//definicion de variables
				
				String producto;
				double precio;
				double cantidad;
				double total;
				double descuento=0;
		
				
				//definir el escaner para leer por consola
				Scanner sc=new Scanner(System.in);
				System.out.println("Tienda de Ventas");
				
				//Pedir los productos
				System.out.print("Producto: ");
				//leer el producto
				producto=sc.nextLine();
				
				System.out.print("Precio: ");
				precio=sc.nextDouble();
				
				System.out.print("Cantidad: ");
				cantidad=sc.nextDouble();
				
				//calcular total
				total=precio*cantidad;
				
					//si el total es mayor que volumen aplicar dto
					if(total>VOL_MIN_DTO){
						descuento=descuento+DTO_VOLUMEN;
					
					}
					//si el producto es de la semana aplicar dto
					if(producto.equals(PROD_SEMANA)){
						descuento=descuento+DTO_PROD_SEM;
						
					}
					
					//calcular total con descuento
					total=total*(1-descuento/100);
					
					/*
					 varDto=total*descuento/100;
					 total=total-varDto;
					 */
					
					//leer por consola
					System.out.println("Se le ha realizado un descuento");
					System.out.print("Has comprado "+cantidad+"kg"+" de "+producto+", "+String.format("%.2f",total)+" € a pagar!");				
					
	}
}
