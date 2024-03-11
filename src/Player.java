//Parent class
public abstract class Player{

    //Data members
    private String name;
    private int lives;
    private double health;

    //Constructors
    protected Player() {}

    protected Player(String name, int lives, double health) {
        this.name = name;
        this.lives = lives;
        this.health = health;
    }

    //Getters and Setters

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getLives() {return lives;}
    public void setLives(int lives) {this.lives = lives;}

    public double getHealth() {return health;}
    public void setHealth(double health) {this.health = health;}

    public String toString(){return
            "Name: " + name + "\n" +
                    "Lives: " + lives + "\n" +
                    "Health: " + health + "\n";}

    public void findsMedicine(){
        health = health + 0.1;
    }

    public void sustainsInjury(){
        health = health - .10;
    }

    public void perishes(){
        lives = lives - 1;
    }

    public abstract void eat();
    public abstract void speak();

}//End of class.