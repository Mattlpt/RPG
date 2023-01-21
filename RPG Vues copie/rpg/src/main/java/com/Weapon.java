package com;

public class Weapon extends Item {
    
    public Weapon(String name, int dmg,  int xp){
        super(name, dmg, xp); 
    }

    public String toString(){
        return this.name;
    }
    

}