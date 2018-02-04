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
 * @author Jeff
 */
public class ListItem implements Serializable{
    
    // class instance variable
    private String name;
    private int number;
    // class instance variable - animals
    private String fish; //2 Nephi 7:2
    private String lion; //2 Nephi 15:28
    private String owl; //2 Nephi 23:21
    private String serpent; //1 Nephi 17:41 
    private String cow; //1 Nephi 18:25
    private String bat; //2 Nephi 12:20
    private String elephant; //Ether 9:19
    private String dog; //Mosiah 12:2
    private String ox; //1 Nephi 18:25
    private String horse; //1 Nephi 18:25
    private String bear; //2 Nephi 21:7
    private String whale; //Ether 2:24
    private String dove; //John 1:32
    //class instance variable - tools
    private String sword; //Mormon 6:9
    private String bow; //Mormon 6:9
    private String arrow; //Mormon 6:9
    private String ax; //Mormon 6:9
    private String cimeter; //Alma 60:2
    private String plowShare; //2 Nephi 12:4
    private String spear; //2 Nephi 12:4
    private String breastplate; //Joseph Smith History 1:35
    private String urimAndThummim; //Joseph Smith History 1:35
    private String hammer; //Isaiah 41:7
    private String nail; //Isaiah 41:7
    private String anvil; //Isaiah 41:7
    
    public ListItem() {
    }  
       
    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public String getLion() {
        return lion;
    }

    public void setLion(String lion) {
        this.lion = lion;
    }
    
    public String getOwl() {
        return name;
    }

    public void setOwl(String name) {
        this.name = name;
    }

    public String getSerpent() {
        return serpent;
    }

    public void setSerpent(String serpent) {
        this.serpent = serpent;
    }
    
    public String getCow() {
        return cow;
    }

    public void setCow(String cow) {
        this.cow = cow;
    }

    public String getBat() {
        return bat;
    }

    public void setBat(String bat) {
        this.bat = bat;
    }
    
    public String getElephant() {
        return elephant;
    }

    public void setElephant(String elephant) {
        this.elephant = elephant;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }
    
    public String getOx() {
        return ox;
    }

    public void setOx(String ox) {
        this.ox = ox;
    }

    public String getHorse() {
        return horse;
    }

    public void setHorse(String horse) {
        this.horse = horse;
    }
    
    public String getBear() {
        return bear;
    }

    public void setBear(String bear) {
        this.bear = bear;
    }

    public String getWhale() {
        return whale;
    }

    public void setWhale(String whale) {
        this.whale = whale;
    }
    
    public String getDove() {
        return dove;
    }

    public void setDove(String dove) {
        this.dove = dove;
    }

    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }
    
    public String getBow() {
        return bow;
    }

    public void setBow(String bow) {
        this.bow = bow;
    }

    public String getArrow() {
        return arrow;
    }

    public void setArrow(String arrow) {
        this.arrow = arrow;
    }
    
    public String getAx() {
        return ax;
    }

    public void setAx(String ax) {
        this.ax = ax;
    }
    
    public String getCimeter() {
        return cimeter;
    }

    public void setCimeter(String cimeter) {
        this.cimeter = cimeter;
    }

    public String getPlowShare() {
        return plowShare;
    }

    public void setPlowShare(String plowShare) {
        this.plowShare = plowShare;
    }
    
    public String getSpear() {
        return spear;
    }

    public void setSpear(String spear) {
        this.spear = spear;
    }

    public String getBreastplate() {
        return breastplate;
    }

    public void setBreastplate(String breastplate) {
        this.breastplate = breastplate;
    }
    
    public String getUrimAndThummim() {
        return ax;
    }

    public void setUrimAndThummim(String urimAndThummim) {
        this.urimAndThummim = urimAndThummim;
    }
    
    public String getHammer() {
        return hammer;
    }

    public void setHammer(String hammer) {
        this.hammer = hammer;
    }

    public String getNail() {
        return nail;
    }

    public void setNail(String nail) {
        this.nail = nail;
    }
    
    public String getAnvil() {
        return anvil;
    }

    public void setAnvil(String anvil) {
        this.anvil = anvil;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.number;
        hash = 47 * hash + Objects.hashCode(this.fish);
        hash = 47 * hash + Objects.hashCode(this.owl);
        hash = 47 * hash + Objects.hashCode(this.lion);
        hash = 47 * hash + Objects.hashCode(this.serpent);
        hash = 47 * hash + Objects.hashCode(this.cow);
        hash = 47 * hash + Objects.hashCode(this.bat);
        hash = 47 * hash + Objects.hashCode(this.elephant);
        hash = 47 * hash + Objects.hashCode(this.dog);
        hash = 47 * hash + Objects.hashCode(this.ox);
        hash = 47 * hash + Objects.hashCode(this.horse);
        hash = 47 * hash + Objects.hashCode(this.bear);
        hash = 47 * hash + Objects.hashCode(this.whale);
        hash = 47 * hash + Objects.hashCode(this.dove);
        hash = 47 * hash + Objects.hashCode(this.sword);
        hash = 47 * hash + Objects.hashCode(this.bow);
        hash = 47 * hash + Objects.hashCode(this.arrow);
        hash = 47 * hash + Objects.hashCode(this.ax);
        hash = 47 * hash + Objects.hashCode(this.cimeter);
        hash = 47 * hash + Objects.hashCode(this.plowShare);
        hash = 47 * hash + Objects.hashCode(this.spear);
        hash = 47 * hash + Objects.hashCode(this.breastplate);
        hash = 47 * hash + Objects.hashCode(this.urimAndThummim);
        hash = 47 * hash + Objects.hashCode(this.hammer);
        hash = 47 * hash + Objects.hashCode(this.nail);
        hash = 47 * hash + Objects.hashCode(this.anvil);
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
        final ListItem other = (ListItem) obj;
        if (this.number != other.number) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.fish, other.fish)) {
            return false;
        }
        if (!Objects.equals(this.lion, other.lion)) {
            return false;
        }
        if (!Objects.equals(this.owl, other.owl)) {
            return false;
        }        
        if (!Objects.equals(this.serpent, other.serpent)) {
            return false;
        }        
        if (!Objects.equals(this.cow, other.cow)) {
            return false;
        }        
        if (!Objects.equals(this.bat, other.bat)) {
            return false;
        }        
        if (!Objects.equals(this.elephant, other.elephant)) {
            return false;
        }
        if (!Objects.equals(this.dog, other.dog)) {
            return false;
        }
        if (!Objects.equals(this.ox, other.ox)) {
            return false;
        }
        if (!Objects.equals(this.horse, other.horse)) {
            return false;
        }
        if (!Objects.equals(this.bear, other.bear)) {
            return false;
        }
        if (!Objects.equals(this.whale, other.whale)) {
            return false;
        }
        if (!Objects.equals(this.dove, other.dove)) {
            return false;
        }
        if (!Objects.equals(this.sword, other.sword)) {
            return false;
        }
        if (!Objects.equals(this.bow, other.bow)) {
            return false;
        }
        if (!Objects.equals(this.arrow, other.arrow)) {
            return false;
        }
        if (!Objects.equals(this.ax, other.ax)) {
            return false;
        }
        if (!Objects.equals(this.cimeter, other.cimeter)) {
            return false;
        }
        if (!Objects.equals(this.plowShare, other.plowShare)) {
            return false;
        }
        if (!Objects.equals(this.spear, other.spear)) {
            return false;
        }
        if (!Objects.equals(this.breastplate, other.breastplate)) {
            return false;
        }
        if (!Objects.equals(this.urimAndThummim, other.urimAndThummim)) {
            return false;
        }
        if (!Objects.equals(this.hammer, other.hammer)) {
            return false;
        }
        if (!Objects.equals(this.nail, other.nail)) {
            return false;
        }
        if (!Objects.equals(this.anvil, other.anvil)) {
            return false;
        }            
        return true;
    }

    @Override
    public String toString() {
        return "ListItem{" + "fish=" + fish + ", lion=" + lion + ", owl=" + owl + ", serpent=" + serpent + ", cow=" + cow + ", bat=" + bat + ", elephant=" + elephant + ", dog=" + dog + ", ox=" + ox + ", horse=" + horse + ", bear=" + bear + ", whale=" + whale + ", dove=" + dove + ", sword=" + sword + ", bow=" + bow + ", arrow=" + arrow + ", ax=" + ax + ", cimeter=" + cimeter + ", plowShare=" + plowShare + ", spear=" + spear + ", breastplate=" + breastplate + ", urimAndThummim=" + urimAndThummim + ", hammer=" + hammer + ", nail=" + nail + ", anvil=" + anvil + '}';
    }
    
    
    
}
