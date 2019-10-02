import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

    public Scanner scanner, scanner1;
    public int numItems;

    public PrintArray(){

    }

    public static void main(String[] args){
        PrintArray pa = new PrintArray();
        pa.run();
    }

    public void run(){
        scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        numItems = scanner.nextInt();

        Integer[] items = new Integer[numItems];

        scanner1 = new Scanner(System.in);
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < items.length; i++){
            items[i] = scanner1.nextInt();
        }

        System.out.println("The values are: " + Arrays.toString(items));
    }

}
