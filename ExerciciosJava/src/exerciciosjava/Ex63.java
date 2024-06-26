package exerciciosjava;
import java.util.Scanner;

public class Ex63 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        int numeroOriginal = numero;

        // Vari�vel para armazenar o �ltimo d�gito
        int digito;

        // Loop do-while para extrair e exibir os d�gitos
        do {
            digito = numero % 10; // Obt�m o �ltimo d�gito do n�mero
            System.out.println(digito); // Exibe o d�gito

            // Remove o �ltimo d�gito do n�mero
            numero = numero / 10;
        } while (numero != 0);

        // Se o n�mero original for zero, exibe o d�gito zero
        if (numeroOriginal == 0) {
            System.out.println(0);
        }

        scanner.close();

	}

}
