package exerciciosjava;

import java.util.Scanner; 

public class Ex76 {

	public static void main(String[] args) {
		// 76) Escreva um programa que leia um n�mero inteiro e exiba a soma de todos os n�meros pares entre 1 e o n�mero lido.
	
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("Digite um n�mero inteiro: ");
		
        int numero = scanner.nextInt();

        
        int somaPares = 0;

        
        for (int i = 1; i <= numero; i++) {
           
            if (i % 2 == 0) {
                somaPares += i;
            }
        }

        System.out.println("A soma dos n�meros pares at� " + numero + " �: " + somaPares);

        scanner.close();
   
	
	
	
	
	}

}
