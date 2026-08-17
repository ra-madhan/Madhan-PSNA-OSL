import java.util.*;

class HelloWorld
{
    public static void main(String[] args)
    {
        int a,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        a=sc.nextInt();
        if(a==0){
            System.out.println("The factorial of the number is:1");
        }
        else
        {
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of the number is:" + fact);
    }
    }
}
        
