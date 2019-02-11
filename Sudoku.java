import java.util.Scanner;
import java.io.*;
public class Sudoku{
    String file="Sudoku/testing.dat";
    int game[][]=new int[9][9];
    int test[][]=new int[9][9];
    public static void main(String args[])
    {
        Sudoku sudoku =new  Sudoku();
        String str="";
        Scanner scn=new Scanner(System.in);
        do{
            System.out.println("\n\n1.Show File\n2.Choose File\n3.Create File\n4.Solve File\n");
            str=scn.nextLine();
            try{
                if(str.equals("1") || str.equalsIgnoreCase("Show File")){
                    sudoku.showFile();
                }else if(str.equals("2") || str.equalsIgnoreCase("Choose File")){
                    System.out.print("\nEnter file name:");
                    sudoku.chooseFile(scn.nextLine());
                }else if(str.equals("3") || str.equalsIgnoreCase("Create File")){
                    sudoku.createFile();
                }else if(str.equals("4") || str.equalsIgnoreCase("Solve File")){
                    sudoku.solveFile();
                }
            }catch(IOException e){System.out.println("Error: "+e.getMessage());}
        }while(str.equalsIgnoreCase("exit")==false);
    }
    Sudoku(){
        try{
            this.showFile();
            this.test=game; 
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void showFile() throws IOException{
        System.out.println("\n>"+this.file);
        FileInputStream fis=new FileInputStream(this.file);
        int ch;
        while((ch=fis.read())!=-1){
            System.out.print((char)ch);
        }
        fis.close();
    }
    public void chooseFile(String f){
        file="sudoku/"+f;
        try{this.showFile();}catch(Exception e){System.out.println("Error:"+e.getMessage());}
    }
    public void createFile() throws IOException{
        System.out.println("Enter Number left to right-->\nLeave 0 for empty blocks");
        FileOutputStream fos=new FileOutputStream(file);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.println("Enter number ("+(i+1)+","+(j+1)+"):");
                int input=new Scanner(System.in).nextInt();
                if(input>=0 && input<10){
                    this.game[i][j]=input;
                    fos.write((char)(48+input));
                    fos.write(' ');
                }else{
                    System.out.println("Error:Invalid Number");
                    j--;
                }
            }
            fos.write('\n');
        }
        fos.close();
    }
    public void solveFile(){
        for(int i=0;i<10;i++){
            for(int j=0;i<10;j++){
                
            }
        }
    }
    
}