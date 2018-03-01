//GameMenuView class - part of the view layer
//Object of this class is to manage the game view
//Author: Team 5 - Jeff and Kristen 
//Last Modified: Feb 2018
//---------------------------
package byui.cit260.findTheGold.view;

import byui.cit260.findTheGold.Team5GameProject.Team5GameProject;
import byui.cit260.findTheGold.control.CropControl;
import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.view.*;
import java.util.ArrayList;
import java.util.Scanner;


public class GameMenuView {
    
    //Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
    
    //Get reference to the Game object and the Crops object
    private static Game theGame = Team5GameProject.getTheGame();
    private static CropData theCropData = theGame.getCropData();
    private static ListMenuView listMenuView = new ListMenuView();
    
    private String gameMenu;
    private int max;
    
    public GameMenuView(){

        gameMenu = "\n" +
                    "*************************************\n" +
                    "* CITY OF AARON: MAIN GAME MENU *\n" +
                    "*************************************\n" +
                    "0 - Game Menu\n" +              
                    "1 - View the Map\n" +
                    "2 - View/Print a list\n" +
                    "3 - Move to a new location\n" +
                    "4 - Manage the Crops\n" +
                    "5 - Return to the Main menu\n";
        max = 5;   
    }
    
    public void displayMainMenuView(){
        int menuOption;    
        do    {
       //Display the menu
       System.out.println(gameMenu); 

       //Prompt the user and get the user's input
       menuOption = getMenuOption();
       
       //Perform the desired action
       doAction(menuOption);
       
       //Determine and display the next view
    } while (menuOption!= max);
    }
    
    public int getMenuOption(){
       //declare a variable to hold user's input
        int userInput;
    
        //begin loop
        do
        {
        //get user input from the keyboard
        userInput = keyboard.nextInt();
        
        //if it is not a valid value, output an error message
        if(userInput < 1 || userInput > max)
        {
            System.out.println("\noption must be between 1 and " + max);
        }
        //loop back to the top if input was not valid
        }while(userInput < 1 || userInput > max);
    
        //return the value input by the user
        return userInput;    
    }
    
    
    public void doAction(int option){
      
        switch(option)
    {
        case 1://Displays writen details about the game and location
            viewMap();
            break;
        case 2: //Provides the user with a set of list options
            listMenuView.displayMainMenuView();
            break;
        case 3://Hints displayed on ways to win the game.
            moveToNewLocation();
            break;
        case 4: //displays steps outlining "Play of the Game".  User story
            //displayed goes step by step
            manageCrops();
            break;
        case 5: //Returns to GameMenuView
            displayMainMenuView();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try Again");
            break;
    }
    }
    
    public static void viewMap(){
        
    }
    
    
    public static void moveToNewLocation(){
        
    }
    
    public static void manageCrops(){
        
    //Display a welcome message.
    System.out.println("\nWelcome mayor. You will serve for a term of 10 years"
            + "or until you are thrown out of the city for mismanagement.");    
   
    //declare a variable to hold user's input
    int userInput;
  
        //get user input from the keyboard
        userInput = keyboard.nextInt();
        
            System.out.println("\nHow many acres of new land do you want"
                    + " to buy?");
            CropControl.buyLand(CropControl.calcLandCost(), userInput, theCropData);
            
            System.out.println("\nHow many acres of new land do you want"
                    + "to sell?");
            CropControl.sellLand(CropControl.calcLandCost(), userInput, theCropData);
            
            System.out.println("\nHow many bushels of grain do you want to"
                    + "give to the people?");
            CropControl.feedPeople(theCropData.getWheatInStore(), userInput, theCropData);
         
            System.out.println("\nHow many acres of land do you want to plant?");
            CropControl.plantCrops(theCropData.getWheatInStore(), userInput, theCropData);
            
            System.out.println("\nWhat percentage of the harvest would you like"
                    + "to be paid in tithes and offering?");
            CropControl.payOffering(userInput, theCropData.getWheatInStore(), theCropData);
            
   
    }
    

}
