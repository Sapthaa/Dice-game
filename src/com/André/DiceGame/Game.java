package com.André.DiceGame;

import java.util.Random;
import java.util.Scanner;

public class Game {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        PlayerName names = new PlayerName();
        Rounds rounds = new Rounds();
        Dices dices = new Dices();

        public void gameOfDie() {
            names.names();
            rounds.rounds();
            dices.dices();


            int p1sum = 0;
            int p2sum = 0;


            System.out.println("Alright, let's begin!");

            for (int i = 1; i <= rounds.turns; i++) {

                System.out.println("Press enter to roll");
                System.out.println("Round: " + i);
                sc.nextLine();

                for (int j = 0; j < dices.amountOfDie; j++) {
                    int dice1 = random.nextInt(6) + 1;
                    System.out.println(names.player1.substring(0,1).toUpperCase() + names.player1.substring(1) + " rolls a: " + dice1);

                    p1sum += dice1;
                    System.out.println(names.player1.substring(0,1).toUpperCase() + names.player1.substring(1) + "'s score for round " + i + " is: " +  p1sum);

                    System.out.println(" ");

                }

                for (int k = 0; k < dices.amountOfDie; k++) {

                    int dice2 = random.nextInt(6) + 1;
                    System.out.println(names.player2.substring(0,1).toUpperCase() + names.player2.substring(1) + " rolls a: " + dice2);

                    p2sum += dice2;
                    System.out.println(names.player2.substring(0,1).toUpperCase() + names.player2.substring(1) + "'s score for round " + i + " is: " + p2sum);

                    System.out.println(" ");
                }

                System.out.println(names.player1.substring(0,1).toUpperCase() + names.player1.substring(1) + "'s total score is: " + p1sum);
                System.out.println(names.player2.substring(0,1).toUpperCase() + names.player2.substring(1) + "'s total score is: " + p2sum);

            }

            if (p1sum < p2sum){
                System.out.println(names.player2.substring(0,1).toUpperCase() + names.player2.substring(1) + " has won");

            }else if (p1sum > p2sum){
                System.out.println(names.player1.substring(0,1).toUpperCase() + names.player1.substring(1) + " has won");
            } else{
                System.out.println("It's a tie, so you both lost");

            }

        }
}

