//CropView class - part of the view layer
//Object of this class is to manage the crop view
//Author: Team 5 - Kristen 
//Last Modified: Feb 2018
//---------------------------
package byui.cit260.findTheGold.view;

import byui.cit260.findTheGold.Team5GameProject.Team5GameProject;
import byui.cit260.findTheGold.control.CropControl;
import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.view.*;
import java.util.ArrayList;
import java.util.Scanner;


public class GameMenuView extends MenuView {
    
    //Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
    
    //Get reference to the Game object and the Crops object
    private static Game theGame = Team5GameProject.getTheGame();
    private static CropData theCropData = theGame.getCropData();
    private static ListMenuView listMenuView = new ListMenuView();
    
    private String gameMenu;
    private int max;
    
    public GameMenuView(){

        super("\n" +
                    "*************************************\n" +
                    "* CITY OF AARON: MAIN GAME MENU *\n" +
                    "*************************************\n" +             
                    "1 - View the Map\n" +
                    "2 - View/Print a list\n" +
                    "3 - Move to a new location\n" +
                    "4 - Manage the Crops\n" +
                    "5 - Return to the Main menu\n",
        5);   
    }
    
    
    @Override public void doAction(int option){
      
        switch(option)
    {
        case 1://Displays writen details about the game and location
            viewMap();
            break;
        case 2://Display view a list
            viewList();
            break;
        case 3: //Provides the user with a option to move to new locations
            moveToNewLocation();
            break;
        case 4://displays steps outlining "Play of the Game".  User story
            //displayed goes step by step
            manageCrops();
            break;
        case 5: 
            displayMenu();
            break;        
    }
    }
    
    //The viewList() method
    //Purpose: Create a ViewList object and calls its displayMenuView() method
    //Parameters: none
    //Returns: none
    public static void viewList(){
        
        ListMenuView lv = new ListMenuView();
        lv.displayMenu();
    }
    
    public static void viewMap(){
        
    }
    
    
    public static void moveToNewLocation(){
        
    }
    
    
    public static void manageCrops(){
       
    //Display a welcome message.
    System.out.println("\nWelcome Supreme High Ruler. You will serve for a \n"
            + "term of 10 years or until you are thrown out of the city for \n"
            + "mismanagement.");    
   
    //declare a variable to hold user's input
    int userInput;
        
            //System.out.println("\nHow many acres of new land do you wish"
            //        + " to buy?");
            CropView.buyLandView();
            //userInput = keyboard.nextInt();
            //CropControl.buyLand(CropControl.calcLandCost(), userInput, theCropData);
            
            //System.out.println("\nHow many acres of new land do you wish"
            //        + " to sell?");
            CropView.sellLandView();
            //userInput = keyboard.nextInt();
            //CropControl.sellLand(CropControl.calcLandCost(), userInput, theCropData);
            
            //System.out.println("\nHow many bushels of grain do you wish to"
            //        + " give to the people?");
            CropView.feedPeopleView();
            //userInput = keyboard.nextInt();
           // CropControl.feedPeople(theCropData.getWheatInStore(), userInput, theCropData);
         
            //System.out.println("\nHow many acres of land do you wish to plant?");
            //userInput = keyboard.nextInt();
            CropView.plantCropsView();
            //CropControl.plantCrops(theCropData.getWheatInStore(), userInput, theCropData);
            
            //System.out.println("\nWhat percentage of the harvest would you like"
            //        + "to be paid in tithes and offering?");
            CropView.payOfferingView();
            //userInput = keyboard.nextInt();
            //CropControl.payOffering(userInput, theCropData.getWheatInStore(), theCropData);
            
            int yearOfReign = theCropData.getYear() +1;
            theCropData.setYear(yearOfReign);
            
            CropView.displayCropsReportView();
            
   
    }
    

}
