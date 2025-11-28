public class bubbleSort {
    public static void main(String[] args) {
        bubbleSortAlgorithm();
    }

    public static void bubbleSortAlgorithm() {

        int array[] = {7, 12, 9, 11, 3};

        for (int i = 0; i < array.length - 1; i++) {
            
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}

