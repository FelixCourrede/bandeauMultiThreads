package bandeau;

public class BandeauSimultane extends Thread{
    public Bandeau b;
   public Scenario s;
    
   public BandeauSimultane(Bandeau b, Scenario s){
    this.b=b;
    this.s=s;
}

    public void run(){
        s.playOn(b);
    }

}
