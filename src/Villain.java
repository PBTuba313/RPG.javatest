//Second layer class
public abstract class Villain extends Player{

    //Data members
    private String primaryDamage;
    private int damageLevel;

    //Constructors
    protected Villain() {}

    protected Villain(String name, int lives, double health, String primaryDamage, int damageLevel) {
        super(name, lives, health);
        this.primaryDamage = primaryDamage;
        this.damageLevel = damageLevel;
    }

    //Getters and Setters
    public String getPrimaryDamage() {return primaryDamage;}
    public void setPrimaryDamage(String primaryDamage) {this.primaryDamage = primaryDamage;}

    public int getDamageLevel() {return damageLevel;}
    public void setDamageLevel(int damageLevel) {this.damageLevel = damageLevel;}

    public String toString(){return super.toString() + "\n" +
            " Primary damage is " + primaryDamage + "\n" +
            " Damage level is " + damageLevel + "\n";}

    @Override
    public void findsMedicine(){
        System.out.println("Villain has robbed a hospital.");
    }

    @Override
    public void sustainsInjury(){
        System.out.println("Villain has been crushed.");
    }

    @Override
    public void perishes(){
        System.out.println("Villain has died and gone straight to hell.");
    }

}//End of Villain class