import java.util.Arrays;

public class Methods {

    private static int[] test = new int[]{1,2,3,4,5};
    private static int[] test1 = new int[]{101,79,43,21,9,1};
    private static int[] test2 = new int[]{100,99,98,97,96};

    public static void main(String[] args){
        System.out.println("Reversed");
        testReverse();
        System.out.println("\nCopied");
        testCopyOf();
        System.out.println("\nCopied with length specified");
        testCopyOfSpec();
        System.out.println("\nSwap");
        testSwap();
    }


    //Question 1
    private static void reverse(int[] array){
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            reversedArray[i] = array[(array.length-1)-i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    private static void testReverse(){
        reverse(test);
        reverse(test1);
        reverse(test2);
    }


    //Question 2
    private static int[] copyOf(int[] array){
        int[] copy = Arrays.copyOf(array, array.length);
        return copy;
    }

    private static void testCopyOf(){
        System.out.println(Arrays.toString(copyOf(test)));
        System.out.println(Arrays.toString(copyOf(test1)));
        System.out.println(Arrays.toString(copyOf(test2)));
    }

    private static int[] copyOfSpec(int[] array, int newLength){
        int[] copy = Arrays.copyOf(array, newLength);
        return copy;
    }

    private static void testCopyOfSpec() {
        System.out.println(Arrays.toString(copyOfSpec(test,2)));
        System.out.println(Arrays.toString(copyOfSpec(test1,10)));
        System.out.println(Arrays.toString(copyOfSpec(test2,5)));
    }


    //Question 3
        /*
        Write a method called swap(), which takes two arrays of int and swap their contents if they have the same length.
        It shall return true if the contents are successfully swapped. The method's signature is as follows:
        public static boolean swap(int[] array1, int[] array2)
        Also write a test driver to test this method.
     */
    private static boolean swap(int[] array1, int[] array2){
        if(array1.length == array2.length) {
            int[] copy = copyOf(array1);
            array1 = array2;
            array2 = copy;
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            return true;
        }
        return false;
    }

    private static void testSwap(){
        System.out.println(swap(test, test2));
        System.out.println();
        System.out.println(swap(test1, test2));
        //test = {1,2,3,4,5}
        //test1 = {101,79,43,21,9,1}
        //test2 = {100,99,98,97,96}
    }
}
