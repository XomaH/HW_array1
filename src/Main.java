import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

// Задание 1
        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = new double[]{1.57, 7.654, 9.986};
        int[] thirdArray = new int[]{11, 12, 12, 12, 23};

        // Задание 2

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);

            if (i != firstArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);

            if (i != secondArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);

            if (i != thirdArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();


        //Задание 3

        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.print(firstArray[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(secondArray[i]);

            if (i != secondArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.print(thirdArray[i]);

            if (i != thirdArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // Задание 4
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i]++;
            }
        }

        System.out.println(Arrays.toString(firstArray));
    }
}
