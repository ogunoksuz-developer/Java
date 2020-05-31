

    import java.util.ArrayList;
public abstract class puanlama {

    private ArrayList puanListesi=new ArrayList();

    private int value;

    private puanlama next;

    public int getValue(){
        return value;
    }

    public void setValue(int value)
    {
        this.value=value;
    }

    public puanlama getNext(){
        return next;
    }

    public puanlama setNext(puanlama next){
        this.next=next;
        return this;
    }

    public void check(puanlama puan){
        System.out.println();


    if(puan.getValue()!=this.value){
        System.out.println();
        if(getNext()!=null){
            getNext().check(puan);
        }
        else{
            System.out.println();
        }
    }
    else{
        puanListesi.add(puan);
    }
}
}


