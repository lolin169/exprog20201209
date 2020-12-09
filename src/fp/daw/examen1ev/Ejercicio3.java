package fp.daw.examen1ev;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String repetir;
		do {
			System.out.println("Escriba una variable real");
			int variable = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Ahora introduzca los valores de los coeficientes");
			int[] coeficientes = creavector();
			System.out.println(evaluaPolinomio(coeficientes, variable));
			System.out.println("¿Quieres repetir o finalizar el programa?(Si/No)");
			repetir = teclado.nextLine();
		} while (repetir.equalsIgnoreCase("si") || repetir.equalsIgnoreCase("repetir"));
		System.out.println("Fin del programa");
		teclado.close();

	}

	static int[] creavector() {
		String numero = teclado.nextLine();
		String numero1 = numero.replace(" ", "");
		int[] coeficientes = new int[numero1.length()];
		int i = 0;
		while (i < numero1.length()) {
			Arrays.fill(coeficientes, i, i + 1, Integer.parseInt(numero1.substring(i, i + 1)));
			i++;
		}
		System.out.println(Arrays.toString(coeficientes));
		return coeficientes;
	}

	static int evaluaPolinomio(int[] vector, int variable) {
		int suma = vector[0];
		for (int i = 0; i < vector.length; i++) {
			for (int z = 1; z < vector.length; z++) {
				suma += vector[i] * calcularVariable(variable, z);
			}
		}
		return suma;

	}

	static int calcularVariable(int variable, int indice) {
		int multiplicacion = variable;
		int i = 1;
		while (i <= indice) {
			multiplicacion *= variable;
			i++;
		}
		return multiplicacion;
	}

}
