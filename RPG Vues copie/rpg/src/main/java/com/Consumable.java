package com;

abstract class Consumable extends Item {

    public Consumable(String name, int dmg, int hp,  int xp){
        super(name, dmg, xp); 
    }
}