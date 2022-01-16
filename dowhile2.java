public class dowhile2 {
  public static void main(String[] args) {
    int n=49;
    int x=0;
    do{
      x=x+1;
    }while(x*x<n);
    System.out.println(x*x==n);
  }
}
