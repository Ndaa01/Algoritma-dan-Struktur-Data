package EPL;
import java.util.ArrayList;
import java.util.List;

class Node {
    String team;
    int points;
    int wins;
    int draws;
    int goalDifference;
    Node next;
    List<String> matches;

    public Node(String team) {
        this.team = team;
        this.points = 0;
        this.wins = 0;
        this.draws = 0;
        this.goalDifference = 0;
        this.matches = new ArrayList<>();
        this.next = null;
    }
}
