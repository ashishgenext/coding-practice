
import java.io.* ;
import java.lang.* ;


class TriangularNumbers{
	public static void main (String args [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test > 0){
			int num = Integer.parseInt(br.readLine());
		//	System.out.println("Result : "+triangular(num));

			test -- ;
		}
	}

	public static boolean triangular(int n) {
    
    double x = checkTriangular(n);
  //  System.out.println("triangular : "+ x);
    if(x==Math.ceil(x)){

        for(int i = 1 ;i < x-1 ; i++){
            int iSq =  getTriangular(i)* getTriangular(i) ;
            int jSq =  getTriangular(i+1)* getTriangular(i+1) ;

          //  System.out.println("values : iSq"+ iSq+" jSq "+jSq);
            if((iSq+jSq) == n){
                return true ;
            }
            
        }
    }
    return false ; 
    
    
}

public static int getTriangular(int x){
    x = (x * (x+1)) /2 ;
    return x ;
}

public static double checkTriangular(int x){
    double a = Math.sqrt(1.0 + (8.0 * x )) ;
  //  System.out.println("checkTriangular : "+a );
    a = a - 1.0 ;
    a= a /2.0 ;
    return a ;       
}

	
}