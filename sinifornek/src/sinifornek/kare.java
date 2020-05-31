package sinifornek;
public class kare extends sekil implements alani,cevresi {
    @Override
    public double alan()
    {
        return getKenar()*getKenar();
    }
    
    @Override
    public double cevre()
    {
        return getKenar()*4;
    }

    
}
