package jdev.modulos.modulo11.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		//Thread processando em paralelo
		new Thread() {

			public void run() { // Executa o que nos queremos
				
				// Codigo da rotina
				
				// Código da rotina que eu quero executar em paralelo
				for (int pos = 0; pos < 10; pos++) {

					System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
				// Fim do codigo em paralelo

			}

		}.start();// Start liga a thread que fica processando paralelamente por tras

		// Codigo do sistema do usuário continua o fluxo de trabalho
		System.out.println("CHEGOU AO FIM DO CODIGO DE TESTE DE THREAD");

		// Fluxo do sistema, cadastro de venda, emissão de nota fiscal
		JOptionPane.showMessageDialog(null, "sistema continua executando para o usuario.");

	}

}
