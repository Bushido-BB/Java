import java.util.Scanner;
public class JaggedArray
{
   static void makeJaggedArray(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter no. of columns... ");
        int cols=scn.nextInt();
        int array[][]=new int[cols][];
        for(int i=0;i<cols;i++){
            System.out.println(i+1+":Enter Row Size...");
            int rows=scn.nextInt();
            array[i]=new int[rows];
            for(int j=0;j<rows;j++){
                System.out.print("Array["+i+"]["+j+"]:");
                array[i][j]=scn.nextInt();
            }
        }
        System.out.print("\nArray: \n{\n");
        for(int i=0;i<array.length;i++){
            System.out.print("  { ");
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("}\n");
        }
        System.out.println("}");
    }
    public static void main(String args[]){
        JaggedArray.makeJaggedArray();
    }
}
