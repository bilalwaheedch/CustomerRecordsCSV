package Default;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Bilal on 09-12-2016.
 */
public class CustomerMain {
    public static void main(String[] args) throws Exception{

        String csvFile = "/Users/Bilal/Dropbox/Canada/Software Testing/6. Selenium/Projects/abc.csv";
        Path out = Paths.get("/Users/Bilal/Dropbox/Canada/Software Testing/6. Selenium/Projects/abc.csv");
        FileWriter writer = new FileWriter(csvFile);

        JFrame frame = new JFrame("Customer Records");

        JPanel cPane = new JPanel();
        cPane.setLayout(null);

        JLabel IDJL = new JLabel("ID");
        IDJL.setSize(300, 30);
        IDJL.setLocation(5, 5);
        cPane.add(IDJL);

        JTextField IDTF = new JTextField();
        IDTF.setSize(110, 20);
        IDTF.setLocation(120, 6);
        cPane.add(IDTF);

        JLabel fNameJL = new JLabel("First Name");
        fNameJL.setSize(300, 30);
        fNameJL.setLocation(5, 40);
        cPane.add(fNameJL);

        JTextField fNameTF = new JTextField();
        fNameTF.setSize(110, 20);
        fNameTF.setLocation(120, 46);
        cPane.add(fNameTF);

        JLabel lNameJL = new JLabel("Last Name");
        lNameJL.setSize(300, 30);
        lNameJL.setLocation(5, 80);
        cPane.add(lNameJL);

        JTextField lNameTF = new JTextField();
        lNameTF.setSize(110, 20);
        lNameTF.setLocation(120, 86);
        cPane.add(lNameTF);

        JLabel phoneJL = new JLabel("Phone Number");
        phoneJL.setSize(300, 30);
        phoneJL.setLocation(5, 120);
        cPane.add(phoneJL);

        JTextField phoneTF = new JTextField();
        phoneTF.setSize(110, 20);
        phoneTF.setLocation(120, 126);
        cPane.add(phoneTF);

        JButton btn = new JButton("Save");
        btn.setSize(90,22);
        btn.setLocation(60, 170);

        int cID = 0;

        ArrayList<Customer> customers = new ArrayList<>();


        // add the listener to the jbutton to handle the "pressed" event
        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Customer cFormData = new Customer(cID, fNameTF.getText(), lNameTF.getText(), Integer.parseInt(phoneTF.getText()));

                customers.add(cFormData);
                CSVUtil.CSVWriteFile(out, customers);
                System.out.println(customers.get(cID).getfName()+ " "+customers.get(cID).getlName());
            }
        });

        cPane.add(btn);

        frame.add(cPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(750, 500);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);

    }
}
