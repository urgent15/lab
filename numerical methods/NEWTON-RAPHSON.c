//Find a root of the equation (x*x*x)-x-1=0 by Newton-Raphson method upto 3 decimal places
#include<stdio.h>
#include<math.h>
float f(float x)
{
    return((x*x*x)-x-1);
}
float df(float x)
{
    return((3*x*x)-1);
}
int main()
{
    float a,b,c,e;
    int k=0;
    printf("Enter the value of accuracy: ");
    scanf("%f",&e);
    do{
        printf("Enter the value of a and b: ");
        scanf("%f%f",&a,&b);
    }
    while(f(a)*f(b)>0);
    do{
        c=b-(f(b)/df(b));
        printf("\n k=%d \t a=%f \t b=%f \t c=%f \t f(c)=%f",k,a,b,c,f(c));
        if (f(a)*f(c)<0)
        b=c;
        else
        a=c;
        k=k+1;
    }
    while(fabs(f(c))>e);
    printf("\n The root of the equation is %f",c);
    printf("\n The number of iteration is %d",k);
    return 0;
}




//INPUT:
//Enter the value of accuracy: 0.0001
//Enter the value of a and b: 1
//2

//OUTPUT:
 //k=0     a=1.000000      b=2.000000      c=1.545455      f(c)=1.145755
 //k=1     a=1.000000      b=1.545455      c=1.359615      f(c)=0.153705
 //k=2     a=1.000000      b=1.359615      c=1.325801      f(c)=0.004625
 //k=3     a=1.000000      b=1.325801      c=1.324719      f(c)=0.000005
 //The root of the equation is 1.324719
 //The number of iteration is 4