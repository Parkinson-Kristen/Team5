//CropView class - part of the view layer
//Object of this class is to manage the crop view
//Author: Team 5 - Kristen 
//Last Modified: March 27 2018
//---------------------------
package byui.cit260.findTheGold.view;

import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.control.*;
import java.util.Scanner;
import byui.cit260.findTheGold.Team5GameProject.*;
import java.util.ArrayList;

public class ListView {
        
    //Get reference to the Game object and the Crops object
    private static Game theGame = Team5GameProject.getTheGame();
    private static CropData theCropData = theGame.getCropData();
    
public static void ListAnimals(ArrayList<ListItem> animals){
    
    //Propmpt the user to enter the following:
    System.out.format("The animals in the kings stockyard are: \n");
       // let us print all the elements available in list
   for (int i =0; i < animals.size(); i++) {   
       ListItem animal = animals.get(i);
       System.out.println("\n\tAnimal Stock: " + animal.getName() +
                "\n\tQuantity: " + animal.getNumber());
   }
}

public static void ListTools(ArrayList<ListItem> tools){
    //Propmpt the user to enter the following:
    System.out.format("The tools in the Kings toolshed are: \n");
       // let us print all the elements available in list
   for (int i =0; i < tools.size(); i++) {   
       ListItem tool = tools.get(i);
       System.out.println("\n\tTool Stockpile: " + tool.getName() +
                "\n\tQuantity: " + tool.getNumber());
   }
}
    
public static void ListProvisions(ArrayList<ListItem> provision){
       //Propmpt the user to enter the following:
    System.out.format("The provisions for the Kings use are: \n");
       // let us print all the elements available in list
   for (int i =0; i < provision.size(); i++) {   
       ListItem provisions = provision.get(i);
       System.out.println("\n\tProvisions List: " + provisions.getName() +
                "\n\tQuantity: " + provisions.getNumber());
   } 
    }

public static void ListTeamMembers(){
    System.out.format("The list of team members are: \n");
    System.out.println("\n\tTeam Members are: " + TeamMember.Kristen.toString());

}


}