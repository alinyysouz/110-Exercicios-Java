package exerciciosjava;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor do sal�rio m�nimo: ");
        double salarioMinimo = scanner.nextDouble();

       
        System.out.print("Digite o sal�rio do funcion�rio: ");
        double salarioFuncionario = scanner.nextDouble();

       
        double quantosSalariosMinimos = salarioFuncionario / salarioMinimo;

        
        System.out.printf("O funcion�rio recebe %.2f sal�rios m�nimos.%n", quantosSalariosMinimos);

        scanner.close();

	}

}
