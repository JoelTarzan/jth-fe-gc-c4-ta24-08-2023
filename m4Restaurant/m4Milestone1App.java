import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class m4Milestone1App {

	public static void main(String[] args) {

		// FASE 1 - Creamos los billetes y los arrays del menu y precios
		Scanner sc = new Scanner(System.in);
		
		int billete5 = 5;
		int billete10 = 10;
		int billete20 = 20;
		int billete50 = 50;
		int billete100 = 100;
		int billete200 = 200;
		int billete500 = 500;

		int precioTotal = 0;

		String platos[] = new String[2];
		double precios[] = new double[platos.length];

		// FASE 2 - Rellenamos los arrays y lo convertimos a un diccionario, mostramos los platos y guardamos lo que elija el usuario
		for (int i = 0; i < platos.length; i++) {
			System.out.println("Introduce el plato número " + (i + 1));
			platos[i] = sc.next().toLowerCase();

			System.out.println("Introduce el precio del plato");
			precios[i] = sc.nextDouble();
		}

		Hashtable<String, Double> menu = new Hashtable<String, Double>();
		for (int i = 0; i < platos.length; i++) {
			menu.put(platos[i], precios[i]);
		}

		ArrayList<String> pedido = new ArrayList<>();
		int seguirPidiendo = 1;

		while (seguirPidiendo == 1) {

			// Mostramos el menu al preguntar
			StringBuilder menuString = new StringBuilder();

			for (String plato : menu.keySet()) {
				menuString.append(plato + " --- " + menu.get(plato) + " €" + "\n");
			}

			System.out.println("\nMenu: \n" + menuString.toString() + "\n\nIntroduce el nombre del producto:");
			String platoPedido = sc.next().toLowerCase();
			pedido.add(platoPedido);

			System.out.println("¿Le gustaría pedir mas? (1: Si - 0: No)");
			seguirPidiendo = sc.nextInt();
		}

		// FASE 3 - Miramos que los platos existan y si es asi, se suma al precio, si no, se avisa de que el plato no existe
		for (String platoPedido : pedido) {
			
			if (menu.containsKey(platoPedido)) {
				precioTotal += menu.get(platoPedido);
				
			} else {
				System.out.println("El plato '" + platoPedido + "' no existe en el menú.");
			}
		}
		
		System.out.println("Precio total del pedido: " + precioTotal + " €");
		
		sc.close();
	}
}