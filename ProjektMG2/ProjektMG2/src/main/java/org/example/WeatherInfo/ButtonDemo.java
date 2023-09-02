//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.WeatherInfo;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class ButtonDemo extends JFrame implements ActionListener {
    JRadioButton rb1 = new JRadioButton("Kraków");
    JRadioButton rb2;
    JRadioButton rb3;
    JRadioButton rb4;
    JRadioButton rb5;
    JButton b;

    ButtonDemo() {
        this.rb1.setBounds(100, 5, 100, 30);
        this.rb2 = new JRadioButton("Sopot");
        this.rb2.setBounds(100, 35, 100, 30);
        this.rb3 = new JRadioButton("Warszawa");
        this.rb3.setBounds(100, 65, 100, 30);
        this.rb4 = new JRadioButton("Poznań");
        this.rb4.setBounds(100, 95, 100, 30);
        this.rb5 = new JRadioButton("Zakopane");
        this.rb5.setBounds(100, 125, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(this.rb1);
        bg.add(this.rb2);
        bg.add(this.rb3);
        bg.add(this.rb4);
        bg.add(this.rb5);
        this.b = new JButton("OK!");
        this.b.setBounds(100, 170, 80, 30);
        this.b.addActionListener(this);
        this.add(this.rb1);
        this.add(this.rb2);
        this.add(this.rb3);
        this.add(this.rb4);
        this.add(this.rb5);
        this.add(this.b);
        this.setSize(300, 300);
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (this.rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Kraków");
        }

        if (this.rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Sopot");
        }

        if (this.rb3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Warszawa");
        }

        if (this.rb4.isSelected()) {
            JOptionPane.showMessageDialog(this, "Poznań");
        }

        if (this.rb5.isSelected()) {
            JOptionPane.showMessageDialog(this, "Zakopane");
        } else {
            JOptionPane.showMessageDialog(this, "Proszę wybrać miasto.");
        }

    }

    public static void main(String[] args) {
        new ButtonDemo();
    }
}
