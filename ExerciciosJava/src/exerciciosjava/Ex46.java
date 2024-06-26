package exerciciosjava;
import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        int contador = 1;
        int somaPares = 0;

        while (contador <= numero) {
            if (contador % 2 == 0) {
                somaPares += contador;
            }
            contador++;
        }

        System.out.println("A soma dos n�meros pares de 1 a " + numero + " �: " + somaPares);

        scanner.close();

	}

}
