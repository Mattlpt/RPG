package com;

abstract class Hero extends Combatant {

    private Weapon weapon ;
    private String name; 

    public Hero(String name, int hp, int armor, int dfse, int atck, int xp, Weapon weapon){
        super(armor, hp, dfse, atck, xp); 
        this.weapon=weapon; 
        this.name = name;
    }

    public String toString(){
        return "Health : " + String.valueOf(hp) + "Protection : " + String.valueOf(armor) + "Defence : " + String.valueOf(dfse) + "Attack : " + String.valueOf(atck) ;
        
    }

    public String getName(){
        return this.name;
    }
    
    public Weapon getWeapon(){
        return this.weapon ;
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
