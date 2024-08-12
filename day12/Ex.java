package com.day12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;

public class Ex extends Frame{
	public static void main(String[] args) {
		Frame f = new Frame();
        f.setSize(400, 500);
        f.setLayout(new BorderLayout());

        TextArea ta = new TextArea("", 3, 35, TextArea.SCROLLBARS_NONE);
        ta.setFont(new Font("", Font.PLAIN, 20));
        f.add(ta, BorderLayout.NORTH);
        
        Panel p = new Panel(new GridLayout(4,5));
        
        Button clear = new Button("clear");
        p.add(clear);
        Button div = new Button("/");
        p.add(div);
        Button mul = new Button("*");
        p.add(mul);
        Button plus = new Button("+");
        p.add(plus);
        Button one = new Button("1");
        p.add(one);
        Button two = new Button("2");
        p.add(two);
        Button three = new Button("3");
        p.add(three);
        Button sub = new Button("-");
        p.add(sub);
        Button four = new Button("4");
        p.add(four);
        Button five = new Button("5");
        p.add(five);
        Button six = new Button("6");
        p.add(six);
        Button equl = new Button("=");
        p.add(equl);
        Button seven = new Button("7");
        p.add(seven);
        Button eight = new Button("8");
        p.add(eight);
        Button nine = new Button("9");
        p.add(nine);
        Button zero = new Button("0");
        p.add(zero);
        
        f.add(p);
        f.setVisible(true);
	}
	
}
