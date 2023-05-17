public class coppyArray {
    public static void main(){
        int array[]={1,2,3,4,5};
        int array2[]={}

        for(int i =0;i<array.length;i++){
            array2[i]=array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
