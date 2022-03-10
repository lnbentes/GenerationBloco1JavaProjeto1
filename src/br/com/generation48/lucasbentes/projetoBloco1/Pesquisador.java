package br.com.generation48.lucasbentes.projetoBloco1;

import java.util.Scanner;

public class Pesquisador extends Pessoa{
	
	private int idP;  //id pesquisador
	Scanner ler;
	
	
	public Pesquisador(String nome, int idP) {
		super.setNome(nome);
		this.idP = idP;
		ler = new Scanner(System.in);
	}
		
	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}
	
	public int validarSenha() {
		int senha = 0;
		try {
			senha = ler.nextInt();
			}catch(Exception e) {
				System.out.println("So aceita numeros inteiros!!!");
				senha = 0;
			}
			return senha;
	}
	
	

}
