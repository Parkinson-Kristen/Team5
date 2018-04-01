//CropView class - part of the view layer
//Object of this class is to manage the crop view
//Author: Team 5 - Kristen 
//Last Modified: Feb 2018
//---------------------------
package byui.cit260.findTheGold.view;

import byui.cit260.findTheGold.Team5GameProject.Team5GameProject;
import byui.cit260.findTheGold.control.CropControl;
import byui.cit260.findTheGold.control.GameControl;
import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.view.*;
import java.util.ArrayList;


public class GameMenuView extends MenuView {
    
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
                    "2 - Display/View a list\n" +
                    "3 - Print a list\n" +
                    "4 - Move to a new location\n" +
                    "5 - Manage the Crops\n" +
                    "6 - Return to the Main menu\n",
        6);   
    }
    
    
    @Override public void doAction(int option){
      
        switch(option)
    {
        case 1://Displays writen details about the game and location
            viewMap();
            break;
        case 2://Display/view a list
            viewList();
            break;
        case 3://Print a list
            printList();
            break;
        case 4: //Provides the user with a option to move to new locations
            moveToNewLocation();
            break;
        case 5://displays steps outlining "Play of the Game".  User story
            //displayed goes step by step
            manageCrops();
            break;
        case 6: 
            return;
                  
    }
    }
    
    //The viewList() method
    //Purpose: Create a ViewList object and calls its displayMenuView() method
    //Parameters: none
    //Returns: none
    public static void viewList(){
        
        String filePath;
        
        //prompt user to decide which list they would like to view
        System.out.println("\n\nWhich list would you like to view?");
        keyboard.nextLine();
        filePath = keyboard.nextLine();
        
        //calls the viewList in MainMenuView
        GameControl.createAnimalList();
        
        //display
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
            CropView.setOfferingView();
            //userInput = keyboard.nextInt();
            //CropControl.payOffering(userInput, theCropData.getWheatInStore(), theCropData);
            
            int yearOfReign = theCropData.getYear() +1;
            theCropData.setYear(yearOfReign);
            
            CropView.displayCropsReportView();
            
   
    }

    private void printList() {
        
        String filePath;
        
        //prompt user and get a file path
        System.out.println("\n\nEnter the file path where you want to print a list to:");
        keyboard.nextLine();
        filePath = keyboard.nextLine();
        
        //calls the viewList in MainMenuView
        GameControl.createAnimalList();
        
        //display
        ListMenuView lv = new ListMenuView();
        lv.displayMenu();
    }
    

}
