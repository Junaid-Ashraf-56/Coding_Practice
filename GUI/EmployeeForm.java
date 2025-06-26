package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Superclass: EmployeeForm
class EmployeeForm extends JFrame {
    protected JTextField nameField, idField, departmentField;
    protected JButton submitButton;
    protected JTextArea outputArea;

    public EmployeeForm() {
        setTitle("Employee Form");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        // Common fields
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Employee ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Department:"));
        departmentField = new JTextField();
        add(departmentField);
    }
}

// Subclass: ManagerForm
class ManagerForm extends EmployeeForm {
    private JTextField teamSizeField, projectNameField;

    public ManagerForm() {
        super(); // Call to parent constructor

        // Additional fields for Manager
        add(new JLabel("Team Size:"));
        teamSizeField = new JTextField();
        add(teamSizeField);

        add(new JLabel("Project Name:"));
        projectNameField = new JTextField();
        add(projectNameField);

        // Submit button
        submitButton = new JButton("Submit");
        add(submitButton);

        // Output area
        outputArea = new JTextArea(5, 20);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        // Action listener for submit
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayManagerInfo();
            }
        });

        // Center the window
        setLocationRelativeTo(null);
    }

    // Method to display all entered data
    private void displayManagerInfo() {
        String name = nameField.getText();
        String id = idField.getText();
        String dept = departmentField.getText();
        String teamSize = teamSizeField.getText();
        String project = projectNameField.getText();

        String result = "Manager Information:\n"
                + "Name: " + name + "\n"
                + "ID: " + id + "\n"
                + "Department: " + dept + "\n"
                + "Team Size: " + teamSize + "\n"
                + "Project Name: " + project;

        outputArea.setText(result);
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ManagerForm().setVisible(true);
        });
    }
}
