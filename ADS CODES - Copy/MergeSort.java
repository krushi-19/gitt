class MergeSort{
	static void mergesort(int arr[],int l ,int r){
		if(l<r){							//for divide
			int mid = (l+(r-1)/2);
			mergesort(arr, l, mid);			//left part
			mergesort(arr, mid+1, r);		//right part
			merge(arr, l ,mid,r);			//l = lower bound
		}
	}
	static void merge(int arr [], int l, int mid,int r){
		int n1 = mid - l + 1;
		int n2 = r - mid;
		int Left[] = new int[n1];			//two lists n1 & n2
		int Right[] = new int[n2];
		for(int i = 0; i < n1; i++)			//11 22  33  44 
			Left[i] = arr[l+i];				//if i = 0 so here left is 11 
		for(int j = 0; j < n2; j++)
			Right[j] = arr[mid + 1 +j];		//& right is 22 
		int i = 0 ;
		int j = 0;
		int k = l;
		while(i < n1 && j < n2){
			if(Left[i] <= Right[j]){
				arr[k] = Left[i];
				i++;
			}
			else{
				arr[k] = Right[j];
				j++;
			}
			k++;
		}
		while(i < n1){
			arr[k] = Left[i];
			i++;
			k++;
		}
		while(j < n2){
			arr[k] = Right[j];
			j++;
			k++;
		}
	}
	void display(int arr[]){
		int n = arr.length;
		for(int i= 0; i < n ; i++){
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		MergeSort m1 = new MergeSort();
		int arr[] = {99,89,34,11,55,33,88,44,22};
		int n = arr.length;
		m1.display(arr);
		mergesort(arr, 0 , n-1);
		System.out.println();
		m1.display(arr);
	}
}
