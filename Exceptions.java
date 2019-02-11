import java.util.Scanner;
class Exceptions{
    public static void main(String args[]){
        String input="";
        do{
            System.out.println("Enter anything:");
            try{
                input=new Scanner(System.in).nextLine();
                System.out.println("1.Increment\n2.substring\n3.Divide");
                switch(new Scanner(System.in).nextInt()){
                    case 1: 
                        int num=Integer.parseInt(input);
                        System.out.println(num++);
                        break;
                    case 2:
                        System.out.println("substring from 0 to 3 index:");
                        System.out.println(input.substring(0,3));
                        break;
                    case 3:
                        System.out.println("Divide:\nEnter a number:");
                        int num2=Integer.parseInt(new Scanner(System.in).nextLine());
                        System.out.println("Division= "+(Integer.parseInt(input)/num2));
                }
            }
            catch(NumberFormatException e){
                System.out.println("NumberFormatException");
            }
            catch(NullPointerException e){
                System.out.println("NullPointerException");
            }
            catch(StringIndexOutOfBoundsException e){
                System.out.println("StringIndexOutOfBoundsException");
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticException");
            }
        }while(input.equals("exit")==false);
    }
    
}