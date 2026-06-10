public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Swaping a="+a+" b="+b);//printing the numbers before swapping
        a=a+b;// here a=10+20, a=30
        b=a-b;;//here b=30-20, b=10
        a=a-b;//here a=30-10, a=20
        System.out.println("After Swaping a="+a+" b="+b);//printing the numbers after swapping
    }
    
}
