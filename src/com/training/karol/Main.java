package com.training.karol;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Drink drink = Barman.createDrink("Sok kokosowy",40,"Spirytus",50,"Malibu",50);
        Barman.printDrink(drink);
    }
}
