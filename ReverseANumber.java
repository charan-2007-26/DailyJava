import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number reverse ");
        int num=sc.nextInt();//taking the user input and storing it in num variable
        int rev=0;// rev is for storing the reversed number
        int del=0;// it is used to store the eleminating elements
        int ornum=num;// it is for storing original number
        while(num>0){
            del=num%10;/*
            here  example num =123
            del=123%10=3 like this 12%10=2 and 1%10=1*/
            rev=rev*10+del;/*
            here rev=rev*10+3 =3 like this 3*10+2=32 and 32*10+1=321 */
            num=num/10;// deleting the last element in the number
            /*
            num=123/10=12 and 12/10=1 and 1/10=0 */

        }
        System.out.println("Orginal number is "+ornum);
        System.out.println("Reversed number is "+rev);
    }
    
}
