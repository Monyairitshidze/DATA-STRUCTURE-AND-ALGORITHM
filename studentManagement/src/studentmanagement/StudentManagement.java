
package studentmanagement;

import java.util.*;
public class StudentManagement {
    

    public static void main(String[] args) {
       
        //create object of student class so that we can access methods and attributes
        student student = new student();
        
        
        //display opton for user to select
        System.out.println("SELECT OPTION TO DO");
        System.out.println("1. ADD STUDENT");
        System.out.println("2. VIEW STUDENTS");
        System.out.println("3. EDIT STUDENTS");
        System.out.println("4. SEARCH STUDENTS");
        System.out.println("5. DELETE STUDENTS");
        System.out.println("6. EXIT");
        
        Scanner sc = new Scanner(System.in);
        
        //accepting users choice
        System.out.println("ENTER YOUR CHOICE: ");
        int choice0 = sc.nextInt();
        
        //use conditional statements to check users choice
          if(choice0==1)  {
            
            System.out.println("Enter your name:");
            String name = sc.next();
            
            System.out.println("Enter your age:");
            Integer age = sc.nextInt();
            
            int id = 0;
            
            //use for loop ro generate student id
            for(int i=0; i<6; i++) {
                    Random random = new Random();
                    id = random.nextInt(1000000);
                }
            
            //call the method of student class
            student.addStudent(id, name, age);
            
          }
          
            // declare variable choice which monitors the response of the user
          String choice1 ="yes";
        
        System.out.println("DO YOU WANT TO CONTINUE ADDING STUDENTS??");
        System.out.println("ENTER YES / NO");
        choice1 = sc.next().toLowerCase();
        
        if(choice1.equals("yes")) {
            
            System.out.println("Enter your name:");
           String name = sc.next();
            
            System.out.println("Enter your age:");
           int age = sc.nextInt();
            
           int id = 0;
            
            //use for loop ro generate student id
            for(int i=0; i<6; i++) {
                    Random random = new Random();
                    id = random.nextInt(1000000);
                }
            
            //call the method of student class
            student.addStudent(id, name, age);
            
            System.out.println("DO YOU STILL WANT TO CONTINUE ADDING STUDENTS??");
            System.out.println("ENTER YES / NO");
            choice1 = sc.next().toLowerCase();
            
            while(choice1.equals("yes")) {
                 
            System.out.println("Enter your name:");
           name = sc.next();
            
            System.out.println("Enter your age:");
           age = sc.nextInt();
            
            id = 0;
            
            //use for loop ro generate student id
            for(int i=0; i<6; i++) {
                    Random random = new Random();
                    id = random.nextInt(1000000);
                }
            
            //call the method of student class
            student.addStudent(id, name, age);
            
                
            }
            
          if(choice1.equals("no")) {
                
        //display opton for user to select
        System.out.println("SELECT OPTION TO DO");
        System.out.println("1. ADD STUDENT");
        System.out.println("2. VIEW STUDENTS");
        System.out.println("3. EDIT STUDENTS");
        System.out.println("4. SEARCH STUDENTS");
        System.out.println("5. DELETE STUDENTS");
        System.out.println("6. EXIT");
        
        //accepting users choice
        System.out.println("ENTER YOUR CHOICE: ");
        choice0 = sc.nextInt();
        
         if(choice0 == 2) {
          
             student.viewStudent();
             
              }
         
         else if(choice0 == 3){
             
             student.editStudent();
             
             }
             }
          }
        } 
    }
