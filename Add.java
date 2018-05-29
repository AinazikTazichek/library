import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add {
    private JButton addButton;
    private JTextField language;
    private JTextField isbn;
    private JTextField author;
    private JTextField title;
    private JPanel panel;
    private JComboBox comboBox1;
    private static JFrame frame;

    public Add() {

        addButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (title.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Please fill the title field", "Error", JOptionPane.ERROR_MESSAGE);
                else if (author.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Please fill the a author field", "Error", JOptionPane.ERROR_MESSAGE);
                else if (isbn.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Please fill the b ISBN field", "Error", JOptionPane.ERROR_MESSAGE);
                else if (language.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Please fill the c language field", "Error", JOptionPane.ERROR_MESSAGE);
                else {
                    if (File.AddBook(title.getText(), author.getText(), isbn.getText(), language.getText(), comboBox1.getSelectedItem().toString())) {
                        JOptionPane.showMessageDialog(null, "Book saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        frame.dispose();
                    }
                }
            }

        });
    }
    public static void ShowAdd() {
        frame = new JFrame("Add");
        frame.setContentPane(new Add().panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,200);
    }
}
