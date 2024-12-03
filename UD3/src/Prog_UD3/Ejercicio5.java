package Prog_UD3;

public class Ejercicio5 {
	public static void main(String[] args) {
		int numero[] = new int[5];
		numero[0] = 10;
		numero[1] = 20;
		numero[2] = 30;
		numero[3] = 40;
		numero[4] = 50;
		System.out.println(suma(numero));

	}

	static int suma(int[] numero) {

		int suma = 0;
		for (int i = 0; i < numero.length; i++) {
			suma = suma + numero[i];
		}

		return suma;

	}
}