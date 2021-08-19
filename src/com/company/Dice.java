package com.company;

import java.util.Random;

public class Dice {
    int sides;

    Dice(int sides){
        this.sides = sides;
    }

    public int roll(){
        Random random = new Random();
        return random.nextInt(sides) +1;
    }
}
