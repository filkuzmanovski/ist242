
import java.util.ArrayList;

/**
 *
 * @author Filip Kuzmanovski
 */
public class footballTeam {
    // Attributes
    private String teamName;
    private String mascot;
    private int instantYards;
    private ArrayList<footballPlayer> player;
    
    // Constructor
    footballTeam(String tm_teamName, String tm_mascot, ArrayList<footballPlayer> tm_player) {
        teamName = tm_teamName;
        mascot = tm_mascot;
        player = tm_player;
    }
    
    // Displaying Team Info
       void teamInfo() {
        System.out.println("Team Name: " + getTeamName());
        System.out.println("Team Mascot: " + getMascot());
        System.out.println("Instant Rushing Yards: " + instantYards());
        System.out.println("");
        
        for (int i = 0; i < getPlayer().size(); i++) {
            getPlayer().get(i).playerAttr();
            System.out.println("");
        }
    }
    
    // Method for Instant Yards
    public int instantYards() {
        int yardsTotal = 0;
        for (int i = 0; i < getPlayer().size(); i++) {
            yardsTotal += getPlayer().get(i).rushingYard();
            instantYards = yardsTotal;
        }
        return instantYards;
    }
    
    //Player information method Based on search by position
     String playerInfo(String searchPosition) {
        footballPlayer searchPlayer = new footballPlayer();
        boolean validPlayer = false;
        
        //For loop to check players by position entry
        for (int j = 0; j < getPlayer().size(); j++) {
            searchPlayer = getPlayer().get(j);
            if (searchPosition.equals(searchPlayer.getPosition())) {
                searchPlayer.playerAttr();
                System.out.println("");
                validPlayer = true;
            }
        }
        if (!validPlayer) {
            System.out.println("You entered an invalid position");
        }
        return searchPosition;
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the mascot
     */
    public String getMascot() {
        return mascot;
    }

    /**
     * @param mascot the mascot to set
     */
    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    

    /**
     * @param instantYards the instantYards to set
     */
    public void setInstantYards(int instantYards) {
        this.instantYards = instantYards;
    }

    /**
     * @return the player
     */
    public ArrayList<footballPlayer> getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(ArrayList<footballPlayer> player) {
        this.player = player;
    }
}   
    