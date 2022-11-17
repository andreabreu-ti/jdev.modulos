package jdev.modulos.modulo9.executavel;

import javax.swing.JOptionPane;

import jdev.modulos.modulo9.classes.Aluno;
import jdev.modulos.modulo9.classes.Disciplina;

public class PrimeiraClasseRemoverRepetir {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
//		String idade = JOptionPane.showInputDialog("Qual a idade?");
//		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?");
//		String rg = JOptionPane.showInputDialog("Registro Geral?");
//		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
//		String mae = JOptionPane.showInputDialog("Qual o Nome da Mãe?");
//		String pai = JOptionPane.showInputDialog("Qual o Nome do Pai?");
//		String matricula = JOptionPane.showInputDialog("Data da Matrícula?");
//		String serie = JOptionPane.showInputDialog("Qual Série?");
//		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");

		Aluno aluno1 = new Aluno(); /* Aqui será o João */

		aluno1.setNome(nome);
//		aluno1.setIdade(Integer.valueOf(idade));
//		aluno1.setDataNascimento(dataNascimento);
//		aluno1.setRegistroGeral(rg);
//		aluno1.setNumeroCpf(cpf);
//		aluno1.setNomeMae(mae);
//		aluno1.setNomePai(pai);
//		aluno1.setDataMatricula(matricula);
//		aluno1.setSerieMatriculado(serie);
//		aluno1.setNomeEscola(escola);

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

		System.out.println(aluno1.toString());// Descrição do objeto na memoria
		System.out.println("Media do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}

}
