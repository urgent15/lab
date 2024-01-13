#include <stdio.h>
#include <math.h>
float f(float x, float y)
{
    float f;
    f = (x + y);
    return f;
}
main()
{
    int i,n;
    float x0, y0, xn, h, k,k1,k2,k3,k4;
    printf("\n Enter the value of x0,y0");
    scanf("%f%f", &x0, &y0);
    printf("\n Enter the value of xn");
    scanf("%f", &xn);
    printf("\n Enter the step size h");
    scanf("%f", &h);
    n=(xn-x0)/h;
    for(i=0;i<n;i++)
    {
        k1=h*f(x0,y0);
        k2=h*f(x0+h/2,y0+k1/2);
        k3=h*f(x0+h/2,y0+k2/2);
        k4=h*f(x0+h,y0+k3);
        k=(k1+2*k2+2*k3+k4)/6;
        y0=y0+k;
        x0=x0+h;
        printf("\n The value of y(%f)=%f", x0, y0);
    }
}





//Enter the value of x0,y00
//1

 //Enter the value of xn1.2

 //Enter the step size h0.2

 //The value of y(0.200000)=1.242800
 //The value of y(0.400000)=1.583636
 //The value of y(0.600000)=2.044213
 //The value of y(0.800000)=2.651042
 //The value of y(1.000000)=3.436502
 //The value of y(1.200000)=4.440144[1]
