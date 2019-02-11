import java.io.*;
class Sum{
    static float a,b;
    Sum()throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first no....");
        a=Float.parseFloat(br.readLine());
        System.out.println("Enter Second no....");
        b=Float.parseFloat(br.readLine());        
    }
    static String function1(float x,float y){
        return "Function 1:"+(x+y);
    }
    static void function2(float x,float y){
        System.out.println("Function 2:"+(x+y));
    }
    static String function3(){
        return "Function 3:"+(a+b);        
    }
    static void function4(){
        System.out.println("Function 4:"+(a+b));        
    }
    public static void main(String args[]){
        Sum s1=null;
        try{
            s1=new Sum();
        }
        catch(Exception e){}
        
        System.out.println(function1(s1.a,s1.b));//args+rtrn
        function2(s1.a,s1.b);                    //args only
        System.out.println(function3());         //rtrn only
        function4();                             //none
        
    }
}