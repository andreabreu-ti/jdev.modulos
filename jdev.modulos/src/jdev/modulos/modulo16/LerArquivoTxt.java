package jdev.modulos.modulo16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream entradaArquivo = new FileInputStream(new File(
				"C:\\Users\\andre_abreu\\git\\jdev.modulos\\jdev.modulos\\src\\jdev\\modulos\\modulo16\\arquivowork.txt"));

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			if (linha != null && !linha.isEmpty()) {
				System.out.println(linha);
			}

		}
	}
}
