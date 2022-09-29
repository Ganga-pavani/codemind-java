import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
	{
	    int x,y,lcm;
	    Scanner sc=new Scanner(System.in);
	    x=sc.nextInt();
	    y=sc.nextInt();
	    lcm=(x>y)?x:y;
    while(lcm>0)
    {
        if(lcm%x==0&&lcm%y==0)
        {
            System.out.println(lcm);
            break;
        }
        ++lcm;
    }
	    
	}

}