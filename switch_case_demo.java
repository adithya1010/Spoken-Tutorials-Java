/**
 * switch_case_demo
 */
public class switch_case_demo {

  public static void main(String[] args) {
    int day=3;
    String dName="";
    switch(day)
    {
      case 0:
        dName="Sunday";
        break;
      case 1:
        dName="Monday";
        break;
      case 3:
        dName="Tuesday";
        break;
      case 4:
        dName="Wednesday";
        break;
    }
    System.out.println(dName);
    
  }
}
