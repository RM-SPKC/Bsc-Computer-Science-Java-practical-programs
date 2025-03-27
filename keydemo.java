import java.awt.*;
import java.awt.event.*;

public class keydemo extends Frame implements KeyListener 
{

    TextArea t;

    public keydemo() 
	{
     
        setTitle("Keyboard Events");
        setSize(400, 400);
     
        t = new TextArea();
        add(t);
		t.setEditable(false);
        t.requestFocus();
        t.addKeyListener(this);
        setVisible(true);
    

    addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
	}	
    public void keyTyped(KeyEvent e) 
	{   
	    char ch=e.getKeyChar();
		if (Character.isLetterOrDigit(ch))
        t.append("\nKey typed: " +ch );
    }

   
    public void keyPressed(KeyEvent e) 
	{
        char ch=e.getKeyChar();
		if (!Character.isLetterOrDigit(ch))
		t.append("\nKey pressed: " + e.getKeyCode());
    }

    public void keyReleased(KeyEvent e)
	{
        t.append("\nKey released");
    }

    public static void main(String[] args) 
	{
        new keydemo();
    }
}
