
#include <Stdio.h>

main(){
	int n,m ;
	scanf("%d %d",&n,&m);

	int x = calculatePower(n,m);
	printf("%d\n",x );

}

int calculatePower(int n,int m){
	if(m == 0) return 1 ;
	if(m%2 == 0) return calculatePower(n,m/2)*calculatePower(n,m/2);
	if(m%2 == 1) return n*calculatePower(n,m/2) * calculatePower(n,m/2) ;

}