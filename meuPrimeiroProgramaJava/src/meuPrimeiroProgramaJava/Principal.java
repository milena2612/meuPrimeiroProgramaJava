/**
 * Meu primeiro programa Java
 * 
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author milena data: 02/02/2021
 */
public class Principal {
	public static void main(String[] args) {
		// SaldaÃ§Ã£o e pergunta o nome.
		System.out.println("OlÃ¡ amigo!\nQual seu nome?");
		
		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// SaldaÃ§Ã£o especÃ­fica para o nome lido. 
		System.out.printf("OlÃ¡ %s", nome);
		in.close();
		
		// Nota: perguntar a idade e exibi-la.
	}

}
