import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class CricketPlayer {
    String name;
    int no_of_innings;
    int times_of_notout;
    int total_runs;
    double bat_avg;

    public CricketPlayer(String name, int no_of_innings, int times_of_notout, int total_runs) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.times_of_notout = times_of_notout;
        this.total_runs = total_runs;
        this.bat_avg = avg();
    }

    public double avg() {
        return (double) total_runs / (no_of_innings - times_of_notout);
    }

    public static void sortPlayer(CricketPlayer[] players) {
        Arrays.sort(players, Comparator.comparingDouble(player -> player.bat_avg));
    }

    @Override
    public String toString() {
        return "CricketPlayer{" +
                "name='" + name + '\'' +
                ", no_of_innings=" + no_of_innings +
                ", times_of_notout=" + times_of_notout +
                ", total_runs=" + total_runs +
                ", bat_avg=" + bat_avg +
                '}';
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of players:");
        int n = sc.nextInt();

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for player " + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Number of innings: ");
            int no_of_innings = sc.nextInt();
            System.out.print("Times of not out: ");
            int times_of_notout = sc.nextInt();
            System.out.print("Total runs: ");
            int total_runs = sc.nextInt();

            players[i] = new CricketPlayer(name, no_of_innings, times_of_notout, total_runs);
        }

        CricketPlayer.sortPlayer(players);

        System.out.println("\nSorted player details:");
        for (CricketPlayer player : players) {
            System.out.println(player);
        }
    }
}
