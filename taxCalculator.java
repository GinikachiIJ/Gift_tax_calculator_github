
import java.util.Scanner;

public class taxCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of gift?");
        
        int giftValue = Integer.valueOf(scan.nextLine());
        
        //Formula for GiftTax, based on giftValue entered
        double giftValueBandA = (100 + (giftValue - 5000)*0.08);
        double giftValueBandB = (1700 + (giftValue - 25000)*0.1);
        double giftValueBandC = (4700 + (giftValue - 55000)*0.12);
        double giftValueBandD = (22100 + (giftValue - 200000)*0.15);
        double giftValueBandE = (142100 + (giftValue - 1000000)* 0.17);
                
        if (giftValue <5000) {
            System.out.println("No tax! ");
        } else if (giftValue <= 25000) {
            System.out.println("Tax: " + giftValueBandA);
        } else if (giftValue <= 55000) {
            System.out.println("Tax: " + giftValueBandB);
        } else if (giftValue <= 200000) {
            System.out.println("Tax: " + giftValueBandC);
        } else if (giftValue <= 1000000) {
            System.out.println("Tax: " + giftValueBandD);
        } else if (giftValue >1000000) {
            System.out.println("Tax: " + giftValueBandE);
        
        }
       
    }
}
