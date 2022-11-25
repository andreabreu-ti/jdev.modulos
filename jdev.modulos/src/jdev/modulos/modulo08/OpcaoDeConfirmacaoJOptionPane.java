package jdev.modulos.modulo08;

import javax.swing.JOptionPane;

public class OpcaoDeConfirmacaoJOptionPane {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros? ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas? ");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja Ver o RESULTADO da divisão?");

		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao);
		}else {
			System.out.println("Não quiz ver o resultado!");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja Ver o RESTO da divisão?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "O Resto da divisao é " + resto);
		}else {
			System.out.println("Não quiz ver o RESTO!");
		}
		
	}

}
