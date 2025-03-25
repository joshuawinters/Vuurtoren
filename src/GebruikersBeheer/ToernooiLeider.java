package GebruikersBeheer;

public class ToernooiLeider extends Gebruikers {
    public ToernooiLeider(int id, String naam, String wachtwoord) {
        super(id, naam, wachtwoord, "Toernooileider");
    }

    @Override
    public void inloggen() {
        System.out.println("Toernooileider " + naam + " is ingelogd.");
    }

    public void genereerSchema() {
        System.out.println("Wedstrijdschema wordt gegenereerd...");
    }
}

