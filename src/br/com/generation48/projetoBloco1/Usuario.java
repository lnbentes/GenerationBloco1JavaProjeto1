package br.com.generation48.projetoBloco1;

import java.util.Scanner;

public class Usuario extends Pessoa{
	
	Scanner ler = new Scanner(System.in);
	private String estado;
	private char sexo;
	private int idade;
	
	public Usuario(String nome, int id, String estado, char sexo, int idade) {
		super.setNome(nome);
		super.setId(id);
		this.estado = estado;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getEndereco() {
		return estado;
	}
	public void setEndereco(String endereco) {
		this.estado = endereco;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int testarResposta() {
		int resposta = 0;
	try {
		resposta = ler.nextInt();
		}catch(Exception e) {
			System.out.println("So aceita numeros inteiros!!!");
			resposta = 0;
		}
		return resposta;
}
	
}
