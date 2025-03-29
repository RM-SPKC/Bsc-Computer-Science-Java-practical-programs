import java.util.*;
import java.applet.*;
import java.awt.*;
/*<applet code="web.class" width="800" height="800">
</applet>*/
public class web extends Applet
{
int i=0;
public void paint(Graphics g)
{
Image p=getImage(getCodeBase(),"menu.png");
g.drawImage(p,0,160,800,500,this);
Color c=new Color(255,102,102);
g.setColor(c);
Font f=new Font("Arial",Font.BOLD,28);
g.setFont(f);
g.drawString("Pizza Hut",100,70);
g.fillRect(0,120,800,50);
Font f1=new Font("Arial",Font.BOLD,16);
g.setFont(f1);
g.setColor(Color.black);
g.drawString("Home      About Us    Menu    Contact Us",0,160);
g.setColor(c);
g.fillRect(0,650,800,50);
g.setColor(Color.WHITE);
g.setFont(f);
g.drawString("Order Now",400,500);
g.setFont(f1);
g.drawString("Copy right @ PizzaHut 2025",350,670);
}
}