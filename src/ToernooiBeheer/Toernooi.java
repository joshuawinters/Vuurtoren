package ToernooiBeheer;

import TeamBeheer.Team;

import java.util.List;

public class Toernooi {
    private int id;
    private String naam;
    private List<Team> teams;
    private List<Wedstrijd> wedstrijden;

    public Toernooi(int id, String naam, List<Team> teams) {
        this.id = id;
        this.naam = naam;
        this.teams = teams;
    }

    public void genereerWedstrijdschema() {
        System.out.println("Het wedstrijdschema wordt gegenereerd...");
    }

    public void toonStanden() {
        System.out.println("Toernooi standen worden weergegeven...");
    }
}

