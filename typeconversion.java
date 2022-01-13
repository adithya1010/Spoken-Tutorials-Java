public class typeconversion {
public static void main(String[] args) {
  int a=5;
  float b=2.5f;
  b=(float)a;//explicit conversion
  System.out.println(b);
  char c='m';
  a=(int)c;
  System.out.println(a);//prints the ASCII value
  String height="6";
  int h=Integer.parseInt(height);
  System.out.println(h);
  float hf =Float.parseFloat(height);
  System.out.println(hf);
}
}
