import java.io.*;
class clg{
    public static void main(String args[]) throws IOException{
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a%b);
        
        System.out.println(a==b?"Yes":"No");
        
        System.out.println(function1(a,b));
        function2(a,b);
        System.out.println(function3());
        function4();
        
        makeArray();
        
        make2DArray();
        
        makeJaggedArray();
    }
    static void makeArray() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int array[]=new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Array: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static void make2DArray() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int array[][]=new int[5][2];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++)
                array[i][j]=Integer.parseInt(br.readLine());
        }
        System.out.println("Array: ");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++)
                System.out.print(array[i][j]+" ");
                System.out.println("");
        }
    }
    static void makeJaggedArray() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of columns... ");
        int cols=Integer.parseInt(br.readLine());
        int array[][]=new int[cols][];
        for(int i=0;i<cols;i++){
            System.out.println("Enter Row Size...");
            int rows=Integer.parseInt(br.readLine());
            array[i]=new int[rows];
            for(int j=0;j<rows;j++){
                array[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("Array: ");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }

    static String function1(int a,int b){
        return "Function 1:"+((a*a)+(b*b)+(2*a*b));
    }
    static void function2(int a,int b){
        System.out.println("Function 2:"+((a*a)+(b*b)+(2*a*b)));
    }
    static String function3(){
        int a=20;int b=30;
        return "Function 3:"+((a*a)+(b*b)+(2*a*b));        
    }
    static void function4(){
        int a=40,b=50;
        System.out.println("Function 4:"+((a*a)+(b*b)+(2*a*b)));        
    }
}