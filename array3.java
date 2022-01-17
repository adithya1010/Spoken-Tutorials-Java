import java.io.*;
import java.util.*;
public class array3 {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int numbers[]= new int[10];
    int sum=0;
    System.out.println("Enter 10 numbers");
    for(int i=0;i<10;i++)
    {
      numbers[i]=sc.nextInt();
    }
    for(int i=0;i<10;i++)
    {
      sum=sum+numbers[i];
    }
    System.out.println("The sum is"+sum);

  }
}
