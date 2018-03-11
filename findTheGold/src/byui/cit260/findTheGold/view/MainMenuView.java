//MainMenuView class - part of the view layer
//Object of this class is to manage the main menu
//Author: Team 5 - Kristen 
//Last Modified: Feb 22 2018
//---------------------------
package byui.cit260.findTheGold.view;

import java.util.Scanner;
import byui.cit260.findTheGold.control.*;
import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.Team5GameProject.*;
import byui.cit260.findTheGold.view.*;

public class MainMenuView extends MenuView {
        
    private String mainMenu;
    private int max;
    
    Scanner keyboard = new Scanner(System.in);    
   

//The doAction method
//Purpose: performs the selected action
//Parameters: none
//Returns: none
//-----------------------------
public void doAction(int option){
    
    switch(option)
    {
        //if the option is 1, call startNewGame()
        case 1://create and start a new game
            startNewGame();
            break;
        //if the option is 2, call startExistingGame()
        case 2: //get and start a saved game
            startSavedGame();
            break;
        //if the option is 3, call displayHelpMenue()
        case 3://get help menu
            displayHelpMenuView();
            break;
        //if the option is 4, call displaySaveGame()
        case 4: //save game
            displaySaveGameView();
            break;
        //if the option is 5, display a goodbye message
        case 5:
            System.out.println("Thanks for playing ... goodbye");
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try Again");
            break;
    }
}
    
//The startNewGame method
//Purpose: creates game object and starts the game
//Parameters: none
//Returns: none
//-----------------------
public void startNewGame(){
    
    //Create a new Game object;
    Game theGame = new Game();
    
    //Save a reference to it in the GameProject class.
    Team5GameProject.setCurrentGame(theGame);
    
    //Display the Banner Page.
    System.out.println("\n" +
            "Welcome to the city of Aaron. You have been summoned\n" +
            "here by the High Priest to assume your role as ruler of the city.\n" +
            "Your responsibility is to buy and sell land, determine how much what\n" +
            "to plant each year and how much to set aside to feed your people. In\n" +
            "addition, it will be your job to pay an annual tithe on the what that\n" +
            "is harvested.  If you fail to provide enough wheat for the people,\n" +
            "people will starve, some people will die, and your workforce will be\n" +
            "diminished.  Plan carefully.  And OH! there is always a danger of rats\n" +
            "eating your wheat.  Look for clues through out the game to help you\n" +
            "succeed!\n");
    
    //Create a new Player object.
    Player thePlayer = new Player();
    
    //Prompt for and get the user's name.
    String name;
    System.out.println("\nPlease type in your first name:");
    name = keyboard.next();
    
    //Save the user's name in the Player object.
    thePlayer.setPlayerName(name);
    
    //Save a reference to the player object in the Game object.
    theGame.setPlayer(thePlayer);
    
    //Display a welcome message.
    System.out.println("\nWelcome High Priest" +name+ ". Rule wisely and you"
            + "will be showered with praise at the end of your term.  Rule"
            + "poorly and you will be thrown out of the city for the tower"
            + "wall!");
    
    //Display the Game menu.
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenu();
    
    //Create the CropData object,
    //initialize it and save a reference to it in the Game.
    CropData theCrops = new CropData();
    theCrops.setYear(0);
    theCrops.setPopulation(100);
    theCrops.setNewPeople(5);
    theCrops.setCropYield(3);
    theCrops.setNumberWhoDied(0);
    theCrops.setOffering(10);
    theCrops.setWheatInStore(2700);
    theCrops.setAcresOwned(1000);
    theCrops.setAcresPlanted(1000);
    theCrops.setHarvest(3000);
    theCrops.setOfferingBushels(300);
    theCrops.setAcresPlanted(1000);
    
    theGame.setCropData(theCrops);
}

//The startSavedGame method
//Purpose: starts saved the game
//Parameters: none
//Returns: none
//-----------------------
public void startSavedGame(){
    
    System.out.println("\nStart saved game option selected.");
}

//The displayHelpMenuView method
//Purpose: displays the help menu
//Parameters: none
//Returns: none
//-----------------------
public void displayHelpMenuView(){
    
    System.out.println("\nDisplay Help Menu View.");
}

//The displaySaveGameView method
//Purpose: displays the Save Game view
//Parameters: none
//Returns: none
//-----------------------
public void displaySaveGameView(){
    
    System.out.println("\nDisplay Save Game View.");
}


//The MainMenuView contructor
//Purpose: Initialize the menu data
//Parameters: none
//Returns: none
// ----------------------------
public MainMenuView(){

    super("\n" +
                "*************************************\n" +
                "* CITY OF AARON: MAIN GAME MENU *\n" +
                "*************************************\n" +            
                "1 - Start new game\n" +
                "2 - Get and start a saved game\n" +
                "3 - Get help on playing the game\n" +
                "4 - Save game\n" +
                "5 - Quit game\n",
                5);
}



}





