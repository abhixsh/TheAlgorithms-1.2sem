#include <stdio.h>

int main(){

    int array[10] = {1,2,3,4,5,6,7,8,9,10};
    printf("Enter Value what You want to insert: ");
    int value;
    scanf("%d",&value);
    printf("Enter Position where You want to insert: ");
    int position;
    scanf("%d",&position);
    array[position-1] = value;
    printf("After Insertion: ");
    for(int i=0;i<10;i++){
        printf("%d ",array[i]);
    }
    


    return 0;
}