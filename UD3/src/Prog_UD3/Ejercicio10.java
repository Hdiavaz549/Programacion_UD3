package Prog_UD3;

import java.util.Arrays;

public class Ejercicio10 {
public static void main(String[] args) {
	int[] a = new int[10];
	Arrays.fill(a, 20);
	System.out.println(Arrays.toString(a));
	
	Arrays.fill(a, 20);
	a[5] = 3;
	a[6] = 4;
	a[7] = 5;
	a[8] = 6;
	System.out.println(Arrays.toString(a));
}   
}
