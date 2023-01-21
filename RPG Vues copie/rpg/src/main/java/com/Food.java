package com;

public class Food extends Consumable {
   
    public Food(String name, int dmg, int hp,  int xp){
        super(name, dmg, hp, xp);
    }

    Food pain = new Food("Pain", 0, 2, 4); 
    Food fruit = new Food("Fruit", 0, 1, 2);
    Food Viande = new Food("Viande", 0, 4, 8);
    Food nada = new Food("quedale", 0, 0, 0);

    public void ConsumFood(String name, Hero consumer){

    }
}