package Main;
import Beveiliging.Authenticator;
import TeamBeheer.*;
import ToernooiBeheer.*;
import GebruikersBeheer.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class Setup {

    // Hardcoded users
    private final String user1 = "hanna";
    private final String pass1 = "admin";
    private final String user2 = "simon";
    private final String pass2 = "admin";


    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        new Setup().startScreen();
    }

    public void startScreen(){
        // Hoofdvenster instellen
        frame = new JFrame("Toernooi Beheer Systeem");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        // Titel toevoegen
        JLabel titleLabel = new JLabel("Welkom bij het Toernooi Beheer Systeem", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Panel voor knoppen
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 1, 10, 10));

        // Startknop
        JButton startButton = new JButton("Login");
        startButton.setFont(new Font("Arial", Font.PLAIN, 16));
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Toernooi wordt gestart!", "Informatie", JOptionPane.INFORMATION_MESSAGE);
                frame.dispose(); // Sluit het startscherm
                loginScreen(); // Open het login scherm
            }
        });
        // Afsluitknop
        JButton exitButton = new JButton("Afsluiten");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 16));
        exitButton.addActionListener(e -> System.exit(0));

        // Knoppen toevoegen aan het paneel
        buttonPanel.add(startButton);
        buttonPanel.add(exitButton);

        // Knoppenpaneel toevoegen aan het frame
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Venster weergeven
        frame.setVisible(true);
    }
    private void loginScreen(){
        frame = new JFrame("Toernooi Beheer Systeem");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Toernooi Beheer Systeem");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(titleLabel, BorderLayout.NORTH);
        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        // Username Field
        inputPanel.add(new JLabel("Gebruikersnaam:"));
        usernameField = new JTextField();
        inputPanel.add(usernameField);
        // Password Field
        inputPanel.add(new JLabel("Wachtwoord:"));
        passwordField = new JPasswordField();
        inputPanel.add(passwordField);
        // Buttons
        JButton loginButton = new JButton("Login");
        JButton exitButton = new JButton("Afsluiten");

        inputPanel.add(loginButton);
        inputPanel.add(exitButton);

        frame.add(inputPanel, BorderLayout.CENTER);
        // Action Listeners
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                validateLogin(username, password);
            }
        });

        exitButton.addActionListener(e -> System.exit(0));

        // Show Frame
        frame.setVisible(true);
    }
    private void validateLogin(String username, String password) {
        if (username.equals(user1) && password.equals(pass1)) {
            JOptionPane.showMessageDialog(frame, "Welkom, Hanna!", "Login Succesvol", JOptionPane.INFORMATION_MESSAGE);
            frame.dispose();
            Hanna.openHannaScreen();
        } else if (username.equals(user2) && password.equals(pass2)) {
            JOptionPane.showMessageDialog(frame, "Welkom, Simon!", "Login Succesvol", JOptionPane.INFORMATION_MESSAGE);
            frame.dispose();
            Simon.openSimonScreen();
        } else {
            JOptionPane.showMessageDialog(frame, "Ongeldige inloggegevens!", "Fout", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void openMainDashboard() {
        // Hier kun je het hoofdmenu openen (bijv. een nieuw frame of panel tonen)
        JFrame dashboard = new JFrame("Dashboard");
        dashboard.setSize(800, 600);
        dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dashboard.setLocationRelativeTo(null);

        JLabel welcomeLabel = new JLabel("Hoofdmenu - Selecteer een optie", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));

        dashboard.add(welcomeLabel);
        dashboard.setVisible(true);
    }



    public static void setup(){
        // Teams en spelers maken
        Speler speler1 = new Speler(1, "Jan", 15);
        Speler speler2 = new Speler(2, "Piet", 16);
        Team team1 = new Team(1, "De Tijgers", "School A", Arrays.asList(speler1, speler2));

        // Wedstrijd aanmaken
        Wedstrijd wedstrijd = new Wedstrijd(1, team1, new Team(2, "De Wolven", "School B", Arrays.asList()), "Veld 1");

        // Stand invoeren
        wedstrijd.voerScoreIn(3, 2);
        System.out.println(wedstrijd.getResultaat());

        // Gebruikersbeheer
        Authenticator auth = new Authenticator();
        ToernooiLeider admin = new ToernooiLeider(1, "Klaas", "admin123");
        auth.registreerGebruiker(admin);
        auth.inloggen("Klaas", "admin123");
    }
}
