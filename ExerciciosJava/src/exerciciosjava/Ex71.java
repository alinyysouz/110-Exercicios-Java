package exerciciosjava;

import java.util.Scanner;

public class Ex71 {

	public static void main(String[] args) {
		// 71) Crie um programa que leia um n�mero inteiro positivo e exiba todos os divisores desse n�mero.

	       Scanner teclado = new Scanner(System.in);

	        
	        System.out.print("Digite um n�mero inteiro positivo: ");
	        int numero =teclado.nextInt();

	        
	        if (numero <= 0) {
	            System.out.println("Insira um n�mero inteiro positivo.");
	        } else {
	            System.out.println("Os divisores de " + numero + " s�o:");

	            for (int i = 1; i <= numero; i++) {
	                if (numero % i == 0) {  
	                    System.out.println(i);  
	                }
	            }
	        }

	     teclado.close();
		
	}

}
