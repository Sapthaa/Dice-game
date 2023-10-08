package com.André.DiceGame;

import java.util.Scanner;

public class PlayerName {
    Scanner sc = new Scanner(System.in);
    public String player1;
    public String player2;

    public void names() {
        System.out.println("Hello, Write your names");
        System.out.println("Player 1: ");
        this.player1 = sc.nextLine();

        System.out.println("Player 2: ");
        this.player2 = sc.nextLine();

        System.out.println("Player 1: name is " + player1.substring(0,1).toUpperCase() + player1.substring(1));
        System.out.println("Player 2: name is " + player2.substring(0,1).toUpperCase() + player2.substring(1));

    }




}
