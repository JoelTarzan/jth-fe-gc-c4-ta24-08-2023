import javax.swing.JOptionPane;

public class m3Milestone2App {

	public static void main(String[] args) {
		
		// Creamos el array bidimensional
		double notas[][] = new double[5][3];
		
		// Rellenamos el array con las notas
		for (int fil = 0; fil < notas.length; fil++) {
			JOptionPane.showMessageDialog(null, "Introduce las notas del alumno " + (fil + 1));
			
			for (int col = 0; col < notas[0].length; col++) {
				notas[fil][col] = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota " + (col + 1) + "\nDel 0 al 10."));
			}
		}
		
		// Recorremos el array e indicamos si el alumno ha aprobado o no mediante la media aritmética
		int numAlumno = 1;
		
		for (double[] alumno : notas) {
			double media = calcularMedia(alumno);
			
			if (media >= 5 ) {
				JOptionPane.showMessageDialog(null, "La nota media del alumno " + numAlumno + " es: " + media + ". Y por lo tanto a aprobado.");
				
			} else {
				JOptionPane.showMessageDialog(null, "La nota media del alumno " + numAlumno + " es: " + media + ". Y por lo tanto a suspendido.");
			}
			numAlumno++;
		}
	}
	
	public static double calcularMedia(double[] notas) {
		double suma = 0;
		
		for (double nota : notas) {
			suma += nota;
		}
		
		return suma / notas.length;	
	}
}