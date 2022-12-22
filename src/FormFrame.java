import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormFrame extends JFrame {
    private static Font mainFont = new Font("Serpe print", Font.BOLD,18);
    JTextField firstNameField;
    JTextField lastNameField;
    JLabel welcomeLabel;

    public void initialize() {
        JLabel firstNameLabel = new JLabel("First Name");
        firstNameLabel.setFont(mainFont);

        firstNameField = new JTextField();
        firstNameField.setFont(mainFont);

        JLabel lasttNameLabel = new JLabel("Last Name");
        lasttNameLabel.setFont(mainFont);

        lastNameField = new JTextField();
        lastNameField.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        formPanel.add(firstNameLabel);
        formPanel.add(firstNameField);
        formPanel.add(lasttNameLabel);
        formPanel.add(lastNameField);

        welcomeLabel = new JLabel();
        welcomeLabel.setFont(mainFont);

        JButton okButton = new JButton("OK");
        okButton.setFont(mainFont);
        okButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("ok");
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                welcomeLabel.setText(String.format("Hello %s %s", firstName, lastName));
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.setFont(mainFont);
        clearButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Clear");
                firstNameField.setText("");
                lastNameField.setText("");
                welcomeLabel.setText("");
            }
            
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2,5,5));
        buttonPanel.add(okButton);
        buttonPanel.add(clearButton);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(5,5));
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(welcomeLabel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Welcome");
        setSize(500,300);
        setMinimumSize(new Dimension());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
