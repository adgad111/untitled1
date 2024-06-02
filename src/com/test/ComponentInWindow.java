package com.test;

import javax.swing.*;
import java.awt.*;

public class ComponentInWindow extends JFrame {
    JCheckBox checkBox1,checkBox2; //复选框
    JRadioButton radioM,radioF; //单选框
    ButtonGroup group; //
    JComboBox<String> comBox;
    public ComponentInWindow(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        setLayout(new FlowLayout());//设置布局
        comBox=new JComboBox<String>();//下拉列表
        checkBox1=new JCheckBox("喜欢音乐");
        checkBox2=new JCheckBox("喜欢旅游");
        group=new ButtonGroup();



    }


}
