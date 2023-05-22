public class intAscending {
    public static void main(String[] args){
        int array[] = {2,3,5,1,4};
        int temp;
        

        for(int i=0; i < array.length;i++){
            for(int j=i+1;j<array.length;j++){

                if(array[i] > array[j]){
                    temp = array[j];
                    array[j]=array[i];
                    array[i] = temp;
            }}
        }
        for(int i=0; i < array.length;i++){
                System.out.print(array[i] + " ");
        }
    }
    
}
