//ErrorView class - part of the view layer
//Object of this class is to manage error statements
//Author: Team 5 - Kristen 
//Last Modified: March 31 2018
//---------------------------
package byui.cit260.findTheGold.view;

import byui.cit260.findTheGold.Team5GameProject.Team5GameProject;
import java.io.PrintWriter;

public class ErrorView {
    
    private static PrintWriter console = Team5GameProject.getOutput();
    
    private static PrintWriter log = Team5GameProject.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        console.println(
                 "\n---ERROR-----------------------------------------"
                +"\n" + errorMessage
                +"\n-------------------------------------------------");
    
        log.printf("%n%n%s", className + " - " + errorMessage);  
    }


}
