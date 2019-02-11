import java.applet.Applet;
import java.awt.Graphics;
public class AppletFile extends Applet{
    String name="";
    public void paint(Graphics g){
        name=this.getParameter("name");
        g.drawString("Welcome "+name,20,40);
    }
    public AppletFile(){
        this.start();
        this.init();
    }
}