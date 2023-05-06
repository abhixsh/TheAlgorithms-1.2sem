#include<stdio.h>
int main(){
int array[5]={};
int sum=0;
int count=0;
float mean=0;
printf("Please enter 5 numbers:\n");
for (int i = 0; i < 5; i++)
{
    scanf("%d",&array[i]);
}
for (int i = 0; i < 5; i++)
{
    sum=sum+array[i];
    count++;
}
mean=sum/count;
printf("The mean of the numbers is %.2f\n",mean);


    return 0;
}