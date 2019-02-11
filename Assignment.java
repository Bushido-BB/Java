import java.io.*;
class Assignment{

    public static void main(String args[]){
        SunTrustBanks sbt=new SunTrustBanks();
    }
}
class Style extends Thread{
    String array[][]={{" ","26"},{"*","5"},{"\n","1"},
    {" ","23"},{"*","1"},{"'","9"},{"*","1"},{"\n","1"},
    {" ","21"},{"*","1"},{"'","13"},{"*","1"},{"\n","1"},
    {" ","20"},{"*","1"},{"'","2"},{"-","5"},{" ","1"},{"-","5"},{" ","2"},{"*","1"},{"\n","1"},
    {" ","20"},{"*","1"},{"'","6"},{"/ \\","1"},{" ","6"},{"*","1"},{"\n","1"},
    {" ","20"},{"*","1"},{"'","5"},{"/   \\","1"},{" ","5"},{"*","1"},{"\n","1"},
    {" ","20"},{"*","1"},{"'","15"},{"*","1"},{"\n","1"},
    {" ","20"},{"*","1"},{"'","15"},{"*","1"},{"\n","1"},
    {" ","22"},{"*","1"},{"'","11"},{"*","1"},{"\n","1"},
    {" ","22"},{"*","1"},{"'","3"},{"_","5"},{" ","3"},{"*","1"},{"\n","1"},
    {" ","22"},{"*","1"},{"'","2"},{"/","1"},{" ","5"},{"\\","1"},{" ","2"},{"*","1"},{"\n","1"},
    {" ","23"},{"*","1"},{"'","8"},{"*","1"},{"\n","1"},
    {" ","25"},{"*","1"},{"'","4"},{"*","1"},{"\n","1"},
    {" ","26"},{"*","4"},{"\n","1"},
};
    
    public void run(){
        try{
            Thread.sleep(500);
            for(int i=0;i<6000;i++)
                System.out.print((char)(Math.random()*255));
            System.out.println();
            new ProcessBuilder("cmd.exe", "/c", "color 04").inheritIO().start();
            for(int i=0;i<array.length;i++){
                int times=Integer.parseInt(array[i][1]);
                for(int j=0;j<times;j++){
                    System.out.print(array[i][0]);
                }
                Thread.sleep((80-i)%70);
            }
            Thread.sleep(300);
            for(int i=0;i<6000;i++)
                System.out.print((char)(Math.random()*255));
            System.out.println();
        }
        catch(Exception e){
                System.out.print(e);
        }
    }
}
class SunTrustBanks{
    SunTrustBanks(){
        try{
            initiateLogin();
        }catch(Exception e){
            System.out.println(e+"\n");
        }
    }
    static int tries=0;
    static String login[][]={{"nikhil","431"},{"raj","436"},{"rohit","440"}};
    void login(String user){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t\t\tWelcome "+user);
        try{
            Style s1=new Style();
            s1.start();
            //br.readLine();
        }catch(Exception e){
            System.out.println(e+"\n");
        }
    }
    void initiateLogin() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        bigloop:while(true){
            int user_index=0;
            System.out.print("username:");
            String username=br.readLine();
            System.out.print("password:");
            String password=br.readLine();
            while(user_index<login.length){
                if(username.equals(login[user_index][0]) && password.equals(login[user_index][1])){
                    username=login[user_index][0];
                    login(username);
                    break bigloop;
                }
                user_index++;
            }
            tries++;
            System.out.println("Incorrect Username or Password...\n");
            if(tries>=3){
                break;
            }
        }
        Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
    }
}