import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class GUI {
    private static JMenu menu;
    private static JMenuBar menuBar;
    private JPanel panel1;
    private JPanel panel;
    private JButton shrugButton;
    private JButton button3;
    private JButton resetButton;
    private JTextArea textArea1;
    private static JMenuItem menuItem;
    private static JRadioButtonMenuItem rbMenuItem;
    private static JCheckBoxMenuItem cbMenuItem;


    // Actions for the shrug button to add a shrug and a button that resets all text in the text field
    public GUI() {
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(null);
            }
        });
        shrugButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.append(" ¯\\_(ツ)_/¯ ");
            }
        });
    }


    public static void main(String[] args) {
        // runs the gui editor
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().panel1);
        // exits window on X press
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Creates Jmenu variables
        JMenuBar MenuBar = new JMenuBar();
        frame.setJMenuBar(MenuBar);

        JMenu file = new JMenu("File");
        MenuBar.add(file);

        JMenuItem open = new JMenuItem("Open File");
        file.add(open);

        JMenuItem save = new JMenuItem("Save");
        file.add(save);
        frame.pack();
        frame.setVisible(true);
        final Formatter[] x = new Formatter[1];
        // Saves text onto a string and saves file as test.txt
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filetext = textArea1.getText();
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(".\\test.txt"));

                    writer.write(filetext);

                    writer.close();

                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }

        });
        // not complete but will open a text file
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
}



