
import java.util.Random;



/**
 * @author Filip Kuzmanovski
 */
public class footballPlayer {
     // Player Attributes
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private int weight;
    
    // Constructor
    footballPlayer(String pl_firstName, String pl_lastName, int pl_age, String pl_position, int pl_weight) {
        firstName = pl_firstName;
        lastName = pl_lastName;
        age = pl_age;
        position = pl_position;
        weight = pl_weight;
    }
    
    // footballPlayer method
    footballPlayer() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.position = "";
        this.weight = 0;
    }
    
    // Print info on player and their stats
    void playerAttr() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Player Age: " + getAge());
        System.out.println("Player Position: " + getPosition());
        System.out.println("Player Weight: " + getWeight());
        System.out.println("Player's Rushing Yards: " + rushingYard());
    }
    
    // Method for displaying random rushing yards
    int rushingYard() {
        int val = 0;
        double rushVal = Math.random(); 
         val = (int) (rushVal * 100.0)+ 1;
        return val;  
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
