package jdev.modulos.modulo11.thread;

import javax.swing.JOptionPane;

public class ThreadRunnable {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();

		System.out.println("CHEGOU AO FIM DO CODIGO DE TESTE DE THREAD");

		JOptionPane.showMessageDialog(null, "sistema continua executando para o usuario.");

	}

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			for (int pos = 0; pos < 10; pos++) {
				System.out.println("Executando alguma rotina, por exemplo envio de notas fiscais");
				try {
					Thread.sleep(4000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	};

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			for (int pos = 0; pos < 10; pos++) {
				System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	};

}
