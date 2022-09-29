import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
	{
	    int i,n,k,max;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
        int [] arr=new int [n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    max=0;
    k=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(arr[i]+k>=max)
        {
            max=arr[i];
            System.out.print("True ");
        }
        else
        {
            System.out.print("False ");
        }
    }
	}

}