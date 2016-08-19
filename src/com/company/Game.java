package com.company;

import javax.swing.*;
import java.util.Random;

/**
 * Created by AliceRamsy on 19.08.2016.
 */
public class Game {

    private static Window window;
    private static Figure [][] figures;
    private static int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static Random random;
    public static void init(){
        window = new Window(300,300, 4, 4, "Петнашки :)");
        figures = new Figure[4][4];
        random = new Random();

        int index = random.nextInt(15);
        int count = 0;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (count == 15){
                    break;
                } else {
                    figures[i][j] = new Figure(70, 70, getNumber());
                    window.add(figures[i][j]);
                }
                count++;
            }
        }
        window.setVisible(true);
    }

    public static int getNumber(){
        random = new Random();
        int index;
        int number;
        do {
            index = random.nextInt(15);
        } while (numbers[index] == 0);

        number = numbers[index];
        numbers[index] = 0;
        return number;
    }

    public static void start(){
    }
}
