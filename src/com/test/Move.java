package com.test;

import javax.swing.*;
import javax.xml.bind.annotation.XmlAnyAttribute;
import java.awt.*;

public class Move {
    JButton left,right,above,below;
    public void setButton(JButton left,JButton right,JButton above,JButton below){
        this.left = left;
        this.right = right;
        this.above = above;
        this.below = below;
    }
    public void go(Penson penson,JButton move){
        boolean f=true;
        int x=penson.getBounds().x;
        int y=penson.getBounds().y;
        Rectangle rectangle=penson.getBounds();
        if(move==left){

        }
    }

}
