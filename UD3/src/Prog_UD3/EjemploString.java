package Prog_UD3;

public class EjemploString {
	public static void main(String[] args) {
		System.out.println("Hola \u0394");
		System.out.println("Hola \"Hector\"\r");
		
		//Convertir
		int i = 65;
		char c = (char) i;
		System.out.println(c);
		c = 'A';
		i = c;
		System.out.println(i);
		
		//Convertir int a String
		int j = 120;
		String s = String.valueOf(j);
		
		//Comparar cadenas
		//Tipos primitivos si se usa == porque no tienen metodo
		String cad1 = "Hola";
		String cad2 = "Hola";
		System.out.println(cad1 == cad2);
		
		//Comparar con equals
		String cad3 = "Hola";
		String cad4 = "Hola";
		cad3.equals(cad4);
		
		//Método compareTo
		int comparacion;
		
		//Cadenas iguales
		comparacion = "Hola".compareTo("Hola");
		
		//Cadena invocante es menor
		comparacion = "Casa".compareTo("Dedo");
		
		//Cadena invocante mayor
		comparacion = "Dedo".compareTo("Casa");
		
		if (comparacion == 0) {
			System.out.println("Son iguales");
		} else if (comparacion < 0) {
			System.out.println("Primera menor");
		} else {
			System.out.println("Primer mayor");
		}
		
		//numero caracteres string
		System.out.println("Hola".length());
		
		//Posicion caracter en cadena
		System.out.println("Hola Fran".indexOf("Fran"));
	}
}
