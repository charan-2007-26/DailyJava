//Checking the given number is prime or not
import java.util.Scanner;

public class PrimeCheck {
    // creating a method to check the number is prime or not and storing the logic in checkPrime method 
     public static boolean checkPrime(int n)//passing the parameter value n 
     {
             boolean prime=true;//Asigning the default value true to boolean variable prime
                if (n<=1) { // checking the condition if the number is less than or equal to 1 then it is not a prime number
                            //prime number is not less than or equals to 1
                return false; // return false the given n value is not prime
        }else{ // if the given value is greater 1 we proceed check the another condition
        for (int i = 2; i < n;i++)  { 
            if(n%i==0){ //checking the condition is the any possibilities to get divisible with any number between 2 and n-1 if it is divisible then it is not a prime number
                return false;
                //if the codition get true then we break the loop and return false because the given n value is not prime
                }else{
                return true;
                }
            }
        }
        return prime;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //asking the user to enter a number to check it is prime or not
        System.out.println("Enter a number to check it is prime or not ");
        int n=sc.nextInt();//taking user input and storing it in n variable
        if (checkPrime(n)) {// if the condition will get true then it is a prime number
            System.out.println(n+" is a prime number");
            
        }else{//if the condition will get false then it is  not a prime number
            System.out.println(n+" is not a prime number");
        }
    
        sc.close();//closing the scanner resourse
            
        }
    }


