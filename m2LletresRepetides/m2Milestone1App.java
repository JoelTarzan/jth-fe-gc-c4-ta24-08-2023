import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class m2Milestone1App {

	public static void main(String[] args) {

		// FASE 1 - Creamos un array de Char y mostramos cada letra
		char chars[] = {'J', 'O', 'E', 'L',};
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		System.out.println("---------------------------");

		// FASE 2 - Creamos un ArrayList de chars e indicamos las vocales, consonantes y si hay un numero
		ArrayList<Character> name = new ArrayList<Character>();
		name.add('J');
		name.add('O');
		name.add('3');
		name.add('L');

		for (Character character : name) {
			if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
				System.out.println("VOCAL");

			} else if (Character.isDigit(character)) {
				System.out.println("Els noms de persones no contenen números!");

			} else {
				System.out.println("CONSONANTE");
			}
		}
		System.out.println("---------------------------");

		// FASE 3 - Creamos un HashMap para almacenar las letras y las veces que se repite cada una
		ArrayList<Character> charsRepeated = new ArrayList<Character>();
		charsRepeated.add('J');
		charsRepeated.add('O');
		charsRepeated.add('O');
		charsRepeated.add('E');
		charsRepeated.add('E');
		charsRepeated.add('L');
		charsRepeated.add('L');
		charsRepeated.add('L');
		charsRepeated.add('L');
		charsRepeated.add('E');

		Map<Character, Integer> charCounter = new HashMap<Character, Integer>();

		for (Character character : charsRepeated) {
			boolean characterExists = false;

			// Miramos si hay alguna letra ya en el Map, y si es asi, modificamos el booleano que lo controla
			for (Character key : charCounter.keySet()) {
				if (character == key) {
					characterExists = true;
				}
			}

			// Si no se ha repetido, se añade al Map, y si no, se suma una unidad
			if (!characterExists) {
				charCounter.put(character, 1);
			} else {
				charCounter.put(character, (charCounter.get(character) + 1));
			}
		}

		for (Character key : charCounter.keySet()) {
			System.out.println("Letra: " + key + " value: " + charCounter.get(key));
		}
		System.out.println("---------------------------");

		// FASE 4 - Creamos una lista con el apellido y lo fusionamos al nombre, dejando un espacio
		ArrayList<Character> lastname = new ArrayList<Character>();
		lastname.add('T');
		lastname.add('A');
		lastname.add('R');
		lastname.add('Z');
		lastname.add('A');
		lastname.add('N');

		ArrayList<Character> fullName = new ArrayList<Character>();
		for (Character key : name) {
			fullName.add(key);
		}

		fullName.add(' ');

		for (Character key : lastname) {
			fullName.add(key);
		}

		for (Character character : fullName) {
			System.out.print(character);
		}
	}
}