//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.WeatherInfo;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.border.EmptyBorder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class BoxLayoutExample1 implements ActionListener {
    public BoxLayoutExample1() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Informator pogodowy");
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, 1);
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
        JLabel title = new JLabel("POGODA W KRAKOWIE");
        title.setFont(new Font("Arial", 0, 30));
        title.setHorizontalAlignment(0);
        title.setSize(300, 30);
        title.setLocation(300, 30);
        panel.add(title);

        try {
            BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\T470s\\Desktop\\ProjektMG2\\ProjektMG2\\src\\main\\resources\\symbol-pogody-1.png"));
            Image newimage = myPicture.getScaledInstance(60, 60, 4);
            JLabel jlabContents8 = new JLabel(new ImageIcon(newimage));
            panel.add(jlabContents8);
        } catch (IOException var37) {
            System.out.println("Image could not be imported");
            System.exit(1);
        }

        JLabel jlabPrompt = new JLabel("Temperatura");
        JLabel jlabContents = new JLabel("");
        JLabel jlabPrompt2 = new JLabel("Opis");
        JLabel jlabContents2 = new JLabel("");
        JLabel jlabPrompt3 = new JLabel("Temperatura odczuwalna");
        JLabel jlabContents3 = new JLabel("");
        JLabel jlabPrompt4 = new JLabel("Cisnienie");
        JLabel jlabContents4 = new JLabel("");
        JLabel jlabPrompt5 = new JLabel("Wiatr");
        JLabel jlabContents5 = new JLabel("");
        JLabel jlabPrompt6 = new JLabel("Jakosc powietrza");
        JLabel jlabContents6 = new JLabel("");
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        String url = "https://pogoda.interia.pl/prognoza-dlugoterminowa-krakow,cId,4970";

        try {
            Document doc = Jsoup.connect("https://pogoda.interia.pl/prognoza-dlugoterminowa-krakow,cId,4970").timeout(60).get();
            Iterator var29 = doc.select(".weather-currently").iterator();

            while(var29.hasNext()) {
                Element e = (Element)var29.next();
                String Data = e.select(".date.weather-currently-info-item").text();
                JTextField jtf7 = new JTextField(Data);
                jtf7.setEditable(false);
                jtf7.setActionCommand("myTF7");
                panel.add(jtf7);
                String Temperatura = e.select(".weather-currently-temp").text();
                JTextField jtf1 = new JTextField(Temperatura);
                jtf1.setEditable(false);
                jtf1.setActionCommand("myTF1");
                panel.add(jlabPrompt);
                panel.add(jlabContents);
                panel.add(jtf1);
                String Opis = e.select(".weather-currently-icon-description").text();
                JTextField jtf2 = new JTextField(Opis);
                jtf2.setEditable(false);
                jtf2.setActionCommand("myTF2");
                panel.add(jlabPrompt2);
                panel.add(jlabContents2);
                panel.add(jtf2);
                String TemperaturaOdczuwalna = e.select(".feelTemperature.weather-currently-details-item > .weather-currently-details-value").text();
                JTextField jtf3 = new JTextField(TemperaturaOdczuwalna);
                jtf3.setEditable(false);
                jtf3.setActionCommand("myTF3");
                panel.add(jlabPrompt3);
                panel.add(jlabContents3);
                panel.add(jtf3);
                String Cisnienie = e.select(".steady.weather-currently-details-value").text();
                JTextField jtf4 = new JTextField(Cisnienie);
                jtf4.setEditable(false);
                jtf4.setActionCommand("myTF4");
                panel.add(jlabPrompt4);
                panel.add(jlabContents4);
                panel.add(jtf4);
                String Wiatr = e.select(".wind.weather-currently-details-item > .weather-currently-details-value").text();
                JTextField jtf5 = new JTextField(Wiatr);
                jtf5.setEditable(false);
                jtf5.setActionCommand("myTF5");
                panel.add(jlabPrompt5);
                panel.add(jlabContents5);
                panel.add(jtf5);
                String JakoscPowietrza = e.select(".kind > .value").text();
                JTextField jtf6 = new JTextField(JakoscPowietrza);
                jtf6.setEditable(false);
                jtf6.setActionCommand("myTF6");
                panel.add(jlabPrompt6);
                panel.add(jlabContents6);
                panel.add(jtf6);
            }
        }  catch (IOException e) {
        System.out.println("Błędny link");
    }


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        frame.setSize(width / 2, height / 2);
        frame.setLocationRelativeTo((Component)null);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    }
}
