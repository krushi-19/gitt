class bsort{
    void bsort(int arr[]){
     
    int n = arr.length;
    boolean flag;
    
   for(int i=0; i<n;i++){
    flag=false;
          for(int j=0; j<n-1;j++)
      {
         if(arr[j] > arr[j+1])
        {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            flag=true;
       
                       }
             




}


}


}

 void ssort(int arr[]){
 int n = arr.length;
 for(int i=0; i<n-1;i++){

  int min =i;
  
  for(int j=i+1; j<n;j++) 
   if(arr[j] < arr[min])
  min = j;


   int temp = arr[min];
   arr[min]=arr[i];
   arr[i]=temp;
   
}



}

void isort(int arr[]){
  int n = arr.length;
  for(int i=1; i<n;i++){
   int temp = arr[i];
   int j = i-1;
  while(j >= 0 && arr[j] > temp){
    arr[j+1] = arr[j];
    j= j-1;


}
  arr[j+1] = temp;

}


}


   void display(int arr[]){
     int n = arr.length;
     for(int i = 0; i<n; i++){
       System.out.print(" "+arr[i]);

}
 System.out.println(); 



}

 public static void main(String[] args){
   bsort b = new bsort();
   int arr[] = {15,16,6,8,5};
   b.display(arr);
   b.bsort(arr);
   b.display(arr);
  System.out.println();
 b.bsort(arr);
   b.display(arr);
  System.out.println();
b.isort(arr);
		System.out.println();
		b.display(arr);




}






}
