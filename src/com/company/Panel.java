package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JFrame {

    private JButton d4, d6, d8, d10, d12, d20;


    public Panel() {


        super("RollDice");
        super.setBounds(500, 100, 1000, 800);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container window = super.getContentPane();
        window.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel roll = new JLabel(" Нажми что бы бросить: ");
        d4 = new JButton("D4");
        d4.setIcon(new ImageIcon("com/company/images/d4.png"));
        d4.setPreferredSize(new Dimension(200, 200));
        d4.setBorderPainted(false);
        d4.setFocusPainted(false);
        d4.setContentAreaFilled(false);
        d6 = new JButton("D6");
        d6.setIcon(new ImageIcon("com/company/images/d6.png"));
        d6.setPreferredSize(new Dimension(200, 200));
        d6.setBorderPainted(false);
        d6.setFocusPainted(false);
        d6.setContentAreaFilled(false);
        d8 = new JButton("D8");
        d8.setIcon(new ImageIcon("com/company/images/d8.png"));
        d8.setPreferredSize(new Dimension(200, 200));
        d8.setBorderPainted(false);
        d8.setFocusPainted(false);
        d8.setContentAreaFilled(false);
        d10 = new JButton("D10");
        d10.setIcon(new ImageIcon("com/company/images/d10.png"));
        d10.setPreferredSize(new Dimension(200, 200));
        d10.setBorderPainted(false);
        d10.setFocusPainted(false);
        d10.setContentAreaFilled(false);
        d12 = new JButton("D12");
        d12.setIcon(new ImageIcon("com/company/images/d12.png"));
        d12.setPreferredSize(new Dimension(200, 200));
        d12.setBorderPainted(false);
        d12.setFocusPainted(false);
        d12.setContentAreaFilled(false);
        d20 = new JButton("D20");
        d20.setIcon(new ImageIcon("com/company/images/d20.png"));
        d20.setPreferredSize(new Dimension(200, 200));
        d20.setBorderPainted(false);
        d20.setFocusPainted(false);
        d20.setContentAreaFilled(false);


        window.add(roll);
        window.add(d4);
        window.add(d6);
        window.add(d8);
        window.add(d10);
        window.add(d12);
        window.add(d20);

        d4.addActionListener(new Dice(4));
        d6.addActionListener(new Dice(6));
        d8.addActionListener(new Dice(8));
        d10.addActionListener(new Dice(10));
        d12.addActionListener(new Dice(12));
        d20.addActionListener(new Dice(20));

    }


    class Dice implements ActionListener {

        private int maxvalue;
        private int value;

        public Dice(int maxvalue) {
            this.maxvalue = maxvalue;
        }

        public int getMaxvalue() {
            return maxvalue;
        }

        public void setMaxvalue(int maxvalue) {
            this.maxvalue = maxvalue;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Random numb = new Random();
            value = numb.nextInt(maxvalue) + 1;


            JOptionPane.showMessageDialog(null, value,
                    "Результат броска D" + getMaxvalue(),
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

}
