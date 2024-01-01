package org.example.Menus;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {

    private JFrame jFrame;
    private JTable inventoryMenu ;




    public  Menu(String title){
        this.jFrame = new JFrame(title);
    };

    public JFrame getjFrame() {
        return jFrame;
    }

    public void setProperties(){
        jFrame.setSize(400,500);//400 width and 500 height
        jFrame.setLayout(null);//using no layout managers
        jFrame.setVisible(true);//making the frame visible
    }
    public void table(String [] column, String[][] data){
        inventoryMenu=new JTable(data,column);
        inventoryMenu.setBounds(30,40,100,20);
        JScrollPane sp=new JScrollPane(inventoryMenu);
        jFrame.add(sp);
        jFrame.setSize(400,500);//400 width and 500 height
        jFrame.setVisible(true);//making the frame visible

    }


    public void addTextElement(JTextField jTextField,String text ,int x,int y,int width ,int height){
        jTextField.setText(text);
        jTextField.setBounds(x,y,width,height);
        jTextField.setEditable(false);
        jFrame.add(jTextField);

    }

    public void Refresh(){
        jFrame.repaint();
    }

    public void display(String input){
    }
}
