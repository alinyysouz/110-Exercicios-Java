package exerciciosjava;
import java.util.Scanner;

//104) Crie um programa que leia uma matriz 3x3 de números inteiros e verifique se ela é simétrica (igual à sua transposta).

public class Ex104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean simetrica = true;

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break; //
                }
            }
            if (!simetrica) {
                break; 
            }
        }

        System.out.println("\nMatriz 3x3 informada:");
        exibirMatriz(matriz);


        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }

        scanner.close();
	}
	
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}


