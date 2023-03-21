import java.util.Scanner;

public class reto3 {
   public static void main(String[] args) {
      Scanner guardarx  = new Scanner(System.in);

      // Pedir la longitud del tablero
      System.out.print("Ingrese la longitud del tablero: ");
      int n = guardarx.nextInt();

      // Crear la matriz de Sudoku
      int[][] sudoku = new int[n][n];

      // Rellenar la matriz con valores aleatorios
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            sudoku[i][j] = (int) (Math.random() * n + 1);
         }
      }

      // Imprimir la matriz de Sudoku
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(sudoku[i][j] + " ");
         }
         System.out.println();
      }

      // Verificar que la suma de las filas y columnas sean la misma
      int sumaFila = 0;
      int sumaColumna = 0;
      boolean valid = true;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            sumaFila += sudoku[i][j];
            sumaColumna += sudoku[j][i];
         }
         if (sumaFila != sumaColumna) {
            valid = false;
            break;
         }
         sumaFila = 0;
         sumaColumna = 0;
      }

      if (valid) {
         System.out.println("El Sudoku es válido.");
      } else {
         System.out.println("El Sudoku es inválido.");
      }
   }
}
