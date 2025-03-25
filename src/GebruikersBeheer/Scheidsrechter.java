package GebruikersBeheer;

public class Scheidsrechter extends Gebruikers {
    private String school;

    public Scheidsrechter(int id, String naam, String wachtwoord, String school) {
        super(id, naam, wachtwoord, "Scheidsrechter");
        this.school = school;
    }

    @Override
    public void inloggen() {
        System.out.println("Scheidsrechter " + naam + " is ingelogd.");
    }

    public void voerStandIn(int wedstrijdId, int scoreTeam1, int scoreTeam2) {
        System.out.println("Stand voor wedstrijd " + wedstrijdId + " ingevoerd: " + scoreTeam1 + " - " + scoreTeam2);
    }
}

