
import java.io.* ;

class Min_swap{

	public static void main(String args[])throws IOException{

		int arr[] = {0, 3, 5, 6, 4, 1, 2};
		int pairs[] = {0, 3, 6, 1, 5, 4, 2};

		System.out.println("minswap : "+minswap(3,arr,pairs));
	}

	public static int minswap(int pair,int arr[],int pairs[]){

		int []trackIndex = new int[2*pair + 1] ;

		for(int i =0 ;i <=2*pair ;i++ ){
			trackIndex[arr[i]] = i ;
		}
		return minswapUtil(arr,pairs,trackIndex,1,2*pair);
	}

	public static int minswapUtil(int arr[],int pair[],int index [] ,int i,int n ){
		if (i > n) return 0;

		if(pair[arr[i]] == arr[i+1]){
			 return minswapUtil(arr,pair,index,i+2,n) ;
		}
		
		int one = arr[i+1] ;
		int oneIndex = i + 1 ;
		int two = arr[index[pair[arr[i]]]];
		int twoIndex = index[pair[arr[i]]] ;

		swap(arr,oneIndex,twoIndex);
		updateIndex(index,one,two,oneIndex,twoIndex);
		int a = minswapUtil(arr,pair,index,i+2,n);

		swap(arr,twoIndex,oneIndex);
		updateIndex(index,two,one,twoIndex,oneIndex);
		

		one = arr[i];
		oneIndex = i ;
		two = arr[index[pair[arr[i+1]]]];
		twoIndex = index[pair[arr[i+1]]] ;

		swap(arr,oneIndex,twoIndex);
		updateIndex(index,one,two,oneIndex,twoIndex);
		int b = minswapUtil(arr,pair,index,i+2,n);

		swap(arr,twoIndex,oneIndex);
		updateIndex(index,two,one,twoIndex,oneIndex);

		return 1+min(a,b);





	}

	static void updateIndex(int index[],int i ,int j,int ai,int aj){
		index[i] = ai;
		index[j] = aj ;
	}
	static void swap(int []arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp ;
	} 
	static int min (int a ,int b){
		if(a > b){
			return b ;
		}
		return a ;
	}
}