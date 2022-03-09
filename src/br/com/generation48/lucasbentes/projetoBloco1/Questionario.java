package br.com.generation48.lucasbentes.projetoBloco1;

import java.util.ArrayList;

public class Questionario implements moldeQuestionario {
	
	private ArrayList<Integer> quest;
	
	public Questionario() {
		quest = new ArrayList<>();
	}
	
	@Override
	public void listarPerguntas() {
		System.out.println("Pergunta 1 - De 0 a 10 gstou do sabor do bolo?");
		System.out.println("Pergunta 2 - De 0 a 10 gstou da textura do bolo?");
		System.out.println("Pergunta 3 - De 0 a 10 gstou do cheiro do bolo?");
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

}
