package br.com.generation48.lucasbentes.projetoBloco1;

import java.util.ArrayList;

public class Armazenar {
	
	ArrayList<Questionario> armaz;
	
	public Armazenar() {
		armaz = new ArrayList<>();
	}
	
	public void armazenarQuestionario(Questionario quest) {
		armaz.add(quest);
	}
	
	public Questionario getQuestionario(int numero) {
		return armaz.get(numero);
	}
	
	public int indexQuestUsuario(int idUsuario) {
		int index = 0;
		for(int i = 0; i < armaz.size(); i++) {
			
			if(idUsuario == armaz.get(i).getIdUduario()) {
				index = i;
			}
			
		}
		return index;
	}

}
