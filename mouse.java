import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class mouse extends MouseAdapter
{
JFrame f;
JLabel l;
Font fo;
mouse()
{
f=new JFrame();
l=new JLabel("",JLabel.CENTER);
f.add(l);
fo=new Font("Arial",Font.BOLD,28);
l.setFont(fo);
f.addMouseListener(this);
f.setSize(1000,1000);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void mouseClicked(MouseEvent m)
{
l.setText("Mouse clicked");
}
public void mouseEntered(MouseEvent m)
{
l.setText("Mouse Entered");
}
public void mouseExited(MouseEvent m)
{
l.setText("Mouse Exited");
}
public void mousePressed(MouseEvent m)
{
l.setText("Mouse pressed");
}
public void mouseReleased(MouseEvent m)
{
l.setText("Mouse Released");
}
public static void main(String args[])
{
new mouse();
}
}