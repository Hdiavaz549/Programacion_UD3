package Prog_UD3;

public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };
		int[] c = { 1, 2, 3, 4 };
		compararArrays((a), (b));
	}

	public static boolean compararArrays(int[] array1, int[] array2) {
		boolean resultado = true;
		int i = 0;
		while (i < array1.length && resultado) {
			if (array1[i] != array2[i]) {
				resultado = false;
				
				}

			}
			i++;
		return resultado;

	}
}