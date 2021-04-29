#include<stdio.h>
int bin_to_dec(int n)
{
    int power=1,rem,rev=0;
    while(n>0)
    {
        rem=n%10;
        rev=rev+rem*power;
        power=power*2;
        n/=10;
    }
    return rev;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}