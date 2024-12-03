package Prog_UD3;

import java.util.Scanner;
public class Ejemplo4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dame un numero");
	int n = sc.nextInt();
	int[] t = new int[5];
	for (int i = 0; i < t.length; i++) {
		t[i] = 'a';
		System.out.println(t);
	}
}
}
