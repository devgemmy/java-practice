package Lecture5_GUI;

import javax.swing.*;
import java.awt.event.*;

public class FirstFrame extends JFrame implements ActionListener{

    //Fields	
    JPanel mypanel;
    JTextField myTextField;
    JButton myButton;
    JLabel myLabel;
    int counter=0;

    //constructor
    public FirstFrame() {
        mypanel = new JPanel();
        myTextField = new JTextField(20);
        myButton = new JButton("Press Button");
        myLabel = new JLabel("I am just displaying stuff");

        add(mypanel);
        mypanel.add(myTextField);
        mypanel.add(myButton);
        mypanel.add(myLabel);
        myButton.addActionListener(this);
    }

    //methods
    public static void main(String[] args) {
        JFrame myframe = new FirstFrame();

        myframe.setTitle("My First GUI");
        myframe.setSize(300, 200);
        myframe.setLocation(20, 200);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==myButton) {
            String x = myTextField.getText();
            myLabel.setText(x);
            System.out.println(x);
            counter++;
            System.out.println(counter);
        }
    }

}

