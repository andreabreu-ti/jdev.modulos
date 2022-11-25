package jdev.modulos.modulo11.classes.auxiliares;

import jdev.modulos.modulo10.interfaces.PermitirAcesso;

//Realmente e somente receber alguem que tem o contrato da interface de PermitirAcesso e chamado o autenticar
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
