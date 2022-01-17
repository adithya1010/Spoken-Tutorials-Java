import java.util.*;
public class arrayoperations {
public static void main(String[] args) {
  int marks[]={2,7,5,4,8};
  Arrays.fill(marks,6);
  int marksCopy[];
  marksCopy=Arrays.copyOfRange(marks,1,4);
  Arrays.sort(marks);
  String mStr=Arrays.toString(marksCopy);
  System.out.println(mStr);
}

}
