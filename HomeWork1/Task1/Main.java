public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        double average = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random() * 10000 - 5000);
                if (array[i][j] > max)
                    max = array[i][j];
                if (array[i][j] < min)
                    min = array[i][j];
                average += array[i][j];
            }
        }
        average /= 25;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
        System.out.println("Average value: " + average);
    }
}
