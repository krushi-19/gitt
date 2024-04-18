class Bsearch{

static int search(int arr[], int l, int r,int key){

  if(r>=l){

       int mid = l+(r-1)/2;
       if(arr[mid] == key)
        return mid;
       if(arr[mid] > key)
           return search(arr,l,mid-1,key);
       else
         return search(arr,r,mid+1,key);




}
return -1;

}

public static void main(String[] args){

 int x = 11;
 int arr[] = {10,11,13,56,78,78,40};
  int n = arr.length;
 int result = search(arr,0,n-1,x);
 if(result == -1)
    System.out.println("Not found !");
		else
			System.out.println("Found at index = " + result);



}


}