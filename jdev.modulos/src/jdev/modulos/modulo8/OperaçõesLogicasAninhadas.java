package jdev.modulos.modulo8;

public class OperaçõesLogicasAninhadas {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 5;
		int nota3 = 60;
		int nota4 = 98;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		// Operações Lógicas aninhadas: São Operações dentro de operações

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno esta aprovado direto - Parabens! "+ media);
				}else {
					System.out.println("Aluno esta aprovado direto! "+ media);
				}
			} else {
				System.out.println("Aluno esta em recuperacao! "+ media);
			}
		}else {
			System.out.println("Aluno reprovado direto! "+ media );
		}

	}

}
