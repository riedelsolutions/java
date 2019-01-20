public class Main {
    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] array) {   //104.1
        int smallest = array[0];

        for (int count = 0; count < array.length; count++) {
            if (smallest > array[count]) {
                smallest = array[count];
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {   //104.2  ((I changed this to incorporate an already-known index number as the starting point))
        int index = indexOfTheSmallest(array, 0);
        return index;
    }

    public static int indexOfTheSmallest(int[] array, int startingIndex) {
        int smallest = array[startingIndex];
        int index = startingIndex;

        for (int count = startingIndex; count < array.length; count++) {
            if (smallest > array[count]) {
                smallest = array[count];
                index = count;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int array[], int index) {   //104.3
        int smallest = array[index];
        int smallIndex = index;

        for (int count = index; count < array.length; count++) {
            if (smallest > array[count]) {
                smallest = array[count];
                smallIndex = count;
            }
        }

        return smallIndex;
    }

    public static void swap(int[] array, int index1, int index2) {   //104.4
        int firstNum = array[index1];
        int secondNum = array[index2];

        array[index1] = secondNum;
        array[index2] = firstNum;
    }

    public static void printArray(int[] array) {
        System.out.print("[");

        for (int count = 0; count < array.length; count++) {
            System.out.print("" +array[count]);

            if (count == array.length-1) {
                System.out.print("]");
            } else {
                System.out.print(", ");
            }
        }
    }

    public static void sort(int[] array) {   //104.5
        printArray(array);

        for (int count = 0; count < array.length; count++) {
            int index = indexOfTheSmallest(array, count);
            swap(array, count, index);

            printArray(array);
        }
    }

}