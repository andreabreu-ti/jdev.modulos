package jdev.modulos.modulo15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasDiaMesAnoNovaApi {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();

		System.out.println("Data Atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Dia da Semana: " + localDate.getDayOfWeek() + " - " + localDate.getDayOfWeek().ordinal());

		System.out.println("Dia do Mes: " + localDate.getDayOfMonth());
		System.out.println("Dia do Ano: " + localDate.getDayOfYear());
		System.out.println("Mes: " + localDate.getMonth());
		System.out.println("Ano: " + localDate.getYear());

	}

}
