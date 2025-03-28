package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.io.File;

public class Hanna {

    public static void openHannaScreen() {
        JFrame hannaFrame = new JFrame("Hanna's Dashboard");
        hannaFrame.setSize(600, 400);
        hannaFrame.setLocationRelativeTo(null);
        hannaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hannaFrame.setLayout(new GridLayout(6, 1, 10, 10));

        // Welcome Label
        JLabel welcomeLabel = new JLabel("Welkom, Hanna!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        hannaFrame.add(welcomeLabel);

        // Import CSV Button
        JButton importCsvButton = new JButton("Importeer CSV");
        importCsvButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                importCsv();
            }
        });
        hannaFrame.add(importCsvButton);

        // Enter Number of Poules Button
        JButton enterPoulesButton = new JButton("Voer aantal poules in");
        enterPoulesButton.addActionListener(e -> enterPoules());
        hannaFrame.add(enterPoulesButton);

        // Generate Poules Button
        JButton generatePoulesButton = new JButton("Genereer Poules");
        generatePoulesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generatePoules();
            }
        });
        hannaFrame.add(generatePoulesButton);

        //Generate game schedule
        JButton generateWedstrijdSchema = new JButton("Genereer wedstrijd schema");
        generateWedstrijdSchema.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateGameSchedule();
            }
        });
        hannaFrame.add(generateWedstrijdSchema);

        // Dropdown for Sport Selection
        String[] sports = {"Voetbal", "Basketbal", "Volleybal", "Hockey"};
        JComboBox<String> sportDropdown = new JComboBox<>(sports);
        hannaFrame.add(new JLabel("Kies een sport:", SwingConstants.CENTER));
        hannaFrame.add(sportDropdown);

        // Enter Available Fields Button
        JButton enterFieldsButton = new JButton("Voer beschikbare velden in");
        enterFieldsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enterAvailableFields();
            }
        });
        hannaFrame.add(enterFieldsButton);

        hannaFrame.setVisible(true);

    }

    // Function to handle CSV import
    private static void importCsv() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(null, "CSV bestand geïmporteerd: " + selectedFile.getName());
        }
    }

    // Function to enter poule count
    private static void enterPoules() {
        String input = JOptionPane.showInputDialog("Voer het aantal poules in:");
        if (input != null && !input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aantal poules: " + input);
        }
    }

    // Function to generate poules
    private static void generatePoules() {
        JOptionPane.showMessageDialog(null, "Poules gegenereerd!");
    }

    // Function to generate wedstrijd schema
    private static void generateGameSchedule() {
        JOptionPane.showMessageDialog(null, "Poules gegenereerd!");
    }
    // Function to enter available fields
    private static void enterAvailableFields() {
        String input = JOptionPane.showInputDialog("Voer het aantal beschikbare velden in:");
        if (input != null && !input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Beschikbare velden: " + input);
        }
    }
}
