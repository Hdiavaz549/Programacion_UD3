package Prog_UD3;


public class Ejercicio3 {
public static void main(String[] args) {
	int sueldo[] = new int[5];
	sueldo[0] = 1800;
	sueldo[1] = 1200;
	sueldo[2] = 2000;
	sueldo[3] = 1200;
	sueldo[4] = 900;
	for (int i = 0; i < sueldo.length; i++) {
		sueldo[i] = sueldo[i] + 10% sueldo[i];
	}
	System.out.println(sueldo);
}
}
