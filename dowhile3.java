import java.io.IOException;
import java.util.Scanner;

class dowhile3
{
  public static void main(String args[])
  {
    int d,n=0;
    int sum=0;
    int c=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the binary number:");
    int bin=sc.nextInt();
    System.out.println(bin+" is the given binary number");
    do{
      {
        bin=n;
        d=n%10;
        n=n/10;
        sum=sum+(d*c);
        c=c*2;
      }
    } while (n>0);
  }
}
