
package insertionsort;

import java.util.Random;

public class InsertionSort {

    //represent insersion sort algorithm
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
        
        //call insertion sort algorithm
        insertionSort(array,n);
       
        System.out.println();
        
        //print the final sorted array using for each loop
        System.out.println("FINAL SORTED ARRAY");
       
        for(int values: array) {
            
         System.out.print(values+ " ");
        }
         
    }
    
    public static void insertionSort(int array[],int n) {
       
        //control number of iteration
        for(int i=0; i<n;i++) {
            
            //this variable monitor the current value
            int key = array[i];
            //monitor previous values
            int j = i-1;
            
            //inner while loop is used to compare and swift values to their correct possition
            
            while(j>=0 && array[j]>key) {
                
              //  set the value of the next index with the value of previous index if condion is met
                array[j+1] = array[j];
                
                //decrement j so that we can compare previous ellemnt with current ellemnt
                j--; 
            }
            
            array[j+1] = key;
            
            System.out.println("AFTER PASS "+ i);
            //use for each loop to print condition of array after each pass
             for(int values: array) {
                  System.out.print(values+ " ");
            }
             System.out.println();
            
        }
  
    }
        
    }
    

