import javax.swing.*;
import java.awt.event.*;

public class Frames extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;
    //Fields
    JPanel mypanel;
    JTextField myTextField;
    JButton myButton;
    JLabel myLabel;
    int counter=0;

    //constructor
    public Frames()
    {
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
        new Frames();

        Calculator calculator = new Calculator();
        calculator.setTitle("My First GUI");
        calculator.setSize(300, 200);
        calculator.setLocation(20, 200);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource() ==myButton)
        {
            String x = myTextField.getText();
            myLabel.setText(x);
            System.out.println(x);
            counter++;
            System.out.println(counter);
        }
    }

}

