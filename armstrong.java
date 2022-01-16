public class armstrong {

  public static void main(String[] args) {
    int q=0,r,sum=0,n;
    for(int i=100;i<1000;i++)
    {
      n=i;
      while(n>0);
      {
      r=n%10;
      sum=sum+(r*r*r);
      n=n/10;
    }
    if(sum==i)
    {
      System.out.println(sum);
      System.out.println("is an armstrong number");
    }
    sum=0;
    }
  }
}
