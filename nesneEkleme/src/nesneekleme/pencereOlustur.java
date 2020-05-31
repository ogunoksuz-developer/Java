package nesneEkleme;
import javax.swing.JFrame;            //Pencere nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JPanel;            //Panel nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JButton;           //Buton nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JTextField;        //TextField nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JPasswordField;    //PasswordField nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf
import javax.swing.JLabel;            //Label nesnesi oluşturabilmemiz için içe aktarmamız gereken sınıf

public class pencereOlustur extends JFrame
{
    JFrame frame;
    JPanel panel;
    JButton button;
    JTextField txtField;
    JPasswordField passField;
    JLabel label;

    // Sınıfın Constructor' ı
    public pencereOlustur()
   {
        super("Pencere Adı buraya yazılır");
        setBounds(100, 100, 550, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Paneli oluşturuyorum
        panel = new JPanel();

        // Nesneleri oluşturuyorum
        button = new JButton("Button metni budur");
        txtField = new JTextField("", 10);
        passField = new JPasswordField("", 10);
        label = new JLabel("Label metni budur");

        // Nesneleri Panele ekliyorum
        panel.add(button);
        panel.add(txtField);
        panel.add(passField);
        panel.add(label);

        //paneli Frame e ekliyorum
        add(panel); //---&gt;&gt;&gt;frame.add(panel) ile aynı anlamı taşır
 }
}
