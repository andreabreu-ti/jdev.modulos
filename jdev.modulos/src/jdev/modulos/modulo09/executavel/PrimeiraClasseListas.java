package jdev.modulos.modulo09.executavel;

import javax.swing.JOptionPane;

import jdev.modulos.modulo09.classes.Aluno;
import jdev.modulos.modulo09.classes.Disciplina;

public class PrimeiraClasseListas {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Qual o Nome da Mãe?");
		String pai = JOptionPane.showInputDialog("Qual o Nome do Pai?");
		String matricula = JOptionPane.showInputDialog("Data da Matrícula?");
		String serie = JOptionPane.showInputDialog("Qual Série?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");

		Aluno aluno1 = new Aluno(); /* Aqui será o João */

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);

		Disciplina disciplina1a = new Disciplina();
		disciplina1a.setDisciplina("Banco de Dados");
		disciplina1a.setNota(90);

		Disciplina disciplina2a = new Disciplina();
		disciplina2a.setDisciplina("Matematica");
		disciplina2a.setNota(80);

		Disciplina disciplina3a = new Disciplina();
		disciplina3a.setDisciplina("Geografia");
		disciplina3a.setNota(85);

		Disciplina disciplina4a = new Disciplina();
		disciplina4a.setDisciplina("JAVA OO");
		disciplina4a.setNota(85);

		aluno1.getDisciplinas().add(disciplina1a);
		aluno1.getDisciplinas().add(disciplina2a);
		aluno1.getDisciplinas().add(disciplina3a);
		aluno1.getDisciplinas().add(disciplina4a);

		System.out.println(aluno1.toString());// Descrição do objeto na memoria
		System.out.println("Media do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}

}
