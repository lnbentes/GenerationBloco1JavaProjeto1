package br.com.generation48.projetoBloco1;

public interface moldeQuestionario {
	
	public void listarPerguntas();
	
	public void salvarResposta(int valor);
	
	public int pegarResposta(int numero);
	
	public void listarRespostas();

}
