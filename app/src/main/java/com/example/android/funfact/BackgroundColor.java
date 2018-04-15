package com.example.android.funfact;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by jasveer on 4/15/2018.
 */

public class BackgroundColor {
    /**
     * array for colors
     */

    private final String[] colors = new String[]{"#F44336",
            "#880E4F",
            "#9C27B0",
            "#FF1744",
            "#4A148C",
            "#D50000",
            "#673AB7",
            "#2196F3",
            "#00838F",
            "#004D40",
            "#E65100" };

    /**
     *
     * @return random colors
     */
    int getColor(){
        //random number generator for random getFacts
        Random randomFacts=new Random();
        //android getFacts

        int number=randomFacts.nextInt(colors.length);

        //returning new colors randomly
        int color= Color.parseColor(colors[number]);
        return color;
    }
}