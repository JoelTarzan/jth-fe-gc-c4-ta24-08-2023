public class m2Milestone3App {

	public static void main(String[] args) {

		int seconds = 0;
		int minutes = 0;
		int hour = 0;

		// Bucle infinito
		while (true) {

			// Mostramos la hora formateando el texto, indicamos que deben de haber 2 digitos, y si no los hay, rellenara el hueco con un 0
			System.out.printf("%02d:%02d:%02d%n", hour, minutes, seconds);

			// Espera un segundo
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Actualizamos el tiempo
			seconds++;

			if (seconds == 60) {
				seconds = 0;
				minutes++;

				if (minutes == 60) {
					minutes = 0;
					hour++;

					if (hour == 24) {
						hour = 0;
					}
				}
			}

		}
	}
}