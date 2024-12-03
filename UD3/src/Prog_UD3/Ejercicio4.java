package Prog_UD3;

public class Ejercicio4 {
	public static void main(String[] args) {
		int suma = 0;
		int num;
		int numero[] = new int[10];
		for (int i = 0; i < numero.length; i++) {
			numero[i] = num = (int) (Math.random() * 100);
			suma = suma + numero[i];
		}
		System.out.println(suma);
	}
}
