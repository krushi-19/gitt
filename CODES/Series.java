public class Series {


    static void printNumbers(int n) {
        if (n <= 0) {
            return;                     //stop recursion if n is not positive
        }
        printNumbers(n - 1);            // Recursive call to print numbers from 1 to n-1
        System.out.println(n);        // Print the current number after the recursive call
    }

    public static void main(String[] args) {
        int n = 5;                   
        printNumbers(n);               
    }
}
