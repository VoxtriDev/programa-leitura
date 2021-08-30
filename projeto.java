package "nome do seu package";

import java.util.Scanner;

public class teste {
	
	public static void main(String[] args) {

	System.out.println("Insira seu nome:");
	Scanner in = new Scanner(System.in);
	String nome = in.nextLine();
	System.out.println("Insira sua idade:");
	String idade = in.nextLine();
	System.out.println("Insira seu jogo favorito:");
	String jogo = in.nextLine();
	System.out.println("Informações:" + nome);
	System.out.println(idade);
	System.out.println(jogo);
    }
}
