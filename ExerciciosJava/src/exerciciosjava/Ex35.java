package exerciciosjava;
import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro n�mero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo n�mero inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro n�mero inteiro: ");
        int numero3 = scanner.nextInt();

       
        double media = (numero1 + numero2 + numero3) / 3.0;

        
        System.out.printf("M�dia aritm�tica: %.2f%n", media);

      
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

       
        scanner.close();

	}

}
