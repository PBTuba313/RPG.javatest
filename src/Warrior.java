/** This class models a Warrior
 * Part of the 3rd layer of classes
 * @author Ammaad Denmark
 */
public class Warrior extends Hero{

    /**The warrior's weapon*/
    private String weapon;

    /**Whether the warrior is a legend */
    private boolean legendary;

    /**
     * General no argument constructor.
     */
    public Warrior() {}

    /**
     * Creates a new Warrior
     *
     * @param name the name of the warrior.
     * @param  lives the number of lives.
     * @param health amount of health.
     * @param primarySkill the main skill.
     * @param skillLevel the number of the skill level.
     * @param weapon weapon of choice.
     * @param legendary whether warrior is legend or not.
     */
    public Warrior(String name, int lives, double health, String primarySkill, int skillLevel, String weapon, boolean legendary) {
        super(name, lives, health, primarySkill, skillLevel);
        this.weapon = weapon;
        this.legendary = legendary;
    }

    /**
     * Gets the warrior's weapon.
     *
     * @return the weapon of the warrior.
     */
    public String getWeapon() {return weapon;}

    /**Sets the weapon. */
    public void setWeapon(String weapon) {this.weapon = weapon;}

    /**
     * Gets a boolean value.
     *
     * @return Is the warrior legendary.
     */
    public boolean isLegendary() {return legendary;}

    /**Sets legendary status */
    public void setLegendary(boolean legendary) {this.legendary = legendary;}

    /**
     * Prints a string of data members from the Warrior class.
     *
     * @return data members from the Warrior class in order.
     */
    public String toString(){return super.toString() + "\n" +
            " Choice of weapon is " + weapon + "\n" +
            " Is the Warrior a legend? " + legendary + "\n";}

    @Override
    /**Override method to indicate the warrior has found medicine. */
    public void findsMedicine(){
        super.findsMedicine();
        System.out.println("The Warrior " + getName() + " was given medicine.");
    }

    @Override
    /**Override method to indicate the warrior has sustained injury. */
    public void sustainsInjury(){

        System.out.println("The Warrior " + getName() + " has been struck!");
    }

    @Override
    /**Override method to indicate the warrior has perished. */
    public void perishes(){

        System.out.println("The Warrior " + getName() + " has fallen in battle and gone to Valhalla.");
    }

    @Override
    /**Override method to indicate the warrior has eaten. */
    public void eat(){System.out.println("The warrior " + getName() + " ate a leg of meat.");}

    @Override
    /**Override method to indicate the warrior has spoken. */
    public void speak(){System.out.println("The warrior " + getName() + " shouted Set your heart Ablaze!");}

}//End of Warrior class