public class logicaloperators{
  public static void main(String[] args) {
    boolean b;
    int age=11;
    int weight=32;
    b=age<18 && weight>=40;
    System.out.println(b);
    boolean c;
    c=age<=15 || weight<=30;
    System.out.println(c);
    boolean d;
    d=!(age<=15 || weight<=30 );
    System.out.println(d);
    boolean e;
    e=age<15 || (age<18 && weight<40);
    System.out.println(e);
  }
}
