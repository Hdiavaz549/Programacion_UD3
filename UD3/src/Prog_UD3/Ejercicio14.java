/**
 * 
 */
package Prog_UD3;

import java.util.Arrays;

/**
 * 
 */
/**
 * 
 */
class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] original = { 18, 21, 19, 18, 20 };
		int[] destino = new int[original.length];
		for (int i = 0; i < destino.length; i++) {
			destino[i] = original[i];

		}
		System.out.println(Arrays.toString(destino));
		Ejercicio13.compararArrays(original, destino);

	}

}
