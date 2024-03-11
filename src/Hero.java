//Second layer class
public abstract class Hero extends Player{

    //Data members
    private String primarySkill;
    private int skillLevel;

    //Constructors
    protected Hero() {}

    protected Hero(String name, int lives, double health, String primarySkill, int skillLevel) {
        super(name, lives, health);
        this.primarySkill = primarySkill;
        this.skillLevel = skillLevel;
    }

    //Getters and Setters
    public String getPrimarySkill() {return primarySkill;}
    public void setPrimarySkill(String primarySkill) {this.primarySkill = primarySkill;}

    public int getSkillLevel() {return skillLevel;}
    public void setSkillLevel(int skillLevel) {this.skillLevel = skillLevel;}

    public String toString(){return super.toString() + "\n" +
            " Primary skill is " + primarySkill + "\n" +
            " Power level is " + skillLevel + "\n";}

    @Override
    public void findsMedicine(){
        System.out.println("Hero has found medicine.");
    }

    @Override
    public void sustainsInjury(){
        System.out.println("Hero has been stabbed.");
    }

    @Override
    public void perishes(){
        System.out.println("Hero has died and gone to heaven.");
    }

}//End of Hero class