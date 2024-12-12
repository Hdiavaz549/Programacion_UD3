/**
 * 
 */
package Prog_UD3;

/**
 * 
 */
import java.util.Scanner;

public class Ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String respuesta;
		// Insertar la contraseña
		System.out.println("Introduce una contraseña");
		String contraseña = sc.nextLine();

		// Adivina la contraseña
		System.out.println("¿Cual es la contraseña?");
		respuesta = sc.nextLine();
		while (respuesta == contraseña) {
		if (respuesta.length() == contraseña.length()) {
			System.out.println("Has adivinado la contraseña");
			System.out.println("Introduce la contraseña");
			contraseña = sc.nextLine();
			System.out.println("¿Cual es la contraseña?");
			respuesta = sc.nextLine();
		}
		}
		do {
			System.out.println("¿Cual es la contraseña?");
			respuesta = sc.nextLine();
			if (respuesta.length() < contraseña.length()) {
				System.out.println("Tu respuesta es muy corta");
			} else if (respuesta.length() > contraseña.length()) {
				System.out.println("Tu respuesta es muy larga");
			} else {
				System.out.println("Respuesta incorrecta");
			} 
		} while (respuesta != contraseña);
	}
}
