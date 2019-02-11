import java.util.Scanner;
public class ZeroException{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int numi=scn.nextInt();
        int deno=scn.nextInt();
        try{
            System.out.print("="+(numi/deno));
        }catch(ArithmeticException e){
            System.out.println("\nError:"+e);
        }
    }
}