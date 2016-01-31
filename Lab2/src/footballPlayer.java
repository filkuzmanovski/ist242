
/**
 *
 * @author Filip Kuzmanovski
 */
public class footballPlayer extends student {
    // Attributes
    private float height;
    private float weight;
    private String experience;
    private String position;
    private String university;
    footballPlayer(String fn, String ln, int ag, String mj, float ht, float wt, String exp, String pos, String uni) {
        super(fn, ln, ag, mj);
        height = ht;
        weight = wt;
        experience = exp;
        position = pos;
        university = uni;
    }
    /**
     * @return the height
     */
    public float getHeight() {
      return height;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }
    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }
    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    /**
     * @return the experience
     */
    public String getExperience() {
        return experience;
    }
    /**
     * @param experience the experience to set
     */
    public void setExperience(String experience) {
        this.experience = experience;
    }
    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }
    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }
    /**
     * @return the name of the university 
     */
    public String getUniversity() {
        return university;
    }
    /**
     * @param university the university to set  
     */
    public void setUniversity(String university) {
        this.university = university;
    }
    
    // All Info method
    String getAllInfo() {
        return "Name: " + getFirstName() + " " + getLastName() + "\nAge: " + getAge() +  "\nStudent Status: " + getStatus() + "\nMajor: " + getMajor() + "\nHeight: " + getHeight() + "\nExperience: " + getExperience() + "\nPlayer Position: " + getPosition() + "\nUniversity: " + getUniversity();
    }
}
