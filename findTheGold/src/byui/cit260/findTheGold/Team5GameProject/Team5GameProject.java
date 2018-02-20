//The City of Aaron Game
//The driver file, contains the main() method
//Author: Team 5 - Jeff and Kristen 
//Last Modified: Feb 2018
//---------------------------
package byui.cit260.findTheGold.Team5GameProject;

import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.view.*;
import byui.cit260.findTheGold.control.*;


public class Team5GameProject {
    
    //variable for keeping a reference to the Game object
    private static Game theGame = null;    

    //main function - entry point for the program
    //runs the main menu
    public static void main(String[]args)
    {     
        Game theGame = new Game();
       
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();
}

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        Team5GameProject.theGame = theGame;
    }
    
    public static void setCurrentGame(Game currentGame){
        
        setTheGame(currentGame);
    }
    
    public static void startSavedGame(Game currentGame){
        
        setTheGame(currentGame);
    }
}