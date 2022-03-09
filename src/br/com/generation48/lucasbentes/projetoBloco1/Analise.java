package br.com.generation48.lucasbentes.projetoBloco1;

public class Analise {
	
	private int soma;
	
	public double mediaSabor(Questionario questa1, Questionario questa2, Questionario questa3) {
		this.soma = questa1.pegarResposta(0) + questa2.pegarResposta(0) + questa3.pegarResposta(0);
		return this.soma / 3;
	}
	public double mediaSabor(Questionario questa1, Questionario questa2) {
		this.soma = questa1.pegarResposta(0) + questa2.pegarResposta(0);
		return this.soma / 2;
	}
	
	public double mediaTextura(Questionario questa1, Questionario questa2, Questionario questa3) {
		this.soma = questa1.pegarResposta(1) + questa2.pegarResposta(1) + questa3.pegarResposta(1);
		return this.soma / 3;
	}
	public double mediaTextura(Questionario questa1, Questionario questa2) {
		this.soma = questa1.pegarResposta(0) + questa2.pegarResposta(0);
		return this.soma / 2;
	}
	
	public double mediaCheiro(Questionario questa1, Questionario questa2, Questionario questa3) {
		this.soma = questa1.pegarResposta(2) + questa2.pegarResposta(2) + questa3.pegarResposta(2);
		return this.soma / 3;
	}
	public double mediaCheiro(Questionario questa1, Questionario questa2) {
		this.soma = questa1.pegarResposta(0) + questa2.pegarResposta(0);
		return this.soma / 2;
	}
	
	public double mediaTotal(Questionario questa) {
		for(int i = 0; i < questa.tamanho(); i++) {
			this.soma = this.soma + questa.pegarResposta(i);
		}
		return this.soma / questa.tamanho();
	}
	
	
	
	

}
