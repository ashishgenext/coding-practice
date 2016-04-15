
import java.io.* ;

class SumOfDifference{

public static void main(String []args)throws IOException{
int [] arr = {1,2,3} ;
int ans = 0 ;
for(int i = 0;i<32 ;i++){
int count = 0 ;
for(int j =0;j < arr.length ;j++){
if((arr[j] & (1 << i)) == 1) count++ ;
}
 ans = ans + (count*(arr.length-count)*2);
}

System.out.println("answer "+ans);

}

}