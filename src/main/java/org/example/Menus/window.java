package org.example.Menus;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window {

        public static void main(String[] args) {
            JFrame f=new JFrame("Tower");//creating instance of JFrame
            //like the main board to add elements

            JTextField output = new JTextField(2);
            output.setBounds(130,40,100,40);
            output.setEditable(false);
            //perfect for stats

//            (new ImageIcon("D:\\icon.png") should it be an image for a button


            JButton inventory=new JButton("Inventory");//creating instance of JButton
            inventory.setBounds(130,100,100, 40);//x axis, y axis, width, height

            JButton Status=new JButton("Status");
            Status.setBounds(130,160,100,40);

            JButton equipment=new JButton("Equipment");
            equipment.setBounds(130,220,100,40);
            Status.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText("HP: 25/25 ");
                    f.remove(inventory);
                    f.remove(equipment);
                    f.remove(Status);
                    f.repaint();

                    //allows one to refresh Jframe
                }
            });
            f.add(output);
            f.add(inventory);//adding button in JFrame
            f.add(Status);
            f.add(equipment);

            f.setSize(400,500);//400 width and 500 height
            f.setLayout(null);//using no layout managers
            f.setVisible(true);//making the frame visible
    }
}
