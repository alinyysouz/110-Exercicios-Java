package exerciciosjava;
import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int somaIdades = 0;

        while (contador < 5) {
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da pessoa " + (contador + 1) + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha ap�s o pr�ximoInt()

            somaIdades += idade;
            contador++;
        }

        double mediaIdades = somaIdades / 5.0;
        System.out.printf("A m�dia das idades das 5 pessoas �: %.2f%n", mediaIdades);

        scanner.close();

	}

}
