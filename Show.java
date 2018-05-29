import javax.swing.*;
import java.awt.event.*;

public class Show {
    private JPanel panel1;
    private JLabel label;
    private JButton ok;
    private JScrollPane scrollPane;
    private static JFrame frame;
    private static String start="<html><body>";
    private static String text;
    private static String end="</body></html>";

    public Show(String i) {
        File f=new File();
        String[][] allBook = f.books(i);
        for(int k=0; k<allBook.length;k++) {
            text += "Title: " + allBook[k][0] + "<br>" + "Author: " + allBook[k][1] + "<br>" + "ISBN: " + allBook[k][2] + "<br>" + "Language: " + allBook[k][3] + "<br><br>";
        }
        label.setText(start + text + end);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               text="";
                frame.dispose();
            }
        });


    }

    public  void ShowD() {
        frame  = new JFrame("Show");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,300);
    }
}
