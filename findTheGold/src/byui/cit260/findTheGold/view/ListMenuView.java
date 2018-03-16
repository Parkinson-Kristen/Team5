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
import java.util.Scanner;


public class ListMenuView extends MenuView {
  
    
    //Get reference to the Game object and the Crops object
    private static Game theGame = Team5GameProject.getTheGame();
    private static CropData theCropData = theGame.getCropData();
    
    private String gameMenu;
    private String listMenu;
    private String mainMenu;
    private int max;
    
    Scanner keyboard = new Scanner(System.in);
    
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
                    "5 - Return to the Main menu\n",
                    5);         
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
                case 5: //Return to game menu
                    displayMenu();
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try Again");
                    break;
                }
    }
    
    public void listAnimals(){
        theGame.getAnimals();
        
    }
   
    public void listTools(){
        theGame.getTools();
        
    }
    
    public void listProvision(){
        theGame.getProvision();
        
    }
    
    public void listTeam(){
        theGame.getTeam();
                
    }
    
    
}
