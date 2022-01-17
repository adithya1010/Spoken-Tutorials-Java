import java.io.*;
import java.util.*;
public class decimaltobinary {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the binary number");
    String binaryString=sc.nextLine();
    int decimal=Integer.parseInt(binaryString,2);
    System.out.println(decimal);
  }
}
