/**
 * 
 */
package Prog_UD3;

import java.util.Arrays;

/**
 * 
 */
public class EjercicioPractico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] numero = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(numero));

		// Segundo metodo
		numero = Arrays.copyOf(numero, 10);
		System.out.println(Arrays.toString(numero));
		System.out.println(compararArrays(numero, numero));
		
		// Tercer Metodo
		numero = Arrays.copyOfRange(numero, 0, 10);
		System.out.println(Arrays.toString(numero));
		System.out.println(compararArrays(numero, numero));
		
		// Cuarto Metodo
		System.arraycopy(numero, 0, numero, 0, numero.length);
		System.out.println(Arrays.toString(numero));
		System.out.println(compararArrays(numero, numero));
		
		// Primer Metodo
		int[] numero1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		  for (int i=9; i>=0;i--) {
	            System.out.println(numero1[i]);            
	        }
		  System.out.println(compararArrays(numero1, numero1));
	}

public static boolean compararArrays(int[] array1, int[] array2) {
	    
		boolean resultado = true;
		
		if (array1.length != array2.length) {
			resultado = false; // Diferente tamaño
	    }

		int i = 0;
	    while (i < array1.length && resultado) {
	        if (array1[i] != array2[i]) {
	        	resultado = false; // Elementos diferentes
	        }
	        i++;
	    }
	    
	    return resultado; // Son iguales
	}
}