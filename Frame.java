package javaCodeGeeks;

import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 400);

        // Set a layout manager
        frame.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        // Create and add the labels
        JLabel label = new JLabel("Hello je suis le texte ", JLabel.CENTER);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2; // span two columns
        frame.add(label, constraints);

        JLabel after = new JLabel("Je suis un autre texte content");
        constraints.gridy = 1;
        frame.add(after, constraints);

        JLabel nameLabel = new JLabel("Name:");
        constraints.gridy = 2;
        constraints.gridx = 0; // back to first column
        constraints.gridwidth = 1; // reset gridwidth
        frame.add(nameLabel, constraints);

        // Create and add text fields
        JTextField nameField = new JTextField(20); // 20 columns
        constraints.gridx = 1;
        frame.add(nameField, constraints);

        JLabel prenomLabel = new JLabel("Prenom");
        constraints.gridy = 3;
        constraints.gridx = 0; // back to first column
        frame.add(prenomLabel, constraints);

        JTextField prenomField = new JTextField(20);
        constraints.gridx = 1;
        frame.add(prenomField, constraints);

        JLabel adresseLabel = new JLabel("Adresse"); // Corrected label name
        constraints.gridy = 4; // Increment row
        constraints.gridx = 0; // Reset column
        frame.add(adresseLabel, constraints);

        JTextField adresseField = new JTextField(20);
        constraints.gridx = 1;
        frame.add(adresseField, constraints);

        // Create the button panel and add the button
        JPanel buttonPanel = new JPanel();
        JButton bt1 = new JButton("Valider");
        JButton bt2 = new JButton("Supprimer");
        buttonPanel.add(bt1);
        buttonPanel.add(bt2);
        constraints.gridy = 5; // Increment row
        constraints.gridx = 0; // Reset column
        constraints.gridwidth = 2; // Span two columns
        frame.add(buttonPanel, constraints);

        // Add action listeners to buttons
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add functionality for button "Valider" here
                String name = nameField.getText();
                String prenom = prenomField.getText();
                String adresse = adresseField.getText();
                JOptionPane.showMessageDialog(frame, "Bonjour " + prenom + " " + name + " " + adresse);
            }
        });

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add functionality for button "Supprimer" here
                nameField.setText(""); // Clear the text field
                prenomField.setText(""); // Clear the text field
                adresseField.setText(""); // Clear the text field
            }
        });

        // Make the frame visiblesx
        frame.setVisible(true);
    }
}
