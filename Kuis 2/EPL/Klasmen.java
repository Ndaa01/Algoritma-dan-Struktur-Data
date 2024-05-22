package EPL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Klasemen {
    Node head;

    public Klasemen() {
        this.head = null;
    }

    // Menambahkan tim baru ke dalam linked list
    public void addTeam(String team) {
        Node newNode = new Node(team);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Memperbarui poin tim berdasarkan hasil pertandingan
    public void recordMatch(String team1, int score1, String team2, int score2) {
        Node teamNode1 = findTeam(team1);
        Node teamNode2 = findTeam(team2);

        if (teamNode1 == null || teamNode2 == null) {
            System.out.println("Salah satu atau kedua tim tidak ditemukan.");
            return;
        }

        // Rekam hasil pertandingan
        teamNode1.matches.add("Vs " + team2 + ": " + score1 + "-" + score2);
        teamNode2.matches.add("Vs " + team1 + ": " + score2 + "-" + score1);

        if (score1 > score2) {
            teamNode1.points += 3;
            teamNode1.wins += 1;
            teamNode1.goalDifference += (score1 - score2);
            teamNode2.goalDifference -= (score1 - score2);
        } else if (score1 < score2) {
            teamNode2.points += 3;
            teamNode2.wins += 1;
            teamNode2.goalDifference += (score2 - score1);
            teamNode1.goalDifference -= (score2 - score1);
        } else {
            teamNode1.points += 1;
            teamNode2.points += 1;
            teamNode1.draws += 1;
            teamNode2.draws += 1;
        }
    }

    // Menemukan tim berdasarkan nama
    private Node findTeam(String team) {
        Node current = head;
        while (current != null) {
            if (current.team.equals(team)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void sortStandings() {
        if (head == null || head.next == null) {
            return;
        }

        Node sortedList = null;

        while (head != null) {
            Node current = head;
            head = head.next;

            if (sortedList == null || current.points > sortedList.points) {
                current.next = sortedList;
                sortedList = current;
            } else {
                Node search = sortedList;
                while (search.next != null && search.next.points > current.points) {
                    search = search.next;
                }
                current.next = search.next;
                search.next = current;
            }
        }

        head = sortedList;
    }

    // Menampilkan klasemen
    public void displayStandings() {
        if (head == null) {
            System.out.println("Klasemen kosong.");
        } else {
            System.out.format("%-20s%-10s%-10s%-10s%-15s%n", "Team", "Points", "Wins", "Draws", "Goal Difference");
            System.out.println("---------------------------------------------------------------");
            Node current = head;
            while (current != null) {
                System.out.format("%-20s%-10d%-10d%-10d%-15d%n", current.team, current.points, current.wins, current.draws, current.goalDifference);
                current = current.next;
            }
        }
    }

    public void findTeamMatches(String team) {
        Node teamNode = findTeam(team);
        if (teamNode == null) {
            System.out.println("Tim tidak ditemukan.");
        } else {
            System.out.println("Hasil pertandingan " + team + ":");
            List<String> shuffledMatches = new ArrayList<>(teamNode.matches);
            Collections.shuffle(shuffledMatches);
            for (String match : shuffledMatches) {
                System.out.println(match);
            }
        }
    }
}
