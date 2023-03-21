import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de competidores: ");
        int numCompetidores = sc.nextInt();

        String[] nombres = new String[numCompetidores];
        double[] tiempos = new double[numCompetidores];

        // Pedir los nombres y tiempos de cada competidor
        for (int i = 0; i < numCompetidores; i++) {
            System.out.print("Ingrese el nombre del competidor #" + (i+1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Ingrese el tiempo del competidor #" + (i+1) + " (segundos): ");
            tiempos[i] = sc.nextDouble();
        }

        // Mostrar los resultados
        System.out.println("\nResultados de la competencia:");
        for (int i = 0; i < numCompetidores; i++) {
            System.out.println(nombres[i] + ": " + tiempos[i] + " segundos");
        }

        // Determinar al ganador
        double menorTiempo = tiempos[0];
        int indiceGanador = 0;
        for (int i = 1; i < numCompetidores; i++) {
            if (tiempos[i] < menorTiempo) {
                menorTiempo = tiempos[i];
                indiceGanador = i;
            }
        }

        System.out.println("\nEl ganador es " + nombres[indiceGanador] + " con un tiempo de " + tiempos[indiceGanador] + " segundos.");
    }
}
