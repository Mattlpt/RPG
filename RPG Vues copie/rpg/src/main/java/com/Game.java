package com;

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game{
    
    public List<Hero> team ; 
    public List<Enemy> enemies ; 
    public List<Integer> choix = new ArrayList<Integer>();
    Hero atckan; 
    Enemy atcké;

 
    public Game(){
        setHeros();
        setEnemies();
    }



    public List<Hero> getTeam(){
        return this.team;
    } 


    public void setHeros(){
        Scanner scanner = new Scanner(System.in); 
        this.team = new ArrayList<Hero>();
        System.out.println("Entrez le nombre de combatant dans cette équipe");
        int n = scanner.nextInt(); 
        choix.add(n);
        for(int i = 0; i < n; i++){
            System.out.println("\nQuel Hero voulez-vous employer ?\n"); 
            System.out.println(" _________________________________________________________________________ "); 
            System.out.println("|         1        |         2        |        3         |        4       |");
            System.out.println("|__________________|__________________|__________________|________________|"); 
            System.out.println("|      Warrior     |      Hunter      |      Healer      |      Mage      |"); 
            System.out.println("|                  |                  |                  |                |"); 
            System.out.println("| atck : n         | atck : i         | atck : j         | atck : k       |");
            System.out.println("| dfse : a         | dfse : b         | dfse : c         | dfse : d       |"); 
            System.out.println("| health : e       | health : f       | health : g       | health : h     |"); 
            System.out.println("| armor : l        | armor: m         | armor : o        | armor : p      |"); 
            System.out.println("|__________________|__________________|__________________|________________|"); 
            System.out.println("\n Choisissez le numéro correspondant ; \n"); 
            int h = scanner.nextInt();
            switch(h){
                case 1 : 
                    this.team.add(new Warrior("Warrior", 0, 20, 10, 12, 0, new Weapon("Epée", 12, 0), null, null));
                    break ; 
                case 2 :
                    this.team.add(new Hunter("Hunter", 20, 0, 10, 10, 0, new Weapon("Flèche", 10, 0), null, null)); 
                    break;
                case 3 : 
                    this.team.add(new Healer("Healer", 10, 0, 10, 1, 2, new Weapon("null", i, h)));    
                    break;
                case 4 : 
                    this.team.add(new Mage("Mage", 10, 0, 10, 1, 2, new Weapon("null", i, h)));
                    break; 
                    }
            }

            System.out.println("Youre team : ");
            for(Hero hero : this.team){
                System.out.println(hero.getName() );
            }
        scanner.close();
    }

    public void setEnemies(){
        this.enemies = new ArrayList<Enemy>();

        Random random = new Random();
        int j = (int) choix.get(0);
        for(int i = 1; i <=j; i++) {
            int value = random.nextInt((2 - 1) + 1) + 1;
            switch(j){
                case 1 : 
                    this.enemies.add(new Enemy("Gobelin", value, value, j, i, value));
                    break ; 
                case 2 :
                    this.enemies.add(new Enemy("monstre", value, value, j, i, value));
                    break;
            }
        }
    }

    public Hero setAtckan(List<Hero> team2){
        Scanner scannerAtckan = new Scanner(System.in);
        System.out.println("Quel hero par au combat ?"); 
        int o = scannerAtckan.nextInt(); 
        atckan = team2.get(o);
        scannerAtckan.close();
        return atckan ; 
    }

    public Enemy setAtcké(List<Enemy> enemies2){
        atcké = enemies2.get(0);
        return atcké ; 
    }

    public void combat(Hero atckan, Enemy atcké){
        // l'attaque
        int p = atckan.getWeapon().getDmg(); 
        atcké.PerdreHp(p);

        // la riposte 
        int q = atcké.getAtck();
        atckan.PerdreHp(q);

        System.out.println("Votre combatant à : " + atckan.hp + "!");
        System.out.println("L'enemi à pris cher ! Il lui reste : " + atcké.hp);
    }

    public static void main(String[] args){

        Weapon epee = new Weapon("Epée", 12, 0);

        Weapon arrow = new Weapon("Flèche", 10, 0);

        Warrior warrior = new Warrior("Warrior", 0, 20, 10, 12, 0, epee, null, null); 

        Hunter hunter = new Hunter("Hunter", 20, 0, 10, 10, 0, arrow, null, null);
    
        int combats = 5 ; 
        Game game = new Game();
    }
}