//The MainMenuView class - base abstract class for all menu views
//Author: Team 5 - Kristen 
//Last Modified: March 2018
//---------------------------
package byui.cit260.findTheGold.view;

import java.util.Scanner;

public interface ViewInterface {
    
    public void displayMenu();
    public int getMenuOption();
    public void doAction (int option);
}
    
    
