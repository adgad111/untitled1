package com.test;

import javax.swing.*;
import java.awt.event.*;

public class Hua_Rong_Dao extends JFrame  implements ActionListener, MouseListener, KeyListener {
    JButton restart=new JButton("重新开始");
    JButton left=new JButton(),rigth=new JButton(), above=new JButton(),below=new JButton();
    Penson []pensons = new Penson[10];

    Hua_Rong_Dao(){
        init();
        setVisible(true);
        setBounds(100,100,320,520);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }
    public void init(){
        setLayout(null);
        add(restart);
        restart.setBounds(100,320,120,35);
        restart.addActionListener(this);
        String [] names={"周","曹操","黄","张","关羽","刘","兵","兵","兵","兵"};
        for(int i=0;i<pensons.length;i++){
            pensons[i]=new Penson(i,names[i]);
            pensons[i].addMouseListener(this);
            pensons[i].addKeyListener(this);
            add(pensons[i]);
        }


    };
    @Override
    //按下鼠标
    public void mousePressed(MouseEvent e){

    }
    @Override
    //释放鼠标
    public void mouseReleased(MouseEvent e){

    }

    @Override
    //动作事件
    public void actionPerformed(ActionEvent e){
        dispose();
        new Hua_Rong_Dao();
    }

}
