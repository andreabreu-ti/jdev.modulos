package jdev.modulos.modulo11.executavel;

import jdev.modulos.modulo11.classes.Aluno;
import jdev.modulos.modulo11.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 8.3, 9.2, 7.1, 6.7 };

		Aluno aluno = new Aluno();
		aluno.setNome("André Abreu");
		aluno.setNomeEscola("JDEV Treinamento");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação");
		disciplina2.setNota(notasLogica);

		aluno.getDisciplinas().add(disciplina2);
	}
}
