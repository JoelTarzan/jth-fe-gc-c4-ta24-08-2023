import java.util.Scanner;

public class m3Milestone3App {

	public static void main(String[] args) {

		// Pedimos el numero
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        
        // Generamos la secuencia llamando a la función
        generarSecuenciaFibonacci(num);

        sc.close();
	}

	public static void generarSecuenciaFibonacci(int num) {
		int num1 = 0;
		int num2 = 1;

		System.out.println("Secuencia de Fibonacci hasta " + num + ":");
		while (num1 <= num) {
			System.out.print(num1 + " ");
			int temp = num1;
			num1 = num2;
			num2 = temp + num2;
		}
	}
}