import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        char[] chars = {'c', 'a', 'r', 'b', 'o', 'n'};
        Arrays.sort(chars);
        generatePermutations(chars, 0);
    }

    public static void generatePermutations(char[] chars, int index) {
        if (index == chars.length) {
            System.out.println(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, i, index);
            generatePermutations(chars, index + 1);
            swap(chars, i, index);
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
