package jdev.modulos.modulo10.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import jdev.modulos.modulo10.classes.Aluno;
import jdev.modulos.modulo10.classes.Disciplina;
import jdev.modulos.modulo10.classes.Secretario;
import jdev.modulos.modulo10.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe o senha");

		Secretario secretario = new Secretario(); //Diretamente com o objeto
		secretario.setLogin(login);
		secretario.setSenha(senha);
		
		if (secretario.autenticar()) { //Se TRUE acessa se FALSE não acessa

			List<Aluno> alunos = new ArrayList<>();

			// É uma lista que dentro de temos uma chave que identifica uma sequência de
			// valores também
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 1; qtd++) {

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

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) { // Separei em listas

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}
			System.out.println("------------------------------Lista dos aprovados------------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println(aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com media de = "
						+ aluno.getMediaNota());
			}
			System.out.println("------------------------------Lista dos Reprovados------------------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println(aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com media de = "
						+ aluno.getMediaNota());
			}
			System.out.println("------------------------------Lista em Recuperacao------------------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println(aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2() + " com media de = "
						+ aluno.getMediaNota());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
			System.out.println("Acesso não permitido");
		}
	}

}
