import java.util.Arrays;

public class Methods {

    public static void main(String[] args){
        testReverse();
    }

    //Question 1
    public static void reverse(int[] array){
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            reversedArray[i] = array[(array.length-1)-i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    public static void testReverse(){
        int[] test = new int[]{1,2,3,4,5};
        int[] test1 = new int[]{101,79,43,21,9,1};
        int[] test2 = new int[]{100,99,98,97,96};
        reverse(test);
        reverse(test1);
        reverse(test2);
    }

        //Question 2
        /*
        Write a boolean method called copyOf(), which takes an int Array and returns a copy of the given array.
        The method's signature is as follows:
        public static int[] copyOf(int[] array)
        Also write a test driver to test this method.
        Write another version for copyOf() which takes a second parameter to specify the length of the new array.
        You should truncate or pad with zero so that the new array has the required length.
        public static int[] copyOf(int[] array, int newLength)
        NOTES: This is similar to the built-in function Arrays.copyOf().
     */
    public static int[] copyOf(int[] array){
        return null;
    }

    public static int[] copyOfSpec(int[] array, int size){
        return null;
    }

        //Question 3
        /*
        Write a method called swap(), which takes two arrays of int and swap their contents if they have the same length.
        It shall return true if the contents are successfully swapped. The method's signature is as follows:
        public static boolean swap(int[] array1, int[] array2)
        Also write a test driver to test this method.
     */
    public static boolean swap(int[] array1, int[] array2){
        return true;
    }
}
