package com;

abstract class Combatant {

    protected int armor ; 
    protected int hp ; 
    protected int dfse ; 
    protected int atck ; 
    protected int xp ;

    public Combatant(int armor, int hp, int dfse, int atck, int xp){
        this.armor = armor ;
        this.hp = hp ; 
        this.dfse = dfse ; 
        this.atck = atck ; 
        this.xp = xp;
    }

    public int getArmor(){
        return this.armor ; 
    }
    
    public int getHp(){
        return this.hp ; 
    }

    public int getDfse(){
        return this.dfse ; 
    }

    public int getAtck(){
        return this.atck ;
    }

    public int xp(){
        return this.xp; 
    }

}