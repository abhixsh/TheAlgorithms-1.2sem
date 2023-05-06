#include<stdio.h>
int main(){
int array[5]={};
int largest=0;
int second_largest=0;
printf("Please enter 5 numbers:\n");
for (int i = 0; i < 5; i++)
{
    scanf("%d",&array[i]);
}
largest=array[0];
second_largest=array[0];
for (int i = 0; i < 5; i++)
{
    if (array[i]>largest)
    {
        largest=array[i];
    }
}
for (int i = 0; i < 5; i++)
{
   if (second_largest<=array[i]&&largest>array[i])
   {
         second_largest=array[i];
   }
   
}

printf("The second largest number is %d\n",second_largest);


    return 0;
}