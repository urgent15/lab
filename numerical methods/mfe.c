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
    int n;
    float x0, y0, xn, h, x,x1, y1, y,y11,e;
    printf("\n Enter the value of x0,y0,xn,h,e:");
    scanf("%f%f%f%f%f", &x0, &y0, &xn, &h,&e);
    do {
        y1 = y0 + h * f(x0, y0);
        do{
            y11=y1;
            y1=y0+h*(f(x0,y0)+f(x0+h,y11))/2;

        }while(fabs(y1-y11)>e);
        x0 = x0 + h;
        y0 = y1;
        printf("\n The value of y(%f)=%f", x0, y0);
    } while (x0 <= xn);
}


 //Enter the value of x0,y0,xn,h,e:0
//1
//0.8
//0.1
//0.0001

 //The value of y(0.100000)=1.110525
 //The value of y(0.200000)=1.243210
 //The value of y(0.300000)=1.400389
 //The value of y(0.400000)=1.584638
 //The value of y(0.500000)=1.798809
 //The value of y(0.600000)=2.046050
 //The value of y(0.700000)=2.329842
 //The value of y(0.800000)=2.654033[1]
