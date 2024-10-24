
package array;

import java.util.Random;
import java.util.Scanner;
public class Array {

    // array as linear data structure
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        //array insersion using assignement method
        
        int array1[]= {1,2,3,4,5,6};
        
        //using another method
        int array2[] = new int[6];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[4] = 5;
        array2[5] = 6;
        
        //use for loop
        int array3[] = new int[6];
        for(int i=0; i<6; i++) {
            
            Random random = new Random();
            array3[i] = random.nextInt(10);
        }
        
        //or
        int[] array4 = new int[6];
        for(int i=0; i<6; i++) {
          System.out.println("ENTER "+i + " VALUE: ");
          int value = sc.nextInt();
           array4[i] = value;
        }
        
        //array update(using array2)
        array2[0] = 6;//this will upadte value at index 1
        
        //using fisrt array
        
        for(int i=0; i<array1.length; i++) {
            
           if(array1[i] == 3){
               array1[3] = 7;  
           }
        }
        
        //array deltion
        
        //using fisrt array
        
        for(int i=0; i<array1.length-1; i++) {
            
           if(array1[i] == 3){
               continue;
              
           }
        }
        
        // another method
        //using fisrt array
        for(int i=0; i<array1.length-1; i++) {
          
            if(array1[i] == 3){
              array1[i] = array1[i+1];
              
           }
            
        }
        
        //array searching
        //using first array
        
        int key = 3;
        
        for(int i=0; i<array1.length; i++){
        
            if(array1[i] == key){
                System.out.println("KEY FOUND");
            }
    }
        
        //transversing throught the array
        System.out.println("THIS ARE VALUES OF ARRAY1");
        for(int i=0; i< array1.length; i++) {
            System.out.print(array1[i]+ ",");
        }
        
        System.out.println();
        
        System.out.println("THIS ARE VALUES OF ARRAY2");
        for(int i=0; i< array1.length; i++) {
            System.out.print(array2[i]+ ",");
        }
        
         System.out.println();
        
        System.out.println("THIS ARE VALUES OF ARRAY3");
        for(int i=0; i< array1.length; i++) {
            System.out.print(array3[i]+ ",");
        }
        
         System.out.println();
        
        System.out.println("THIS ARE VALUES OF ARRAY4");
        for(int i=0; i< array1.length; i++) {
            System.out.print(array4[i]+ ",");
        }
        
       
       
    }
    
}
