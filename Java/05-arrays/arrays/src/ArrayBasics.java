public class ArrayBasics {
    public static void main(String[] args) {
        // store a roll number (integer)
        int rollNo = 23;

        // store a name (string)
        String name = "deepak";

        // store 5 roll number

        int rollNo1 = 1;
        int rollNo2 = 2;
        int rollNo3 = 3;
        int rollNo4 = 4;
        int rollNo5 = 5;

        //syntax of an array

        // datatype[] variable_name = new datatype[size];

        // store 5 roll numbers

        int[] rollNumbers = new int[5];
        // or directly
        int[] rollNumber2 = {23, 34, 5, 2, 56, 4};

        int[] ros; // declaration of the array, ros is getting defined in the stack
        // by default it has null

        ros = new int[5]; // initialization: actually here object is being created in the memory (heap)
        System.out.println(ros[1]); // by default it has 0

        String[] arr = new String[4];
        System.out.println(arr[0]); // it will print null by default
    }
}
