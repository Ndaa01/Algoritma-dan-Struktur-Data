package EPL;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Klasemen eplStandings = new Klasemen();

        // Daftar klub di Premier League
        String[] clubs = {
            "Arsenal", "Aston Villa", "Bournemouth", "Brentford", "Brighton",
            "Burnley", "Chelsea", "Crystal Palace", "Everton", "Fulham",
            "Liverpool", "Luton Town", "Manchester City", "Manchester United",
            "Newcastle United", "Nottingham Forest", "Sheffield United",
            "Tottenham Hotspur", "West Ham United", "Wolves"
        };

        // Menambahkan tim ke dalam klasemen
        for (String club : clubs) {
            eplStandings.addTeam(club);
        }

        // Simulasi pertandingan
        simulateMatches(eplStandings, clubs);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Menampilkan Klasemen");
            System.out.println("2. Menampilkan Riwayat Tim");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    eplStandings.sortStandings();
                    eplStandings.displayStandings();
                    break;
                case 2:
                    displayTeamMenu(scanner, eplStandings, clubs);
                    break;
                case 3:
                    // Exit
                    System.out.println("Terima kasih! Program berakhir.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (choice != 3);
    }

    private static void displayTeamMenu(Scanner scanner, Klasemen eplStandings, String[] clubs) {
        System.out.println("Pilih tim untuk melihat riwayat pertandingan:");
        for (int i = 0; i < clubs.length; i++) {
            System.out.println((i + 1) + ". " + clubs[i]);
        }
        System.out.print("Masukkan nomor tim (1-20): ");
        int teamChoice = scanner.nextInt();
        if (teamChoice >= 1 && teamChoice <= clubs.length) {
            String selectedTeam = clubs[teamChoice - 1];
            eplStandings.findTeamMatches(selectedTeam);
        } else {
            System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
        }
    }

        private static void simulateMatches(Klasemen eplStandings, String[] clubs) {
        Random rand = new Random();
        for (int i = 0; i < clubs.length; i++) {
            for (int j = i + 1; j < clubs.length; j++) {
                for (int k = 0; k < 2; k++) {
                    int score1 = rand.nextInt(5); // Skor acak untuk tim 1 (0-4)
                    int score2 = rand.nextInt(5); // Skor acak untuk tim 2 (0-4)
                    eplStandings.recordMatch(clubs[i], score1, clubs[j], score2);
                }
            }
        }
    }
}
