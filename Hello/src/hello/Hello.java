package hello;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
        
/**
 *
 * static allows main method to be called without instantiation of class
 * don't need to create (instantiate) a class to call a method
 * main method is first to be called
 * ide = integrated development environment
 * packages: related classes and interfaces
 * java.awt contains things the user will interact with, interfaces
 * java.awt.flowlayout and .font and .color
 * javax.swing (x =extension) swing is set of program components to create GUIs
 * to create graphical user interfaces
 * javax.swing.jframe and jlabel  frame adds border and title, button components, icon
 * label is display are for text or image
 * extends means we create subclass of the class we're extending
 * jlabel need to create an instance of the class
 */
public class Hello extends JFrame {
    JLabel jlabClock;
    ClockThread ct;
    
    public Hello(){
        jlabClock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabClock.setFont(new Font("Arial", Font.CENTER_BASELINE,80));
        jlabClock.setOpaque(true);
        jlabClock.setBackground(Color.RED);
        jlabClock.setForeground(Color.MAGENTA);
        add(jlabClock);
        setSize(1200, 120);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);
    }

    public static void main(String[] args) {
System.out.println("Hello world");
new Hello();
        }
    /**
     * thread-single sequential flow of control within program or app, independent path
     * can run concurrently with other
     */
}
