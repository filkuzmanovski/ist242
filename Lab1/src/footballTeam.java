
import java.util.ArrayList;

class footballTeam {
    
    // Attributes
    private String teamName;
    private String mascot;
    private ArrayList<footballPlayer> player;
    
    // Constructor
    footballTeam(String teamName, String mascot, ArrayList<footballPlayer> player) {
        this.teamName = teamName;
        this.mascot = mascot;
        this.player = player;   
    }
    
    // Displaying information for team
    @Override
    public String toString(){
        String vidT = "";
        vidT += ("Team Name: " + getTeamName() + "\n");
        vidT += ("Team Mascot: " + getMascot() + "\n");
        vidT += "Team Roster listed below: \n";
        vidT += "\n";
        // For loop for listing players
        for(int i = 0; i < getPlayer().size(); i++) {
            vidT += getPlayer().get(i).toString();
            vidT += "\n";
        }
        
        return vidT;
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
