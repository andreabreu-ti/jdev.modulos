package jdev.modulos.modulo11.executavel;

public class ArrayVetor {

	public static void main(String[] args) {

		/*
		 * Array pode ser de todos os tipos de dados e objetos também
		 * 
		 * Array sempre deve ter a quantidade de posições definidas
		 */

		double[] notas = new double[5];

		/* Atribuir valor nas posições do array */
		notas[0] = 9.8;
		notas[1] = 7.8;
		notas[2] = 3.8;
		notas[3] = 6.8;

		for (int posit = 0; posit < 5; posit++) {
			System.out.println("Nota " + (posit + 1) + " = " + notas[posit]);
		}

	}
}
