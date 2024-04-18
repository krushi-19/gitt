public class PrimeFactors {
    public static void main(String[] args) {
      int number = 40; 
        System.out.println("Prime factors of " + number + " are:");
        for (int factor = 2; factor <= number; factor++) {
            while (number % factor == 0) {
                System.out.println(factor);
                number /= factor;
            }
        }
    }
}
