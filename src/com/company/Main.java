package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*JFrame frm = new JFrame("test");
        frm.setSize(300,300);
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        JButton btn = new JButton("btn");
        btn.setSize(100, 100);
        final int[] i = {0};
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn.setText("press " + i[0]);
                i[0]++;
            }
        });
        frm.add(btn);
        frm.setVisible(true);*/
        Game.init();

    }
}
