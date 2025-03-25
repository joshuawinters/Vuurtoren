package Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Simon {
    public static void openSimonScreen() {
        JFrame simonFrame = new JFrame("Wedstrijd Schema's - Simon");
        simonFrame.setSize(1000, 500);
        simonFrame.setLocationRelativeTo(null);
        simonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simonFrame.setLayout(new BorderLayout());

        // Hardcoded teams and points per poule
        String[] pouleA = {"Team Alpha - 3 punten", "Team Bravo - 6 punten", "Team Charlie - 2 punten", "Team Delta - 4 punten"};
        String[] pouleB = {"Team Echo - 1 punt", "Team Foxtrot - 5 punten", "Team Golf - 0 punten", "Team Hotel - 3 punten"};

        // Left panel for poule teams
        JPanel leftPanel = new JPanel(new GridLayout(2, 1));
        leftPanel.setPreferredSize(new Dimension(200, 500));

        JPanel pouleAPanel = new JPanel(new GridLayout(pouleA.length + 1, 1));
        pouleAPanel.setBorder(BorderFactory.createTitledBorder("Poule A"));
        for (String team : pouleA) {
            pouleAPanel.add(new JLabel(team));
        }

        JPanel pouleBPanel = new JPanel(new GridLayout(pouleB.length + 1, 1));
        pouleBPanel.setBorder(BorderFactory.createTitledBorder("Poule B"));
        for (String team : pouleB) {
            pouleBPanel.add(new JLabel(team));
        }

        leftPanel.add(pouleAPanel);
        leftPanel.add(pouleBPanel);

        // Center - Table with matches
        String[] columnNames = {"Poule", "Team 1", "Team 2", "Scheidsrechter", "Uitslag", "Confirm"};
        Object[][] pouleData = {
                {"Poule A", "Team Alpha", "Team Bravo", "Scheids 1", "0 - 0", "Voer in"},
                {"Poule A", "Team Charlie", "Team Delta", "Scheids 2", "0 - 0", "Voer in"},
                {"Poule B", "Team Echo", "Team Foxtrot", "Scheids 3", "0 - 0", "Voer in"},
                {"Poule B", "Team Golf", "Team Hotel", "Scheids 4", "0 - 0", "Voer in"}
        };

        DefaultTableModel tableModel = new DefaultTableModel(pouleData, columnNames);
        JTable pouleTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(pouleTable);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        JButton printButton = new JButton("Print Schema");
        JButton wisselPoulesButton = new JButton("Wissel Poules");
        JButton genereerOpnieuwButton = new JButton("Genereer Opnieuw");
        JButton confirmButton = new JButton("Confirm");

        buttonPanel.add(wisselPoulesButton);
        buttonPanel.add(printButton);
        buttonPanel.add(genereerOpnieuwButton);
        buttonPanel.add(confirmButton);

        // Add components
        simonFrame.add(leftPanel, BorderLayout.WEST);
        simonFrame.add(scrollPane, BorderLayout.CENTER);
        simonFrame.add(buttonPanel, BorderLayout.SOUTH);

        simonFrame.setVisible(true);

    }
}
