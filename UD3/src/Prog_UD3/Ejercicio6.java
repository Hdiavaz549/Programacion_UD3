package Prog_UD3;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] decimal;
		decimal = new double[5];
		decimal[0] = sc.nextDouble();
		decimal[1] = sc.nextDouble();
		decimal[2] = sc.nextDouble();
		decimal[3] = sc.nextDouble();
		decimal[4] = sc.nextDouble();
		for (int i = 0; i < decimal.length; i++) {
			System.out.println("Los numeros son: " + decimal[i]);
		}
	}
}
