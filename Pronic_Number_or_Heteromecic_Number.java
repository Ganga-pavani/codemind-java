import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
	{
	    int n,i,count=0;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
      for(i=0;i<=n;i++)
      {
        if(i*(i+1)==n)
        count++;
      }
if(count>0)
System.out.println("YES");
else
System.out.println("NO");
	}

}