package Chapter2UsingData;

import javax.swing.*;
import java.util.Scanner;

public class UsingConfirmDB {

    public static void main(String[] args){

        int selection;
        boolean isYes;
        selection = JOptionPane.showConfirmDialog(null,
                "Do you want to upgrade to first class?");
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null,
                "You responded " + isYes);
    }

}