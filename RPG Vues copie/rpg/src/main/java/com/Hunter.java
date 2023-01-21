package com;

public class Hunter extends Hero {
    
    private Potion potion ; 
    private Food food ; 

    public Hunter(String name, int hp, int armor, int dfse, int atck, int xp, Weapon arrow, Potion potion, Food food){
        super(name, hp, armor, dfse, atck, xp,arrow) ;
        this.potion = potion ;
        this.food = food ;
    }

    public void Tirer(int arrow, Enemy atcké){
        while(arrow != 0){
            atcké.PerdreHp(1); 
        }
    }

    public Potion getPotion(){
        return this.potion ; 
    }

    public Food getFood(){
        return this.food ; 
    }

    
}    