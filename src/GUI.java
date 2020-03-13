import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GUI {
    private static JMenu menu;
    private static JMenuBar menuBar;
    private JPanel panel1;
    private JPanel panel;
    private JButton fileButton;
    private JButton shrugButton;
    private JButton button3;
    private JButton resetButton;
    private JTextArea textArea1;
    private static JMenuItem menuItem;
    private static JRadioButtonMenuItem rbMenuItem;
    private static JCheckBoxMenuItem cbMenuItem;

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
        menuBar = new JMenuBar();
        menu = new JMenu("Edit");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        menuItem = new JMenuItem("Save",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);

        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


