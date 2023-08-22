import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class m4Milestone2App {

	public static void main(String[] args) {

		// En esta version se avisara inmediatamente de que un plato no existe con una excepcion, ademas de haber otra para la
		// respuesta sobre si se continua pidiendo plato o no
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

		// Rellenamos los arrays y los convertimos a un diccionario
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

		// Creamos una lista con el pedido
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

			// Miramos que el plato exista antes de introducirlo al array
			try {
				if (menu.containsKey(platoPedido)) {
					pedido.add(platoPedido);

				} else {
					throw new Exception("El plato '" + platoPedido + "' no existe en el menú.");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			// Se controla la respuesta del usuario
			System.out.println("¿Le gustaría pedir mas? (1: Si - 0: No)");
			try {
				seguirPidiendo = sc.nextInt();

				if (seguirPidiendo != 0 && seguirPidiendo != 1) {
					throw new Exception("Respuesta no válida. Por favor, introduzca 0 o 1.");
				}

			} catch (Exception e) {
				System.out.println("Respuesta no válida. Por favor, introduzca 0 o 1.");
				sc.next();
				seguirPidiendo = 1;
			}		
		}

		// Se suma el precio de los platos pedidos
		for (String platoPedido : pedido) {
			precioTotal += menu.get(platoPedido);
		}

		System.out.println("Precio total del pedido: " + precioTotal + " €");

		sc.close();
	}
}