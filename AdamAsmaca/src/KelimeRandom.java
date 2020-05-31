//Singleton a Cevir
public class KelimeRandom extends KelimeHafiza {

    

    String[] atanan=new String[5];
    public void randomAta(){

        int i=(int)(Math.random()*4)+1;

    if(i==1){
        for(int k=0;k<=4;k++){
          atanan[k]=super.k1[k];
        }
    }
    else if(i==2){
        for(int k=0;k<=4;k++){
          atanan[k]=super.k2[k];
        }
    }
    else if(i==3){
        for(int k=0;k<=4;k++){
          atanan[k]=super.k3[k];
        }
    }
    else if(i==4){
        for(int k=0;k<=4;k++){
          atanan[k]=super.k4[k];
        }
    }
    else if(i==5){
        for(int k=0;k<=4;k++){
          atanan[k]=super.k5[k];
        }
    }

   // System.out.println("Atanan Sayi :"+atanan[0]+""+atanan[1]+""+atanan[2]+""+atanan[3]+""+atanan[4]);

   }


}
