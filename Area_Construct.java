import java.io.*;
class Area_Construct{
    Area_Construct(int x){
        //circle
        System.out.println("Area Of Circle is "+(22*x*x/7));
    }
    Area_Construct(int x,int y){
        //rectangle
        if(x!=y)
            System.out.println("Area of Rectangle is "+(x*y));
        else
            System.out.println("Area of Square is "+(x*y));
    }
    Area_Construct(int x,int y,int z){
    //triangle
    if(x+y>z && y+z>x && x+z>y){
            double s=(x+y+z)/2;
            double area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
            System.out.println("Area of Triangle is "+((float)area));
        }
    else{
            System.out.println("No such triangle possible!");
        }
    }
    public static void main(String args[]){
        Area_Construct circle=new Area_Construct(140);
        Area_Construct rect=new Area_Construct(120,20);
        Area_Construct triangle=new Area_Construct(12,10,11);
    }
}
