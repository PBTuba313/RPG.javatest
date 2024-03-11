/** This class models an outlaw
 * Part of the 3rd layer of classes
 * @author Ammaad Denmark
 */
public class Outlaw extends Villain{

    /**Determines if the outlaw is notorious or not*/
    private boolean notorious;

    /**Determines if the outlaw is deadly or not*/
    private boolean deadly;

    /**
     * General no argument constructor.
     */
    public Outlaw() {}

    /**
     * Creates a new Outlaw
     *
     * @param name the name of the Outlaw.
     * @param  lives the number of lives.
     * @param health amount of health.
     * @param primaryDamage the main damage.
     * @param damageLevel the number of the damage level.
     * @param notorious is the outlaw a menace.
     * @param deadly is the outlaw deadly.
     */
    public Outlaw(String name, int lives, double health, String primaryDamage, int damageLevel, boolean notorious, boolean deadly) {
        super(name, lives, health, primaryDamage, damageLevel);
        this.notorious = notorious;
        this.deadly = deadly;
    }

    /**
     * Gets true or false.
     *
     * @return is notorious or not.
     */
    public boolean isNotorious() {return notorious;}

    /**Sets if notorious or not*/
    public void setNotorious(boolean notorious) {this.notorious = notorious;}

    /**
     * Gets true or false.
     *
     * @return is deadly or not.
     */
    public boolean isDeadly() {return deadly;}

    /**Sets if deadly */
    public void setDeadly(boolean deadly) {this.deadly = deadly;}

    /**
     * Prints a string of data members from the Outlaw class.
     *
     * @return data members from the Outlaw class in order.
     */
    public String toString(){return super.toString() + "\n" +
            " Is the Outlaw a menace 2 society? " + notorious + "\n" +
            " Is the Outlaw deadly? " + deadly + "\n";}

    @Override
    /**Override method to indicate the outlaw has found medicine. */
    public void findsMedicine(){

        super.findsMedicine();
        System.out.println("The Outlaw " + getName() + " has mugged a civilian!");
    }

    @Override
    /**Override method to indicate the outlaw has sustained injury. */
    public void sustainsInjury(){
        System.out.println("The Outlaw " + getName() + " has been shot!");
    }

    @Override
    /**Override method to indicate the outlaw has perished. */
    public void perishes(){
        System.out.println("The Outlaw " + getName() + " was killed by the Amish mafia.");
    }

    @Override
    /**Override method to indicate the outlaw has eaten. */
    public void eat(){System.out.println("The Outlaw " + getName() + " ate a roasted possum.");}

    @Override
    /**Override method to indicate the outlaw has spoken. */
    public void speak(){System.out.println("The Outlaw " + getName() + " shouted for women and money!");}
}//End of Outlaw class.