import java.math.BigInteger;
class FibonacciSquares
{
    public static void main(String args[])
    {
        fibo(5);
    }
    static void fibo(int x)
    {
        int i=0;int j=1;
        while(x+1!=0)
        {
            System.out.print(j+" ");
            j=(i+(i=j));
            x--;
        }
    }
    public static void perimeter(String n1) {
    BigInteger n=new BigInteger(n1), i=new BigInteger("0"),j=new BigInteger("1");
    BigInteger peri=new BigInteger("0");
    n=n.add(new BigInteger("1"));
        while(n.equals(new BigInteger("0"))==false)
        {
            peri=peri.add(j);
            j=(i.add(i=j));
            n=n.subtract(new BigInteger("1"));
        }
        System.out.println(peri.multiply(BigInteger.valueOf(4)));
    }
    public static void perifind()
    {
        BigInteger i=new BigInteger("0"),
        j=new BigInteger("1"),
        peri=new BigInteger("0"),
        n=new BigInteger("5");
            n=n.add(new BigInteger("1"));
        while(n.equals(new BigInteger("0"))==false)
        {
            peri=peri.add(j);
            j=(i.add(i=j));
            n=n.subtract(new BigInteger("1"));
        }
        System.out.print(peri.multiply(new BigInteger("4")));
    }
    public static void fiboarea()
    {
        BigInteger n=new BigInteger("42");
        BigInteger i=new BigInteger("0"),
                   j=new BigInteger("1"),
                   area=new BigInteger("0");

        while(n.equals(BigInteger.valueOf(0))==false){
area=area.add(j.multiply(j));
            j=i.add(i=j);
          n=n.subtract(BigInteger.valueOf(1));
        }
        System.out.println(area.divide(j).add(j));
    }
}