package br.com.generation48.lucasbentes.projetoBloco1;

public class Usuario extends Pessoa{
	
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
	
	
}
