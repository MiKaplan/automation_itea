package homework;

public class Homework6 {
    public static void main(String[] args) {
        int[][] array = MultipleArrays();

        MaxNumInArray(array);
    }

    static int[][] MultipleArrays() {
        int[][] firstArray = {{1, 2}, {3, 4}};
        int[][] secondArray = {{5, 6}, {7, 8}};
        int [][] resultArray = new int[2][2];

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray.length; j++) {
                resultArray[i][j] = firstArray[i][j] * secondArray[i][j];
            }
        }

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray.length; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }

        return resultArray;
    }
    static void MaxNumInArray(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max elem: " + max);
    }
}
