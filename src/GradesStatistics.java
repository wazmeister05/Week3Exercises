import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {


    private double totals;

    private GradesStatistics(){
    }

    public static void main(String[] args){
        GradesStatistics gs = new GradesStatistics();
        gs.run();
    }

    private void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numItems = scanner.nextInt();

        int[] students = new int[numItems];

        Scanner scanner1 = new Scanner(System.in);
        for (int i = 1; i < students.length+1; i++){
            System.out.print("Enter the grade for student " + i + ": ");
            //example data on question 50, 51, 56, 53.
            students[i-1] = scanner1.nextInt();
            totals += students[i-1];
        }

        System.out.println("The grades are: " + Arrays.toString(students));

        Arrays.sort(students); //required for below

        //String.format inspired my mkyong.com
        System.out.println("The average is: " + String.format("%.2f",totals/ numItems));
        System.out.println("The median is: " + String.format("%.2f",median(students)));
        System.out.println("The minimum is: " + students[0]);
        System.out.println("The maximum is: " + students[students.length-1]);
        System.out.println("The standard deviation is: " + String.format("%.2f",standardDeviation(students, totals)));  //2 decimal places. Using sample data should be 2.29...
        System.out.println("The population standard deviation is: " + String.format("%.2f",popStandardDeviation(students, totals)));  //2 decimal places. Using sample data should be 2.29...
    }

    private double median(int[] students){
        //doubles required as Math.floor and ceil require doubles
        double firstPlace = Math.floor((students.length - 1.0) / 2.0);
        //Math.floor rounds a decimal number down
        double secondPlace = Math.ceil((students.length - 1.0) / 2.0);
        //Math.ceil rounds a decimal number up
        if (firstPlace == secondPlace ) {    //if pos1 == pos2, the array had an odd number of cells, meaning there is one already there
            return students[(int)firstPlace];
        } else {    //in this case, the array had an even number of cells
            return (students[(int)firstPlace] + students[(int)secondPlace]) / 2.0 ;  //add the two elements and divide by 2 to get the number between them.
        }
    }

    //how to calculate this was pulled from https://www.wikihow.com/Calculate-Standard-Deviation. No code was used from there.
    private double standardDeviation(int[] students, double total){
        int sampleSize = students.length;
        double variance = 0;
        double mean = total/sampleSize;
        for (int student : students) {
            variance += Math.pow(student - mean, 2);
        }
        return Math.sqrt(variance/(sampleSize -1));
    }

    private double popStandardDeviation(int[] students, double total) {
        int sampleSize = students.length;
        double variance = 0;
        double mean = total/sampleSize;
        for (int student : students) {
            variance += Math.pow(student - mean, 2);
        }
        return Math.sqrt(variance/(sampleSize));
    }
}
