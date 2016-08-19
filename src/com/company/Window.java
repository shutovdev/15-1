package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AliceRamsy on 19.08.2016.
 */
public class Window extends JFrame {
    private int weight;
    private int height;
    private int row;
    private int col;
    private String text;

    public Window(int weight, int height, int row, int col, String text){
        super(text);
        this.weight = weight;
        this.height = height;
        this.row = row;
        this.col = col;
        this.text = text;
        this.setSize(weight,height);
        this.setLayout(new GridLayout(row, col));
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }


}
