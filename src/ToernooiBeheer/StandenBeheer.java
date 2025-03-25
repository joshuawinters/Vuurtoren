package ToernooiBeheer;

import TeamBeheer.Team;

import java.util.HashMap;
import java.util.Map;

public class StandenBeheer {
    private Map<Team, Integer> standen = new HashMap<>();

    public void updateStand(Team team, int punten) {
        standen.put(team, standen.getOrDefault(team, 0) + punten);
    }

    public void toonStanden() {
        for (Map.Entry<Team, Integer> entry : standen.entrySet()) {
            System.out.println(entry.getKey().getNaam() + ": " + entry.getValue() + " punten");
        }
    }
}

