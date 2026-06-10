import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the sum of digits ");
        int num=sc.nextInt();//taking the user input
        int sum=0;//it is for storing the sum
        int temp=num;//storing the num value in temp to accessess the original num
        while (num!=0) {
            int digits=num%10;//seperating the individual digits from the number to find sum
            sum+=digits;// calculating the sum of digits of the number
            num=num/10;//deleting the last digit from the number
        }
        // printing the sum of the digits of the number
        System.out.println("sum of the digits of "+temp+" is "+sum);
        sc.close();//closing the scanner resources
    }
    
}
