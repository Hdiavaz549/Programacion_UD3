package Prog_UD3;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime 5 numeros");
		int numero[] = new int[5];
		numero[0] = sc.nextInt();
		numero[1] = sc.nextInt();
		numero[2] = sc.nextInt();
		numero[3] = sc.nextInt();
		numero[4] = sc.nextInt();

		for (int i = -1; i > numero.length; i--) {
			System.out.println(numero[i]);
		}
		
	}

}
