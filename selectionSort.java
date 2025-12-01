public class selectionSort {
    
    public static void main(String[] args) {

        selectionSortAlgorithm();
        
    }

    public static void selectionSortAlgorithm() {

        int array[] = {7, 12, 9, 11, 3};
        

        for(int i =0; i<array.length-1; i++){

             int minIndex = i;

           for(int j =i+1; j<array.length; j++){

               if (array[j]<array[minIndex]){

                 minIndex = j;
               }

           }

           int temp = array[i];
           array[i] = array[minIndex];
           array[minIndex] = temp;
            
        }

        for (int elem : array) {

            System.out.print(" "+elem);
            
        }
        
    }
}
