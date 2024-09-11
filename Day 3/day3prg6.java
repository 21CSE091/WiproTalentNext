public class day3prg6 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide exactly four integers as command line arguments.");
            return;
        }
        int[][] array = new int[2][2];
        int index = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = Integer.parseInt(args[index++]);
            }
        }
        System.out.println("The given array is:");
        printArray(array);
        System.out.println("The reverse of the array is:");
        printReverseArray(array);
        System.out.println("The biggest number in the array is: " + findMax(array));
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printReverseArray(int[][] array) {
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
