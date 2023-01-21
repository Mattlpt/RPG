package com;

abstract class SpellCaster extends Hero {

    
    public SpellCaster(String name, int hp, int armor, int dfse, int atck, int xp, Weapon weapon){
        super(name, armor, hp, dfse, atck, xp, weapon); 
    }

    public String toString(){
        return "Health : " + String.valueOf(hp) + "Protection : " + String.valueOf(armor) + "Defence : " + String.valueOf(dfse) + "Attack : " + String.valueOf(atck) ;
        
    }

    public void PerdreHp(int m){
        this.hp -= m; 
    }

    public void PrendreHp(int h){
        this.hp += h;
    }

    public void PerdreXp(int j){
        this.xp -= j ; 
    }

    public void PrendreXp(int k){
        this.xp += k ; 
    }
    
}
