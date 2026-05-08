
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<Team> teams = readTeamsFromFile(file);
        
        System.out.println("Team: ");
        String teamToSearch = scan.nextLine();
        
        System.out.println("Games: " + getGamesPlayed(teamToSearch, teams));
        System.out.println("Wins: " + getGamesWon(teamToSearch, teams));
        System.out.println("Losses: " + getGamesLost(teamToSearch, teams));
    }
    
    public static ArrayList<Team> readTeamsFromFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();
        
        try (Scanner scFile = new Scanner(Paths.get(file))) {
            
            while (scFile.hasNextLine()) {
                String row = scFile.nextLine();
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                teams.add(new Team(homeTeam, homeTeamPoints));
                teams.add(new Team(visitingTeam, visitingTeamPoints));
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return teams;
    }
    
    public static int getGamesPlayed(String teamToSearch, ArrayList<Team> teams) {
        int gamesPlayed = 0;
        
        for (Team team : teams) {
            if (teamToSearch.equalsIgnoreCase(team.getName())) {
                gamesPlayed++;
            }
        }
        
        return gamesPlayed;
    }
    
    public static int getGamesWon(String teamToSearch, ArrayList<Team> teams) {
        int gamesWon = 0;
        for (int i = 0; i < teams.size(); i+=2) {
            if (!teams.get(i).getName().equalsIgnoreCase(teamToSearch) && !teams.get(i+1).getName().equalsIgnoreCase(teamToSearch)) {
                continue;
            }
            
            if (teams.get(i).getName().equalsIgnoreCase(teamToSearch)) {
                int points = teams.get(i).getPoints();
                if (points > teams.get(i+1).getPoints()) {
                    gamesWon++;
                } 
            } else {
                int points = teams.get(i+1).getPoints();
                if (points > teams.get(i).getPoints()) {
                    gamesWon++;
                }
            }
        }
        
        return gamesWon;
    }
    
    public static int getGamesLost(String teamToSearch, ArrayList<Team> teams) {
        int gamesLost = 0;
        for (int i = 0; i < teams.size(); i+=2) {
            if (!teams.get(i).getName().equalsIgnoreCase(teamToSearch) && !teams.get(i+1).getName().equalsIgnoreCase(teamToSearch)) {
                continue;
            }
            
            if (teams.get(i).getName().equalsIgnoreCase(teamToSearch)) {
                int points = teams.get(i).getPoints();
                if (points < teams.get(i+1).getPoints()) {
                    gamesLost++;
                } 
            } else {
                int points = teams.get(i+1).getPoints();
                if (points < teams.get(i).getPoints()) {
                    gamesLost++;
                }
            }
        }
        
        return gamesLost; 
    }


}
