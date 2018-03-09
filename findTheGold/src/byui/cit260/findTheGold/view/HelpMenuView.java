//The HelpMenuViewClass - part of the view layer
//Object of this class is to manage the game menu
//Author: Kristen
//Date last modified: March 2018
//-------------------------------
package byui.cit260.findTheGold.view;

import java.util.Scanner;
        
public class HelpMenuView extends MenuView {
    
    private String gameMenu;
    private int max;
    Scanner keyboard = new Scanner(System.in);
    
    //The MainMenuVie Constructor
    //Purpose: Initialize the menu data
    //Parameters: none
    //Returns: none
    //--------------------
    public HelpMenuView(){
        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON:      HELP MENU  *\n" +
                   "**********************************\n" +
                   " 1 - What are the goals of the game?\n" +
                   " 2 - Where is the City of Aaron?\n" +
                   " 3 - How do I view the map?\n" +
                   " 4 - How do I move to a new location?\n" +
                   " 5 - How do I display a list?\n" +
                   " 6 - Return to the main menu\n",
        
        6);
    }
     // The displayMainMenuView method
    // Purpose: displays menu, gets user input, and does the selected action
    // Parameters: none
    // Returns: none
    // ===================================    
    public void displayMenuView()
    {
        // executre this loop as long as the selected option is not 5
        int menuOption = 0;
        do
        {
            // display the menu
            System.out.println(gameMenu);
        
            // get the user's selection
            menuOption = getMenuOption();
        
            // perform the selected action
            doAction(menuOption);  
        } while (menuOption != max);
    }
    
    // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption()
    {
        int selectedOption = 0;
        do
        {
            // get input from keyboard. It must be in the range 1-5
            selectedOption = keyboard.nextInt();
            if(selectedOption < 1 || selectedOption > max)
            {
                System.out.println("Incorrect input: option must be between 1 and " + max);
            }
            
        } while (selectedOption < 1 || selectedOption > max);
        return selectedOption;
        
    } 
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // view goals
                viewGoals();
                break;
            case 2: // see where the city is
                viewWhere();
                break;                
            case 3: // get help menu
                viewHowMap();
                break;
            case 4:
                viewHowMove();
                break;
            case 5: // save game
                viewHowList();
                break;
            case 6: // return to main menu
                return;
                
        }
    }
    
    // The viewGoals() method
    // Pupose: tell what the goal of the game is
    // Parameters: none
    // Returns: none
    public void viewGoals()
    {
        System.out.println("\nThe goal of the game is to survive 10 years as ruler.\n" +
                            "You have to decide how much land to buy, how much land\n" +
                            "to sell, how much wheat to feed your people, and how\n" +
                            "much wheat to plant for the year.\n\n" +
                            "If too many people starve, you will be impeached.\n");
    }
    
    // The viewWhere() method
    // Pupose: tell where the City of Aaron is
    // Parameters: none
    // Returns: none
    public void viewWhere()
    {
        System.out.println("\nAccording to The Book of Mormon, the city of Aaron was\n" +
                           "located near Nephihah, though constructed earlier. Prior \n" +
                           "to the construction of Nephihah, its nearest known \n" +
                           "neighbor was Moroni.\n");
    }  
    
    // The viewHowMap() method
    // Pupose: tell how to display the map
    // Parameters: none
    // Returns: none
    public void viewHowMap()
    {
        System.out.println("\nThe game menu provides an option for displaying the map.");
    }
    
    // The viewHowMove() method
    // Pupose: tell how to move to another location
    // Parameters: none
    // Returns: none
    public void viewHowMove()
    {
        System.out.println("\nThe game menu provides an option for moving to another location.");
    }    

    // The viewHowList() method
    // Pupose: tell how to display a list
    // Parameters: none
    // Returns: none
    public void viewHowList()
    {
        System.out.println("\nThe game menu provides an option for displaying the list\n" +
                           "of animals in the city, the list tools in the storehouse, the\n" +
                           "of other provisions in the storehouse, and the names of the\n" +
                           "developers of the game.\n");
    }   
}
