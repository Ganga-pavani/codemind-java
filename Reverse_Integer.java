import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
	{
	    int n,sum=0,r;
	    Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
    while(n!=0)
    {
        r=n%10;
        sum=sum*10+r;
        n=n/10;
    }
    System.out.println(sum);
	}
	

}