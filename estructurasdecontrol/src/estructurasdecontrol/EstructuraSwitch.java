package estructurasdecontrol;

import java.util.Scanner;

public class EstructuraSwitch {

	public static void main(String[] args) {
		// Estructura condicionales
		// Estructura condicionales simple (if)
		// Estructura condicionales doble (if else)
		// Estructura condicionales anidada (multiple - if else if)
		// Para hoy - Estructura condicionales multiple (Switch)
		Scanner lector = new Scanner(System.in);
		int op = 5;
		System.out.print("Ingrese el Color Del Semaforo: ");
		char car = lector.next().charAt(0);
		
		switch (car) {
           // El valor puede ser una variable byte , short, int , char , String		
		case  'A' & 'a':
			   System.out.println("El valor es amarillo");
			break;
			
		case 'V' & 'v': 
			System.out.println("El valor es verde");
			break;
			
		case 'R'  & 'r':
			   System.out.println("El valor es rojo");
			break;
		default:
			System.out.println("Caracter Incorrecto");
		
		}
           System.out.println("»--Fin Del Programa--«");
	}

}
