class zeroes{
    public static void main(String args[]){
        zeros(1000);
    }
public static void zeros(int n) {
      int num=n;
      int count=0;
      int i=1;
      while(num!=0){
        int denom=(int)(Math.pow(5,i));
        count+=num/denom;
        num/=denom;
        i++;
      }
      System.out.print(count);
  }
}