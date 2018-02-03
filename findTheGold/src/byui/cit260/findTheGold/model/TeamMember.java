/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheGold.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kjpar
 */
public enum TeamMember implements Serializable {
    
    Jeff("Jeff Bryant", "A member of Team-5"),
    Kristen("Kristen Parkinson", "A member of Team-5");
    
    // class instance variables
    private String name;
    private String title;
    
    TeamMember(String name, String title){
        this.name = name;
        this.title = title;
    }

    public String getName(){
        return name;
    }
    
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return "TeamMember{" + "name=" + name + ", title=" + title + '}';
    }
}
