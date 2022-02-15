package Lab4;

import java.util.Scanner;

public class Lab4_qns1 {
    public static void main(String[] args){
        BMI person1 = new BMI();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        person1.setPounds(input.nextDouble());
        
        System.out.println("Enter height in inches: ");
        person1.setInchs(input.nextDouble());
        

        System.out.println("BMI is " + person1.CalculateBMI());
        System.out.println(person1.CheckHealth(person1.CalculateBMI()));

        input.close();

    }
    
}
