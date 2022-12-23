package jdev.modulos.modulo11.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {

	public TelaTimeThread() { // Constructor executa o que tiver dentro no momento da abertura ou execução
		
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		
		
		
		//Sempre será o último comando
		setVisible(true);//Torna a tela visivel para o usuário
	}

}
