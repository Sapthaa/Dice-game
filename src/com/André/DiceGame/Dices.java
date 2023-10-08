package com.André.DiceGame;

import java.util.Scanner;

public class Dices {
    Scanner sc = new Scanner(System.in);
    boolean isAsking = true;

    int amountOfDie;
    public void dices (){

        System.out.println("How many dices ( 1 - 3 dices max ) ");

        do {
            if (sc.hasNextInt()) {
                amountOfDie = sc.nextInt();
                sc.nextLine();
            }else {
                amountOfDie = 0;
                sc.nextLine();
            }

            if ( amountOfDie < 1 || amountOfDie > 3 ){
                System.out.println("Wrong input, try again");
            } else if (amountOfDie == 1){

                System.out.println("You picked: " + amountOfDie + " die");
                isAsking = false;
                break;
            }
            else {
                System.out.println("You picked: " + amountOfDie + " dices");
                isAsking = false;
                break;
            }

        } while (isAsking);

    }



}
