/**
 * 
 */
package Prog_UD3;

import java.util.Iterator;
/**
 * 
 */
import java.util.Scanner;
public class Ejercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		char c;
		int cont = 0;
		System.out.println("Inserta una frase");
		frase = sc.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			c = frase.charAt(i);
			if(c == ' ') {
				cont ++;
			}
		}
System.out.println(cont);
	}

}
