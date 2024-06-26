package exerciciosjava;

import java.util.Scanner;

public class Ex80 {

	public static void main(String[] args) {
		//80) Crie um programa que leia o nome e a idade de v�rias pessoas at� que o nome "fim" seja informado. Ao final, exiba a m�dia das idades.
	
		 Scanner teclado = new Scanner(System.in);

	        int somaIdades = 0;
	        int contadorPessoas = 0;
	        String nome;

	        System.out.println("Digite o nome (ou 'fim' para encerrar): ");
	        nome = teclado.nextLine();

	        while (!nome.equalsIgnoreCase("fim")) {
	            System.out.print("Digite a idade de " + nome + ": ");
	            int idade = teclado.nextInt();
	            teclado.nextLine(); 

	            somaIdades += idade;
	            contadorPessoas++;

	            System.out.println("Digite o nome (ou 'fim' para encerrar): ");
	            nome = teclado.nextLine();
	        }

	        if (contadorPessoas > 0) {
	            double mediaIdades = (double) somaIdades / contadorPessoas;
	            System.out.println("A m�dia das idades das pessoas �: " + mediaIdades);
	        } else {
	            System.out.println("Nenhuma pessoa foi inserida.");
	        }

	        teclado.close();
	
	
	}

}
