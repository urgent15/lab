#include <stdio.h>
#include <math.h>

float f(float x) 
{
    float f;
    f=(x+1/x);
    return (f);
}
main ()
{
    float a,b,h,trap;
    int n,i,k;
    printf("Enter the value of a,b,n\n");
    scanf("%f%f%d",&a,&b,&n);
    h=(b-a)/n;
    trap=(f(a)+f(b));
    for(k=1;k<n;k++)
    {
        trap=trap+2*f(a+k*h);
    }
    trap=trap*h/2;
    printf("The value of integral is %f\n",trap);
}
