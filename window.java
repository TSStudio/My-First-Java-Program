import java.awt.*;
import javax.swing.*;

public class window extends JFrame {
    public void CreateJFrame(String title) { 
        JFrame jf = new JFrame(title); 
        Container container = jf.getContentPane(); 
        JLabel jl=new JLabel("It is a window");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        container.setBackground(Color.white);
        jf.setVisible(true); 
        jf.setSize(200, 150); 
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new window().CreateJFrame("Create a JFRAME WINDOW");
    }
}