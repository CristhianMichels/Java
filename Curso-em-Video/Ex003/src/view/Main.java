package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JLabel jLabel1;
    private JButton clickMeButton;
    private JPanel MainPanel;

    public Main (){
        setContentPane(MainPanel);
        setTitle("HelloWorldJava");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel1.setText("Hello World!");
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
