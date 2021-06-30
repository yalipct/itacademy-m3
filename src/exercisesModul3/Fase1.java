package exercisesModul3;

import java.util.*;

public class Fase1 {

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
		
		System.out.println(city1 + ", " + city2 + ", " + city3 + ", " + city4 + ", " + city5 + ", " + city6);
		
	}
}