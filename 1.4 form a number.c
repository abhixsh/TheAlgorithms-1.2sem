#include<stdio.h>
int main(){ 
int array[5]={};
printf("Please enter 5 numbers:\n");
for (int i = 0; i < 5; i++)
{
    scanf("%d",&array[i]);
}
for (int i = 0; i < 5; i++)
{
    printf("%d",array[i]);
}

    return 0;
}