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
		
		// Salda��o espec�fica para o nome lido. 
		System.out.printf("Olá %s", nome);
		// SaldaÃ§Ã£o especÃ­fica para o nome lido. 
		System.out.printf("OlÃ¡ %s", nome);
		in.close();
		
		// Perguntar a idade
				System.out.printf("%s, qual � a sua idade?", nome);
				
				// Ler idade
				Integer idade = in.nextInt();
				
				System.out.printf("%d! Puxa! Como voc� � jovem!", idade);
				in.close();
	}

}
