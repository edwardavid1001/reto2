import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la cantidad de notas a evaluar
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int cantidadNotas = sc.nextInt();

        // Crear un array para almacenar las notas
        double[] notas = new double[cantidadNotas];

        // Pedir el valor de cada nota y almacenarla en el array
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese el valor de la nota #" + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // Calcular el promedio de notas
        double promedio = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            promedio += notas[i];
        }
        promedio /= cantidadNotas;

        // Mostrar el promedio de notas y la anotación correspondiente
        System.out.println("Promedio de notas: " + promedio);
        if (promedio < 3) {
            System.out.println("Reprobaste");
        } else if (promedio >= 3 && promedio < 4) {
            System.out.println("Pasaste Raspando");
        } else {
            System.out.println("Aprobaste con buenos resultados");
        }
    }
}
