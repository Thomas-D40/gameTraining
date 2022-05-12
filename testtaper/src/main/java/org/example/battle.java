package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class battle {

    public static void chooseEnemy(int 1) {
        System.out.println("Who do you want to attack?");
        Scanner scan = new Scanner(System.in);
        int monsterChoice = scan.nextInt();

        switch(monsterChoice) {
                case 1 :
                    return Enemies.enemy1;
                default :
                    System.out.println("Please, make an effort and choose a monster to hit");
        }
    }

    public static void chooseEnemy(2) {
        System.out.println("Who do you want to attack?");
        Scanner scan = new Scanner(System.in);
        int monsterChoice = scan.nextInt();

        switch(monsterChoice) {
                case 1 :
                    return Enemies.enemy1;
                case 2 :
                    return Enemies.enemy2;
                                           
                default :
                    System.out.println("Please, make an effort and choose a monster to hit");
        }
    }
    
    public static void chooseEnemy(3) {
        System.out.println("Who do you want to attack?");
        Scanner scan = new Scanner(System.in);
        int monsterChoice = scan.nextInt();

        switch(monsterChoice) {
                case 1 :
                    return Enemies.enemy1;
                case 2 :
                    return Enemies.enemy2;
                case 3:
                    return Enemies.enemy3;
                                           
                default :
                    System.out.println("Please, make an effort and choose a monster to hit");
        }
    }

    
    

    public static void fight(Hero player, ArrayList<Monster> enemies){
        for (int i = 1; i <= enemies.size(); i++) {
        System.out.println("The great " + enemies.get(i).getName() + " appears before you, screeching, howling");
        }

        Scanner scan = new Scanner(System.in);  

        

        do {
            for (int i = 0 ; i == 0; ) {
                System.out.println("What will you do?");
                System.out.print("1 - fight   | 2 - flee  : ");
                try{

                    int choice = scan.nextInt();


                    switch (choice) {
                        case 1:
                            chooseEnemy();
                            i++;
                            break;

                        case 2:
                            player.flee();
                            i++;
                            break;

                        default:
                            System.out.println("What are you doing? There's a monster here, make your choice!");
                    }
                } catch (InputMismatchException e) {
                    //scan.close();
                    System.out.println("Did you get hit too hard in the head?");
                }

            }
            if (enemy.getHp() > 0) {
                player.takeHit(enemy.attack());
            }
        }
        while (player.getHp() > 0 && enemy.getHp() > 0) ;
    }

    

}

