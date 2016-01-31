import java.util.*;
class footballPlayer {
    
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
   
    // Method for displaying rushing yards
     public void rushYards() {
        Random rushRand;
        rushRand = new Random();
        int n;
        n = rushRand.nextInt(100);
    }
    
    // Method for displaying player info
    @Override
    public String toString() {
       return String.format("Player Name: %s %s \nAge: %d years old \nPosition: %s \nWeight: %d lbs \n", getFirstName(), getLastName(), getAge(), getPosition(), getWeight());
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
