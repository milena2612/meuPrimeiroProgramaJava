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
public class Principal {// Classe que contém o método principal.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá amigo!\nQual seu nome?");
		
		// Ler uma string do console usando somente a biblioteca Scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Exibir uma string 
		System.out.printf("Olá %s", nome);
		in.close();
				
		
	}

}
