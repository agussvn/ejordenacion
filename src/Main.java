import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamaño del array: ");
        int tamaño = sc.nextInt();

        int[] array = new int[tamaño];
        Random r = new Random();
        for (int i = 0; i < tamaño; i++) {
            array[i] = r.nextInt(100);
        }

        System.out.println("Array original: " + Arrays.toString(array));

        System.out.print("¿Ordenar con 'insercion' o 'burbuja'? ");
        String metodo = sc.next();

        int[] ordenado;
        if (metodo.equalsIgnoreCase("insercion")) {
            ordenado = sin_main.insert(array);
        } else {
            ordenado = sin_main.burbuja(array);
        }

        System.out.println("Array ordenado: " + Arrays.toString(ordenado));
        sc.close();
    }
}
