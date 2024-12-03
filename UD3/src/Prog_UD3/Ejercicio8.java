/**
 * 
 */
package Prog_UD3;

/**
 * 
 */

public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int t[] = {1, 7, 66, 96, 4, 8, 35};
		System.out.println("El maximo es:" + maximo(t));

	}
public static int maximo(int t[]) {
	int max = t[0];
	for(int i = 0; i < t.length; i++) {
		if(t[i] > max) {
			max = t[1];
			
		}
	}
	return max;
}
}
