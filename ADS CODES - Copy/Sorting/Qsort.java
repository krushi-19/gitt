class Qsort{

  static void quicksprt(int arr[], int low, int high){

    int pi= partition(arr,low,high);
    quicksort(arr,low,pi-1);
    quicksort(arr,pi+1;high);


}

static void partittion(int arr[], int low, int high){

int pivot = arr[high];
int i = (low-1);
for(int j=low;j<=high;j++){

  if(arr[j[ < pivot){
  i++;
  swap(arr,i,j);

}

}
swap(arr,i+1,high);
return i+1;

static int swap(int arr[], int i,int j){

 int temp =arr[i];
  arr[i] = arr[j];
  arr[j] = temp;


}


}

}