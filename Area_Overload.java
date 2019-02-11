    import java.io.*;
    class Area_Overload{
        int var1=0,var2=0;
        Area_Overload(){}
        Area_Overload(int x){
            var1=var2=x;
        }
        Area_Overload(int x,int y){
            var1=x;var2=y;
        }
        void findArea(int x){
            //circle
            System.out.println("Area Of Circle is "+(22*x*x/7));
        }
        void findArea(int x,int y){
            //rectangle
            if(x!=y)
            System.out.println("Area of Rectangle is "+(x*y));
            else
            System.out.println("Area of Square is "+(x*y));
        }
        void findArea(int x,int y,int z){
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
            Area_Overload circle=new Area_Overload();
            circle.findArea(10);
            Area_Overload rect=new Area_Overload();
            rect.findArea(10,30);
            Area_Overload square=new Area_Overload();
            square.findArea(10,10);
            Area_Overload triangle=new Area_Overload();
            triangle.findArea(25,20,30);
        }
}