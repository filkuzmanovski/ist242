/**
 *
 * @author Filip Kuzmanovski
 */
public class collegeFootballPlayer extends footballPlayer {
    // Atributes
    private double totalYrd;
    private int totalTds;
    collegeFootballPlayer(String fn, String ln, int ag, String mj, float ht, float wt, String exp, String pos, String uni, double tYards, int tTds) {
        super(fn, ln, ag, mj, ht, wt, exp, pos, uni);
        totalYrd = tYards;
        totalTds = tTds;
    }

 
    /**
     * @return the total yards by player
     */
    public double getTotalYrd() {
       return totalYrd;
    }
    /**
     * @param totalYrd the total yards by player
     */
    public void setTotalYrd(double totalYrd) {
        this.totalYrd = totalYrd;
    }
    /**
     * @return the total touchdowns scored by player
     */
    public int getTotalTds() {
        return totalTds;
    }
    /**
     * @param totalTds total touchdowns by player
     */
    public void setTotalTds() {
        this.totalTds = totalTds;
    }
    // All Info method
    String getAllInfo() {
        return "Name: " + getFirstName() + " " + getLastName() + "\nAge: " + getAge() +  "\nStudent Status: " + getStatus() + "\nMajor: " + getMajor() + "\nHeight: " + getHeight() + "\nExperience: " + getExperience() + "\nPlayer Position: " + getPosition() + "\nUniversity: " + getUniversity() + "\nTotal Yards: " + getTotalYrd() + "\nTotal Touchdowns: " + getTotalTds();
    }
}
