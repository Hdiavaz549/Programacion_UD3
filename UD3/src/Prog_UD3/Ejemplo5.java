package Prog_UD3;

public class Ejemplo5 {
public static void main(String[] args) {
	int suma = 0;
	int natural[] = {1, 2, 3, 4, 5};
	for (int x : natural) {
		suma = suma + x;
	}
	System.out.println(suma);
}
}