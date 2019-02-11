import java.util.Scanner;
public class CustomException{
    public static void main(String args[]){
        try{
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter a String: ");
            if(scn.nextLine().equals("your name")){
                throw new NoMatchException();
            }
        }
        catch(NoMatchException e){
            System.out.println(e.getMessage()+"\n"+e.getStackTrace());
        }
    }
}
class NoMatchException extends Exception{
    NoMatchException(){
        super("NoMatchException: String is invalid");
    }
}