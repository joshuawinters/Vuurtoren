package TeamBeheer;

import java.util.List;

public class Team {
    private int teamId;
    private String naam;
    private String school;
    private List<Speler> spelers;

    public Team(int teamId, String naam, String school, List<Speler> spelers) {
        this.teamId = teamId;
        this.naam = naam;
        this.school = school;
        this.spelers = spelers;
    }

    public String getNaam() {
        return naam;
    }
}

