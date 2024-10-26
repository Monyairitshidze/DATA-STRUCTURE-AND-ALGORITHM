
package selectionsort;

import java.util.Random;

public class SelectionSort {

    //represent sekection sort algorithm
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
        selectionSort(array,n);
       
        System.out.println();
        
        //print the final sorted array using for each loop
        System.out.println("FINAL SORTED ARRAY");
       
        for(int values: array) {
            
         System.out.print(values+ " ");
        }
         
    }
    
    public static void selectionSort(int array[],int n) {
       
        //control number of iteration
        for(int i=0; i<n;i++) {
            
            int minIndex = i;
            //inner for loop is used to compare and set values
            for(int j=i+1; j<n;j++){
               
              if(array[minIndex]>array[j]) {
                  minIndex = j;
              }
            }
            
            //swapping process is done on the outer loop
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            
            System.out.println("AFTER PASS "+ i);
            //use for each loop to print condition of array after each pass
             for(int values: array) {
                  System.out.print(values+ " ");
            }
             System.out.println();
           
        }
       
    }
    
}
