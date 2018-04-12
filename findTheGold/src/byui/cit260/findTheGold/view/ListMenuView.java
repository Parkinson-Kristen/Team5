//ListMenuView class - part of the view layer
//Object of this class is to manage the list view
//Author: Team 5 - Kristen 
//Last Modified: Feb 2018
//---------------------------
package byui.cit260.findTheGold.view;

import byui.cit260.findTheGold.control.*;
import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.Team5GameProject.*;
import byui.cit260.findTheGold.view.*;


public class ListMenuView extends MenuView {
  
    
    //Get reference to the Game object and the Crops object
    private static Game theGame = Team5GameProject.getTheGame();
    private static CropData theCropData = theGame.getCropData();
    
    private String gameMenu;
    private String listMenu;
    private String mainMenu;
    private int max;
  
    
    /*public void displayMainMenuView(){
        int menuOption;    
        do    {
       //Display the menu
       System.out.println(listMenu); 

       //Prompt the user and get the user's input
       menuOption = getMenuOption();
       
       //Perform the desired action
       doAction(menuOption);
       
       //Determine and display the next view
    } while (menuOption!= max);
    }
*/

    public ListMenuView(){ 
         super("\n" +
                    "*************************************\n" +
                    "* CITY OF AARON: LIST MENU *\n" +
                    "*************************************\n" +            
                    "1 - List or view the animals in the storehouse\n" +
                    "2 - List or view the tools in the storehouse\n" +
                    "3 - List or view the provisions in the storehouse\n" +
                    "4 - List or view the authors of this game\n" +
                    "5 - Save the list of animals of this game to disk\n" +
                    "6 - Save the list of provisions of this game to disk\n" +
                    "7 - Save the list of tools of this game to disk\n" +
                    "8 - Return to the Main menu\n",
                 
                    8);         
    }    
    
    @Override public void doAction(int action){
      
        switch(action){
                case 1: //View list of animals in the storehouse
                    listAnimals(); 
                    break;
                case 2: //View list of tools in the storehouse
                    listTools();
                    break;
                case 3: //View list of provisions in the storehouse
                    listProvision(); 
                    break;
                case 4: //View list of authors of Team5 game
                    listTeam(); 
                    break;
                case 5: //Save animal list to file
                    saveAnimalsList();
                    break;
                case 6: //Save provision list to file
                    saveProvisionsList();
                    break;
                case 7: //Save tools list to file
                    saveToolsList();
                    break;
                case 8: //Return to game menu
                    return;
                default:
                    System.out.println("\n*** Invalid selection *** Try Again");
                    break;
                }
    }
    
    public void listAnimals(){
        ListView.ListAnimals(theGame.getAnimals());       
    }
   
    public void listTools(){
        ListView.ListTools(theGame.getTools()); 
        
    }
    
    public void listProvision(){
        ListView.ListProvisions(theGame.getProvision()); 
        
    }
    
    public void listTeam(){
        ListView.ListTeamMembers();
                
    }
 
    public void saveAnimalsList(){
        String filePath;
        
        //prompt user and get a file path
        System.out.println("\n\nEnter the file path where you want to save the animals list to:");
        keyboard.nextLine();
        filePath = keyboard.nextLine();     
        ListView.saveAnimalList(filePath);
                
    }  
 
    public void saveProvisionsList(){
        String filePath;
        
        //prompt user and get a file path
        System.out.println("\n\nEnter the file path where you want to save the provisions list to:");
        keyboard.nextLine();
        filePath = keyboard.nextLine();     
        ListView.saveProvisionList(filePath);
                
    }
    
    public void saveToolsList(){
        String filePath;
        
        //prompt user and get a file path
        System.out.println("\n\nEnter the file path where you want to save the tools list to:");
        keyboard.nextLine();
        filePath = keyboard.nextLine();     
        ListView.saveToolList(filePath);
                
    }    
    
    
}
