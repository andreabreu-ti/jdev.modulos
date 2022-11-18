package jdev.modulos.modulo9.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import jdev.modulos.modulo9.classes.Aluno;
import jdev.modulos.modulo9.classes.Disciplina;

//AULA - Percorrendo lista pelas posições
public class PrimeiraClassePercorrendoListaPosicao {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");

			Aluno aluno1 = new Aluno(); /* Aqui será o João */

			aluno1.setNome(nome);

			for (int pos = 1; pos <= 4; pos++) {
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

		for (int pos = 0; pos < alunos.size(); pos++) {

			Aluno aluno = alunos.get(pos);
			System.out.println("------------------------------------------------------------");
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Media do Aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("------------------------------------------------------------");

			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {

				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println("Materia = " + disc.getDisciplina() + " Nota = " + disc.getNota());

			}
		}

	}
}

/*
 * // String idade = JOptionPane.showInputDialog("Qual a idade?"); // String
 * dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?"); //
 * String rg = JOptionPane.showInputDialog("Registro Geral?"); // String cpf =
 * JOptionPane.showInputDialog("Qual o CPF?"); // String mae =
 * JOptionPane.showInputDialog("Qual o Nome da Mãe?"); // String pai =
 * JOptionPane.showInputDialog("Qual o Nome do Pai?"); // String matricula =
 * JOptionPane.showInputDialog("Data da Matrícula?"); // String serie =
 * JOptionPane.showInputDialog("Qual Série?"); // String escola =
 * JOptionPane.showInputDialog("Qual o nome da escola?");
 * 
 * // aluno1.setIdade(Integer.valueOf(idade)); //
 * aluno1.setDataNascimento(dataNascimento); // aluno1.setRegistroGeral(rg); //
 * aluno1.setNumeroCpf(cpf); // aluno1.setNomeMae(mae); //
 * aluno1.setNomePai(pai); // aluno1.setDataMatricula(matricula); //
 * aluno1.setSerieMatriculado(serie); // aluno1.setNomeEscola(escola);
 */
