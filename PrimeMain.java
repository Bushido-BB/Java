import pack.PrimeNumber;
class PrimeMain{
    public static void main(String args[]){
        int num=Integer.parseInt(args[0]);
        PrimeNumber p1=new PrimeNumber();
        System.out.println(p1.prime(num));
    }
}