/**
 * 
 */
package Prog_UD3;

/**
 * 
 */
import java.util.Scanner;
public class Ejercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase");
		String f1 = sc.nextLine();
		System.out.println("Escribe otra frase");
		String f2 = sc.nextLine();
		if (f1.length() < f2.length()) {
			System.out.println("La primera es la mas corta");
		} else if (f2.length() < f1.length()){
			System.out.println("La segunda es mas corta");
		}
		

	}

}
