package jdev.modulos.modulo9.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import jdev.modulos.modulo9.classes.Aluno;
import jdev.modulos.modulo9.classes.Disciplina;
import jdev.modulos.modulo9.constantes.StatusAluno;

//AULA - Substituindo um aluno na lista
public class ListaAprovadoReprovadoRecuperacao {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();
		
		List<Aluno> alunosAprovados = new ArrayList<>();
		List<Aluno> alunosRecuperacao = new ArrayList<>();
		List<Aluno> alunosReprovados = new ArrayList<>();
		
		for (int qtd = 1; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");

			Aluno aluno1 = new Aluno(); /* Aqui será o João */

			aluno1.setNome(nome);

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
				System.out.println(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) {/* Opção Sim é Zero */

				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}

			alunos.add(aluno1);
		}
		
		for (Aluno aluno : alunos) { //Separei em listas
			
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				
				alunosAprovados.add(aluno);
			}else
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					alunosRecuperacao.add(aluno);
				}else {
					alunosReprovados.add(aluno); //Reprovado
				}
		}
		System.out.println("------------------------------Lista dos aprovados------------------------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println(aluno.getNome()+" Resultado =" + aluno.getAlunoAprovado2() + " com media de = "+ aluno.getMediaNota());
		}
		System.out.println("------------------------------Lista dos Reprovados------------------------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println(aluno.getNome()+" Resultado =" + aluno.getAlunoAprovado2() + " com media de = "+ aluno.getMediaNota());
		}
		System.out.println("------------------------------Lista em Recuperacao------------------------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println(aluno.getNome()+" Resultado =" + aluno.getAlunoAprovado2() + " com media de = "+ aluno.getMediaNota());
		}

	}
}
