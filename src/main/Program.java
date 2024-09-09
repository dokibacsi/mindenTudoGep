package main;

import Model.MindenTudoGep;

public class Program {
    public static void main(String[] args) {
       MindenTudoGep mtg = new MindenTudoGep();
        mtg.dalFeltolt();
        System.out.printf("A kért dal >>>: %s.\n",  mtg.dalKer());
        System.out.print("LottószelvényXD: "+ mtg.generalLottoSzelveny());
    }
    
}
