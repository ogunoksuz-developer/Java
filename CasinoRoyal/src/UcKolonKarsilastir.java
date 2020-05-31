
public class UcKolonKarsilastir {
    int[] kk=new int[4];
public UcKolonKarsilastir(int a0,int a1,int a2){
   kk[0]=a0;
   kk[1]=a1;
   kk[2]=a2;
}
int sonucum;
public void sonuc(){
   if(kk[0]==kk[1]&&kk[0]==kk[2]&&kk[1]==kk[2])sonucum=2;
   else if(kk[0]==kk[1]||kk[0]==kk[2]||kk[1]==kk[2])sonucum=1;
   else sonucum=0;
}


}
