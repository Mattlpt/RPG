package com;

abstract class Item {
    
    protected int dmg ;
    protected String name ;
    protected int xp ;  
    protected int hp ; 

    public Item(String name, int dmg, int xp){
        this.name = name ;
        this.dmg = dmg ;

        this.xp = xp ;
    }

    public int getDmg(){
        return this.dmg ; 
    }

    public String getName(){
        return this.name ; 
    }

    public int getXp(){
        return this.xp ; 
    }
     
    public int getHp(){
        return this.hp ;
    }
}
