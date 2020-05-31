
public class casinoroyal {

    
    public static void main(String[] args) {
        KontrolSinifiKalitimAl ksk1=new KontrolSinifiKalitimAl();
        ksk1.d=3;
        ksk1.seviyem();

        UcKolonKarsilastir ukk1=new UcKolonKarsilastir(ksk1.p[0],ksk1.p[1],ksk1.p[2]);
        ukk1.sonuc();
 
        KacTuttu kt1=new KacTuttu();
        kt1.t=ukk1.sonucum;
        kt1.kTuttu();
        System.out.println("**"+ksk1.p[0]+"**"+ksk1.p[1]+"**"+ksk1.p[2]+"**");
        System.out.println(kt1.a1);
    }

}
