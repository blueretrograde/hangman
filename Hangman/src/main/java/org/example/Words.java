package org.example;

import java.util.Random;

public class Words {

    public static final String[] wordPool = {
            "Buenos Aires", "Yerevan", "Canberra", "Vienna", "Minsk", "Brussels", "Nicosia", "Athens", "Prague",
            "Bratislava", "Rome", "Stockholm", "Dublin", "London", "Washington DC", "Hanoi", "Montevideo", "Moscow",
            "Madrid", "Seoul", "Tokyo", "Amsterdam", "Mexico City", "Chisinau", "Paris", "Ottawa", "Tallinn", "Helsinki",
            "Oslo", "Lisbon", "Manila", "Copenhagen", "Berlin", "Warsaw", "Abu Dhabi", "Panama City", "Kuala Lumpur", "New Delhi" };

    //38 cities
    public static final Random randomise = new Random();

    public static String getRandomWord(){
        String randomWord = wordPool[randomise.nextInt(wordPool.length)];
        System.out.println(randomWord);
        return randomWord;
    }




    }



