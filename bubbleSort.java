public class bubbleSort {
    public static void main(String[] args) {

        bubbleSortAlgorithm();
        
    }

    public static void bubbleSortAlgorithm() {

        int array[] = {7,12,9,11,3};

        int small = array[0];

        for(int i =0; i<array.length; i++){

            if(array[i] < small){

                small = array[i];
            }

            System.out.println("The small is : "+ small);

        }

        System.out.println("The smallest value is :" + small);
        
        
    }
}
