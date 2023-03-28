import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        int n,digit,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        n=sc.nextInt();
        while(n>0)
        {
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("sum of digits:"+sum);
    }
}
