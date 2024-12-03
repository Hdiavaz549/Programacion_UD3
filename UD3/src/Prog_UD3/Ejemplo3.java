package Prog_UD3;

import java.util.Iterator;

public class Ejemplo3 {

	public static void main(String[] args) {
		//Crear array de 5 posiciones tipo caracter
		char[] letras = new char[5];
		//Recorrer el array para inicializar cda posicion con la letra "a"
		for (int i = 0; i < letras.length; i++) {
			letras[i] = 'a';
			System.out.println(letras);
		}
	}

}
