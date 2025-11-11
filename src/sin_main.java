public class sin_main {

    public static int[] insert(int[] array) {
        int[] ordenado = array.clone();
        for (int i = 1; i < ordenado.length; i++) {
            int actual = ordenado[i];
            int j = i - 1;
            while (j >= 0 && ordenado[j] > actual) {
                ordenado[j + 1] = ordenado[j];
                j--;
            }
            ordenado[j + 1] = actual;
        }
        return ordenado;
    }

    public static int[] burbuja(int[] array) {
        int[] ordenado = array.clone();
        int n = ordenado.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ordenado[j] > ordenado[j + 1]) {
                    int temp = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = temp;
                }
            }
        }
        return ordenado;
    }
}
