import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
	{
	    int temp,n,i,r,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int [] arr=new int [n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    
    for(i=0;i<n;i++)
    {
        temp=arr[i];
        sum=0;
        while(temp!=0)
        {
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if(sum==arr[i])
        System.out.println("True");
        else
        System.out.println("False");
    }
	}

}