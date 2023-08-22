import java.util.Arrays;
import java.util.Scanner;

public class m3Milestone1App {

	public static void main(String[] args) {

		// FASE 1 - Guardamos 6 ciudades en variables
		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el nombre de 6 ciudades");
		ciutat1 = sc.nextLine();
		ciutat2 = sc.nextLine();
		ciutat3 = sc.nextLine();
		ciutat4 = sc.nextLine();
		ciutat5 = sc.nextLine();
		ciutat6 = sc.nextLine();

		System.out.println("Ciudad: " + ciutat1);
		System.out.println("Ciudad: " + ciutat2);
		System.out.println("Ciudad: " + ciutat3);
		System.out.println("Ciudad: " + ciutat4);
		System.out.println("Ciudad: " + ciutat5);
		System.out.println("Ciudad: " + ciutat6);

		System.out.println("--------------------------------");

		// FASE 2 - Pasar la informacion a un array y ordenarlo
		String arrayCiutats[] = {ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6};
		Arrays.sort(arrayCiutats);

		for (String c : arrayCiutats) {
			System.out.println(c);
		}

		System.out.println("--------------------------------");

		// FASE 3 - Cambiar las vocales 'a' por el numero 4 y guardarlo en otro array
		String arrayCiutatsModificades[] = new String[arrayCiutats.length];

		for (int i = 0; i < arrayCiutats.length; i++) {
			arrayCiutatsModificades[i] = arrayCiutats[i].replaceAll("a", "4").replaceAll("A", "4");
		}

		Arrays.sort(arrayCiutatsModificades);

		for (String c : arrayCiutatsModificades) {
			System.out.println(c);
		}

		System.out.println("--------------------------------");

		// FASE 4 - Crear un array por cada ciudad y rellenarlo con las letras de la ciudad
		// Se que hay maneras mucho mas optimas para hacer esto, pero me daba la sensacion que el ejercicio 
		// te pide hacerlo así paso por paso y sin usar funciones a parte
		char arrayCiutat1[] = new char[ciutat1.length()];
		char arrayCiutat2[] = new char[ciutat2.length()];
		char arrayCiutat3[] = new char[ciutat3.length()];
		char arrayCiutat4[] = new char[ciutat4.length()];
		char arrayCiutat5[] = new char[ciutat5.length()];
		char arrayCiutat6[] = new char[ciutat6.length()];

		for (int i = 0; i < arrayCiutat1.length; i++) {
			arrayCiutat1[i] = ciutat1.charAt(i);
		}
		for (int i = 0; i < arrayCiutat2.length; i++) {
			arrayCiutat2[i] = ciutat2.charAt(i);
		}
		for (int i = 0; i < arrayCiutat3.length; i++) {
			arrayCiutat3[i] = ciutat3.charAt(i);
		}
		for (int i = 0; i < arrayCiutat4.length; i++) {
			arrayCiutat4[i] = ciutat4.charAt(i);
		}
		for (int i = 0; i < arrayCiutat5.length; i++) {
			arrayCiutat5[i] = ciutat5.charAt(i);
		}
		for (int i = 0; i < arrayCiutat6.length; i++) {
			arrayCiutat6[i] = ciutat6.charAt(i);
		}

		for (int i = (arrayCiutat1.length - 1); i >= 0; i--) {
			System.out.print(arrayCiutat1[i]);
		}
		System.out.println();
		for (int i = (arrayCiutat2.length - 1); i >= 0; i--) {
			System.out.print(arrayCiutat2[i]);
		}
		System.out.println();
		for (int i = (arrayCiutat3.length - 1); i >= 0; i--) {
			System.out.print(arrayCiutat3[i]);
		}
		System.out.println();
		for (int i = (arrayCiutat4.length - 1); i >= 0; i--) {
			System.out.print(arrayCiutat4[i]);
		}
		System.out.println();
		for (int i = (arrayCiutat5.length - 1); i >= 0; i--) {
			System.out.print(arrayCiutat5[i]);
		}
		System.out.println();
		for (int i = (arrayCiutat6.length - 1); i >= 0; i--) {
			System.out.print(arrayCiutat6[i]);
		}
		System.out.println();
		
		sc.close();
	}
}