package exercisesModul3;

import java.util.Scanner;

public class Fase4 {

	public static void main(String[] args) {
		
		String city1="", city2="", city3="", city4="", city5="", city6="";	
		
		//almacenan la longitud de los char array 
		int longitud_city1, longitud_city2, longitud_city3, longitud_city4, longitud_city5, longitud_city6;

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
		
		System.out.println("Ciudades con los nombres invertidos:");

		//array caracteres city1	
		longitud_city1=city1.length(); 		
		char letras_city1[]= new char[longitud_city1];		
		
		//rellenar el array de caracteres
		for(char i=0; i<longitud_city1;i++) {
			
			letras_city1[i]=city1.charAt(i);			
		}
		//muestra el nombre de la ciudad al derecho
		System.out.print(city1 + " - ");
		
		//rotar y mostrar el array de caracteres invertido
		for(int r=longitud_city1-1; r>=0; r--) {			
			
			System.out.print(letras_city1[r]);
		}
		System.out.println();
		
		//array caracteres city2
		longitud_city2=city2.length();
		char letras_city2[]= new char[longitud_city2];
		
		//rellenar el array de caracteres
		for(char i=0; i<longitud_city2;i++) {
					
			letras_city2[i]=city2.charAt(i);
		}
		//muestra el nombre de la ciudad al derecho
		System.out.print(city2 + " - ");
		
		//rotar y mostrar el array de caracteres invertido
		for(int r=longitud_city2-1; r>=0; r--) {			
			
			System.out.print(letras_city2[r]);
		}
		System.out.println();
		
		//array caracteres city3
		longitud_city3=city3.length();
		char letras_city3[]= new char[longitud_city3];
		
		for(char i=0; i<longitud_city3;i++) {
			
			letras_city3[i]=city3.charAt(i);
		}
		//muestra el nombre de la ciudad al derecho
		System.out.print(city3 + " - ");
		
		//rotar y mostrar el array de caracteres invertido
		for(int r=longitud_city3-1; r>=0; r--) {			
			
			System.out.print(letras_city3[r]);
		}
		System.out.println();
		
		//array caracteres city4
		longitud_city4=city4.length();
		char letras_city4[]= new char[longitud_city4];
		
		for(char i=0; i<longitud_city4;i++) {
			
			letras_city4[i]=city4.charAt(i);
		}
		
		//muestra el nombre de la ciudad al derecho
		System.out.print(city4 + " - ");
		
		//rotar y mostrar el array de caracteres invertido
		for(int r=longitud_city4-1; r>=0; r--) {			
			
			System.out.print(letras_city4[r]);
		}
		System.out.println();
		
		//array caracteres city5
		longitud_city5=city5.length();
		char letras_city5[]= new char[longitud_city5];
		
		for(char i=0; i<longitud_city5;i++) {
			
			letras_city5[i]=city5.charAt(i);
		}
		
		//muestra el nombre de la ciudad al derecho
		System.out.print(city5 + " - ");
		
		//rotar y mostrar el array de caracteres invertido
		for(int r=longitud_city5-1; r>=0; r--) {			
			
			System.out.print(letras_city5[r]);
		}
		System.out.println();
		
		//array caracteres city6
		longitud_city6=city6.length();
		char letras_city6[]= new char[longitud_city6];
		
		for(char i=0; i<longitud_city6;i++) {
			
			letras_city6[i]=city6.charAt(i);
		}
		
		//muestra el nombre de la ciudad al derecho
		System.out.print(city6 + " - ");
		
		//rotar y mostrar el array de caracteres invertido
		for(int r=longitud_city6-1; r>=0; r--) {			
			
			System.out.print(letras_city6[r]);
		}
		
	}	
	
}
