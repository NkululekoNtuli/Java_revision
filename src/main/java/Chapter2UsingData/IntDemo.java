package Chapter2UsingData;

import javax.swing.*;

public class IntDemo {

    public static void main(String[] args){

        String name;
        name = JOptionPane.showInputDialog(null, "What is your name>> ");
        JOptionPane.showMessageDialog(null, "Hello " + name +
                " may you have a pleasant day.");
    }
}
