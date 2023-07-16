package za.ac.tut;

import java.awt.Color;
import javax.swing.JFrame;

public class MyFrame extends JFrame
{
    public  MyFrame()
    {
        setTitle("My First GUI");
        setSize(200, 250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
}
