//MainMenuView class - part of the view layer
//Object of this class is to manage the main menu
//Author: Team 5 - Kristen 
//Last Modified: Feb 22 2018
//---------------------------
package byui.cit260.findTheGold.view;

import byui.cit260.findTheGold.control.*;
import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.Team5GameProject.*;
import byui.cit260.findTheGold.view.*;

public class MainMenuView extends MenuView {
        
    private String mainMenu;
    private int max;
   

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


private void startNewGame(){
    
    System.out.println("\nStart new game option selected.");
    GameControl gameRef = new GameControl();
    gameRef.startNewGame();  
}



//The startSavedGame method
//Purpose: loads a saved game object from disk and start the game
//Parameters: none
//Returns: none
//-----------------------
public void startSavedGame(){
    
    String filePath;
    
    //prompt user and got a file path
    System.out.println("\n\nEnter the file path where you want to load the game from:");
    keyboard.nextLine(); //this gets rid of the newline left by getMenuOption()
    filePath = keyboard.nextLine();
    
    //calls the getSavedGame() method in the GameControl class to load the game
    GameControl.getSavedGame(filePath);
    
    //display the game menue for the loaded game
    GameMenuView gmv = new GameMenuView();
    gmv.displayMenu();
    System.out.println("\nStart saved game option selected.");
}

public void saveGameToFile(){
    
    String filePath;
    
    //prompt user and got a file path
    System.out.println("\n\nEnter the file path where you want to save the game:");
    //keyboard.nextLine(); //this gets rid of the newline left by getMenuOption()
    filePath = keyboard.nextLine();
    
    //calls the getSavedGame() method in the GameControl class to load the game
    GameControl.saveAGame(filePath);
    
    //display the game menue for the loaded game
    GameMenuView gmv = new GameMenuView();
    gmv.displayMenu();
    System.out.println("\nSave game option selected.");
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
    saveGameToFile();
    
}

    






}





