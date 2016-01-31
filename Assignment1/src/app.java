
import java.util.*;
/**
 * @author Filip Kuzmanovski
 */
public class app {
   public static void main(String[] args){
        
        // Declaring Array list of Football Players
        ArrayList<footballPlayer> player = new ArrayList<>();
        
        // list of 11 players
        player.add(new footballPlayer("Antonio", "Brown", 27, "WR", 180));
        player.add(new footballPlayer("Julian", "Edelman", 29, "WR", 200));
        player.add(new footballPlayer("Tom", "Brady", 38, "QB", 225));
        player.add(new footballPlayer("J.J.", "Watt", 26, "DE", 289));
        player.add(new footballPlayer("Calvin", "Johnson", 30, "WR", 239));
        player.add(new footballPlayer("Marshawn", "Lynch", 29, "RB", 215));
        player.add(new footballPlayer("Rob", "Gronkowski", 26, "TE", 265));
        player.add(new footballPlayer("Richard", "Sherman", 27, "CB", 195));
        player.add(new footballPlayer("Julio", "Jones", 26, "WR", 220));
        player.add(new footballPlayer("Clay", "Matthews", 29, "LB", 260));
        
        // Creating a team with the above players
        footballTeam team = new footballTeam("NFL Elite", "Bald Eagle", player); 
        
        // User prompt for position desired
        System.out.print("Enter a position that you want information for: ");
        Scanner scnr = new Scanner(System.in);
        String positionDesired = scnr.nextLine();
        
        // Dot notation for displaying information on player including Rush Yards
        team.playerInfo(positionDesired);
        System.out.println("");
        
        // Displaying Team Info with Summary of Rush Yards
         team.teamInfo();        
    }
}