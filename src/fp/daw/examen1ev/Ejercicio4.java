package fp.daw.examen1ev;

public class Ejercicio4 {

	public static void main(String[] args) {

		int[][] matriz = { { 1, 5, 5, 2, 4 }, { 2, 1, 4, 14, 3 }, { 3, 7, 11, 2, 8 }, { 4, 8, 12, 16, 4 } };

		System.out.println(max3x3sum(matriz));

	}

	static Integer max3x3sum(int[][] matriz) {
		int mayor = 0;

		if (matriz.length < 3 || matriz[0].length < 3) {
			return null;
		} else {

			for (int i = 0; i < matriz.length - 2; i++) {
				int sum = 0;
				for (int z = 0; z < matriz[i].length - 2; z++) {

					for (int k = i; k < (i + 3); k++) {
						for (int j = z; j < (z + 3); j++) {
							sum += matriz[k][j];
						}
					}
					if (sum > mayor) {
						mayor = sum;
						sum = 0;
					} else {
						sum = 0;
					}

				}
			}
			return mayor;
		}

	}

}
