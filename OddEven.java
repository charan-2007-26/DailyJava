//checking the number is even or odd by using modulos(%) operator
import java.util.Scanner;

public class OddEven {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // Asking the user to enter a number to check even or odd
    System.out.println("Enter a number to check Even or Odd:");
    // taking the user input and storing it in a variable num
    int num=sc.nextInt();
    if(num%2==0)
    {
        //if the number is divisible by 2 then it is an even number
        System.out.println(num+" is a Even number ");
    }else
        {
            //if the number is not divisible by 2 then it is an odd number
        System.out.println(num+" is a Odd number ");
    }
    sc.close();
 }   
}