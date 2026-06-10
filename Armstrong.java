//checking the number is armstrong or not
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //asking the user to enter a number to check is the number is armstrong or not
        System.out.println("enter a number to Armstrong or not :");
        int Number=sc.nextInt();//taking the user input
        IsArmStrong(Number);//calling the IsArmStrong method and passing the parameter value to check number is armstorng or not
        sc.close();
    }
    public static void IsArmStrong(int Number){
        int temp=Number;
        int digits=0;
        // counting the no of digits in the number to find power value of the individual digits
        if(temp<0){
            temp*=-1;
             while(temp>0){
            digits++;
            temp=temp/10;
        }
        }else if(temp==0){
            digits=1;
        }else{
        while(temp>0){
            digits++;
            temp=temp/10;
        }
    }
        int sd;
        int pv;
        int arm=0;
        int temp2=Number;
        // checking the number is Arnstrong or not
        while (Number>0) {
            sd=Number%10;
            pv=sd;
            for(int i=1;i<digits;i++){
                pv*=sd;
            }
           arm+=pv;
          Number=Number/10;  
        }
        if (temp2==arm) {// if it is armstorng number it will prints this
            System.out.println(temp2+" is an Armstrong Number ");
            
        }else{//if it is not armstrong number it will prints this
            System.out.println(temp2+" is not an Armstrong Number ");
        }
    }
    
}
