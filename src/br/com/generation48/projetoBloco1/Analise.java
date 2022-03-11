package br.com.generation48.projetoBloco1;

public class Analise {
	
	private int saborRuim;
	private int saborBom;
	private int saborOtimo;
	
	
	public void saborRegiaoNorte(Usuario u1, Questionario q1) {
		if(u1.getEndereco() == "norte" && q1.pegarResposta(0) >= 0 && q1.pegarResposta(0) <= 4 ) {
			this.saborRuim = this.saborRuim + 1;
		}
		else if(u1.getEndereco() == "norte" && q1.pegarResposta(0) == 5) {
			this.saborBom = this.saborBom + 1;
		}
		else if(u1.getEndereco() == "norte" && q1.pegarResposta(0) >= 6 && q1.pegarResposta(0) <= 10 ) {
			this.saborOtimo = this.saborOtimo + 1;
		}
		
	}
	
	public void respostaNorte() {
		System.out.println("Dados do Norte: ");
		System.out.println("Achou ruim: " + this.saborRuim);
		System.out.println("Achou bom: " + this.saborBom);
		System.out.println("Achou otimo: " + this.saborOtimo);
	}

}
