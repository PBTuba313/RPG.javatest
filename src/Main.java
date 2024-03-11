/*My name is Ammaad Denmark.
And this is my code for Project1 for CSC 225.

The purpose of this code is to create an
inheritance hierarchy that uses Array Lists.*/

import java.util.ArrayList;
import java.util.*;

public class Main{
    public static void main(String[] args){/*Inside our main method we need to
    add a text based menu for the user. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello and welcome to Player Menu!");
        ArrayList<Player> players = new ArrayList<>();//This ArrayList will store Player objects.


        /*Alright, so the rest of the code has to be within a loop until the user
        tells it to stop.*/
        boolean END = false;//Flag variable to control our grand loop.

        while(END != true){

            //Menu for user
            System.out.println("Menu: ");
            System.out.println("1. View all players");
            System.out.println("2. Search players");
            System.out.println("3. Add a player");
            System.out.println("4. Interact with player");
            System.out.println("5. End program");
            System.out.println(" ");

            System.out.print("Please enter 1-5 here: ");
            int user_input = sc.nextInt();
            System.out.println(" ");

            while (user_input < 1 || user_input > 5) {
                System.out.println("That number is invalid.");
                System.out.print("Enter a number in the range of 1 and 5: ");
                user_input = sc.nextInt();
                System.out.println(" ");
            }

            /*First up is view players. This method loops through the ArrayList
             and prints each object which will implicitly grab the toString() for each object.
             If no players are in the ArrayList, you must print a statement that states this. */
            if (user_input == 1){

                for (int i = 0; i < players.size(); i++){

                    /*Use the isEmpty method, paired with an if statement, to check
                    if there are any players in the ArrayList*/
                    if (players.isEmpty()){

                        System.out.println("There are no players.");
                    }   else{

                        System.out.println(players.get(i) + " ");
                    }//End of if/else block

                }//End of for loop
            }//End of view players block.

            //Next is Search player
            else if(user_input == 2){

                char search_name;

                System.out.println("You have chosen to search the inventory.");
                System.out.println("Enter a letter and I will show you all players whose name begins with it: ");
                search_name = sc.next().toLowerCase().charAt(0);
                System.out.println(" ");


                for(int i = 0; i < players.size(); i++){

                    String playerName = players.get(i).getName();
                    playerName = playerName.toLowerCase();
                    char first = playerName.charAt(0);

                    String type = String.valueOf(players.get(i).getClass());
                    type = type.substring(6);

                    if(first == search_name){

                        System.out.println(playerName + "-->" + type + " ");

                    }

                }//End of for loop

            }//End of search player block.

            //Next is Add player.
            else if(user_input == 3){

                System.out.println("You have chosen to add a player.");
                System.out.println(" ");

                System.out.println("Which player type would you like to add? ");
                System.out.println("1. Warrior");
                System.out.println("2. Wizard");
                System.out.println("3. Outlaw");
                System.out.println("4. Warlock");
                System.out.println();

                System.out.println("Enter 1-4 here: ");
                int user_input2 = sc.nextInt();

                while( (user_input2 < 1 || user_input2 > 4) ){//Use a loop to check if the user enters invalid input

                    System.out.println("Invalid input, try again: ");
                    user_input2 = sc.nextInt();
                    System.out.println("");

                }//End of while loop

                /*Alright, here the fun part. The shorter, more efficient version of the Add player
                method involves nested if/else-if statements. Start with the parent class,
                and work your way down.*/

                if (user_input2 >= 1 && user_input2 <= 4){

                    //Initialize variables.

                    //First layer, player.
                    String playerName;
                    int playerLives;
                    double playerHp;

                    //Second layer.

                    //Hero Variables.
                    String mainSkill = "";
                    int skills = 0;

                    //Villain variables.
                    String pDamage = "";
                    int damageLVL = 0;

                    //Third layer

                    //Warrior
                    String weapons = "";
                    String isLegend = "";
                    boolean isTrue1;

                    //Wizard
                    String wizType = "";
                    int wizExp = 0;

                    //Outlaw
                    String isNot = "";
                    boolean isTrue2;
                    String isDeadly = "";
                    boolean isTrue3;

                    //Warlock
                    int spells = 0;
                    int charm = 0;

                    System.out.println("You have entered valid input.");
                    System.out.println("Now you need to enter the attributes the player has.");
                    System.out.println(" ");
                    /*All the 4 player types have a name, number of lives and health.
                     We need to write the code in a way that doesn't repeat
                     requests for each of the four items. */

                    //In the first layer of our grand if statement, ask for the 3 player attributes.

                    //First Layer
                    System.out.println("What's the players name? (No whitespaces please): ");
                    playerName = sc.next();
                    System.out.println(" ");

                    System.out.println("How many lives does the player have? (1-3): ");
                    playerLives = sc.nextInt();
                    System.out.println(" ");

                    System.out.println("What is the players HP? (1-1000): ");
                    playerHp = sc.nextDouble();
                    System.out.println(" ");


                    //Going into the second layer
                    if (user_input2 == 1 || user_input2 == 2){

                        System.out.println("You have chosen a Hero.");
                        System.out.println(" ");
                        /*If the user enters a 1 or 2, it's either a warrior or wizard.
                        Which both belong to the Hero class. So we only need to ask
                        for attributes related to that class.*/

                        System.out.println("What is the hero's primary skill? (No whitespaces please): ");
                        mainSkill = sc.next();
                        System.out.println(" ");

                        System.out.println("What is the hero's skill level? (1-100): ");
                        skills = sc.nextInt();


                    }   else if(user_input2 == 3 || user_input2 == 4){/* If 3 or 4
                    then it's either outlaw or warlock, which both belong to the villain class. */

                        System.out.println("You have chosen a Villain.");
                        System.out.println(" ");

                        System.out.println("How much damage does the villain deal? (1-1000): ");
                        pDamage = sc.next();
                        System.out.println(" ");

                        System.out.println("What is the villain's power level? (0-9000)");
                        damageLVL = sc.nextInt();
                        System.out.println(" ");

                    }//End of villain else-if.

                    //Now we need to go into the 3rd layer
                    if (user_input2 == 1){//

                        System.out.println("You have chosen Warrior.");
                        System.out.println(" ");

                        System.out.println("What's the warrior's weapon? (No whitespaces please): ");
                        weapons = sc.next();
                        System.out.println(" ");

                        System.out.println("Is the warrior a legend? (y/n): ");
                        isLegend = sc.next().toLowerCase();
                        System.out.println(" ");

                        if(isLegend.equals("y")){
                            isTrue1 = true;

                        }   else{

                            isTrue1 = false;
                        }

                        Warrior warrior = new Warrior(playerName, playerLives, playerHp, mainSkill, skills, weapons, isTrue1);
                        players.add(warrior);
                        System.out.println("The attributes for your Warrior have been added.");
                        System.out.println(" ");

                    } else if (user_input2 == 2) {

                        System.out.println("You have chosen Wizard.");
                        System.out.println(" ");

                        System.out.println("What type of wizard are you? (No whitespaces please): ");
                        wizType = sc.next();
                        System.out.println(" ");

                        System.out.println("What is the Wizards power level? (1-1000): ");
                        wizExp = sc.nextInt();
                        System.out.println(" ");

                        Wizard wiz = new Wizard(playerName, playerLives, playerHp, mainSkill, skills, wizType, wizExp);
                        players.add(wiz);
                        System.out.println("The attributes for your Wizard have been added.");
                        System.out.println(" ");

                    } else if (user_input2 == 3){

                        System.out.println("You have chosen Outlaw.");
                        System.out.println(" ");

                        System.out.println("Is the Outlaw a menace? (y/n): ");
                        isNot = sc.next().toLowerCase();
                        System.out.println(" ");

                        if(isNot.equals("y")){
                            isTrue2 = true;

                        }   else{

                            isTrue2 = false;
                        }

                        System.out.println("Is the Outlaw deadly? (y/n): ");
                        isDeadly = sc.next().toLowerCase();
                        System.out.println(" ");

                        if(isDeadly.equals("y")){
                            isTrue3 = true;

                        }   else{

                            isTrue3 = false;
                        }

                        Outlaw outL = new Outlaw(playerName, playerLives, playerHp, pDamage, damageLVL, isTrue2, isTrue3);
                        players.add(outL);
                        System.out.println("The attributes for your Outlaw player have been added.");
                        System.out.println(" ");

                    } else if (user_input2 == 4){

                        System.out.println("You have chosen Warlock.");
                        System.out.println(" ");

                        System.out.println("How many spells can the Warlock cast? (1-20)");
                        spells = sc.nextInt();
                        System.out.println(" ");

                        System.out.println("What is the charm level? (1-10): ");
                        charm = sc.nextInt();
                        System.out.println(" ");

                        Warlock war = new Warlock(playerName, playerLives, playerHp, pDamage, damageLVL, spells, charm);
                        players.add(war);
                        System.out.println("The attributes for your Warlock player have been added.");
                        System.out.println(" ");

                    }

                }//End of big Add player if.

            }//End of Add player block

            else if(user_input == 4){

                System.out.println("You have chosen to interact with players.");
                System.out.println(" ");
                int num_list = 1;
                int user_action;

                for(int i = 0; i < players.size(); i++) {//Use a for loop to print the names of players added.

                    String playerName = players.get(i).getName();
                    playerName = playerName.toLowerCase();

                    System.out.println(num_list +  ". " + playerName);
                    System.out.println(" ");
                    num_list++;

                }//end of for loop.

                System.out.println("Please enter the number of the player you want to interact with: ");
                int playerNum = sc.nextInt();
                System.out.println(" ");

                while (playerNum < 1 || playerNum > players.size()) {
                    System.out.println("That number is invalid.");
                    System.out.print("Enter a number within range: ");
                    playerNum = sc.nextInt();
                    System.out.println(" ");
                }

                //If the player they chose is either a Warrior or warlock.
                if(players.get(playerNum - 1) instanceof Warrior ) {
                    Warrior temp = (Warrior) players.get(playerNum - 1);
                    System.out.println("The item you chose belongs to the Warrior class.");
                    System.out.println(" ");

                    System.out.println("1. Find medicine.");
                    System.out.println("2. Sustain Injury.");
                    System.out.println("3. DIE!");
                    System.out.println("4. Eat");
                    System.out.println("5. Speak");
                    System.out.println(" ");

                    System.out.println("Please enter the number of the action you'd like to perform: ");
                    user_action = sc.nextInt();
                    System.out.println(" ");

                    while (user_action < 1 || user_action > 6) {
                        System.out.println("That number is invalid.");
                        System.out.print("Enter a number between 1 and 3: ");
                        user_action = sc.nextInt();
                        System.out.println(" ");
                    }

                    if (user_action == 1){
                        players.get(playerNum - 1).findsMedicine();
                        System.out.println(" ");

                    }   else if (user_action == 2) {

                        players.get(playerNum - 1).sustainsInjury();
                        System.out.println(" ");

                    }   else if (user_action == 3) {

                        players.get(playerNum - 1).perishes();
                        System.out.println(" ");

                    }   else if(user_action == 4){

                        players.get(playerNum - 1).eat();
                        System.out.println(" ");

                    }   else if(user_action == 5){
                        players.get(playerNum - 1).speak();
                        System.out.println(" ");

                    }

                }   else if (players.get(playerNum - 1) instanceof Warlock){
                    Warlock temp = (Warlock) players.get(playerNum - 1);
                    System.out.println("The number you chose belongs to the Warlock class.");
                    System.out.println(" ");

                    System.out.println("1. Find medicine.");
                    System.out.println("2. Sustain Injury.");
                    System.out.println("3. DIE!");
                    System.out.println("4. Eat");
                    System.out.println("5. Speak");
                    System.out.println(" ");

                    System.out.println("Please enter the number of the action you'd like to perform: ");
                    user_action = sc.nextInt();
                    System.out.println(" ");

                    while (user_action < 1 || user_action > 6) {
                        System.out.println("That number is invalid.");
                        System.out.print("Enter a number between 1 and 5: ");
                        user_action = sc.nextInt();
                        System.out.println(" ");
                    }

                    if (user_action == 1){
                        players.get(playerNum - 1).findsMedicine();
                        System.out.println(" ");

                    }   else if (user_action == 2) {

                        players.get(playerNum - 1).sustainsInjury();
                        System.out.println(" ");

                    }   else if (user_action == 3) {

                        players.get(playerNum - 1).perishes();
                        System.out.println(" ");

                    }   else if(user_action == 4){

                        players.get(playerNum - 1).eat();
                        System.out.println(" ");

                    }   else if(user_action == 5){
                        players.get(playerNum - 1).speak();
                        System.out.println(" ");

                    }

                }   else{

                    System.out.println("You've chosen to interact with " + players.get(playerNum - 1).getName());
                    //-1 because we're going by index


                    System.out.println("1. Find medicine.");
                    System.out.println("2. Sustain Injury.");
                    System.out.println("3. DIE!");
                    System.out.println("4. Eat");
                    System.out.println("5. Speak");
                    System.out.println(" ");

                    System.out.println("Please enter the number of the action you'd like to perform: ");
                    user_action = sc.nextInt();
                    System.out.println(" ");

                    while (user_action < 1 || user_action > 6) {
                        System.out.println("That number is invalid.");
                        System.out.print("Enter a number between 1 and 3: ");
                        user_action = sc.nextInt();
                        System.out.println(" ");
                    }

                    if (user_action == 1){
                        players.get(playerNum - 1).findsMedicine();
                        System.out.println(" ");

                    }   else if (user_action == 2) {

                        players.get(playerNum - 1).sustainsInjury();
                        System.out.println(" ");

                    }   else if (user_action == 3) {

                        players.get(playerNum - 1).perishes();
                        System.out.println(" ");

                    }   else if(user_action == 4){

                        players.get(playerNum - 1).eat();
                        System.out.println(" ");

                    }   else if(user_action == 5){
                        players.get(playerNum - 1).speak();
                        System.out.println(" ");

                    }   else {

                        System.out.println("Invalid input. Try again: ");
                        user_action = sc.nextInt();
                    }

                }

            }//End of Interact if/else block

            else if(user_input == 5){
                END = true;
                System.out.println("User has chosen to end. Goodbye.");

            }//End of if/else-if block

        }//End of Big while loop

    }//End of main method
}//End of Main class.