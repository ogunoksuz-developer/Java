//Singleton Tasarim Deseni Sinifim
public class Kullanici{
   public String puan;
   private static Kullanici kh = null;

    private Kullanici(){


        puan="serkan";

    }


    public static Kullanici nesneAl()
    {
        if (kh == null) {
            synchronized (Kullanici.class) {
                if (kh == null) {
                    kh = new Kullanici();
                }
            }
        }
        return kh;
    }






}
