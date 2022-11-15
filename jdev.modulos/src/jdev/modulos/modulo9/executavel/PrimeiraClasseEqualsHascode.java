package jdev.modulos.modulo9.executavel;

import jdev.modulos.modulo9.classes.Aluno;

public class PrimeiraClasseEqualsHascode {

	public static void main(String[] args) {

		// Equals e Hascode (Diferenciar e comprar objetos

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setNumeroCpf("123");
		

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		aluno2.setNumeroCpf("123");

		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos sao iguais");
		} else {
			System.out.println("Alunos nao sao iguais");
		}
	}

}
