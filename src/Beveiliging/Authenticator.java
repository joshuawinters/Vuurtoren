package Beveiliging;

import GebruikersBeheer.Gebruikers;

import java.util.ArrayList;
import java.util.List;

public class Authenticator {
    private List<Gebruikers> gebruikers = new ArrayList<>();

    public void registreerGebruiker(Gebruikers gebruiker) {
        gebruikers.add(gebruiker);
    }

    public Gebruikers inloggen(String naam, String wachtwoord) {
        for (Gebruikers gebruiker : gebruikers) {
            if (gebruiker.getNaam().equals(naam) && gebruiker.getWachtwoord().equals(wachtwoord)) {
                System.out.println("Succesvol ingelogd als " + gebruiker.getNaam());
                return gebruiker;
            }
        }
        System.out.println("Ongeldige inloggegevens!");
        return null;
    }
}
