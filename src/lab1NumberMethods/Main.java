package lab1NumberMethods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N = 3;
        int counter = 0;
        int firstArray[] = new int[2 * N * N];
        int secondArray[][] = new int[N][N];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                secondArray[i][j] = firstArray[counter];
                counter += 2;
            }
        }

        System.out.println(Arrays.toString(firstArray));

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                System.out.print(secondArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
