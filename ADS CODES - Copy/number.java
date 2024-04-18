import java.util.Scanner;

public class number{

 static void f(int i,int n){
 if( i > n){
   return;
}
  
  
    f(i+1,n);
 System.out.println("no values:"+i);



}



public static void main(String[] args){



Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
f(1,n);


}





}
