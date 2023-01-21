package com;

public class Warrior extends Hero {

    private Potion potion ; 
    private Food food ; 
    

    public Warrior(String name, int armor,int hp ,int dfse,int atck, int xp, Weapon weapon, Food food, Potion potion){
        super(name, armor, hp, dfse, atck, xp, weapon) ; 
        this.food = food ; 
        this.potion = potion ; 

    }

    /* 
    public Warrior(){
        this.armor = 0; 
        this.hp = 20 ; 
        this.dfse = 12 ;
        this.atck = 12 ; 
        this.xp = 0; 
        this.weapon = new Weapon("Epée", 12, 0);
        this.food = new Food("quedale", 0, 0, 0);
        this.potion = new Potion("Rien", 0, 0, 0); 

    }
    */

    public Potion getPotion(){
        return this.potion ; 
    }

    public Food getFood(){
        return this.food ; 
    }
}