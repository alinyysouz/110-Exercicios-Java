package exerciciosjava;
import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o n�mero de faltas do aluno: ");
        int faltas = scanner.nextInt();

    
        if (faltas > 15) {
            System.out.println("Situa��o do aluno: Reprovado por falta.");
        } else {
            System.out.println("Situa��o do aluno: Aprovado.");
        }

        
        scanner.close();

	}

}
