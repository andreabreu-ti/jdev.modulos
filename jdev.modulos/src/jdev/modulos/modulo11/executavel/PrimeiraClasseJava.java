package jdev.modulos.modulo11.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import jdev.modulos.modulo10.classes.Aluno;
import jdev.modulos.modulo10.classes.Diretor;
import jdev.modulos.modulo10.classes.Disciplina;
import jdev.modulos.modulo10.classes.auxiliares.FuncaoAutenticacao;
import jdev.modulos.modulo10.constantes.StatusAluno;

public class PrimeiraClasseJava {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {
			
//			File fil = new File("arquivo.txt");
//			Scanner scanner = new Scanner(fil);
			
			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe o senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

				List<Aluno> alunos = null; // Erro
				// List<Aluno> alunos = new ArrayList<Aluno>(); // Correto

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");

					String idade = JOptionPane.showInputDialog("Qual a idade?");
					/*
					 * dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?"); String
					 * rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
					 * JOptionPane.showInputDialog("Qual o CPF?"); String mae =
					 * JOptionPane.showInputDialog("Qual o Nome da Mãe?"); String pai =
					 * JOptionPane.showInputDialog("Qual o Nome do Pai?"); String matricula =
					 * JOptionPane.showInputDialog("Data da Matrícula?"); String serie =
					 * JOptionPane.showInputDialog("Qual Série?"); String escola =
					 * JOptionPane.showInputDialog("Qual o nome da escola?");
					 */

					Aluno aluno1 = new Aluno(); /* Aqui será o João */

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));

					/*
					 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
					 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
					 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
					 * aluno1.setNomeEscola(escola);
					 */

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
					System.out.println(aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ " com media de = " + aluno.getMediaNota());
				}
				System.out.println("------------------------------Lista dos Reprovados------------------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ " com media de = " + aluno.getMediaNota());
				}
				System.out.println("------------------------------Lista em Recuperacao------------------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ " com media de = " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
				System.out.println("Acesso não permitido");
			}

			// Aqui
		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();

			e.printStackTrace();// Imprimir o erro no console Java

			System.out.println(" Mensagem: " + e.getMessage());// Mensagem do erro ou causa

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {

				saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Metodo de erro: " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Class: " + e.getClass().getName());
			}

			JOptionPane.showMessageDialog(null, "Erro de conversao de numero " + saida.toString());
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opaaa um null pointer exception " + e.getClass());
		
		}catch (Exception e) { //Captura todas as exceções que não prevemos
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado " + e.getClass());
		}

	}

}
