package exercisesModul3;

import java.util.*;

public class notasAlumnos {

	public static void main(String[] args) {
		
		double [][] datosAlumnos=new double[5][3];
		
		double media=0;
		
		//declaración del Scanner
		Scanner input;
		
		//almacenar las notas de los alumnos
		for(int i=0; i<5; i++) {
			
			System.out.println("Introduzca las 3 notas para el alumno " + (i+1));
			input=new Scanner(System.in);			
			System.out.print("Nota 1: ");
			datosAlumnos[i][0]=input.nextDouble();
			System.out.print("Nota 2: ");
			datosAlumnos[i][1]=input.nextDouble();
			System.out.print("Nota 3: ");
			datosAlumnos[i][2]=input.nextDouble();
		}
		
		//calcular la media			
		for(int i=0; i<datosAlumnos.length; i++) {
			
			double sumaNotas=datosAlumnos[i][0]+datosAlumnos[i][1]+datosAlumnos[i][2];
			
			media=sumaNotas/3;	
			
			//comprobar si el alumno ha aprobado o suspendido y mostrar resultados
			
			if(media>=5) {
				System.out.println("El alumno " + (i+1) + " ha aprobado con un " + String.format("%.1f", media));
			
			}else {
				System.out.println("El alumno " + (i+1) + " ha suspendido con un " + String.format("%.1f", media));
			}
			
		}	
		
	}
}
