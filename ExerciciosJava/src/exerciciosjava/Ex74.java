package exerciciosjava;

import java.util.Scanner;

public class Ex74 {

	public static void main(String[] args) {
		// 74) Crie um programa que leia o nome e a idade de 5 pessoas e exiba a m�dia das idades.
	
Scanner teclado = new Scanner(System.in);
        
        int total = 0;
        int pessoas = 5;
        double mediaIdades;
        
        System.out.println("Digite o nome e a idade de " + pessoas + " pessoas:");

        for (int n = 1; n <= pessoas; n++) {
            System.out.println("Pessoa " + n + ":");
            
            System.out.print("Nome: ");
            String nome = teclado.next();  
            
            System.out.print("Idade: ");
            int idade = teclado.nextInt();
            
            total += idade; 
        }

      
        mediaIdades = (double) total / pessoas;

      
        System.out.println("A m�dia das idades das " + pessoas + " pessoas �: " + mediaIdades);

       
        teclado.close();
    }
}

