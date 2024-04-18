public class Lsearch{

static int search(int arr[], int key){

int n = arr.length;
for(int i=0;i<n;i++){

    if(arr[i] == key)

      return 1;

}
return -1;


}

public static void main(String[] args){
  
Lsearch l = new Lsearch();
int x = 2;
int arr[] = {10,2,4,5,6,7,8};
int result = search(arr,x);
if(result == -1)
  System.out.println("Not found !");
else
System.out.println("Found at index = " + result);


}

}