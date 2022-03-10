package br.com.generation48.lucasbentes.projetoBloco1;

public class Analise {
	
	private int somaNorte;
	private int somaSul;
	private int somaLeste;
	private int somaOeste;
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
	
	
	
	//######################################
	
	//Faz as contagem do sabor do produto
	public void sabor(int sabor) {
		if(sabor >= 0 && sabor <= 4) {
			this.saborRuim++;
		}else if(sabor == 5) {
			this.saborBom++;
		}else if(sabor >= 6 && sabor <= 10) {
			this.saborOtimo++;
		}
	}
	
	//Os get do sabor
	public int saborRuim() {
		return saborRuim;
	}
	public int saborBom() {
		return saborBom;
	}
	public int saborOtimo() {
		return saborOtimo;
	}
	
	//Faz a contagem de pessoas por regiao
	public void regiao(String nome) {
		if(nome == "norte") {
			this.somaNorte++;
		}else if(nome == "sul") {
			this.somaSul++;
		}else if(nome == "leste") {
			this.somaLeste++;
		}else if(nome == "oeste") {
			this.somaOeste++;
		}
	}
	
	//Os gets das regios
	public int regiaoNorte(){
		return this.somaNorte;
	}
	public int regiaoSul(){
		return this.somaSul;
	}
	public int regiaoLeste(){
		return this.somaLeste;
	}
	public int regiaoOeste(){
		return this.somaOeste;
	}
	
	
	
	
	
	

}
