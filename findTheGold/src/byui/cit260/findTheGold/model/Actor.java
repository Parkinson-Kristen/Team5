/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheGold.model;

/**
 *
 * @author kjpar
 */
public enum Actor {
    
    Jeff("Jeff Bryant", "a member of team-5"),
    Kristen("Kristen Parkinson", "a member of team-5");
    
    private String name;
    private String description;

    Actor(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Actor{" + "name =" + name + ", description=" + description}";
    }
