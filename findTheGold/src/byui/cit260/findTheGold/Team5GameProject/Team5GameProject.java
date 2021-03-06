//The City of Aaron Game
//The driver file, contains the main() method
//Author: Team 5 - Kristen 
//Last Modified: Feb 2018
//---------------------------
package byui.cit260.findTheGold.Team5GameProject;

import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.view.*;
import byui.cit260.findTheGold.control.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Team5GameProject {
    
    //variable for keeping a reference to the Game object
    private static Game theGame = null;  
    
    private static PrintWriter logFile = null;

    //main function - entry point for the program
    //runs the main menu
    public static void main(String[]args)
    { 
        PrintWriter output = new PrintWriter(System.out, true);
        try {
            logFile = new PrintWriter("logFile.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Team5GameProject.class.getName()).log(Level.SEVERE, null, ex);
        }
      /*  Player playerOne = new Player();
        
        Location firstLocation = new Location();
        CropData firstData = new CropData();
        ListItem secondData = new ListItem();
        ListItem firstItem = new ListItem();
        
        playerOne.setPlayerName("Wilma Flintsone");
        firstLocation.setDescription("Zarahemla");
        firstLocation.setSymbol("mark");
        firstData.setYear(1);
        firstData.setPopulation(100);
        firstData.setAcresOwned(1000);
        firstData.setCropYield(3);
        firstData.setWheatInStore(3000);
        firstData.setNumberWhoDied(2);
        firstData.setNewPeople(5);
        firstData.setHarvest(45);
        firstData.setHarvestAfterOffering(2700);
        firstData.setOffering(300);
        firstData.setOfferingBushels(24);
        firstData.setPeopleFed(4);
        firstData.setAcresPlanted(4);
        firstData.setNumStarved(5);
        firstData.setEatenByRats(0);
        firstData.setWheatForPeople(3);
        secondData.setNumber(1);
        
              
       
        System.out.println(playerOne.toString());
        
        String playerOneName = playerOne.getPlayerName();
        firstItem.setName(playerOneName);
        
        System.out.println("Name = " + playerOneName);
       
        TeamMember.Kristen.getName();
        TeamMember.Kristen.getTitle();
        
        System.out.print(TeamMember.Kristen.toString());
        
        System.out.println(firstLocation.toString());
        System.out.println(firstData.toString());
        System.out.println(firstItem.toString());
        Game theGame = new Game();
       */
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
    }
    public static Game getTheGame(){
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
    
    public static PrintWriter getLogFile(){
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile){
        Team5GameProject.logFile = logFile;
    }

    //To change body of generated methods, choose Tools | Templates.
    public static PrintWriter getOutput() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}