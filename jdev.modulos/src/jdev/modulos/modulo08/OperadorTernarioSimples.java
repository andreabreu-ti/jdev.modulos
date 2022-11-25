package jdev.modulos.modulo08;

public class OperadorTernarioSimples {

	public static void main(String[] args) {

		/* Operadores ternarios são para micro validações, verdadeiro/falso, maior/menor, etc... */
		int nota1 = 50;
		int nota2 = 50;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		String saidaResultado = media >= 70 ? "Aluno Aprovado" : media >= 40 && media <= 69 ? "Aluno em Recuperacao" : "Aluno Reprovado";

		System.out.println(saidaResultado);

	}

}
