public class secondLargest {
    public static void main(String[] args){
        int array[]={1,2,3,4,5,6,};
        int largest = 0;
        int seclargest = 0;
        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                    largest = array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(largest>array[i]&&seclargest<=array[i]){
                seclargest=array[i];
            }
        } 
        System.out.println(seclargest);   
    }
}
