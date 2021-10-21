package testejava;

public class BuscaBinaria {
    public int busca(int[] array, int chave) {
        int i = -1;
        int a = 0;
        int b = array.length;

        while (a <= b) {
            int meio = (a + b) / 2;
            if (array[meio] < chave) {
                a = meio + 1;
            } else if (array[meio] > chave) {
                b = meio - 1;
            } else if (array[meio] == chave) {
                i = meio;
                break;
            }
        }
        return i;
    }
}
