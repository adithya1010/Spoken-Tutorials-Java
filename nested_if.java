/**
 * nested_if
 */
public class nested_if {

  public static void main(String[] args) {
    int n=-5;
    if(n<0){
      System.out.println("Negative Number");
    }
    else {
      if(n%2==0)
      {
        System.out.println("Even number");
      }
      else {
        System.out.println("Odd Number");
      }
    }
  }
}
