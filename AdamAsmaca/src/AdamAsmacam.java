import java.awt.*;
import java.awt.event.*;
public class AdamAsmacam implements ActionListener,WindowListener  {

    Kullanici kh;
    public KelimeRandom kr2;
    public String karakter;
public Panel pn1;
public Panel pn2;
    public Label lbl1;
    public Label lbl2;
    public Label lbl3;
    public Label lbl4;
    public Label lbl5;
     public Label lbl6;
    public Button btn;
    public Frame f;
    public TextField tfHarf;

    public void Olustur(){

         f=new Frame("oyun");
        f.setLayout(new GridLayout(1,7));

        f.setBackground(Color.GREEN);
f.setSize(500,200);
        /* TextField bileşenleri 4 karakter uzunluğunda oluşturuluyor.*/
        tfHarf=new TextField(5);
pn1=new Panel();
pn2=new Panel();
        lbl1=new Label("--");
        lbl2=new Label("--");
        lbl3=new Label("--");
        lbl4=new Label("--");
        lbl5=new Label("--");
        lbl6=new Label("PUAN");
        btn=new Button("calıstır");
        btn.addActionListener(this);
        tfHarf=new TextField();
        pn1.add(lbl1);
        pn1.add(lbl2);
        pn1.add(lbl3);
        pn1.add(lbl4);
        pn1.add(lbl5);
        pn1.add(lbl6);

       pn2.add(btn);
        pn2.add(tfHarf);
f.add(pn1);
f.add(pn2);



         f.setVisible(true);
         f.addWindowListener(this);


    }
public int j=0,t=0;
    public void IslemYap(){
        j++;
        if(j==1){
     kr2=new KelimeRandom();
        kr2.randomAta();
        }
        int f=0;
        String[] maindeGoster={"_ ","_ ","_ ","_ ","_ "};

        
        HarfGir hg2=new HarfGir();
        hg2.Hgir();

        karakter=(tfHarf.getText());
        KelimeKarsilastir ks2=new KelimeKarsilastir(kr2.atanan[0],kr2.atanan[1],kr2.atanan[2],kr2.atanan[3],kr2.atanan[4],karakter);
        ks2.karsilastiralim();
  
        if(ks2.kelimeG==ks2.gosterilecekKelime[0])
        {
        lbl1.setText(""+ks2.gosterilecekKelime[0]);
        t++;
        }
        if(ks2.kelimeG==ks2.gosterilecekKelime[1])
        {
        lbl2.setText(""+ks2.gosterilecekKelime[1]);
        t++;
        }
         if(ks2.kelimeG==ks2.gosterilecekKelime[2])
        {
        lbl3.setText(""+ks2.gosterilecekKelime[2]);
        t++;
        }
         if(ks2.kelimeG==ks2.gosterilecekKelime[3])
        {
        lbl4.setText(""+ks2.gosterilecekKelime[3]);
        t++;
        }
         if(ks2.kelimeG==ks2.gosterilecekKelime[4])
        {
        lbl5.setText(""+ks2.gosterilecekKelime[4]);
        t++;
        }

        if(t==5)
        {
           
                lbl6.setText(""+kh.puan);
           
        }
    }



    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn) // Eğer olayın kaynağı Button bileşeni ise, yani Button’ a tıklandıysa.
        {
             IslemYap();
        }
    }

    public void windowOpened(WindowEvent e) {
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
