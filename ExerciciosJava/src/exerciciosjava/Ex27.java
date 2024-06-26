package exerciciosjava;
import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     
	        System.out.print("Digite a idade da pessoa: ");
	        int idade = scanner.nextInt();

	        
	        System.out.print("Digite o sexo da pessoa (M ou F): ");
	        char sexo = scanner.next().charAt(0);

	        
	        if (sexo == 'M') {
	            if (idade >= 65) {
	                System.out.println("Esta pessoa pode se aposentar.");
	            } else {
	                System.out.println("Esta pessoa n�o pode se aposentar ainda.");
	            }
	        } else if (sexo == 'F') {
	            if (idade >= 60) {
	                System.out.println("Esta pessoa pode se aposentar.");
	            } else {
	                System.out.println("Esta pessoa n�o pode se aposentar ainda.");
	            }
	        } else {
	            System.out.println("Sexo inv�lido. Digite M para masculino ou F para feminino.");
	        }

	       
	        scanner.close();

	}

}
