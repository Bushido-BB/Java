//Pract 3 To display a 1d array
import java.util.Scanner;
class OneDArray{
    static void makeArray(int size){
        //Input starts here>>>
        System.out.println("Enter elements in array of "+size+" elements...");
        Scanner scn=new Scanner(System.in);
        float array[]=new float[10];
        for(int i=0;i<size;i++){
            array[i]=scn.nextFloat();
        }
        //Display starts here>>>
        System.out.print("Array: {");
        for(int i=0;i<array.length-1;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length-1]+"}");
    }
    public static void main(String args[]){
        makeArray(10);  
    }
}