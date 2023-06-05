package EX2;

public class BMI {
    public static void main(String[] args){
        float Height = 1.45f;
        System.out.println("Your Height in Meter : " + Height);
        float Weight = 70f;
        System.out.println("Your Weight in Kilograms : " + Weight);

        float bmi = Weight / (Height*Height);

        System.out.println("Your BMI is : " + bmi);

    }
    
}
