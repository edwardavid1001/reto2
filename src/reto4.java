    public class reto4{
    public static void main(String[] args) {
        // Crear una matriz para el teclado
        String [][] teclado = {
      {"`", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=","     insert","inicio","re pag"},
      {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]", "         supr  ","fin",  " av pag"},
      {"caps", "a", "s", "d", "f", "g", "h", "j", "k", "l", ";"},
      {"shift", "z", "x", "c", "v", "b", "n", "m", ",", ".", "/", "shift","             ↑"},
      {"ctrl", "win", "alt", "space", "alt", "win", "menu", "ctrl","             ←-","  ↓","    -→"}
    };
          for (int i = 0; i < teclado.length; i++) {
            for (int j = 0; j < teclado[i].length; j++) {
                System.out.print(teclado[i][j] + " ");
            }
            System.out.println(); // Agregar un salto de línea después de cada fila
        }
    }
}