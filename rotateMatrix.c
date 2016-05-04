#include <Stdio.h>

main(){
	int arr[4][4] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16} ;
	int n = 3 ;
	int i,j,xA,yA,xB,yB,xC,yC ,xD,yD ,y,z;
	for(i = 0 ;i<=n;i++){
		for(j = 0 ;j <=n ;j++){
			printf("%d\t",arr[i][j]);
		}
		printf("\n");
	}
	//int xA = 0,xB = n,xC = n,xD =0,yA = 0,yB = 0,yC = n,yD = n ;
	
	for(i = 0 ; i < n ;i++){
		xA = i,yA = i ;xB = n-i ,yB = i ,xC = n-i ;yC = n-i ,xD = i,yD = n-i ;
		for(j=0;j<n;j++){
		/*	int temp = arr[xA][yA] ;
			arr[xA][yA] = arr[xB][yB] ;
			arr[xB][yB] = arr[xC][yC] ;
			arr[xC][yC] = arr[xD][yD] ;
			arr[xD][yD] = temp ;*/

			int temp = arr[xD][yD] ;
			arr[xD][yD] = arr[xC][yC] ;
			arr[xC][yC] = arr[xB][yB] ;
			arr[xB][yB] = arr[xA][yA] ;
			arr[xA][yA] = temp ;
			
			xA++,xC-- ,yB++,yD-- ; 
		}

		/*printf("\n");
		for(z = 0 ;z<=n;z++){
		for(y = 0 ;y <=n ;y++){
			printf("%d\t",arr[z][y]);
		}
		printf("\n");
	}*/

	}
	printf("\n");
	printf("\n");
	for(i = 0 ;i<=n;i++){
		for(j = 0 ;j <=n ;j++){
			printf("%d\t",arr[i][j]);
		}
		printf("\n");
	}
}