import java.util.Scanner;
class DomainException extends Exception{
    static boolean checkDomain(double x,String function){
        if(function.equalsIgnoreCase("log")){
            return x>0?true:false;
        }
        else if(function.equalsIgnoreCase("asin")){
            return x<=1&&x>=-1?true:false;
        }
        return false;
    }
    DomainException(String funct){
        System.out.println("Domain Out of Bound for "+funct);
    }
}
public class Throwing{
    public static void main(String args[]) throws DomainException{
        Scanner scn=new Scanner(System.in);
        Double x=scn.nextDouble();
        if(DomainException.checkDomain(x,"log")){
            System.out.println("Log:"+Math.log(x));
        }
        else{
            throw new DomainException("log()");
        }
        if(DomainException.checkDomain(x,"asin")){
            System.out.println("Sine Inverse:"+Math.log(x));
        }
        else{
            throw new DomainException("asin()");
        }
    }
}