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
		// Salda��o e pergunta o nome.
		System.out.println("Ol� amigo!\nQual seu nome?");
		
		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Salda��o espec�fica. 
		System.out.printf("Ol� %s", nome);
		in.close();
				
		
	}

}
