import java.util.Scanner;
class Multiply{
    public double value=0;
    Multiply(double x){
        this.value=x;
    }
    Multiply multiply(Multiply x){
        this.value*=x.value;
        return this;
    }
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a number for 1st Object:");
        Multiply variable1=new Multiply(scn.nextDouble());
        System.out.print("Enter a number for 2nd Object:");
        Multiply variable2=new Multiply(scn.nextDouble());
        System.out.print("Product is "+variable1.multiply(variable2).value);
    }
}