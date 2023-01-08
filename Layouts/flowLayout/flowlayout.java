package Layouts.flowLayout;

import java.awt.*;
import javax.swing.*;

public class flowlayout {

    JFrame frame;

    flowlayout(){
        frame = new JFrame();

        // create a buttons

        JButton btn1 = new JButton("1");
        JButton btn3 = new JButton("3");
        JButton btn2 = new JButton("2");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");


        //add buttons to the frame

        frame.add(btn1); frame.add(btn2); frame.add(btn3);
        frame.add(btn4); frame.add(btn5); frame.add(btn6);

        frame.setLayout(new FlowLayout(FlowLayout.TRAILING));

        frame.setSize(300,500);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new flowlayout();
    }
    
}
