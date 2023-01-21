package com;

public class Mage extends SpellCaster {
    
    private Weapon weapon ;
    private int armor ; 
    private Potion potion ; 
    private Food food ; 

    public Mage(String name, int hp, int armor, int dfse, int atck, int xp, Weapon weapon){
        super(name, armor, hp, dfse, atck, xp, weapon); 
    }

    public Weapon getWeapon(){
        return this.weapon ;
    }

    public int getArmor(){
        return this.armor ;
    }

    public Potion getPotion(){
        return this.potion ; 
    }

    public Food getFood(){
        return this.food ; 
    }
}