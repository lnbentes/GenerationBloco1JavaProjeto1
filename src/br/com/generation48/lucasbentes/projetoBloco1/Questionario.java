package br.com.generation48.lucasbentes.projetoBloco1;

import java.util.ArrayList;

public class Questionario implements moldeQuestionario {
	
	private ArrayList<Integer> quest;
	private int idUduario;
	
	public Questionario(int idUduario) {
		this.quest = new ArrayList<>();
		this.idUduario = idUduario;
	}
	
	@Override
	public void listarPerguntas() {
		System.out.println("Pergunta 1 - De 0 a 10 gstou do sabor do chocolate?");
		System.out.println("Pergunta 2 - De 0 a 10 gstou da textura do chocolate?");
		System.out.println("Pergunta 3 - De 0 a 10 gstou do cheiro do chocolate?");
	}
	
	@Override
	public void salvarResposta(int valor) {
		quest.add(valor);
	}
	
	@Override
	public int pegarResposta(int numero) {
		return quest.get(numero);
	}
	
	@Override
	public void listarRespostas() {
		System.out.println("##### Lista das respostas #####");
		for(int i = 0; i < quest.size(); i++) {
			System.out.println("Pergunta " + (i + 1) + " --- " + quest.get(i));
		}
	}
	
	public int tamanho() {
		return quest.size();
	}
	
	public int getIdUduario() {
		return this.idUduario;
	}

}
