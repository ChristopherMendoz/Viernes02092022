package estructurasdecontrol;

import java.util.Scanner;

public class EjemploSwitch {

	public static void main(String[] args) {
		/*Crear un programa que muestre las opciones
		 * de una calculadora
		 * sumar (2 numeros)
		 * restar (2 numeros)
		 * Multiplicar (2 numeros)
		 * dividir (2 numeros - Tomar en cuenta la division entre 0)
		 * Residuo (2 numeros)
		 * Potencia (de una base a un exponente)
		 * Raiz cuadrada (Tomar en cuenta el signo de la raiz)
		 * Inverso multiplicatico (Tomar en cuenta la division entre 0)
		 * Salir de la Aplicacion */
		Scanner sc = new Scanner(System.in);
		
		double a , b ;
	    int operacion,resutado;
		
		System.out.println("--Bienvenido a su Calculadora--");
		 System.out.println("\n ¿Que operación desea hacer? ");
         System.out.println("1.Suma");
         System.out.println("2.Resta");
         System.out.println("3.Multiplicacion");
         System.out.println("4.Division");
         System.out.println("5.Residuo");
          operacion = sc.nextInt();
          
		switch (operacion) {
		case 1:
			
		    System.out.println("Escriba el primer numero");
		    a=sc.nextDouble();
		    System.out.println("Escriba el segundo numero");
		    b=sc.nextDouble();
		    System.out.println("La Suma de " + a + " y " + b + " es : " + (a+b));
		    break;
		    
case 2:
			
		    System.out.println("Escriba el primer numero");
		    a=sc.nextDouble();
		    System.out.println("Escriba el segundo numero");
		    b=sc.nextDouble();
		    System.out.println("La Resta de " + a + " y " + b + " es : " + (a-b));
		    break;
		    
case 3:
	
    System.out.println("Escriba el primer numero");
    a=sc.nextDouble();
    System.out.println("Escriba el segundo numero");
    b=sc.nextDouble();
    System.out.println("La Multiplicacion de " + a + " y " + b + " es : " + (a*b));
    break;
    
case 4:
	
    System.out.println("Escriba el primer numero");
    a=sc.nextDouble();
    System.out.println("Escriba el segundo numero");
    b=sc.nextDouble();
    if(b==0) {
         System.out.println("No se puede Dividir entre 0 ya que no esta definida");
    }else {
    	  System.out.println("La Division de " + a + " y " + b + " es : " + (a/b));
    }
  
    break;
    
case 5:
	
    System.out.println("Escriba el primer numero");
    a=sc.nextDouble();
    System.out.println("Escriba el segundo numero");
    b=sc.nextDouble();
    if(b==0) {
        System.out.println("No se el Residuo entre 0 ya que no esta definida");
   }else {
    System.out.println("El Residuo entre " + a + " y " + b + " es igual a : " + (a%b));
   }
    break;
		}
		
		
		

	}
  
	
}

