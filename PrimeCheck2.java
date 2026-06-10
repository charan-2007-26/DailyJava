import java.util.Scanner;

public class PrimeCheck2 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter anumber to check prime or not ");
    int n=sc.nextInt();
    boolean prime=true;
    if(n<=1){
        prime=false;
    }else if (n%1==0 && n%n==0) {
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                prime =false;
                break;
            }
        }
        
    } else {
        System.out.println("Invalid Values");
        
    }
    if (prime) {
        System.out.println(n+" is a prime number");
        
    }else{
        System.out.println(n+" is not a prime number");
    }
    sc.close();
}    
    
}
