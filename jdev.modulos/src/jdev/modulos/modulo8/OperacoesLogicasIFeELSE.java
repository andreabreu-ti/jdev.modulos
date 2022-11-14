package jdev.modulos.modulo8;

public class OperacoesLogicasIFeELSE {

	public static void main(String[] args) {

		//Condições logica com IF e ELSE
		int nota1 = 90;
		int nota2 = 10;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperacao: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}
	}

//		int mediaAluno = 70;
//		String nome = "Fulano";
//
//		if (mediaAluno >= 70 && nome.equals("Andre")) {
//			System.out.println("Parabens vc esta aprovado");
//		} else if (mediaAluno < 70) {
//			System.out.println("Parabens vc esta reprovado");
//		} else {
//			System.out.println("Aluno nao encontrado!");
//		}
}
