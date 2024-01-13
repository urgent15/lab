#include<math.h>
#include<stdio.h>
int main()
{
	int n,m,i,j,k;
	float a[20][20],x[20],s;
	printf("order of matrix A and number of iteration:");
	scanf("%d%d",&n,&m);
	printf("\n enter the elements of augmented:");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n+1;j++)
		{
			scanf("%f",&a[i][j]);
		}
		printf("\n");
		   }
	printf("enter the initial approximation \n\n");
	for(i=1;i<=n;i++)
	{
		scanf("%f",&x[i]);
		   } 
		   for(k=1;k<=m;k++)
		   {
		   	for(i=1;i<=n;i++)
		   	{
		   		s=a[i][n+1];
		   		for(j=1;j<=n;j++)
		   		{
		   			if(j!=i)
		   			s=s-a[i][j]*x[j];
				   }
				   x[i]=s/a[i][i];
				   printf("x[%d]=%6.4f\t",i,x[i]);
			   }
			   printf("\n");
				 }
				 printf("\n\n the solution is:\n");
				 for(i=1;i<=n;i++)
				 printf("\nx[%d]=%6.4f\n",i,x[i]);      
}