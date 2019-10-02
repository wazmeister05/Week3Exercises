import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

    private PrintArray(){
    }

    public static void main(String[] args){
        PrintArray pa = new PrintArray();
        pa.run();
    }

    private void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numItems = scanner.nextInt();

        Integer[] items = new Integer[numItems];

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < items.length; i++){
            items[i] = scanner1.nextInt();
        }

        System.out.println("The values are: " + Arrays.toString(items));
    }

}
