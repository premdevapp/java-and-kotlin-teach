//import java.util.Scanner;

import javax.swing.JOptionPane;

public class BasicIntro {
    //static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("prem");
        //int range = scan.nextInt();
        String str = JOptionPane.showInputDialog("Enter an Integer : ");
        int range = Integer.parseInt(str);
        System.out.println(String.format("The number is %d",range));
    }
}
