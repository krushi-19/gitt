public class Table {

                                                                                 
    public static void Table(int num, int multiplier) {
        if (multiplier <= 10) {
            System.out.println(num + " * " + multiplier + " = " + (num * multiplier));
            Table(num, multiplier + 1);                                                   
        }
    }

    public static void main(String[] args) {
        int n = 10;                                                 
        printMultiplicationTable(n, 1);                                  
    }
}
