package jdev.modulos.modulo11.executavel;

import jdev.modulos.modulo11.classes.Aluno;
import jdev.modulos.modulo11.classes.Disciplina;

public class ArrayVetor2 {

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

		// -----------------------------------------------------

		Aluno[] arrayAlunos = new Aluno[1];
		arrayAlunos[0] = aluno;
		
		for(int pos = 0; pos < arrayAlunos.length;pos++){
			
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
			
			for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				
				System.out.println("Nome da disciplina é: "+ d.getDisciplina());
				
				for (int posNota = 0; posNota < d.getNota().length; posNota++) {
					System.out.println("A nota número "+posNota+" é igual "+ d.getNota()[posNota]);
					
					
				}
				
			}
		}

	}

}
