package GebruikersBeheer;

//geeft alle gebruikers aan
public class Gebruikers {
    protected int id;
    protected String naam;
    protected String wachtwoord; // Gebruik versleuteling in een echte applicatie
    protected String rol;

    public Gebruikers(int id, String naam, String wachtwoord, String rol) {
        this.id = id;
        this.naam = naam;
        this.wachtwoord = wachtwoord;
        this.rol = rol;
    }
    // inlogen en uitloggen
    // TODO: zorg voor goede beveiliging
    public void inloggen(){
        System.out.println(naam +" is ingelogd");
    }

    public void uitloggen() {
        System.out.println(naam + " is uitgelogd.");
    }

    // Getters en Setters
    public String getWachtwoord() {
        return wachtwoord;
    }

    public String getNaam() {
        return naam;
    }
}
