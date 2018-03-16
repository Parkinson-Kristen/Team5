//The City of Aaron Game
//The driver file, contains the main() method
//Author: Team 5 - Kristen 
//Last Modified: March 10 2018
//---------------------------
package byui.cit260.findTheGold.model;

import java.io.Serializable;
import java.util.Objects;

public class Location implements Serializable {
    
    // class instance variables
    private String description;
    private String symbol;

    public Location() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.description);
        hash = 13 * hash + Objects.hashCode(this.symbol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "description=" + description + ", symbol=" + symbol + '}';
    }
    
    
}
