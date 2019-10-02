import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {


    private Scanner scanner, scanner1;
    private int numItems;
    private double totals;

    public GradesStatistics(){

    }

    public static void main(String[] args){
        GradesStatistics gs = new GradesStatistics();
        gs.run();
    }

    public void run(){
        scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numItems = scanner.nextInt();

        int[] students = new int[numItems];

        scanner1 = new Scanner(System.in);
        for (int i = 1; i < students.length+1; i++){
            System.out.print("Enter the grade for student " + i + ": ");
            students[i-1] = scanner1.nextInt();
            totals += students[i-1];
        }

        System.out.println("The grades are: " + Arrays.toString(students));

        Arrays.sort(students); //required for below

        //String.format inspired my mkyong.com
        System.out.println("The average is: " + String.format("%.2f",totals/numItems));
        System.out.println("The median is: ");      //2 decimal places
        System.out.println("The minimum is: " + students[0]);
        System.out.println("The maximum is: " + students[students.length-1]);
        System.out.println("The standard deviation is: ");  //2 decimal places
    }

}
