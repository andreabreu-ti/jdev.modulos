package jdev.modulos.modulo16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {

		File file = new File(
				"C:\\Users\\aandd\\git\\jdev.modulos\\jdev.modulos\\src\\jdev\\modulos\\modulo16\\arquivo_excel.xsl");

		if (!file.exists()) {
			file.createNewFile();
		}
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("André Abreu");

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(30);
		pessoa2.setNome("Pessoa 2");

		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(45);
		pessoa3.setNome("Fulano de Tal");

		// Lista pode vir do banco de dados ou qualquer fonte
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		

		HSSFWorkbook hssfworkbook = new HSSFWorkbook();// Vai ser usado para escrever a planilha
		HSSFSheet linhaPessoa = hssfworkbook.createSheet("Planilha de pessoas JDev Treinamento");// Criar a planilha

		int numeroLinha = 0;

		for (Pessoa p : pessoas) {
			Row linha = linhaPessoa.createRow(numeroLinha ++);// Criando a linha na planilha

			int celula = 0;

			Cell celNome = linha.createCell(celula ++);
			celNome.setCellValue(p.getNome());

			Cell celEmail = linha.createCell(celula ++);
			celEmail.setCellValue(p.getEmail());

			Cell celIdade = linha.createCell(celula ++);
			celIdade.setCellValue(p.getIdade());

		} // Terminou de montar a planilha

		FileOutputStream saida = new FileOutputStream(file);
		hssfworkbook.write(saida);// Escreve na planilha em arquivo
		saida.flush();
		saida.close();

		System.out.println("Planilha foi criada");
	}

}
