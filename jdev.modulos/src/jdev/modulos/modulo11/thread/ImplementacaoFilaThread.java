package jdev.modulos.modulo11.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila rodando....");

		while (true) {
			
			
			
			synchronized (pilha_fila) { // Bloquear acesso a essa lista por outro processo
				
				Iterator interacao = pilha_fila.iterator();
				
				while (interacao.hasNext()) { // Enquanto conter dados na lista irá processar

					ObjetoFilaThread processar = (ObjetoFilaThread) interacao.next();

					// Processar 10 mil notas fiscais
					// Gerar uma lista enrome de PDF
					// Gerar um envio em massa de email

					System.out.println("----------------------------------");

					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());

					interacao.remove();

					try {
						Thread.sleep(1000); // Dar um tempo para descarga de memoria
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
			try {
				Thread.sleep(1000); // Processo toda a lista, da um tempo para limpeza de memoria
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
