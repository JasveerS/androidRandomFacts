package com.example.android.funfact;

import java.util.Random;

/**
 * Created by jasveer on 4/15/2018.
 */

 class AndroidFacts {
    /**
     * array for all getFacts about few getFacts about android
     */

    private final String[] andoridFacts = new String[]{" The very first Android phone from 2008 had no headphone jack and required an adapter ",
            "Android versions are named in Alphabetical order",
            "Apart from Android 1.0 and 1.1, all other Android versions have been named after sweet treats or desserts",
            "Google has statues outside its HQ for each version of the Android OS",
            "The word Android refers only to a male robot, whereas a female robot is called 'Gynoid'",
            "Samsung had the opportunity to buy Android in late 2004 but passed the opportunity because they did not see any potential in it",
            "Over 1.4 billion people are now using Android",
            "Microsoft makes an astounding $2 billion a year from Android in the form of patent royalties",
            "The first Android prototype looked a lot like a Blackberry",
            "It is based on the open source operating system Linux",
            "Android was originally created as an operating system for digital cameras" };

    /**
     *
     * @return random getFacts
     */
     String getFacts(){
        //random number generator for random getFacts
        Random randomFacts=new Random();
        //android getFacts

        int number=randomFacts.nextInt(andoridFacts.length);

        //returning new getFacts randomly
        return andoridFacts[number];
    }
}
