import java.util.Scanner;
class Root
{
    public static void main(String args[])
    {
        int n,sq,r=1,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    sq=n*n;
    temp=n;
    while(n>0)
    {  
       r=r*10;    
       n=n/10;
    }
       if(sq%r==temp)
       {
           System.out.println("Automorphic Number");
       }
       else
       {
           System.out.println("Not an Automorphic Number");
       }
        

    }
}