package com.test;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
//模型，每个棋子的字体，颜色，焦点事件会让其变色
public class Penson extends JButton implements FocusListener {
    int number;
    Color c = new Color(255,245,170);
    Font font=new Font("宋体",Font.BOLD,12);
    Penson(int Number, String s){
        super(s);
        number=Number;
        setBackground(c);
        setFont(font);
        addFocusListener(this);
    }


    @Override
    public void focusLost(FocusEvent e) {
            setBackground(c);
    }
    @Override
    public void focusGained(FocusEvent e){
            setBackground(Color.red);
    }
}
