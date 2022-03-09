package br.com.generation48.lucasbentes.projetoBloco1;

import java.util.ArrayList;

public class Armazenar {
	
	ArrayList<Object> armaz;
	
	public Armazenar() {
		armaz = new ArrayList<Object>();
	}
	
	public void armazenar(Usuario user, Questionario quest) {
		armaz.add(user);
		armaz.add(quest);
	}
	
	public Usuario getUsuario(int numero) {
		return (Usuario) armaz.get(numero);
	}
	
	public Questionario getQuestionario(int numero) {
		return (Questionario) armaz.get(numero);
	}

}
