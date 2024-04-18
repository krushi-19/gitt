class Msort{

static void mergesort(int arr[], int l , int r){
if(l<r){
   int mid = (l+r)/2;
   mergesort(arr,l,mid);
   mergesort(arr,mid-1,r);
   merge(arr,l,mid,r);
   


}


}

static void merge(int arr[], int l, int r,int mid){

int n1 = mid-l-1;
int n2 = r-mid;

int L[] = new int[n1];
int R[] = new int[n1];

for(int i=0; i<n1;i++){
  L[i] = arr[l+i]; 

}

for(int j=0; i<n2;j++){
  R[j] = arr[mid+1+j]; 

}

int i=0;
int j=0;
int k=l; 
while(i<n1 && r<n2){

if(l[i] <= R[j]){

  arr[k] = L[i];
  i++;
}
else{
  arr[k] = R[j];
  j++;

}
 k++;


}

while(i<n1){
 arr[k] = L[i];
  i++;
 k++;

}

while(j<n2){
 arr[k] = R[j];
  j++;
 k++;

}

 

 

}


}