package GebruikersBeheer;

public class Bezoekers extends Gebruikers {
    public Bezoekers(int id, String naam) {
        super(id, naam, "", "Bezoeker");
    }

    @Override
    public void inloggen() {
        System.out.println("Bezoeker " + naam + " heeft toegang tot het toernooiportaal.");
    }
}

