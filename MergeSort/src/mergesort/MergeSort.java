
package mergesort;

import java.util.Random;

public class MergeSort {

    // representation of merge sort algorithm
    public static void main(String[] args) {
       
        //declare an array of size 10
        int[] array = new int[10];
        
        //assign the length of array to variable n
        int n = array.length;
        
        // use for loop  to enter ellements into the array using random class object
        for(int i=0; i<n; i++ ) {
            
            //create instance of random class
            Random random = new Random();
            array[i] = random.nextInt(10);
        }
        
        //use for each loop to print ellements of the array
        System.out.println("BEFORE SORTING");
        for(int values: array) {
            
            System.out.print(values + " ");
        }
        System.out.println();
        
        //call merge sort algorithm
        mergeSort(array,n);
       
        System.out.println();
        
        //print the final sorted array using for each loop
        System.out.println("FINAL SORTED ARRAY");
       
        for(int values: array) {
            
         System.out.print(values+ " ");
        }
         
    }
    
    public static void mergeSort(int array[],int n) {
        
       //outer for loop is used to controll number of iteration
        for(int i=0; i<n-1;i++) {
            
            //iiner loop is used for swapping
            for(int j=0; j<n-1;j++){
               
                //if condition is met we swap the adjacent numbers
                if(array[j]> array[j+1]) {
                    
                    // swapping process
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            
            
            System.out.println("AFTER PASS "+ i);
            //use for each loop to print condition of array after each pass
             for(int values: array) {
                  System.out.print(values+ " ");
            }
             System.out.println();
           
        }
       
    }
    
}
