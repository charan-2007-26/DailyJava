//Checking the number is even or add by using division(/)and multiplication(*) operators
import java.util.Scanner;

public class MulDivEvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Asking the user to enter a number to check even or odd
        System.out.println("Enter a number to check the even or odd :");
        // taking the user input and storing it in a variable num
        int num=sc.nextInt();
        int div=num/2;//dividing num with 2 and storing it in div variable ex 5/2= 3
        int mul=div*2;//multiplying div with 2 and storing it in mul variable ex 3*2= 6
        /* num=7
           div=7/2  =3
           mul=3*2  =6
           if(mul==num) 6==7 false
           {
           Sop("even");
           }Else{
           Sop("odd");}
         */
        if (mul==num){
            System.out.println("Even");
            
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
    
}
