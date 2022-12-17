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
		
		System.out.println("Nome do aluno = "+aluno.getNome()+ " inscrito na escola "+aluno.getNomeEscola());
		System.out.println("------------------Disciplinas do Aluno------------------");
		for (Disciplina d : aluno.getDisciplinas()) {
			
			
			System.out.println("Disciplina: "+ d.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			
			double notaMaxima = 0.0;
			double notaMinima = 0.0;
			for (int pos= 0;pos < d.getNota().length; pos++) {
				
				System.out.println("Nota "+pos+ " é igual = "+d.getNota()[pos]);
				
				if(pos == 0) {
					notaMaxima = d.getNota()[pos];
				}else {
					if(d.getNota()[pos] > notaMaxima) {
						notaMaxima = d.getNota()[pos];
					}
				}
				if(pos == 0) {
					notaMinima = d.getNota()[pos];
				}else {
					if(d.getNota()[pos] < notaMinima) {
						notaMinima = d.getNota()[pos];
					}
				}
				
			}
			System.out.println("A maior nota da Disciplina = "+d.getDisciplina() + " é de valor "+notaMaxima);
			System.out.println("A menor nota da Disciplina = "+d.getDisciplina() + " é de valor "+notaMinima);
			
		}
	}
}






