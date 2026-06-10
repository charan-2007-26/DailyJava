import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to count no of digits :");
        int number=sc.nextInt();
        CountDigit(number);
       sc.close();
    }
    public static void CountDigit(int number){
         int count=0;
        if( number==0) {
            count++;
        }else  {   
        while(number!=0){
            count++;
            number=number/10;
        }
        }
        System.out.println(count+" Digits");
    }
    }
    
    