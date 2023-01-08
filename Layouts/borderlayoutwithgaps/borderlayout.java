package Layouts.borderlayoutwithgaps;
import java.awt.*;
import javax.swing.*;

public class borderlayout {
    JFrame frame;
    borderlayout(){
        frame = new JFrame();

            JButton btn1 = new JButton("NORTH");
            JButton btn2 = new JButton("SOUTH");
            JButton btn3 = new JButton("EAST");
            JButton btn4 = new JButton("WEST");
            JButton btn5 = new JButton("center");

            frame.setLayout(new BorderLayout(55,88));

            frame.add(btn1 , BorderLayout.NORTH);
            frame.add(btn2,BorderLayout.SOUTH);
            frame.add(btn4,BorderLayout.WEST);
            frame.add(btn3,BorderLayout.EAST);
            frame.add(btn5,BorderLayout.CENTER);



            frame.setSize(800,300);

            frame.setVisible(true);;



    }

    public static void main(String[] args) {
        new borderlayout();
    }
    
}
