package com.André.DiceGame;

import java.util.Scanner;

public class Rounds {
    Scanner sc = new Scanner(System.in);
    boolean isAsking = true;
    int turns;

    public void rounds() {


        do {
            System.out.println("how many turns ( 1 - 5 turns max )");
            if (sc.hasNextInt()) {
                turns = sc.nextInt();
                sc.nextLine();
            } else {
                turns = 0;
                sc.nextLine();
            }

            if (turns < 1 || turns > 5) {
                System.out.println("Wrong input for how many turns, try again");

            } else {
                System.out.println("You picked: " + turns + " turns");
                isAsking = false;
                break;

            }

        }while (isAsking);
    }



}
