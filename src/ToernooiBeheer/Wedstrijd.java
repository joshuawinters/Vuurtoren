package ToernooiBeheer;

import TeamBeheer.Team;

public class Wedstrijd {
    private int wedstrijdId;
    private Team team1;
    private Team team2;
    private int scoreTeam1;
    private int scoreTeam2;
    private String veld;

    public Wedstrijd(int wedstrijdId, Team team1, Team team2, String veld) {
        this.wedstrijdId = wedstrijdId;
        this.team1 = team1;
        this.team2 = team2;
        this.veld = veld;
        this.scoreTeam1 = 0;
        this.scoreTeam2 = 0;
    }

    public void voerScoreIn(int score1, int score2) {
        this.scoreTeam1 = score1;
        this.scoreTeam2 = score2;
    }

    public String getResultaat() {
        return team1.getNaam() + " " + scoreTeam1 + " - " + scoreTeam2 + " " + team2.getNaam();
    }
}

