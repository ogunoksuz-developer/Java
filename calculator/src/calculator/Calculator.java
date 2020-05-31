package calculator;

import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Calculator extends Frame implements ActionListener, WindowListener {

    boolean operatorTiklandi = false;
    boolean newOperatorTiklandi = false;
    boolean girilensayi = true;
    Frame gui;
    Label label;
    Label lbl2;
    String eskiDeger = "0";
    float eskiGirilen = 0;
    float yeniGirilen = 0;
    char input;
    char operativ = '=';
    char oldOperativ = '=';

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.ekranolustur();

    }

    private String[] isaretler;

    public void ekranolustur() {

        gui = new Frame();
        gui.setSize(250, 250);
        gui.setVisible(true);
        gui.setTitle("hesap makinesi");

        setSize(new Dimension(500, 500));
        setResizable(false);
        setBackground(Color.WHITE);

        label = new Label();
        label.setText("");

        lbl2 = new Label();
        lbl2.setText("giriniz");

        Panel panel = new Panel();
        panel.setBackground(Color.yellow);
        panel.setLayout(new GridLayout(4, 4));

        gui.add(label, BorderLayout.NORTH);
        //  gui.add(lbl2, BorderLayout.SOUTH);

        Button buton = new Button("on/off");
        gui.add(buton, BorderLayout.SOUTH);

        String[] isaretler = {"9", "8", "7", "/",
            "6", "5", "4", "*",
            "3", "2", "1", "-",
            "0", "C", "=", "+"};

        Button[] butonlarim = new Button[16];

        for (int b = 0; b < 16; b++) {
            butonlarim[b] = new Button(isaretler[b]);
            butonlarim[b].addActionListener(this);
            panel.add(butonlarim[b]);
        }

        gui.add(panel, BorderLayout.CENTER);

        buton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                buttonClicked();
            }

        });

        gui.addWindowListener(this);//carpı tuşu ile ekran kapatma

    }

    public void actionPerformed(ActionEvent evt) {
        char input = evt.getActionCommand().charAt(0);

        char operativ = evt.getActionCommand().charAt(0);

        if (input >= '0' & input <= '9') {
            newOperatorTiklandi = false;
            if (label.equals("0") || girilensayi) {
                label.setText(input + "");

                if (label.equals("0"))
                {
                    eskiDeger = "" + input;
                } else 
                {
                    eskiDeger = eskiDeger.equals("0") ? "" + input : eskiDeger + input;
                }
            } else 
            {
                label.setText(label.getText() + input);
            }
            // return;
        } else 
        {
            if (input != 'C') {
                if (yeniGirilen == 0) {
                    newOperatorTiklandi = true;
                    oldOperativ = operativ;
                }

                operatorTiklandi = true;
                operativ = input;
            }
        }
        if (input == 'C') {
            TemizleClicked();
        }

        String tekst = "0" + label.getText().trim();

        if (!operatorTiklandi) {
            label.setText(eskiDeger);
            eskiGirilen = Long.parseLong(tekst);
        } else 
        {
            if (newOperatorTiklandi)
            {
                eskiGirilen = Long.parseLong(tekst);
            } 
            else 
            {
                if (input >= '0' & input <= '9') {
                    yeniGirilen = Long.parseLong("" + input);
                }
            }
        }

        //hesapla(input, sayi);
        if (operatorTiklandi) {

            float sonuc = hesapla(oldOperativ, eskiGirilen, yeniGirilen);

            if (yeniGirilen != 0 && operativ == '=') 
            {
                yeniGirilen = 0;
                eskiGirilen = sonuc;
                label.setText(String.valueOf(sonuc));
            }
        }
    }

    public void TemizleClicked() 
    {
        girilensayi = true;
        label.setText("0");
        operatorTiklandi = false;
        newOperatorTiklandi = false;
        girilensayi = true;
        eskiDeger = "0";
        eskiGirilen = 0;
        yeniGirilen = 0;
        operativ = '=';
        oldOperativ = '=';
    }

    public float hesapla(char op, float a, float b) 
    {
        float s = 0;
        switch (op) 
        {
            case '=':
                s = a;
                break;
            case '+':
                s = a + b;
                break;
            case '-':
                s = a - b;
                break;
            case '*':
                s = a * b;
                break;
            case '/':
                s = a / b;
                break;
        }
        return s;
    }
    public void buttonClicked() 
    {
        label.setText("buton clicked");
    }

    public void windowOpened(WindowEvent e) 
    {
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
