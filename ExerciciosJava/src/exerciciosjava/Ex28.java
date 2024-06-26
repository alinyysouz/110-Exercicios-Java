package exerciciosjava;
import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o peso da pessoa (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

       
        double imc = peso / (altura * altura);

        
        System.out.printf("O IMC calculado �: %.2f%n", imc);

        
        if (imc < 18.5) {
            System.out.println("Classifica��o: Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classifica��o: Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classifica��o: Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Classifica��o: Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Classifica��o: Obesidade grau II (severa)");
        } else {
            System.out.println("Classifica��o: Obesidade grau III (m�rbida)");
        }

       
        scanner.close();

	}

}
