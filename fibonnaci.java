public class fibonnaci {

    public static void main(String[] args) {
        
      FindFibonacci(10);
    }
    

    public static void FindFibonacci(int a) {
        
        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 +" "); 
        System.out.print(num2 + " ");

        for(int i =2; i<a; i++){

            int result = num1 + num2;
            System.out.print(result + " ");

            num1 = num2;
            num2 = result;
        }
    }
}
