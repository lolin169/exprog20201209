package fp.daw.examen1ev;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int ano = 2020;
		int ano1 = 100;
		int ano2 = 400;
		int ano3 = 4;
		System.out.printf("El año %d %s\n", ano, esBisiesto(ano) ? "es bisiesto" : "No es bisiesto");
		System.out.printf("El año %d %s\n", ano1, esBisiesto(ano1) ? "es bisiesto" : "No es bisiesto");
		System.out.printf("El año %d %s\n", ano2, esBisiesto(ano2) ? "es bisiesto" : "No es bisiesto");
		System.out.printf("El año %d %s\n", ano3, esBisiesto(ano3) ? "es bisiesto" : "No es bisiesto");

	}

	static boolean esBisiesto(int n) {
		boolean bisiesto = false;
		while ((n % 100) == 0 ^ ((n % 400 == 0) && (n % 4 == 0))) {
			bisiesto = false;
			return bisiesto;
		}
		bisiesto = true;

		return bisiesto;
	}

}
