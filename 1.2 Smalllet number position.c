#include<stdio.h>
int main(){
    int array[5]={};
    
    printf("Please enter 5 numbers:\n");
    for (int i = 0; i < 5; i++)
    {
        scanf("%d",&array[i]);
    }
    int sm=array[0];
    
    for (int i = 0; i < 5; i++)
    {
        if (sm>array[i])
        {
           sm=array[i];
        }
    }
    printf("The smallest number is %d\n",sm);

    return 0;
}