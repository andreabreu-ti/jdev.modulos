package jdev.modulos.modulo11.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {

		/*
		 * Array pode ser de todos os tipos de dados e objetos também
		 * 
		 * Array sempre deve ter a quantidade de posições definidas
		 */

		int[] inteiros = new int[10];
		float[] floats = new float[10];
		
		String[] valores = { "andre", "90", "Curso de Java", "andre@gmail.com" };

		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println("Valor na posição " + pos + " é igual = " + valores[pos]);
		}

//		String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter?");
//
//		double[] notas = new double[Integer.parseInt(posicoes)];
//
//		for (int pos = 0; pos < notas.length; pos++) {
//			String valor = JOptionPane.showInputDialog("Qual o valor da posição " + pos + "?");
//			notas[pos] = Double.valueOf(valor);
//		}
//
//		for (int pos = 0; pos < notas.length; pos++) {
//			System.out.println("Nota " + (pos + 1) + " = " + notas[pos]);
//		}

	}
}
