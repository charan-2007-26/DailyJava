// checking the number is even or odd by using Bitwise AND operator 
import java.util.Scanner;
public class BitAndEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Asking the user to enter a number to check even or odd
        System.out.println("Enter a number to check even or odd:");
        int num=sc.nextInt();//Taking the user input and storing it in num variable
        if((num&1)==0){
            /* here we find last Bit significat (LBS)
               num&1==1 binary form of 1=0001
               here lbs is 1 is odd
               here lbs is 0 is even
             */
            System.out.println("Even Number");

        }else{
            System.out.println("Odd Number");
        }
        sc.close();
    }
    
}
