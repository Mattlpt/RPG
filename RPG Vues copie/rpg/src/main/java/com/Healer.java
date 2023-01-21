package com;

public class Healer extends SpellCaster {

    private Weapon weapon ;
    private int armor ; 
    private Potion potion ; 
    private Food food ; 
    private int xp;

    public Healer(String name, int hp, int armor, int dfse, int atck, int xp, Weapon weapon){
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

    public int getXp(){
        return this.xp; 
    }
    
}