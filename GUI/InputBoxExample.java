package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


abstract class Employee1 {
    protected String name;
    protected int hours;

    public Employee1(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public abstract double calculateSalary();
}
class FullTimeEmployee1 extends Employee1 {

    public FullTimeEmployee1(String name, int hours) {
        super(name, hours);
    }

    @Override
    public double calculateSalary() {
        return hours * 100; // Full-time rate
    }
}
class PartTimeEmployee1 extends Employee1 {

    public PartTimeEmployee1(String name, int hours) {
        super(name, hours);
    }

    @Override
    public double calculateSalary() {
        return hours * 50; // Part-time rate
    }
}

class EmployeeForm extends JFrame {

    private JTextField nameField, hoursField;
    private JComboBox<String> typeBox;
    private JButton submitButton;
    private JLabel resultLabel;

    public EmployeeForm() {
        setTitle("GUI.Employee1 Salary Form");
        setSize(350, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameField = new JTextField(15);
        hoursField = new JTextField(5);
        typeBox = new JComboBox<>(new String[] {"Full-Time", "Part-Time"});
        submitButton = new JButton("Calculate Salary");
        resultLabel = new JLabel("");

        add(new JLabel("Name:"));
        add(nameField);

        add(new JLabel("Hours:"));
        add(hoursField);

        add(new JLabel("Type:"));
        add(typeBox);

        add(submitButton);
        add(resultLabel);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int hours = Integer.parseInt(hoursField.getText());
                String type = (String) typeBox.getSelectedItem();

                Employee1 emp;

                // Polymorphism: parent reference, child object
                if (type.equals("Full-Time")) {
                    emp = new FullTimeEmployee1(name, hours);
                } else {
                    emp = new PartTimeEmployee1(name, hours);
                }

                double salary = emp.calculateSalary();
                resultLabel.setText(name + "'s Salary: " + salary);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeForm();
    }
}