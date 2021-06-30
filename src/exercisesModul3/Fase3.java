package exercisesModul3;

import java.util.*;

public class Fase3 {

	public static void main(String[] args) {
		
		String city1="", city2="", city3="", city4="", city5="", city6="";		

		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el nombre de seis ciudades");
		
		System.out.println("Intruduce la ciudad 1:");
		city1=entrada.nextLine();
		
		System.out.println("Intruduce la ciudad 2:");
		city2=entrada.nextLine();
		
		System.out.println("Intruduce la ciudad 3:");
		city3=entrada.nextLine();
		
		System.out.println("Intruduce la ciudad 4:");
		city4=entrada.nextLine();
		
		System.out.println("Intruduce la ciudad 5:");
		city5=entrada.nextLine();
		
		System.out.println("Intruduce la ciudad 6:");
		city6=entrada.nextLine();
		
		entrada.close();		
			
		//guardar las ciudades en un array
		String arrayCiutats []={city1, city2, city3, city4, city5, city6};
		
		//array para almacenar los nombres de las ciudades modificados
		String[] arrayCiutatsModificades=new String[arrayCiutats.length];
		
		//Cambiar las vocales "a" por 4 de los nombres de las ciudades				
		//recorrer arrayCiutats y buscar las a en cada posicion
		
		for(int i=0; i<arrayCiutats.length;i++) {			
			
			if(arrayCiutats[i].contains("a")) {
				
				String reemplazo=arrayCiutats[i].replace("a", "4");
				
				arrayCiutatsModificades[i]=reemplazo;
			}else {
				arrayCiutatsModificades[i]=arrayCiutats[i];				
			}			
		}
		
		System.out.println();
		
		System.out.println("Ciudades modificadas por orden alfabético:");
		
		//ordenar arrayCiutatsModificades
		Arrays.sort(arrayCiutatsModificades);	
		
		//mostrar arrayCiutatsModificades
		for(String c : arrayCiutatsModificades) {
			
			System.out.println(c);
		}
		
	}

}
