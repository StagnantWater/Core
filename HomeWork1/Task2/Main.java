public class Main {
    public static void main(String[] args) {
        int[] array = {5,6,3,2,5,1,4,9};

        for (int i = 0; i < array.length; i++) {
            for (int j = 1, tmp = 0; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
