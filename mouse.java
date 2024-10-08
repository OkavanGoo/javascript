import java.awt.event.*;
import javax.swing.*;
 
public class MouseCaptureDemo extends JFrame implements MouseMotionListener
{
    public JLabel mouseHoverStatus;
 
    public static void main(String args[]) 
    {
        new MouseCaptureDemo();
    }
 
    MouseCaptureDemo() 
    {
        setSize(500, 500);
        setTitle("Mouse Motion");
 
        mouseHoverStatus = new JLabel("No Mouse Hover Detected.", JLabel.CENTER);
        add(mouseHoverStatus);
        addMouseMotionListener(this);
        setVisible(true);
    }
 
    public void mouseMoved(MouseEvent e) 
    {
        mouseHoverStatus.setText("Mouse Cursor Coordinates => X:"+e.getX()+" | Y:"+e.getY());
    }
 
    public void mouseDragged(MouseEvent e) 
    {}
}