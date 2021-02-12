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
		// Saldação e pergunta o nome.
		System.out.println("Olá amigo!\nQual seu nome?");
		
		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saldação específica. 
		System.out.printf("Olá %s", nome);
		in.close();
				
		
	}

}
