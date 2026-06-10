import java.util.Scanner;
public class Palindrome {
    public static void IsPalindrome(int num) {
        int rev=0;
        int digit=0;
        int Orinum=num;
        while (num!=0) {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(Orinum==rev){
            System.out.println(Orinum+" is a palindrome ");
        }else{
            System.out.println(Orinum+" is not palindrome ");
        }

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check palindrome or not ");
        int num=sc.nextInt();
        IsPalindrome(num);
        sc.close();

    }
    
}
