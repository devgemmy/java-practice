import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{

    //Fields
    JPanel mypanel;

    JButton mybutton0;
    JButton mybuttonDecimal;
    JButton mybuttonPlus;

    JButton mybutton1;
    JButton mybutton2;
    JButton mybutton3;
    JButton mybuttonMinus;

    JButton mybutton4;
    JButton mybutton5;
    JButton mybutton6;
    JButton mybuttonMultiply;

    JButton mybutton7;
    JButton mybutton8;
    JButton mybutton9;
    JButton mybuttonDivide;

    JButton mybuttonEqual;
    JButton mybuttonClear;

    JTextField mytext1;
    JTextField mytext2;

    //int count = 0;

    double num = 0.0, result = 0.0;

    boolean firstEntry = true, firstperiod=false;
    String lastOperation = "";

    //constructor
    public Calculator()
    {
        mypanel = new JPanel();
        mypanel.setLayout(null);
        //-------------------------------------

        mybutton0 = new JButton("0");
        mybutton0.setBounds(15, 250, 95, 45);

        mybuttonDecimal = new JButton(".");
        mybuttonDecimal.setBounds(115, 250, 45, 45);

        mybuttonPlus = new JButton("+");
        mybuttonPlus.setBounds(165, 250, 45, 45);
        //-------------------------------------
        mybutton1 = new JButton("1");
        mybutton1.setBounds(15, 200, 45, 45);

        mybutton2 = new JButton("2");
        mybutton2.setBounds(65, 200, 45, 45);

        mybutton3 = new JButton("3");
        mybutton3.setBounds(115, 200, 45, 45);

        mybuttonMinus = new JButton("-");
        mybuttonMinus.setBounds(165, 200, 45, 45);
        //-------------------------------------
        mybutton4 = new JButton("4");
        mybutton4.setBounds(15, 150, 45, 45);

        mybutton5 = new JButton("5");
        mybutton5.setBounds(65, 150, 45, 45);

        mybutton6 = new JButton("6");
        mybutton6.setBounds(115, 150, 45, 45);

        mybuttonMultiply = new JButton("*");
        mybuttonMultiply.setBounds(165, 150, 45, 45);
        //-------------------------------------
        mybutton7 = new JButton("7");
        mybutton7.setBounds(15, 100, 45, 45);

        mybutton8 = new JButton("8");
        mybutton8.setBounds(65, 100, 45, 45);

        mybutton9 = new JButton("9");
        mybutton9.setBounds(115, 100, 45, 45);

        mybuttonDivide = new JButton("/");
        mybuttonDivide.setBounds(165, 100, 45, 45);
        //-------------------------------------
        mybuttonEqual = new JButton("=");
        mybuttonEqual.setBounds(15, 55, 95, 40);

        mybuttonClear = new JButton("clear");
        mybuttonClear.setBounds(115, 55, 95, 40);
        //-------------------------------------
        mytext1 = new JTextField(20);
        mytext1.setText("0.0");
        mytext1.setBounds(15, 5, 195, 25);
        mytext2 = new JTextField(20);
        mytext2.setText("");
        mytext2.setBounds(15, 27, 195, 25);

        //-------------------------------------
        //-------------------------------------
        add(mypanel);
        mypanel.add(mybutton0);
        mypanel.add(mybuttonDecimal);
        mypanel.add(mybuttonPlus);

        mypanel.add(mybutton1);
        mypanel.add(mybutton2);
        mypanel.add(mybutton3);
        mypanel.add(mybuttonMinus);

        mypanel.add(mybutton4);
        mypanel.add(mybutton5);
        mypanel.add(mybutton6);
        mypanel.add(mybuttonMultiply);

        mypanel.add(mybutton7);
        mypanel.add(mybutton8);
        mypanel.add(mybutton9);
        mypanel.add(mybuttonDivide);

        mypanel.add(mybuttonEqual);
        mypanel.add(mybuttonClear);

        mypanel.add(mytext1);
        mypanel.add(mytext2);

        mybutton1.addActionListener(this);
        mybutton2.addActionListener(this);
        mybutton3.addActionListener(this);
        mybutton4.addActionListener(this);
        mybutton5.addActionListener(this);
        mybutton6.addActionListener(this);
        mybutton7.addActionListener(this);
        mybutton8.addActionListener(this);
        mybutton9.addActionListener(this);
        mybutton0.addActionListener(this);
        mybuttonDecimal.addActionListener(this);

        mybuttonPlus.addActionListener(this);
        mybuttonMinus.addActionListener(this);
        mybuttonMultiply.addActionListener(this);
        mybuttonDivide.addActionListener(this);

        mybuttonEqual.addActionListener(this);
        mybuttonClear.addActionListener(this);

    }

    //methods
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame Calculator = new Calculator();

        Calculator.setTitle("Calculator");
        Calculator.setSize(237, 350);
        Calculator.setLocation(20, 200);
        Calculator.setVisible(true);
        Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==mybutton0)
        {
            if (firstEntry == true)
            {
                mytext1.setText("0");
                firstEntry = false;
            }
            else
                mytext1.setText(mytext1.getText() + "0");
        }
        else if (e.getSource()==mybutton1)
        {
            if (firstEntry == true)
            {
                mytext1.setText("1");
                firstEntry = false;
            }
            else
                mytext1.setText(mytext1.getText() + "1");
        }
        else if (e.getSource()==mybutton2)
        {
            if (firstEntry == true)
            {
                mytext1.setText("2");
                firstEntry = false;
            }
            else
                mytext1.setText(mytext1.getText() + "2");
        }
        else if (e.getSource()==mybutton3)
        {
            if (firstEntry == true)
            {
                mytext1.setText("3");
                firstEntry = false;
            }
            else
                mytext1.setText(mytext1.getText() + "3");
        }
        else if (e.getSource()==mybutton4)
        {
            if (firstEntry == true)
            {
                mytext1.setText("4");
                firstEntry = false;
            }
            else
                mytext1.setText(mytext1.getText() + "4");
        }
        else if (e.getSource()==mybutton5)
        {
            if (firstEntry == true)
            {
                mytext1.setText("5");
                firstEntry = false;
            }
            else
                mytext1.setText(mytext1.getText() + "5");
        }
        else if (e.getSource()==mybutton6)
        {
            if (firstEntry == true)
            {
                mytext1.setText("6");
                firstEntry = false;
            }
            else
                mytext1.setText(mytext1.getText() + "6");
        }
        else if (e.getSource()==mybutton7)
        {
            if (firstEntry == true)
            {
                mytext1.setText("7");
                firstEntry = false;
            }
            else
                mytext1.setText(mytext1.getText() + "7");
        }
        else if (e.getSource()==mybutton8)
        {
            if (firstEntry == true)
            {
                mytext1.setText("8");
                firstEntry = false;
            }
            else
                mytext1.setText(mytext1.getText() + "8");
        }
        else if (e.getSource()==mybutton9)
        {
            if (firstEntry == true)
            {
                mytext1.setText("9");
                firstEntry = false;
            }
            else
                mytext1.setText(mytext1.getText() + "9");
        }
        //////////////////////////////////////////////////
        else if (e.getSource()==mybuttonDecimal)
        {
            if (firstperiod == false)
            {
                mytext1.setText(mytext1.getText() + ".");
                firstperiod = true;
            }
        }
        //////////////////////////////////////////////////
        //Arithmetic Operations
        else if (e.getSource()==mybuttonPlus)
        {
            if (lastOperation.equalsIgnoreCase("+"))
            {
                num = num + Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "+";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("-"))
            {
                num = num - Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "+";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("*"))
            {
                num = num * Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "+";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("/"))
            {
                num = num / Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "+";
                firstperiod = false;
            }
            else
            {
                num = Double.parseDouble(mytext1.getText());
                mytext1.setText("");
                lastOperation = "+";
                firstperiod = false;
            }
        }
        else if (e.getSource()==mybuttonMinus)
        {
            if (lastOperation.equalsIgnoreCase("+"))
            {
                num = num + Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "-";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("-"))
            {
                num = num - Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "-";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("*"))
            {
                num = num * Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "-";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("/"))
            {
                num = num / Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "-";
                firstperiod = false;
            }
            else
            {
                num = Double.parseDouble(mytext1.getText());
                mytext1.setText("");
                lastOperation = "-";
                firstperiod = false;
            }
        }
        else if (e.getSource()==mybuttonMultiply)
        {
            if (lastOperation.equalsIgnoreCase("+"))
            {
                num = num + Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "*";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("-"))
            {
                num = num - Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "*";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("*"))
            {
                num = num * Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "*";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("/"))
            {
                num = num / Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "*";
                firstperiod = false;
            }
            else
            {
                num = Double.parseDouble(mytext1.getText());
                mytext1.setText("");
                lastOperation = "*";
                firstperiod = false;
            }
        }
        else if (e.getSource()==mybuttonDivide)
        {
            if (lastOperation.equalsIgnoreCase("+"))
            {
                num = num + Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "/";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("-"))
            {
                num = num - Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "/";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("*"))
            {
                num = num * Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "/";
                firstperiod = false;
            }
            else if (lastOperation.equalsIgnoreCase("/"))
            {
                num = num / Double.parseDouble(mytext1.getText());
                mytext2.setText(String.valueOf(num));
                mytext1.setText("");
                lastOperation = "/";
                firstperiod = false;
            }
            else
            {
                num = Double.parseDouble(mytext1.getText());
                mytext1.setText("");
                lastOperation = "/";
                firstperiod = false;
            }
        }
        else if (e.getSource()==mybuttonEqual)
        {
            if (lastOperation.equals("+"))
                mytext2.setText(String.valueOf(num+Double.parseDouble(mytext1.getText())));
            else if (lastOperation.equals("-"))
                mytext2.setText(String.valueOf(num-Double.parseDouble(mytext1.getText())));
            else if (lastOperation.equals("*"))
                mytext2.setText(String.valueOf(num*Double.parseDouble(mytext1.getText())));
            else if (lastOperation.equals("/"))
                mytext2.setText(String.valueOf(num/Double.parseDouble(mytext1.getText())));

            firstEntry = true;
            firstperiod = false;
            result = 0;
        }
        else if (e.getSource()==mybuttonClear)
        {
            mytext1.setText("0.0");
            mytext2.setText("");
            firstEntry = true;
            firstperiod = false;
            lastOperation="";
            result = 0;
            num = 0.0;
        }
    }

}