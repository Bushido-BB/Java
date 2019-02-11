import java.util.Scanner;
class TwoDArray{
        static void makeArray(int rows,int columns){
        //Input starts here>>>
        System.out.println("Enter elements in array of "+rows+"x"+columns+" elements...");
        Scanner scn=new Scanner(System.in);
        float array[][]=new float[columns][rows];
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                System.out.print("Array["+i+"]["+j+"]:");
                array[i][j]=scn.nextFloat();
            }
        }
        //Display starts here>>>
        System.out.print("Array:\n");
        for(int i=0;i<columns;i++){
            System.out.print("|\t");
            for(int j=0;j<rows;j++)
                System.out.print(array[i][j]+"\t\t");
            System.out.println("|");
        }
    }
    public static void main(String args[]){
        makeArray(3,4);
    }
}