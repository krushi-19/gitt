public class sum{

  static int sum(int n){
   if(n==1)
     return 1;

  else
   return n+ sum(n-1);
  
}


  



public static void main(String[] args){
  System.out.println(sum(5));

}
}




             /*  sum(5)
             /        \
       sum(4)         5
       /     \
 sum(3)      4
 /    \
2     3   */


