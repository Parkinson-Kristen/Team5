/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheGold.view;

import java.util.Scanner;

public abstract class MenuView implements ViewInterface{
        
        //the data members common to all menu views
        protected final static Scanner keyboard = new Scanner(System.in);
        
        protected String menu; //this string holds the menu string
        protected int max; //this int holds the max input value
        
        //MenuView Constructor
        //Purpose: Initialize the view object with the menu string
        //Parameters: the menu string and the max value
        //returns: none
        public MenuView(String _menu, int _max){
            
            menu =_menu;
            max =_max;
        }
        
        @Override public void displayMenu(){
            
            //execute this loop as long as the selected option is not max
            int menuOption = 0;
            do
            {
                //display the menue
                System.out.println(menu);

                //get the user's selection
                menuOption = getMenuOption();

                //perform the selected action
                doAction(menuOption);
            }while(menuOption != max);
        }
        
        @Override public int getMenuOption(){
            
            int inputValue = 0;
            do
            {
                System.out.format("\nPlease enter an option(1 - %d):",max);
                inputValue = keyboard.nextInt();
                if(inputValue < 0 || inputValue > max)
                {
                    System.out.format("\nError:input value must be between 1 and %d.", max);
                }
            }while(inputValue < 1 || inputValue > max);
    
            return inputValue;
        }

    
}
