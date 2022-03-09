package br.com.generation48.lucasbentes.projetoBloco1;

public class Pesquisador extends Pessoa{
	
	private int idP;  //id pesquisador
	
	
	public Pesquisador(String nome, int idP) {
		super.setNome(nome);
		this.idP = idP;		
	}
		
	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}
	
	

}
