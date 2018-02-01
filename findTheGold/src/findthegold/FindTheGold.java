/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findthegold;

import byui.cit260.findTheGold.model.TeamMember;
import byui.cit260.findTheGold.model.Player;
import java.util.HashSet;

/**
 *
 * @author kjpar
 */
public class FindTheGold {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Wilma Flintsone");
        
        System.out.println(playerOne.toString());
        
        String playerOneName = playerOne.getName();
        
        System.out.println("Name = " + playerOneName);
        
        TeamMember.Jeff.getName();
        TeamMember.Jeff.getTitle();
        TeamMember.Kristen.getName();
        TeamMember.Kristen.getTitle();
        
        System.out.print(TeamMember.Kristen.toString());
                
    }
