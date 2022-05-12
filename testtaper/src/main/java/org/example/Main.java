package org.example;

import java.util.ArrayList;

import java.util.InputMismatchException;

import java.util.Scanner;


import java.math.*;

import static org.example.battle.fight;

class GenerateRandom {
    public static int random(int min, int max) {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
}



public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Monster> enemies = new ArrayList<Monster>();
        Integer numberOfEnemies = null;


       
        while (numberOfEnemies == null) {
            try {
                System.out.println("How many enemies can you beat?");
                numberOfEnemies = scan.nextInt();
                if (numberOfEnemies > 3) {                
                    System.out.println("How pretentious are you? Try to be realistic like less than 3 foes");
                    numberOfEnemies = null;
                }
            } catch (InputMismatchException e) {
                //scan.close();
                System.out.println("Don't you understand what an integer is?");
            } catch (Exception e) {
                System.out.println("Something went wrong! Sorry and Cy@");
                return;
            }
        }
        scan.close();

        System.out.println("I'm out!");
        for (int i = 1; i <= numberOfEnemies; i++) {
                       
            Monster enemy = new Monster(("goblin" + i), 200);
            enemies.add(enemy);
            System.out.println(enemy);
            
        }
        System.out.println(enemies);
        System.out.println(enemies.size());
        System.out.println(enemies.get(0).getName());
        System.out.println(enemies.get(1));
        

        Hero player = new Hero("Ilgard", 200);
        System.out.println(player);

    fight(player, enemies);
    }
}

