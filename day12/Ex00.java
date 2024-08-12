package com.day12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;

public class Ex00 {
    public static void main(String[] args) {
        Frame f = new Frame("계산기");
        f.setSize(300, 400);
        f.setLayout(new BorderLayout());

        TextArea ta = new TextArea("", 3, 35, TextArea.SCROLLBARS_NONE);
        ta.setFont(new Font("", Font.PLAIN, 20));
        f.add(ta, BorderLayout.NORTH);

        Panel p = new Panel(new GridLayout(3, 3));
        
        Button seven = new Button("7");
        Button eight = new Button("8");
        Button nine = new Button("9");
        Button four = new Button("4");
        Button five = new Button("5");
        Button six = new Button("6");
        Button one = new Button("1");
        Button two = new Button("2");
        Button three = new Button("3");
        Button zero = new Button("0");
        Button dot = new Button(".");
        
        p.add(seven);
        p.add(eight);
        p.add(nine);
        p.add(four);
        p.add(five);
        p.add(six);
        p.add(one);
        p.add(two);
        p.add(three);
        p.add(zero);
        p.add(dot);
        
        f.add(p);
        f.setVisible(true);
    }
}