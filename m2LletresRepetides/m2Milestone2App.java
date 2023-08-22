import java.util.Scanner;

public class m2Milestone2App {

	public static void main(String[] args) {

		// ESCALERA DE NUMEROS
		// Preguntamos la longitud
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la longitud de la escalera:");
		int length = sc.nextInt();

		// Controlamos que hayan las mismas lineas que longitud
		for (int line = 0; line <= length; line++) {

			// En cada linea habrán los numeros correspondientes
			for (int num = 1; num <= line; num++) {
				System.out.print(num);
			}

			System.out.println();	
		}

		System.out.println("--------------------");

		// PIRAMIDE INVERSA
		// Preguntamos la longitud
		System.out.println("Introduce la longitud de la piramide:");
		int length2 = sc.nextInt();

		// Controlamos los espacios en blanco, en cada linea habrá uno mas que en la anterior
		int spaces = 0;

		// Empezamos con la linea con mas asteriscos y vamos bajando
		for (int line = length2; line > 0; line--) {

			// En cada linea habrán el doble de asteriscos a esa linea, menos una unidad para que sea un numero impar y acabe con un solo asterisco
			int asterisks = 2 * line - 1;

			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < asterisks; j++) {
				System.out.print("*");
			}

			spaces++;
			System.out.println();
		}

		sc.close();
	}
}