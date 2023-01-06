package jdev.modulos.modulo15;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasFaixaChronoUnit {

	public static void main(String[] args) throws ParseException {

		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2011-02-01"), LocalDate.now());
		System.out.println("Possui " + dias + " dias entre a faixa de data.");

	}

}
