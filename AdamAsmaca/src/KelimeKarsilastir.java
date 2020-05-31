
public class KelimeKarsilastir {
    String[] kelimeR=new String[5];
    String kelimeG=new String();
public int p;
    public KelimeKarsilastir(String a0,String a1,String a2,String a3,String a4,String b){
     kelimeR[0]=a0;
     kelimeR[1]=a1;
     kelimeR[2]=a2;
     kelimeR[3]=a3;
     kelimeR[4]=a4;

     kelimeG=b;
     }

    String[] gosterilecekKelime={"_ ","_ ","_ ","_ ","_ "};
    
    public void karsilastiralim(){
    for( p=0;p<=4;p++){
       if(  kelimeG == null ? kelimeR[p] == null : kelimeG.equals(kelimeR[p])) {
           gosterilecekKelime[p]=kelimeG;
           
      }}}







}
