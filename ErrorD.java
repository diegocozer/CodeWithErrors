import java.util.*;

public class ErrorD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho do array: ");
        int N = input.nextInt();
        int[] array = new int[N];
        System.out.println("Preencha o array com números inteiros: ");
        for (int i = 0; i < N ; i++) {
            array[i] = input.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maior valor do array: " + max);

        Set<Integer> used = new HashSet<Integer>();
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] + array[j] == 10 && !used.contains(array[i]) && !used.contains(array[j])) {
                    System.out.println("Dupla encontrada: " + array[i] + " e " + array[j]);
                    used.add(array[i]);
                    used.add(array[j]);
                }
            }
        }
    }
}