package exercisesModul3;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {		
		
		//serie-valorInicial-segundoValor-suma(valorInicial+segundoValor)
		int N, num1=0, num2=1, suma=1;
		
		//sucesión fibonacci n = n-1 + n-2.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número para mostrar la sequencia Fibonacci:");
		
		N=sc.nextInt();
		
		sc.close();
		
		//muestro el valor inicial
		System.out.print(num1+ " ");	
		
		//mostrar secuencia Fibonacci
		for(int i=1; i<N; i++) {
			
			//muestro la suma
			System.out.print(suma + " ");			
			suma=num1+num2;
			
			//cambio la segunda variable por la primera
			num1=num2;
			//cambio la suma por la segunda variable
			num2=suma;
		}
	}

}
