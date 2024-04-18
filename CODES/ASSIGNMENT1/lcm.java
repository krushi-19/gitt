
public class lcm {
    public static void main(String[] args) {
       int num1=10;
     int num2=20;
        int lcm = lcm(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
    }

    public static int lcm(int num1, int num2) {
        int lcm = Math.max(num1, num2);
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                return lcm;
            }
            lcm++;
        }
    }
}
