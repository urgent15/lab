#include<stdio.h>
#include<math.h>
int main()
{
	float x[15],y[15],X,p=1,s,h,d;  
	int i,j,n;
	printf("\t\t Output\n");
	printf("\n Enter the number of points: ");
	scanf("%d",&n);
	printf("\n Enter the value of X at which y required ");
	scanf("%f",&X);
	printf("\n Enter the value of x & y:\n\n");
	printf("\n x \t\t y=f(x)\n");
	for(i=1;i<=n;i++)
	scanf("%f%f",& x[i],&y[i]);
	h=x[2]-x[1];
	printf("\n h= %f\n",h);
	s=(X-x[1])/h;
	d=y[1];
	printf("s=%f,\t d=%f",s,d);
	for(i=1;i<=n-1;i++)
	{
		for(j=1;j<=n-1;j++)
		{
			y[j]=y[j+1]-y[j];
			printf("\n%f\n",y[j]);
		}
		p=p*(s-i+1)/i;
		d=d+p*y[1];
	}
	printf("\n\n The result is: \n\n");
    printf("y(%1.2f)=%3.5f",X,d);
    return 0;
}
