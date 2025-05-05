package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Base class
class Person {
    protected String name;
    protected String phone;
    protected String email;

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

// Derived class
class Doctor extends Person {
    private String specialization;

    public Doctor(String name, String phone, String email, String specialization) {
        super(name, phone, email);
        this.specialization = specialization;
    }

    public String getDetails() {
        return "Doctor Info:\n" +
                "Name: " + name + "\n" +
                "Specialization: " + specialization + "\n" +
                "Phone: " + phone + "\n" +
                "Email: " + email;
    }
}

// GUI Class
public class Hospital extends JFrame implements ActionListener {
    JTextField nameField, specField, phoneField, emailField;
    JTextArea outputArea;
    JButton submitBtn;

    public Hospital() {
        setTitle("Doctor Information");
        setSize(400, 400);
        setLayout(new GridLayout(7, 2, 10, 10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Input Fields
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Specialization:"));
        specField = new JTextField();
        add(specField);

        add(new JLabel("Phone:"));
        phoneField = new JTextField();
        add(phoneField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        submitBtn = new JButton("Submit");
        submitBtn.setBackground(Color.CYAN);
        submitBtn.setForeground(Color.BLUE);
        submitBtn.setFocusable(false);
        submitBtn.addActionListener(this);
        add(submitBtn);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String spec = specField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();

        Doctor doc = new Doctor(name, phone, email, spec);
        outputArea.setText(doc.getDetails());
    }

    public static void main(String[] args) {
        new Hospital();
    }
}

