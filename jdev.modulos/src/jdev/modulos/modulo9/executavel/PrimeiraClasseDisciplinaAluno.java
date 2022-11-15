package jdev.modulos.modulo9.executavel;

import javax.swing.JOptionPane;

import jdev.modulos.modulo9.classes.Aluno;

public class PrimeiraClasseDisciplinaAluno {

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
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3?");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");
		
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
		
//		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
//		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
//		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
//		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
//		
//		aluno1.getDisciplina().setDisciplina1(disciplina1);
//		aluno1.getDisciplina().setDisciplina2(disciplina2);
//		aluno1.getDisciplina().setDisciplina3(disciplina3);
//		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		//Uso do toString
		System.out.println(aluno1.toString());//Descrição do objeto na memoria
		System.out.println("Media do Aluno = "+aluno1.getMediaNota());
		System.out.println("Resultado = "+aluno1.getAlunoAprovado2());

	}

}
