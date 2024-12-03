package Prog_UD3;

public class Ejemplo7 {
public static void main(String[] args) {
	int[] a = {2, 4, 6, 8, 10};
	
	System.out.println(a);
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		
	}
		
	
	for (int e : a) {
		System.err.println(e);
	}
}
}
