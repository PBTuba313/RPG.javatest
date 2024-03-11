/** This class models a Wizard
 * Part of the 3rd layer of classes
 * @author Ammaad Denmark
 */
public class Wizard extends Hero{

    /**The type of Wizard */
    private String type;

    /**Number of years wizard has practiced */
    private int yearsPracticing;

    /**
     * General no argument constructor.
     */
    public Wizard() {}

    /**
     * Creates a new Wizard
     *
     * @param name the name of the wizard.
     * @param  lives the number of lives.
     * @param health amount of health.
     * @param primarySkill the main skill.
     * @param skillLevel the number of the skill level.
     * @param type wizards type.
     * @param yearsPracticing number of years of practice.
     */
    public Wizard(String name, int lives, double health, String primarySkill, int skillLevel, String type, int yearsPracticing) {
        super(name, lives, health, primarySkill, skillLevel);
        this.type = type;
        this.yearsPracticing = yearsPracticing;
    }

    /**
     * Gets the wizards type.
     *
     * @return the wizards type.
     */
    public String getType() {return type;}

    /**Sets the type*/
    public void setType(String type) {this.type = type;}

    /**
     * Gets the years of practice.
     *
     * @return the practice years.
     */
    public int getYearsPracticing() {return yearsPracticing;}

    /**Sets the years of practice*/
    public void setYearsPracticing(int yearsPracticing) {this.yearsPracticing = yearsPracticing;}

    /**
     * Prints a string of data members from the Wizard class.
     *
     * @return data members from the Wizard class in order.
     */
    public String toString(){return super.toString() + "\n" +
            " The Wizard's type is " + type + "\n" +
            " The Wizard has practiced for " + yearsPracticing + "\n";}

    @Override
    /**Override method to indicate the wizard has found medicine. */
    public void findsMedicine(){

        super.findsMedicine();
        System.out.println("The Wizard " + getName() + " casts a healing spell!");
    }

    @Override
    /**Override method to indicate the wizard has sustained injury. */
    public void sustainsInjury(){
        System.out.println("The Wizard " + getName() + " has been struck by a fireball!");
    }

    @Override
    /**Override method to indicate the wizard has perished. */
    public void perishes(){
        System.out.println("The Wizard " + getName() + " has fallen and left this mortal coil.");
    }

    @Override
    /**Override method to indicate the wizard has eaten. */
    public void eat(){System.out.println("The Wizard " + getName() + " ate a salad.");}

    @Override
    /**Override method to indicate the wizard has spoken. */
    public void speak(){System.out.println("The wizard " + getName() + " spoke Abracadabra!");}

}//End of Wizard class.