package jdev.modulos.modulo15;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasNovaApi {

	public static void main(String[] args) {

		// Nova API de Data e Hora do Java 8

		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual: " + dataAtual);
		System.out.println("Data atual formatada: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual: " + horaAtual);
		System.out.println("Hora atual formatada: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora atual: " + dataHoraAtual);
		System.out.println("Data e Hora atual formatada: "
				+ dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

	}

}
