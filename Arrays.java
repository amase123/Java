import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int[] myArray = {1, 3, 5, 7, 9};
        int sum = 0;
        int[] anotherArray = new int[10];
        String[] gender = {"Female", "Male"};

        for (int i = 0; i < anotherArray.length; i++) {
            if(anotherArray[i] ==10){
                System.out.println("Found it");
                break;
            }
            System.out.println("Insert Item at: "+i);
            anotherArray[i] = input.nextInt();
        }


        for (int i = 0; i < anotherArray.length ;
        i++){
            System.out.println("Item at: " +i+ "is" + myArray[i]);
        }
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
            System.out.println(sum);
        }
    }
}