import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame{
    public GUI (){

        //Opens a window
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize (400, 300);
        frame.setLayout (new FlowLayout());

        //Contains a menu for quitting the program
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Quit");
        JMenuItem quitItem = new JMenuItem ("Quit");

        quitItem.addActionListener ((ActionEvent e) -> System.exit (0));
        menuBar.add(menu);
        menu.add(quitItem);

        //Contains a pre-defined combo box
        String[] choices = { "first", "second", "third"};
        JComboBox<String> comboBox = new JComboBox<>(choices);

        //Prints the selected item
        comboBox.addActionListener((ActionEvent e) -> System.out.println(comboBox.getSelectedItem()));

        frame.add(panel);
        frame.setJMenuBar (menuBar);
        frame.setTitle("Homework_1_GUI");
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
        panel.add(comboBox);

    }
}
