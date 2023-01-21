package com;

class Enemy extends Combatant{

    public Enemy(String name, int hp, int armor, int dfse, int atck, int xp){
         super(hp, armor, dfse, atck, xp) ;
    }

    public String toString(){
        return "Attack : " + String.valueOf(this.atck) + "Defence : " + String.valueOf(this.dfse) + "Armor : " + String.valueOf(this.armor) + "Health : " + String.valueOf(this.hp);  
    }
    
    public void PerdreHp(int n){
       this.hp -= n ; 
    }

    public String getName(){return this.getName();}
}