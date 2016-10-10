
public class HelloWorld {

	public static void main(String[] args) {
		
		
		//calcularEdad();	
		calcularMedia();
			
		}
		
	
		static void contador(){
			
			
		}
		
		
		static void calcularMedia(){
			//definir una var para guadarr la notra de programacion
			//definir una vare para gfuardar la nota de bbdd
			//definir una var para guardar la nota de leng marcas
			//inicializar las vars con las noras q vas a sacar
			//definir una var para calcular la media
			//escribe tu media en consola
			
			int programacion=9;
			int lengMarcas=8;
			int basesDatos=8;
			
			double notaMedia=(double)(programacion+lengMarcas+basesDatos)/3;
			System.out.printf("La media es "+notaMedia);
			
			
			
		}
		static void calcularEdad(){
			//definir una variable año e inicializar a
			//2016		
			//definir ujna var anoNac e inicializarla a 
			//<el que quieras>
			//definir una var nombre e inicializarla con tu nombre
			
			int año=2016;
			int añoNac=1991;
			String nombre="Cesar";
			System.out.printf(nombre+" tienes "+(año-añoNac)+" años");
			
			/*int edad=0;
			String nombre="Juan";
			char sexo='v';
			boolean mayorDeEdad=true;
			System.out.printf("5*5="+5*5);
			*/
		}
	}



