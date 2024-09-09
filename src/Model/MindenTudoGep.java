package Model;

import java.util.Arrays;
import java.util.Random;

public class MindenTudoGep {
    private int[] lottoSzelveny;
    private String totoSzelveny;
    private String[] dalok;
    Random rnd = new Random();

    public MindenTudoGep() {
       this(new String[0]);
    }
    
    public MindenTudoGep(String dal){
        this(new String[]{dal});
    }
    
    public MindenTudoGep(String[] dalok) {
        this.resi();
        if(!(dalok == null || dalok.length == 0 || dalok[0].isBlank())){
            dalFelvesz(dalok);
        }
        this.dalFeltolt();
        this.dalKer();
    }
    
    public void resi(){
        this.generalLottoSzelveny();
        this.generalTottoSzelveny();
        this.dalFeltolt();
    }

    public void dalFeltolt() {
        this.dalok = new String[4];
        dalok[0] = "Back 2 Me";
        dalok[1] = "I know U";
        dalok[2] = "Stop With It";
        dalok[3] = "Spinback";
    }
    
    public String dalKer(){
        int veletlenDal = rnd.nextInt(this.dalok.length);
        return this.dalok[veletlenDal];
    }

    private void dalFelvesz(String[] dalok) {
        String[] meglevoDalok = this.dalok;
        String[] ujDal = Arrays.copyOf(meglevoDalok, 1);
        
    } 

    public int[] generalLottoSzelveny() {
       this.lottoSzelveny = new int[5]; 
       int db = 0;
       while (db < 5){
           int randomSzam = rnd.nextInt(90);
           if(!bennevan(this.lottoSzelveny, randomSzam, db)){
               this.lottoSzelveny[db] = randomSzam;
               db++;
           }
       }
       
        for (int i = 0; i < 10; i++) {
            ;
        }
        return (for(db = 0; db < this.lottoSzelveny.length; db++){int szam = this.lottoSzelveny[db];});
    }
    
    private boolean bennevan(int[] lottoSzelveny, int randomSzam, int db) {
            int i = 0;
            while(i < db && !(this.lottoSzelveny[i]==randomSzam)){
                i++;
            }
            return i < db;
        }
    
    private void generalTottoSzelveny() {

    }

    
    
}
