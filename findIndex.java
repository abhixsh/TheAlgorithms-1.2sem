import java.util.Scanner;

public class findIndex{
        public static void main(String[] args){
                int array[]={1,2,3,4,5};
                int count =0;
                System.out.println("what Elemnt you want to find? ");
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();

                for(int i=0;i<array.length;i++){
                    if(number==array[i]){
                        break;
                    }
                count ++;
                }
                System.out.println("index of a particular element: " + count );
            
        }
}