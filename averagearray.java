public class averagearray {
    public static void main(String[] args){
        double array[]={1.0,2.0,3.0,4.0,5.0};
        double sum = 0;
        double avg=0;
        int count =0;

        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
            count++;
        }
        avg=sum/count;
        System.out.println(avg);
    }
}
