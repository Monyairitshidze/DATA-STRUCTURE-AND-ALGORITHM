public class lowestValue {

    public static void main(String[] args) {

        Find_Small();
    }

    public static void Find_Small() {
        
        int array[] = {7,12,9,11,3};

        int small = array[0];


        for(int i =0; i < array.length ; i++){

            if(array[i] < small){


                small = array[i];


            }

        }

        System.out.println("Lowest Value is: " + small);

    }
    
}
