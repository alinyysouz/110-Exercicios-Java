package exerciciosjava;

public class Ex75 {

	public static void main(String[] args) {
		// 75) Fa�a um programa que exiba os primeiros 20 n�meros da sequ�ncia de Fibonacci.
	
		int a = 0;
        int b = 1;

        System.out.println("Os primeiros 20 n�meros da sequ�ncia de Fibonacci s�o:");

       
        for (int i = 1; i <= 20; i++) {
           
            System.out.print(a + " ");

          
            int proximo = a + b;

           
            a = b;
            b = proximo;
        }

        System.out.println();
	
	
	}

}
