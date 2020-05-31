
public class KontrolSinifi implements RandomKAta,RandomOAta,RandomZAta{
int[] p=new int[3];

    
    public void rKAta() {
     p[0]=(int)(Math.random()*2+1); 
     p[1]=(int)(Math.random()*2+1);
     p[2]=(int)(Math.random()*2+1);
    }

    public void rOAta() {
     p[0]=(int)(Math.random()*4+1);
     p[1]=(int)(Math.random()*4+1);
     p[2]=(int)(Math.random()*4+1);
    }

    public void rZAta() {
     p[0]=(int)(Math.random()*6+1);
     p[1]=(int)(Math.random()*6+1);
     p[2]=(int)(Math.random()*6+1);
    }
  
    
    

}
