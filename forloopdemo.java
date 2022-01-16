public class forloopdemo {

  public static void main(String[] args) {
    int i;
    for(i=10;i<100;i++)
    {
      if((i%3==0) || (i%5==0))
      {
        System.out.println(i*i);
      }

    }
  }
}
