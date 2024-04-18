public class Fibonacci{                                                                                                                                

 public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }


public static void main(String[] args){
  
int n = 5;
for(int i=0; i<=n;i++){
  System.out.println(fib(i) + " " );
}


}
}




/*
Dry run- 



                      fib(5)
                      /    \
           fib(4)          fib(3)
         /      \           /   \
fib(3)    fib(2)     fib(2)    fib(1)
    |         |      |            |
   2          1      1            1


*/