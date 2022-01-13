public class condition2{
  public static void main(String[] args) {
    int testscore=70;
    if(testscore<35)
    {
      System.out.println("C grade");
    }
    else
    {
      if((testscore>=35)&&(testscore<=60))
      {
          System.out.println("B grade");
      }
      else{
        System.out.println("A grade");
      }
    }
  }
}
