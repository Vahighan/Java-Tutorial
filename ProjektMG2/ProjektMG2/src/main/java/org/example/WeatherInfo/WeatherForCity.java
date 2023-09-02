//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.WeatherInfo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WeatherForCity {
    public WeatherForCity() {
    }

    static void Tytul(String tytul, JPanel panel) {
        JLabel title = new JLabel(tytul);
        title.setFont(new Font("Monospaced", 1, 15));
        title.setSize(300, 20);
        title.setLocation(300, 10);
        panel.add(title);
    }

    static void Cisnienie(String Cisnienie, JPanel panel, JTextField jtf7, JLabel jlabPrompt4, JLabel jlabContents4) {
        JTextField jtf4 = new JTextField(Cisnienie);
        jtf4.setEditable(false);
        jtf4.setActionCommand("myTF4");
        jtf4.setMaximumSize(jtf7.getPreferredSize());
        jtf4.setBackground(Color.pink);
        panel.add(jlabPrompt4);
        panel.add(jlabContents4);
        panel.add(jtf4);
    }

    static void Informacje(JPanel panel, String urlMiasto) {
        JLabel jlabPrompt = new JLabel("Temperatura");
        panel.setAlignmentX(0.5F);
        JLabel jlabContents = new JLabel("");
        JLabel jlabPrompt2 = new JLabel("Opis");
        JLabel jlabContents2 = new JLabel("");
        JLabel jlabPrompt3 = new JLabel("Temperatura odczuwalna");
        JLabel jlabContents3 = new JLabel("");
        JLabel jlabPrompt4 = new JLabel("Ciśnienie");
        JLabel jlabContents4 = new JLabel("");
        JLabel jlabPrompt5 = new JLabel("Wiatr");
        JLabel jlabContents5 = new JLabel("");
        JLabel jlabPrompt6 = new JLabel("Jakość powietrza");
        JLabel jlabContents6 = new JLabel("");

        try {
            Document doc = Jsoup.connect("http://agh.edu.pl").get();
            Iterator var24 = doc.select(".weather-currently").iterator();

            while(var24.hasNext()) {
                Element e = (Element)var24.next();
                String Opis = e.select(".weather-currently-icon-description").text();
                JTextField jtf2 = new JTextField(Opis);
                String przewaznieSlonecznie = new String("Przeważnie słonecznie");
                String slonecznie = new String("Słonecznie");
                String zachmurzenieDuze = new String("Zachmurzenie duże");
                String przelotneOpady = new String("Przelotne opady");
                String czesciowoSlonecznie = new String("Częściowo słonecznie");
                String pochmurno = new String("Pochmurno");
                String deszcz = new String("Deszcz");
                String burze_z_piorunami = new String("Burze z piorunami");
                String przejsciowe_zachmurzenie = new String("Przejściowe zachmurzenie");
                String przelotne_opady = new String("Przelotne opady");

                try {
                    JLabel jlabContents8;
                    BufferedImage myPicture;
                    Image newimage;
                    if (Opis.equals(przewaznieSlonecznie)) {
                        myPicture = ImageIO.read(new File("C:\\Users\\User\\eclipse-workspace\\MS_Project_Java_2022\\src\\przewaznie_slonecznie.png"));
                        newimage = myPicture.getScaledInstance(100, 70, 4);
                        jlabContents8 = new JLabel(new ImageIcon(newimage));
                        panel.add(jlabContents8);
                    } else if (Opis.equals(slonecznie)) {
                        myPicture = ImageIO.read(new File("C:\\Users\\User\\eclipse-workspace\\MS_Project_Java_2022\\src\\slonecznie.png"));
                        newimage = myPicture.getScaledInstance(100, 70, 4);
                        jlabContents8 = new JLabel(new ImageIcon(newimage));
                        panel.add(jlabContents8);
                    } else if (Opis.equals(zachmurzenieDuze)) {
                        myPicture = ImageIO.read(new File("C:\\Users\\User\\eclipse-workspace\\MS_Project_Java_2022\\src\\zachmurzenie_duze.png"));
                        newimage = myPicture.getScaledInstance(100, 70, 4);
                        jlabContents8 = new JLabel(new ImageIcon(newimage));
                        panel.add(jlabContents8);
                    } else if (Opis.equals(przelotneOpady)) {
                        myPicture = ImageIO.read(new File("C:\\Users\\User\\eclipse-workspace\\MS_Project_Java_2022\\src\\przelotne_opady.png"));
                        newimage = myPicture.getScaledInstance(100, 70, 4);
                        jlabContents8 = new JLabel(new ImageIcon(newimage));
                        panel.add(jlabContents8);
                    } else if (Opis.equals(czesciowoSlonecznie)) {
                        myPicture = ImageIO.read(new File("C:\\Users\\User\\eclipse-workspace\\MS_Project_Java_2022\\src\\czesciowo_slonecznie.png"));
                        newimage = myPicture.getScaledInstance(100, 70, 4);
                        jlabContents8 = new JLabel(new ImageIcon(newimage));
                        panel.add(jlabContents8);
                    } else if (Opis.equals(pochmurno)) {
                        myPicture = ImageIO.read(new File("C:\\Users\\User\\eclipse-workspace\\MS_Project_Java_2022\\src\\pochmurno.png"));
                        newimage = myPicture.getScaledInstance(100, 70, 4);
                        jlabContents8 = new JLabel(new ImageIcon(newimage));
                        panel.add(jlabContents8);
                    } else if (Opis.equals(deszcz)) {
                        myPicture = ImageIO.read(new File("C:\\Users\\User\\eclipse-workspace\\MS_Project_Java_2022\\src\\deszcz.png"));
                        newimage = myPicture.getScaledInstance(100, 70, 4);
                        jlabContents8 = new JLabel(new ImageIcon(newimage));
                        panel.add(jlabContents8);
                    } else if (Opis.equals(burze_z_piorunami)) {
                        myPicture = ImageIO.read(new File("C:\\Users\\User\\eclipse-workspace\\MS_Project_Java_2022\\src\\burze_z_piorunami.png"));
                        newimage = myPicture.getScaledInstance(100, 70, 4);
                        jlabContents8 = new JLabel(new ImageIcon(newimage));
                        panel.add(jlabContents8);
                    } else if (Opis.equals(przejsciowe_zachmurzenie)) {
                        myPicture = ImageIO.read(new File("C:\\Users\\User\\eclipse-workspace\\MS_Project_Java_2022\\src\\przelotne_zachmurzenie.png"));
                        newimage = myPicture.getScaledInstance(100, 70, 4);
                        jlabContents8 = new JLabel(new ImageIcon(newimage));
                        panel.add(jlabContents8);
                    } else if (Opis.equals(przelotne_opady)) {
                        myPicture = ImageIO.read(new File("C:\\Users\\User\\eclipse-workspace\\MS_Project_Java_2022\\src\\przelotne_opady.png"));
                        newimage = myPicture.getScaledInstance(100, 70, 4);
                        jlabContents8 = new JLabel(new ImageIcon(newimage));
                        panel.add(jlabContents8);
                    } else {
                        myPicture = ImageIO.read(new File("C:\\Users\\User\\eclipse-workspace\\MS_Project_Java_2022\\src\\inne.png"));
                        newimage = myPicture.getScaledInstance(100, 70, 4);
                        jlabContents8 = new JLabel(new ImageIcon(newimage));
                        panel.add(jlabContents8);
                    }
                } catch (IOException var43) {
                    System.out.println("Image could not be imported");
                    System.exit(1);
                }

                String Data = e.select(".date.weather-currently-info-item").text();
                JTextField jtf7 = new JTextField(Data, 30);
                jtf7.setEditable(false);
                jtf7.setActionCommand("myTF7");
                jtf7.setMaximumSize(jtf7.getPreferredSize());
                jtf7.setBackground(Color.pink);
                panel.add(jtf7);
                String Temperatura = e.select(".weather-currently-temp").text();
                JTextField jtf1 = new JTextField(Temperatura, 30);
                jtf1.setEditable(false);
                jtf1.setActionCommand("myTF1");
                jtf1.setMaximumSize(jtf7.getPreferredSize());
                jtf1.setMaximumSize(jtf7.getPreferredSize());
                jtf1.setBackground(Color.pink);
                panel.add(jlabPrompt);
                panel.add(jlabContents);
                panel.add(jtf1);
                jtf2.setEditable(false);
                jtf2.setActionCommand("myTF2");
                jtf2.setMaximumSize(jtf7.getPreferredSize());
                jtf2.setBackground(Color.pink);
                panel.add(jlabPrompt2);
                panel.add(jlabContents2);
                panel.add(jtf2);
                String TemperaturaOdczuwalna = e.select(".feelTemperature.weather-currently-details-item > .weather-currently-details-value").text();
                JTextField jtf3 = new JTextField(TemperaturaOdczuwalna);
                jtf3.setEditable(false);
                jtf3.setActionCommand("myTF3");
                jtf3.setMaximumSize(jtf7.getPreferredSize());
                jtf3.setBackground(Color.pink);
                panel.add(jlabPrompt3);
                panel.add(jlabContents3);
                panel.add(jtf3);
                String Cisnienie;
                if (e.select(".steady.weather-currently-details-value").text() != "") {
                    Cisnienie = e.select(".steady.weather-currently-details-value").text();
                    Cisnienie(Cisnienie, panel, jtf7, jlabPrompt4, jlabContents4);
                }

                if (e.select(".decreasing.weather-currently-details-value").text() != "") {
                    Cisnienie = e.select(".decreasing.weather-currently-details-value").text();
                    Cisnienie(Cisnienie, panel, jtf7, jlabPrompt4, jlabContents4);
                }

                if (e.select(".rising.weather-currently-details-value").text() != "") {
                    Cisnienie = e.select(".rising.weather-currently-details-value").text();
                    Cisnienie(Cisnienie, panel, jtf7, jlabPrompt4, jlabContents4);
                }

                String Wiatr = e.select(".wind.weather-currently-details-item > .weather-currently-details-value").text();
                JTextField jtf5 = new JTextField(Wiatr);
                jtf5.setEditable(false);
                jtf5.setActionCommand("myTF5");
                jtf5.setMaximumSize(jtf7.getPreferredSize());
                jtf5.setBackground(Color.pink);
                panel.add(jlabPrompt5);
                panel.add(jlabContents5);
                panel.add(jtf5);
                String JakoscPowietrza = e.select(".kind > .value").text();
                JTextField jtf6 = new JTextField(JakoscPowietrza);
                jtf6.setEditable(false);
                jtf6.setActionCommand("myTF6");
                jtf6.setMaximumSize(jtf7.getPreferredSize());
                jtf6.setBackground(Color.pink);
                panel.add(jlabPrompt6);
                panel.add(jlabContents6);
                panel.add(jtf6);
            }
        } catch (Exception var44) {
            System.out.println("Could not connect to the page. Check your internet connection!");
        }

    }

    static void Pogoda(String miasto) {
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        BoxLayout boxlayout = new BoxLayout(panel, 1);
        panel.setLayout(boxlayout);
        String url;
        if (miasto.equals("Kraków")) {
            Tytul("POGODA W KRAKOWIE", panel);
            url = "https://pogoda.interia.pl/prognoza-dlugoterminowa-krakowq,cId,4970";
            Informacje(panel, url);
        }

        if (miasto.equals("Sopot")) {
            Tytul("POGODA W SOPOCIE", panel);
            url = "https://pogoda.interia.pl/prognoza-dlugoterminowa-sopot,cId,32529";
            Informacje(panel, url);
        }

        if (miasto.equals("Warszawa")) {
            Tytul("POGODA W WARSZAWIE", panel);
            url = "https://pogoda.interia.pl/prognoza-dlugoterminowa-warszawa,cId,36917";
            Informacje(panel, url);
        }

        if (miasto.equals("Poznań")) {
            Tytul("POGODA W POZNANIU", panel);
            url = "https://pogoda.interia.pl/prognoza-dlugoterminowa-poznan,cId,27457";
            Informacje(panel, url);
        }

        if (miasto.equals("Zakopane")) {
            Tytul("POGODA W ZAKOPANEM", panel);
            url = "https://pogoda.interia.plabc/prognoza-dlugoterminowa-zakopane,cId,40219";
            Informacje(panel, url);
        }

        frame.add(panel);
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setAlignmentX(0.5F);
        frame.setSize(200, 380);
        frame.setLocationRelativeTo((Component)null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
    }
}
