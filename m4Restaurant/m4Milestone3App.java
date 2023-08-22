import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class m4Milestone3App {

	public static void main(String[] args) {

		// En esta version se añaden excepciones personalizadas y algunas otras excepciones
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
			
			try {
				platos[i] = sc.next().toLowerCase();
				
			} catch (Exception e) {
				System.out.println("Valor incorrecto");
				i--;
				sc.next();
			}
	
			System.out.println("Introduce el precio del plato");
			
			try {
				precios[i] = sc.nextDouble();
				
			} catch (Exception e) {
				System.out.println("Valor incorrecto");
				i--;
				sc.next();
			}	
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
					throw new PlatoNoExistenteException("El plato '" + platoPedido + "' no existe en el menú.");
				}

			} catch (PlatoNoExistenteException e) {
				System.out.println(e.getMessage());
			}

			// Se controla la respuesta del usuario
			System.out.println("¿Le gustaría pedir mas? (1: Si - 0: No)");
			try {
				seguirPidiendo = sc.nextInt();

				if (seguirPidiendo != 0 && seguirPidiendo != 1) {
					throw new RespuestaNoValidaException("Respuesta no válida. Por favor, introduzca 0 o 1.");
				}

			} catch (RespuestaNoValidaException e) {
				System.out.println(e.getMessage());
				seguirPidiendo = 1;

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