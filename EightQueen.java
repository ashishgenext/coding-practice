
import java.io.* ;

class EightQueen{
	
	public static void main(String args[])throws IOException{
		int board[][] = new int [8][8];
		for(int i =0 ;i<8;i++){
			for(int j = 0;j<8;j++){
				board[i][j] = 0 ;
			}
		}


		placeQueen(board,8);
	}

	public static void placeQueen(int[][] board,int n){
		
		 if(placeQueenUtil(board,0,n)){
 		 for(int i =0;i<n;i++){
 		 	System.out.println("");	
 		 	for(int j =0 ;j<n;j++)
 		 	System.out.print(board[i][j]+"\t");		
 		 }
 		 
 		 }else{

 		 System.out.println("No Solution exist");
 		}

	}

	public static boolean placeQueenUtil(int [][] board,int start,int n){

		
		if(start>= n) return true;
		int j = 0 ;
		for(int i = 0; i < n ;i++){
			if(isSafe(board,start,i,n) ){
				board[start][i] = 1 ;
				if(placeQueenUtil(board,start+1,n)) return true ;
				board[start][i] = 0 ;

			}
		}

		return false;


			
	}

	public static boolean isSafe(int [][]board,int x ,int y ,int n){

		for(int i = 0 ; i<x;i++){
			if(board[i][y] == 1) return false ;
		}
		for(int i = x ,j = y ;i>=0 && j >=0 ; i--,j--){
			if(board[i][j] == 1) return false ;
		}
		for(int i = x , j = y ;i>=0 && j <n ; i--,j++){
			if(board[i][j] == 1) return false ;
		}

		return true ;

		}
	}
