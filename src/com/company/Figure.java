package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AliceRamsy on 17.08.2016.
 */
public class Figure extends JButton{
    private int width;
    private int height;
    public int name;

    public Figure(int width, int height, int name) {
        super(String.valueOf(name));
        this.height = height;
        this.width = width;
        this.name = name;
        this.setSize(width, height);
        addActionListener(new AListener());
    }

    public class AListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setText("999");
        }
    }

}
