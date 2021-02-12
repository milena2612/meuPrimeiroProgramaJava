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
		
		// Saldação específica para o nome lido. 
		System.out.printf("Olá %s", nome);
		
		// Perguntar a idade
		System.out.printf("%s, qual � a sua idade?", nome);
		
		// Ler idade
		Integer idade = in.nextInt();
		
		System.out.printf("%d! Puxa! Como voc� � jovem!", idade);
		in.close();
	}

}
