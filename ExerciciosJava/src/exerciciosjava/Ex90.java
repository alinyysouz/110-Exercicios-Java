package exerciciosjava;
import java.util.Scanner;

//90)Faça um programa que leia 5 números inteiros e verifique se algum deles é igual a zero.

public class Ex90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        boolean encontradoZero = false;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número inteiro: ", i + 1);
            int numero = scanner.nextInt();
            if (numero == 0) {
                encontradoZero = true;
                break;
            }
        }

        if (encontradoZero) {
            System.out.println("Foi encontrado pelo menos um número igual a zero.");
        } else {
            System.out.println("Nenhum dos números digitados é igual a zero.");
        }

        scanner.close();
    }
}


