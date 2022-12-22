import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;;

public class MainFrame extends JFrame {
    public MainFrame(){
        
        JButton formButton = new JButton("Form");
        formButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("form");
                FormFrame formFrame = new FormFrame();
                formFrame.initialize();
            }
        });

        JButton flowButton = new JButton("Flow Layout");
        flowButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("flow");
                FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame();
                flowLayoutFrame.initialize();
            }
        });

        JButton borderButton = new JButton("Border Layout");
        borderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("border");
                BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
                borderLayoutFrame.initialize();
        
            }
        });

        JButton gridButton = new JButton("Grid Layout");
        gridButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("grid");
                GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();
                gridLayoutFrame.initialize();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(formButton);
        buttonPanel.add(flowButton);
        buttonPanel.add(borderButton);
        buttonPanel.add(gridButton);

        add(buttonPanel);
    }

    public void initialize(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,75);
		setVisible(true);
    }
}