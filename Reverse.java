public class Reverse {

    public static void main(String[] args){

        int array[]={1,2,3,4,5};
        int array2[] //= new int[array.length];
        int n = array.length;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                array2[j]=array[i-1];
            }
        }
        System.out.println(array);
        
    }

}
