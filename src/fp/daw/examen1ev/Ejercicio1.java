package fp.daw.examen1ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce una línea de caracteres");
		String linea = teclado.readLine();
		char[] linea1 = linea.toCharArray();
		Arrays.sort(linea1);
		System.out.println(Arrays.toString(linea1));

	}

}
