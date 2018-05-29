import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    private JButton showAllBooksButton;
    private JButton addABookButton;
    private JButton exitButton;
    private JPanel panel;
    private JComboBox comboBox1;
    private static JFrame frame;
    private String ad;

    public View() {
        addABookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Add add = new Add();
                add.ShowAdd();
            }
        });
        showAllBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!(comboBox1.getSelectedItem().toString().equals("")) && !(comboBox1.getSelectedItem().toString().equals(null))) {
                    ad=comboBox1.getSelectedItem().toString();
                    Show n = new Show(ad);
                    n.ShowD();
                }
                else
                    JOptionPane.showMessageDialog(null, "Please choose Item!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("View");
        frame.setContentPane(new View().panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,300);
    }
}
