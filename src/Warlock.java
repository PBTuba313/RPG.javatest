/** This class models a Warlock
 * Part of the 3rd layer of classes
 * @author Ammaad Denmark
 */
public class Warlock extends Villain{

    /**Level of charisma */
    private int charisma;

    /**Number of spells */
    private int spellCount;

    /**
     * General no argument constructor.
     */
    public Warlock() {}

    /**
     * Creates a new Outlaw
     *
     * @param name the name of the Warlock.
     * @param  lives the number of lives.
     * @param health amount of health.
     * @param primaryDamage the main damage.
     * @param damageLevel the number of the damage level.
     * @param charisma level of charisma.
     * @param spellCount number of spells.
     */
    public Warlock(String name, int lives, double health, String primaryDamage, int damageLevel, int charisma, int spellCount) {
        super(name, lives, health, primaryDamage, damageLevel);
        this.charisma = charisma;
        this.spellCount = spellCount;
    }

    /**
     * Gets the charisma.
     *
     * @return the charisma level.
     */
    public int getCharisma() {return charisma;}

    /** Sets charisma level*/
    public void setCharisma(int charisma) {this.charisma = charisma;}

    /**
     * Gets the number of spells.
     *
     * @return the spell number.
     */
    public int getSpellCount() {return spellCount;}

    /**Sets spell number */
    public void setSpellCount(int spellCount) {this.spellCount = spellCount;}

    /**
     * Prints a string of data members from the Warlock class.
     *
     * @return data members from the Warlock class in order.
     */
    public String toString(){return super.toString() + "\n" +
            " Warlock charisma level is " + charisma + "\n" +
            " Warlock spell count is " + spellCount + "\n";}

    @Override
    /**Override method to indicate the warlock has found medicine. */
    public void findsMedicine(){

        super.findsMedicine();
        System.out.println("The Warlock " + getName() + " has stolen potions.");
    }

    @Override
    /**Override method to indicate the warlock has sustained injury. */
    public void sustainsInjury(){
        System.out.println("The Warlock " + getName() + " has been kicked in the tenders!");
    }

    @Override
    /**Override method to indicate the warlock has perished. */
    public void perishes(){
        System.out.println("The Warlock " + getName() + " has been banished to the Shadow Realm!");
    }

    @Override
    /**Override method to indicate the warlock has eaten. */
    public void eat(){System.out.println("The Warlock " + getName() + " consumed lobster soul.");}

    @Override
    /**Override method to indicate the warlock has spoken. */
    public void speak(){System.out.println("The Warlock " + getName() + " cast an incantation.");}
}//End of Warlock class