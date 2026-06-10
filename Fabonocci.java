import java.util.Scanner;

public class Fabonocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to print fabonocci numbers between range ");
        int n=sc.nextInt();
        int n1=0,n2=1;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 0; i <=n; i++) {
            int temp=n2;
            n2=n1+temp;
            if (n2>=n) {
                break;
            }else{
            System.out.println(n2);
            n1=temp;
            }
        }
    }
    
}
