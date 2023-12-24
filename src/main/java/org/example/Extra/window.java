package org.example.Extra;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window {

        public static void main(String[] args) {
            JFrame f=new JFrame("Tower");//creating instance of JFrame
            //like the main board to add elements

            JTextField output = new JTextField();
            output.setBounds(130,40,100,40);


            JButton inventory=new JButton("Inventory");//creating instance of JButton
            inventory.setBounds(130,100,100, 40);//x axis, y axis, width, height

            JButton Status=new JButton("Status");
            Status.setBounds(130,160,100,40);

            JButton equipment=new JButton("Equipment");
            equipment.setBounds(130,220,100,40);
            equipment.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.setText("Equipment");
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
