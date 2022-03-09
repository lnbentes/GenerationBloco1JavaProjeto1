package br.com.generation48.lucasbentes.projetoBloco1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Analise analise = new Analise();
		int senha = 0;
		
		Pesquisador pesq = new Pesquisador("Bob", 101);
		
		Usuario u1 = new Usuario("Lucas", 1122, "Av", 'M', 33);
		Questionario q1 = new Questionario();
		
		Usuario u2 = new Usuario("Ana", 2211, "Rua", 'F', 77);
		Questionario q2 = new Questionario();
		
		Usuario u3 = new Usuario("Ferdinando", 4673, "R.", 'O', 19);
		Questionario q3 = new Questionario();
		
		System.out.println("usuario: " + u1.getNome());
		q1.listarPerguntas();
		q1.salvarResposta(ler.nextInt());
		q1.salvarResposta(ler.nextInt());
		q1.salvarResposta(ler.nextInt());
		q1.listarRespostas();
		
		System.out.println("\n###########################");
		
		System.out.println("usuario: " + u2.getNome());
		q2.listarPerguntas();
		q2.salvarResposta(ler.nextInt());
		q2.salvarResposta(ler.nextInt());
		q2.salvarResposta(ler.nextInt());
		q2.listarRespostas();
		
		System.out.println("\n###########################");
		
		System.out.println("usuario: " + u3.getNome());
		q3.listarPerguntas();
		q3.salvarResposta(ler.nextInt());
		q3.salvarResposta(ler.nextInt());
		q3.salvarResposta(ler.nextInt());
		q3.listarRespostas();
		
		System.out.println("\n###########################");
		
		do {
			System.out.print("Digite a senha de administrador: ");
			senha = ler.nextInt();
		}while(senha != pesq.getIdP());
		
		System.out.println("Media do sabor: " + analise.mediaSabor(q1, q2, q3));
		System.out.println("Media do sabor: " + analise.mediaSabor(q1, q3));
		
		
		ler.close();
	}

}
