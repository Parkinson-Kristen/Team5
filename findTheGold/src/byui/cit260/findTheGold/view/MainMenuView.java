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

    






}





