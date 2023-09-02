//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.WeatherInfo;

import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class WeatherInfo extends JFrame implements ActionListener {
    static Logger weatherLogger = LogManager.getLogger(WeatherInfo.class.getName());
    JRadioButton rb1 = new JRadioButton("Kraków");
    JRadioButton rb2;
    JRadioButton rb3;
    JRadioButton rb4;
    JRadioButton rb5;
    JButton b;

    WeatherInfo() {
        this.rb1.setBounds(100, 35, 100, 30);
        this.rb2 = new JRadioButton("Sopot");
        this.rb2.setBounds(100, 65, 100, 30);
        this.rb3 = new JRadioButton("Warszawa");
        this.rb3.setBounds(100, 95, 100, 30);
        this.rb4 = new JRadioButton("Poznań");
        this.rb4.setBounds(100, 125, 100, 30);
        this.rb5 = new JRadioButton("Zakopane");
        this.rb5.setBounds(100, 155, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(this.rb1);
        bg.add(this.rb2);
        bg.add(this.rb3);
        bg.add(this.rb4);
        bg.add(this.rb5);
        String miastoWybor = new String("Proszę wybrać miasto:");
        JLabel title = new JLabel(miastoWybor);
        title.setFont(new Font("Arial", 1, 15));
        title.setSize(300, 20);
        title.setLocation(70, 10);
        this.add(title);
        this.b = new JButton("OK!");
        this.b.setBounds(100, 190, 80, 30);
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
        this.setLocationRelativeTo((Component)null);
        this.setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        String zakopane;
        if (this.rb1.isSelected()) {
            weatherLogger.info("KRAKOW SELECTED BY THE USER");
            this.dispose();
            zakopane = new String("Kraków");

            try {
                WeatherForCity.Pogoda(zakopane);
                weatherLogger.info("SUCCESFULLY LOADED KRAKOW WINDOW");
            } catch (Exception var8) {
                System.out.println("Could not load the weather, sorry!");
                weatherLogger.error("ERROR LOADING WEATHER FOR KRAKOW");
            }
        }

        if (this.rb2.isSelected()) {
            weatherLogger.info("SOPOT SELECTED BY THE USER");
            this.dispose();
            zakopane = new String("Sopot");

            try {
                WeatherForCity.Pogoda(zakopane);
                weatherLogger.info("SUCCESFULLY LOADED SOPOT WINDOW");
            } catch (Exception var7) {
                System.out.println("Could not load the weather, sorry!");
                weatherLogger.error("ERROR LOADING WEATHER FOR SOPOT");
            }
        } else if (this.rb3.isSelected()) {
            weatherLogger.info("WARSZAWA SELECTED BY THE USER");
            this.dispose();
            zakopane = new String("Warszawa");

            try {
                WeatherForCity.Pogoda(zakopane);
                weatherLogger.info("SUCCESFULLY LOADED WARSZAWA WINDOW ");
            } catch (Exception var6) {
                System.out.println("Could not load the weather, sorry!");
                weatherLogger.error("ERROR LOADING WEATHER FOR WARSZAWA");
            }
        } else if (this.rb4.isSelected()) {
            weatherLogger.info("POZNAN SELECTED BY THE USER");
            this.dispose();
            zakopane = new String("Poznań");

            try {
                WeatherForCity.Pogoda(zakopane);
                weatherLogger.info("SUCCESFULLY LOADED POZNAN WINDOW");
            } catch (Exception var5) {
                System.out.println("Could not load the weather, sorry!");
                weatherLogger.error("ERROR LOADING WEATHER FOR POZNAN");
            }
        } else if (this.rb5.isSelected()) {
            weatherLogger.info("ZAKOPANE SELECTED BY THE USER");
            this.dispose();
            zakopane = new String("Zakopane");

            try {
                WeatherForCity.Pogoda(zakopane);
                weatherLogger.info("SUCCESFULLY LOADED ZAKOPANE WINDOW");
            } catch (Exception var4) {
                System.out.println("Could not load the weather, sorry!");
                weatherLogger.error("ERROR LOADING WEATHER FOR ZAKOPANE");
            }
        } else if (!this.rb1.isSelected() && !this.rb2.isSelected() && !this.rb3.isSelected() && !this.rb4.isSelected() && !this.rb5.isSelected()) {
            JOptionPane.showMessageDialog(this, "Proszę wybrać miasto.");
            weatherLogger.info("CITY WAS NOT DEFINED");
        }

        weatherLogger.info("PROGRAM STOPPED");
    }

    public static void main(String[] args) {
        weatherLogger.info("PROGRAM LAUNCHED");
        new WeatherInfo();
    }
}
